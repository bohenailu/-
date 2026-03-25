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

import com.entity.GuihaijiluEntity;
import com.entity.view.GuihaijiluView;

import com.service.GuihaijiluService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 归还记录
 * 后端接口
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@RestController
@RequestMapping("/guihaijilu")
public class GuihaijiluController {
    @Autowired
    private GuihaijiluService guihaijiluService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GuihaijiluEntity guihaijilu,
                @RequestParam(required = false) Double guihaijinestart,
                @RequestParam(required = false) Double guihaijineend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date guihaishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date guihaishijianend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			guihaijilu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GuihaijiluEntity> ew = new EntityWrapper<GuihaijiluEntity>();
                if(guihaijinestart!=null) ew.ge("guihaijine", guihaijinestart);
                if(guihaijineend!=null) ew.le("guihaijine", guihaijineend);
                if(guihaishijianstart!=null) ew.ge("guihaishijian", guihaishijianstart);
                if(guihaishijianend!=null) ew.le("guihaishijian", guihaishijianend);
		PageUtils page = guihaijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guihaijilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GuihaijiluEntity guihaijilu, 
                @RequestParam(required = false) Double guihaijinestart,
                @RequestParam(required = false) Double guihaijineend,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date guihaishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date guihaishijianend,
		HttpServletRequest request){
        EntityWrapper<GuihaijiluEntity> ew = new EntityWrapper<GuihaijiluEntity>();
                if(guihaijinestart!=null) ew.ge("guihaijine", guihaijinestart);
                if(guihaijineend!=null) ew.le("guihaijine", guihaijineend);
                if(guihaishijianstart!=null) ew.ge("guihaishijian", guihaishijianstart);
                if(guihaishijianend!=null) ew.le("guihaishijian", guihaishijianend);
		PageUtils page = guihaijiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, guihaijilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GuihaijiluEntity guihaijilu){
       	EntityWrapper<GuihaijiluEntity> ew = new EntityWrapper<GuihaijiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( guihaijilu, "guihaijilu")); 
        return R.ok().put("data", guihaijiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GuihaijiluEntity guihaijilu){
        EntityWrapper< GuihaijiluEntity> ew = new EntityWrapper< GuihaijiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( guihaijilu, "guihaijilu")); 
		GuihaijiluView guihaijiluView =  guihaijiluService.selectView(ew);
		return R.ok("查询归还记录成功").put("data", guihaijiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GuihaijiluEntity guihaijilu = guihaijiluService.selectById(id);
        return R.ok().put("data", guihaijilu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GuihaijiluEntity guihaijilu = guihaijiluService.selectById(id);
        return R.ok().put("data", guihaijilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GuihaijiluEntity guihaijilu, HttpServletRequest request){
    	guihaijilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guihaijilu);
        guihaijiluService.insert(guihaijilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GuihaijiluEntity guihaijilu, HttpServletRequest request){
    	guihaijilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(guihaijilu);
        guihaijiluService.insert(guihaijilu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GuihaijiluEntity guihaijilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(guihaijilu);
        guihaijiluService.updateById(guihaijilu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        guihaijiluService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<GuihaijiluEntity> wrapper = new EntityWrapper<GuihaijiluEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = guihaijiluService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	




}
