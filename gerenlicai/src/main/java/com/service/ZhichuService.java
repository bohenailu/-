package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhichuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhichuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhichuView;


/**
 * 支出
 *
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface ZhichuService extends IService<ZhichuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhichuVO> selectListVO(Wrapper<ZhichuEntity> wrapper);
   	
   	ZhichuVO selectVO(@Param("ew") Wrapper<ZhichuEntity> wrapper);
   	
   	List<ZhichuView> selectListView(Wrapper<ZhichuEntity> wrapper);
   	
   	ZhichuView selectView(@Param("ew") Wrapper<ZhichuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhichuEntity> wrapper);
   	
}

