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


import com.dao.ShouruDao;
import com.entity.ShouruEntity;
import com.service.ShouruService;
import com.entity.vo.ShouruVO;
import com.entity.view.ShouruView;

@Service("shouruService")
public class ShouruServiceImpl extends ServiceImpl<ShouruDao, ShouruEntity> implements ShouruService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouruEntity> page = this.selectPage(
                new Query<ShouruEntity>(params).getPage(),
                new EntityWrapper<ShouruEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouruEntity> wrapper) {
		  Page<ShouruView> page =new Query<ShouruView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouruVO> selectListVO(Wrapper<ShouruEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouruVO selectVO(Wrapper<ShouruEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouruView> selectListView(Wrapper<ShouruEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouruView selectView(Wrapper<ShouruEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
