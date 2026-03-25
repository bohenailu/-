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


import com.dao.JierujiluDao;
import com.entity.JierujiluEntity;
import com.service.JierujiluService;
import com.entity.vo.JierujiluVO;
import com.entity.view.JierujiluView;

@Service("jierujiluService")
public class JierujiluServiceImpl extends ServiceImpl<JierujiluDao, JierujiluEntity> implements JierujiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JierujiluEntity> page = this.selectPage(
                new Query<JierujiluEntity>(params).getPage(),
                new EntityWrapper<JierujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JierujiluEntity> wrapper) {
		  Page<JierujiluView> page =new Query<JierujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JierujiluVO> selectListVO(Wrapper<JierujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JierujiluVO selectVO(Wrapper<JierujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JierujiluView> selectListView(Wrapper<JierujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JierujiluView selectView(Wrapper<JierujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
