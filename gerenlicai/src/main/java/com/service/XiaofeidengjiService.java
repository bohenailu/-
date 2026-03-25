package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofeidengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofeidengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofeidengjiView;


/**
 * 消费等级
 *
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface XiaofeidengjiService extends IService<XiaofeidengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofeidengjiVO> selectListVO(Wrapper<XiaofeidengjiEntity> wrapper);
   	
   	XiaofeidengjiVO selectVO(@Param("ew") Wrapper<XiaofeidengjiEntity> wrapper);
   	
   	List<XiaofeidengjiView> selectListView(Wrapper<XiaofeidengjiEntity> wrapper);
   	
   	XiaofeidengjiView selectView(@Param("ew") Wrapper<XiaofeidengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofeidengjiEntity> wrapper);
   	
}

