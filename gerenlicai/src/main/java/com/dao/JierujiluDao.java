package com.dao;

import com.entity.JierujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JierujiluVO;
import com.entity.view.JierujiluView;


/**
 * 借入记录
 * 
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface JierujiluDao extends BaseMapper<JierujiluEntity> {
	
	List<JierujiluVO> selectListVO(@Param("ew") Wrapper<JierujiluEntity> wrapper);
	
	JierujiluVO selectVO(@Param("ew") Wrapper<JierujiluEntity> wrapper);
	
	List<JierujiluView> selectListView(@Param("ew") Wrapper<JierujiluEntity> wrapper);

	List<JierujiluView> selectListView(Pagination page,@Param("ew") Wrapper<JierujiluEntity> wrapper);
	
	JierujiluView selectView(@Param("ew") Wrapper<JierujiluEntity> wrapper);
	
}
