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


import com.dao.ZhichuDao;
import com.entity.ZhichuEntity;
import com.service.ZhichuService;
import com.entity.vo.ZhichuVO;
import com.entity.view.ZhichuView;

@Service("zhichuService")
public class ZhichuServiceImpl extends ServiceImpl<ZhichuDao, ZhichuEntity> implements ZhichuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhichuEntity> page = this.selectPage(
                new Query<ZhichuEntity>(params).getPage(),
                new EntityWrapper<ZhichuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhichuEntity> wrapper) {
		  Page<ZhichuView> page =new Query<ZhichuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhichuVO> selectListVO(Wrapper<ZhichuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhichuVO selectVO(Wrapper<ZhichuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhichuView> selectListView(Wrapper<ZhichuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhichuView selectView(Wrapper<ZhichuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
