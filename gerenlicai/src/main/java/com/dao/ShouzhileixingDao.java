package com.dao;

import com.entity.ShouzhileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouzhileixingVO;
import com.entity.view.ShouzhileixingView;


/**
 * 收支类型
 * 
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface ShouzhileixingDao extends BaseMapper<ShouzhileixingEntity> {
	
	List<ShouzhileixingVO> selectListVO(@Param("ew") Wrapper<ShouzhileixingEntity> wrapper);
	
	ShouzhileixingVO selectVO(@Param("ew") Wrapper<ShouzhileixingEntity> wrapper);
	
	List<ShouzhileixingView> selectListView(@Param("ew") Wrapper<ShouzhileixingEntity> wrapper);

	List<ShouzhileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShouzhileixingEntity> wrapper);
	
	ShouzhileixingView selectView(@Param("ew") Wrapper<ShouzhileixingEntity> wrapper);
	
}
