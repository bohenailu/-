package com.dao;

import com.entity.ShengqianmiaozhaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShengqianmiaozhaoVO;
import com.entity.view.ShengqianmiaozhaoView;


/**
 * 省钱妙招
 * 
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface ShengqianmiaozhaoDao extends BaseMapper<ShengqianmiaozhaoEntity> {
	
	List<ShengqianmiaozhaoVO> selectListVO(@Param("ew") Wrapper<ShengqianmiaozhaoEntity> wrapper);
	
	ShengqianmiaozhaoVO selectVO(@Param("ew") Wrapper<ShengqianmiaozhaoEntity> wrapper);
	
	List<ShengqianmiaozhaoView> selectListView(@Param("ew") Wrapper<ShengqianmiaozhaoEntity> wrapper);

	List<ShengqianmiaozhaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShengqianmiaozhaoEntity> wrapper);
	
	ShengqianmiaozhaoView selectView(@Param("ew") Wrapper<ShengqianmiaozhaoEntity> wrapper);
	
}
