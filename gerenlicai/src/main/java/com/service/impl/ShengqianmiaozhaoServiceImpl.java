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


import com.dao.ShengqianmiaozhaoDao;
import com.entity.ShengqianmiaozhaoEntity;
import com.service.ShengqianmiaozhaoService;
import com.entity.vo.ShengqianmiaozhaoVO;
import com.entity.view.ShengqianmiaozhaoView;

@Service("shengqianmiaozhaoService")
public class ShengqianmiaozhaoServiceImpl extends ServiceImpl<ShengqianmiaozhaoDao, ShengqianmiaozhaoEntity> implements ShengqianmiaozhaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShengqianmiaozhaoEntity> page = this.selectPage(
                new Query<ShengqianmiaozhaoEntity>(params).getPage(),
                new EntityWrapper<ShengqianmiaozhaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShengqianmiaozhaoEntity> wrapper) {
		  Page<ShengqianmiaozhaoView> page =new Query<ShengqianmiaozhaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShengqianmiaozhaoVO> selectListVO(Wrapper<ShengqianmiaozhaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShengqianmiaozhaoVO selectVO(Wrapper<ShengqianmiaozhaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShengqianmiaozhaoView> selectListView(Wrapper<ShengqianmiaozhaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShengqianmiaozhaoView selectView(Wrapper<ShengqianmiaozhaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
