package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JierujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JierujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JierujiluView;


/**
 * 借入记录
 *
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface JierujiluService extends IService<JierujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JierujiluVO> selectListVO(Wrapper<JierujiluEntity> wrapper);
   	
   	JierujiluVO selectVO(@Param("ew") Wrapper<JierujiluEntity> wrapper);
   	
   	List<JierujiluView> selectListView(Wrapper<JierujiluEntity> wrapper);
   	
   	JierujiluView selectView(@Param("ew") Wrapper<JierujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JierujiluEntity> wrapper);
   	
}

