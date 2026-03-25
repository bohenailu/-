package com.dao;

import com.entity.GuihaijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuihaijiluVO;
import com.entity.view.GuihaijiluView;


/**
 * 归还记录
 * 
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface GuihaijiluDao extends BaseMapper<GuihaijiluEntity> {
	
	List<GuihaijiluVO> selectListVO(@Param("ew") Wrapper<GuihaijiluEntity> wrapper);
	
	GuihaijiluVO selectVO(@Param("ew") Wrapper<GuihaijiluEntity> wrapper);
	
	List<GuihaijiluView> selectListView(@Param("ew") Wrapper<GuihaijiluEntity> wrapper);

	List<GuihaijiluView> selectListView(Pagination page,@Param("ew") Wrapper<GuihaijiluEntity> wrapper);
	
	GuihaijiluView selectView(@Param("ew") Wrapper<GuihaijiluEntity> wrapper);
	
}
