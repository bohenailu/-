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


import com.dao.XiaofeiyusuanDao;
import com.entity.XiaofeiyusuanEntity;
import com.service.XiaofeiyusuanService;
import com.entity.vo.XiaofeiyusuanVO;
import com.entity.view.XiaofeiyusuanView;

@Service("xiaofeiyusuanService")
public class XiaofeiyusuanServiceImpl extends ServiceImpl<XiaofeiyusuanDao, XiaofeiyusuanEntity> implements XiaofeiyusuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofeiyusuanEntity> page = this.selectPage(
                new Query<XiaofeiyusuanEntity>(params).getPage(),
                new EntityWrapper<XiaofeiyusuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofeiyusuanEntity> wrapper) {
		  Page<XiaofeiyusuanView> page =new Query<XiaofeiyusuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofeiyusuanVO> selectListVO(Wrapper<XiaofeiyusuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofeiyusuanVO selectVO(Wrapper<XiaofeiyusuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofeiyusuanView> selectListView(Wrapper<XiaofeiyusuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofeiyusuanView selectView(Wrapper<XiaofeiyusuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
