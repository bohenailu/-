package com.dao;

import com.entity.XuexiaojianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiaojianjieVO;
import com.entity.view.XuexiaojianjieView;


/**
 * 理财新闻
 * 
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface XuexiaojianjieDao extends BaseMapper<XuexiaojianjieEntity> {
	
	List<XuexiaojianjieVO> selectListVO(@Param("ew") Wrapper<XuexiaojianjieEntity> wrapper);
	
	XuexiaojianjieVO selectVO(@Param("ew") Wrapper<XuexiaojianjieEntity> wrapper);
	
	List<XuexiaojianjieView> selectListView(@Param("ew") Wrapper<XuexiaojianjieEntity> wrapper);

	List<XuexiaojianjieView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaojianjieEntity> wrapper);
	
	XuexiaojianjieView selectView(@Param("ew") Wrapper<XuexiaojianjieEntity> wrapper);
	
}
