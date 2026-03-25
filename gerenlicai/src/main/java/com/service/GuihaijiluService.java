package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuihaijiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuihaijiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuihaijiluView;


/**
 * 归还记录
 *
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface GuihaijiluService extends IService<GuihaijiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuihaijiluVO> selectListVO(Wrapper<GuihaijiluEntity> wrapper);
   	
   	GuihaijiluVO selectVO(@Param("ew") Wrapper<GuihaijiluEntity> wrapper);
   	
   	List<GuihaijiluView> selectListView(Wrapper<GuihaijiluEntity> wrapper);
   	
   	GuihaijiluView selectView(@Param("ew") Wrapper<GuihaijiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuihaijiluEntity> wrapper);
   	
}

