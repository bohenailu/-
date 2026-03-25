package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XiaofeidengjiEntity;
import com.entity.view.XiaofeidengjiView;

import com.service.XiaofeidengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 消费等级
 * 后端接口
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@RestController
@RequestMapping("/xiaofeidengji")
public class XiaofeidengjiController {
    @Autowired
    private XiaofeidengjiService xiaofeidengjiService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiaofeidengjiEntity xiaofeidengji,
		HttpServletRequest request){
        EntityWrapper<XiaofeidengjiEntity> ew = new EntityWrapper<XiaofeidengjiEntity>();
		PageUtils page = xiaofeidengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaofeidengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiaofeidengjiEntity xiaofeidengji, 
		HttpServletRequest request){
        EntityWrapper<XiaofeidengjiEntity> ew = new EntityWrapper<XiaofeidengjiEntity>();
		PageUtils page = xiaofeidengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaofeidengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiaofeidengjiEntity xiaofeidengji){
       	EntityWrapper<XiaofeidengjiEntity> ew = new EntityWrapper<XiaofeidengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaofeidengji, "xiaofeidengji")); 
        return R.ok().put("data", xiaofeidengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaofeidengjiEntity xiaofeidengji){
        EntityWrapper< XiaofeidengjiEntity> ew = new EntityWrapper< XiaofeidengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaofeidengji, "xiaofeidengji")); 
		XiaofeidengjiView xiaofeidengjiView =  xiaofeidengjiService.selectView(ew);
		return R.ok("查询消费等级成功").put("data", xiaofeidengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiaofeidengjiEntity xiaofeidengji = xiaofeidengjiService.selectById(id);
        return R.ok().put("data", xiaofeidengji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiaofeidengjiEntity xiaofeidengji = xiaofeidengjiService.selectById(id);
        return R.ok().put("data", xiaofeidengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaofeidengjiEntity xiaofeidengji, HttpServletRequest request){
    	xiaofeidengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaofeidengji);
        xiaofeidengjiService.insert(xiaofeidengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaofeidengjiEntity xiaofeidengji, HttpServletRequest request){
    	xiaofeidengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaofeidengji);
        xiaofeidengjiService.insert(xiaofeidengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XiaofeidengjiEntity xiaofeidengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaofeidengji);
        xiaofeidengjiService.updateById(xiaofeidengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaofeidengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XiaofeidengjiEntity> wrapper = new EntityWrapper<XiaofeidengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = xiaofeidengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	




}
