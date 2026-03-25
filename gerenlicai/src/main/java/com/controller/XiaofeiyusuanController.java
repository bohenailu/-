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

import com.entity.XiaofeiyusuanEntity;
import com.entity.view.XiaofeiyusuanView;
import com.entity.ZhichuEntity;

import com.service.XiaofeiyusuanService;
import com.service.ZhichuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 消费预算
 * 后端接口
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@RestController
@RequestMapping("/xiaofeiyusuan")
public class XiaofeiyusuanController {
    @Autowired
    private XiaofeiyusuanService xiaofeiyusuanService;
    
    @Autowired
    private ZhichuService zhichuService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XiaofeiyusuanEntity xiaofeiyusuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xiaofeiyusuan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XiaofeiyusuanEntity> ew = new EntityWrapper<XiaofeiyusuanEntity>();
		PageUtils page = xiaofeiyusuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaofeiyusuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XiaofeiyusuanEntity xiaofeiyusuan, 
		HttpServletRequest request){
        EntityWrapper<XiaofeiyusuanEntity> ew = new EntityWrapper<XiaofeiyusuanEntity>();
		PageUtils page = xiaofeiyusuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xiaofeiyusuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XiaofeiyusuanEntity xiaofeiyusuan){
       	EntityWrapper<XiaofeiyusuanEntity> ew = new EntityWrapper<XiaofeiyusuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xiaofeiyusuan, "xiaofeiyusuan")); 
        return R.ok().put("data", xiaofeiyusuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XiaofeiyusuanEntity xiaofeiyusuan){
        EntityWrapper< XiaofeiyusuanEntity> ew = new EntityWrapper< XiaofeiyusuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xiaofeiyusuan, "xiaofeiyusuan")); 
		XiaofeiyusuanView xiaofeiyusuanView =  xiaofeiyusuanService.selectView(ew);
		return R.ok("查询消费预算成功").put("data", xiaofeiyusuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XiaofeiyusuanEntity xiaofeiyusuan = xiaofeiyusuanService.selectById(id);
        return R.ok().put("data", xiaofeiyusuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XiaofeiyusuanEntity xiaofeiyusuan = xiaofeiyusuanService.selectById(id);
        return R.ok().put("data", xiaofeiyusuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XiaofeiyusuanEntity xiaofeiyusuan, HttpServletRequest request){
    	xiaofeiyusuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaofeiyusuan);
        xiaofeiyusuanService.insert(xiaofeiyusuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XiaofeiyusuanEntity xiaofeiyusuan, HttpServletRequest request){
    	xiaofeiyusuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xiaofeiyusuan);
        xiaofeiyusuanService.insert(xiaofeiyusuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XiaofeiyusuanEntity xiaofeiyusuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xiaofeiyusuan);
        xiaofeiyusuanService.updateById(xiaofeiyusuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xiaofeiyusuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 获取消费预算及超支提醒
     */
    @RequestMapping("/budgetWarn")
    public R budgetWarn(@RequestParam Map<String, Object> params, XiaofeiyusuanEntity xiaofeiyusuan) {
        EntityWrapper<XiaofeiyusuanEntity> ew = new EntityWrapper<>();
        if (xiaofeiyusuan.getZhanghao() != null && !xiaofeiyusuan.getZhanghao().isEmpty()) {
            ew.like("zhanghao", xiaofeiyusuan.getZhanghao());
        }
        List<XiaofeiyusuanEntity> list = xiaofeiyusuanService.selectList(ew);
        List<Map<String, Object>> result = new ArrayList<>();
        boolean hasOverBudget = false;
        
        for (XiaofeiyusuanEntity budget : list) {
            Map<String, Object> item = new HashMap<>();
            item.put("id", budget.getId());
            item.put("zhanghao", budget.getZhanghao());
            item.put("xingming", budget.getXingming());
            item.put("yusuanjine", budget.getYusuanjine());
            item.put("meizhoujine", budget.getMeizhoujine());
            item.put("shiyongshijian", budget.getShiyongshijian());
            
            String zhanghao = budget.getZhanghao();
            Float yusuanjine = budget.getYusuanjine();
            
            EntityWrapper<ZhichuEntity> ewZhichu = new EntityWrapper<>();
            if (zhanghao != null && !zhanghao.isEmpty()) {
                ewZhichu.eq("zhanghao", zhanghao);
            }
            
            List<ZhichuEntity> zhichuList = zhichuService.selectList(ewZhichu);
            Float totalExpense = 0f;
            for (ZhichuEntity zhichu : zhichuList) {
                if (zhichu.getJine() != null) {
                    totalExpense += zhichu.getJine();
                }
            }
            
            item.put("totalExpense", totalExpense);
            
            boolean overBudget = yusuanjine != null && totalExpense > yusuanjine;
            item.put("overBudget", overBudget);
            if (overBudget) {
                hasOverBudget = true;
            }
            
            result.add(item);
        }
        
        params.put("hasOverBudget", hasOverBudget);
        return R.ok().put("data", result);
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
		
		Wrapper<XiaofeiyusuanEntity> wrapper = new EntityWrapper<XiaofeiyusuanEntity>();
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

		int count = xiaofeiyusuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	




}
