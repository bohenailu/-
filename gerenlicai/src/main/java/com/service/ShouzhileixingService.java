package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouzhileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouzhileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouzhileixingView;


/**
 * 收支类型
 *
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface ShouzhileixingService extends IService<ShouzhileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouzhileixingVO> selectListVO(Wrapper<ShouzhileixingEntity> wrapper);
   	
   	ShouzhileixingVO selectVO(@Param("ew") Wrapper<ShouzhileixingEntity> wrapper);
   	
   	List<ShouzhileixingView> selectListView(Wrapper<ShouzhileixingEntity> wrapper);
   	
   	ShouzhileixingView selectView(@Param("ew") Wrapper<ShouzhileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouzhileixingEntity> wrapper);
   	
}

