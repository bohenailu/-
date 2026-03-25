package com.dao;

import com.entity.ZhichuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhichuVO;
import com.entity.view.ZhichuView;


/**
 * 支出
 * 
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface ZhichuDao extends BaseMapper<ZhichuEntity> {
	
	List<ZhichuVO> selectListVO(@Param("ew") Wrapper<ZhichuEntity> wrapper);
	
	ZhichuVO selectVO(@Param("ew") Wrapper<ZhichuEntity> wrapper);
	
	List<ZhichuView> selectListView(@Param("ew") Wrapper<ZhichuEntity> wrapper);

	List<ZhichuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhichuEntity> wrapper);
	
	ZhichuView selectView(@Param("ew") Wrapper<ZhichuEntity> wrapper);
	
}
