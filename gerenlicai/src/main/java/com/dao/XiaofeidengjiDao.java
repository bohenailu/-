package com.dao;

import com.entity.XiaofeidengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofeidengjiVO;
import com.entity.view.XiaofeidengjiView;


/**
 * 消费等级
 * 
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface XiaofeidengjiDao extends BaseMapper<XiaofeidengjiEntity> {
	
	List<XiaofeidengjiVO> selectListVO(@Param("ew") Wrapper<XiaofeidengjiEntity> wrapper);
	
	XiaofeidengjiVO selectVO(@Param("ew") Wrapper<XiaofeidengjiEntity> wrapper);
	
	List<XiaofeidengjiView> selectListView(@Param("ew") Wrapper<XiaofeidengjiEntity> wrapper);

	List<XiaofeidengjiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofeidengjiEntity> wrapper);
	
	XiaofeidengjiView selectView(@Param("ew") Wrapper<XiaofeidengjiEntity> wrapper);
	
}
