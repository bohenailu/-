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


import com.dao.XiaofeidengjiDao;
import com.entity.XiaofeidengjiEntity;
import com.service.XiaofeidengjiService;
import com.entity.vo.XiaofeidengjiVO;
import com.entity.view.XiaofeidengjiView;

@Service("xiaofeidengjiService")
public class XiaofeidengjiServiceImpl extends ServiceImpl<XiaofeidengjiDao, XiaofeidengjiEntity> implements XiaofeidengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofeidengjiEntity> page = this.selectPage(
                new Query<XiaofeidengjiEntity>(params).getPage(),
                new EntityWrapper<XiaofeidengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofeidengjiEntity> wrapper) {
		  Page<XiaofeidengjiView> page =new Query<XiaofeidengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofeidengjiVO> selectListVO(Wrapper<XiaofeidengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofeidengjiVO selectVO(Wrapper<XiaofeidengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofeidengjiView> selectListView(Wrapper<XiaofeidengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofeidengjiView selectView(Wrapper<XiaofeidengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
