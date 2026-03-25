package com.dao;

import com.entity.ShouruEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouruVO;
import com.entity.view.ShouruView;


/**
 * 收入
 * 
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface ShouruDao extends BaseMapper<ShouruEntity> {
	
	List<ShouruVO> selectListVO(@Param("ew") Wrapper<ShouruEntity> wrapper);
	
	ShouruVO selectVO(@Param("ew") Wrapper<ShouruEntity> wrapper);
	
	List<ShouruView> selectListView(@Param("ew") Wrapper<ShouruEntity> wrapper);

	List<ShouruView> selectListView(Pagination page,@Param("ew") Wrapper<ShouruEntity> wrapper);
	
	ShouruView selectView(@Param("ew") Wrapper<ShouruEntity> wrapper);
	
}
