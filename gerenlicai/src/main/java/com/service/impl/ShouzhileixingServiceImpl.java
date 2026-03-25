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


import com.dao.ShouzhileixingDao;
import com.entity.ShouzhileixingEntity;
import com.service.ShouzhileixingService;
import com.entity.vo.ShouzhileixingVO;
import com.entity.view.ShouzhileixingView;

@Service("shouzhileixingService")
public class ShouzhileixingServiceImpl extends ServiceImpl<ShouzhileixingDao, ShouzhileixingEntity> implements ShouzhileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouzhileixingEntity> page = this.selectPage(
                new Query<ShouzhileixingEntity>(params).getPage(),
                new EntityWrapper<ShouzhileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouzhileixingEntity> wrapper) {
		  Page<ShouzhileixingView> page =new Query<ShouzhileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouzhileixingVO> selectListVO(Wrapper<ShouzhileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouzhileixingVO selectVO(Wrapper<ShouzhileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouzhileixingView> selectListView(Wrapper<ShouzhileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouzhileixingView selectView(Wrapper<ShouzhileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
