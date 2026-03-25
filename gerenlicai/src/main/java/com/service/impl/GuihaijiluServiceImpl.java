package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GuihaijiluDao;
import com.entity.GuihaijiluEntity;
import com.service.GuihaijiluService;
import com.entity.vo.GuihaijiluVO;
import com.entity.view.GuihaijiluView;

@Service("guihaijiluService")
public class GuihaijiluServiceImpl extends ServiceImpl<GuihaijiluDao, GuihaijiluEntity> implements GuihaijiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuihaijiluEntity> page = this.selectPage(
                new Query<GuihaijiluEntity>(params).getPage(),
                new EntityWrapper<GuihaijiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuihaijiluEntity> wrapper) {
		  Page<GuihaijiluView> page =new Query<GuihaijiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuihaijiluVO> selectListVO(Wrapper<GuihaijiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuihaijiluVO selectVO(Wrapper<GuihaijiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuihaijiluView> selectListView(Wrapper<GuihaijiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuihaijiluView selectView(Wrapper<GuihaijiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
