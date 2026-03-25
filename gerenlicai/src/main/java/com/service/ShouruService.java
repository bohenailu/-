package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouruEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouruVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouruView;


/**
 * 收入
 *
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface ShouruService extends IService<ShouruEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouruVO> selectListVO(Wrapper<ShouruEntity> wrapper);
   	
   	ShouruVO selectVO(@Param("ew") Wrapper<ShouruEntity> wrapper);
   	
   	List<ShouruView> selectListView(Wrapper<ShouruEntity> wrapper);
   	
   	ShouruView selectView(@Param("ew") Wrapper<ShouruEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouruEntity> wrapper);
   	
}

