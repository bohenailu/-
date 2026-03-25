package com.dao;

import com.entity.XiaofeiyusuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofeiyusuanVO;
import com.entity.view.XiaofeiyusuanView;


/**
 * 消费预算
 * 
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface XiaofeiyusuanDao extends BaseMapper<XiaofeiyusuanEntity> {
	
	List<XiaofeiyusuanVO> selectListVO(@Param("ew") Wrapper<XiaofeiyusuanEntity> wrapper);
	
	XiaofeiyusuanVO selectVO(@Param("ew") Wrapper<XiaofeiyusuanEntity> wrapper);
	
	List<XiaofeiyusuanView> selectListView(@Param("ew") Wrapper<XiaofeiyusuanEntity> wrapper);

	List<XiaofeiyusuanView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofeiyusuanEntity> wrapper);
	
	XiaofeiyusuanView selectView(@Param("ew") Wrapper<XiaofeiyusuanEntity> wrapper);
	
}
