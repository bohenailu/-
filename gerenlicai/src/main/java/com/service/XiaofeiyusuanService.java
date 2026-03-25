package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofeiyusuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofeiyusuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofeiyusuanView;


/**
 * 消费预算
 *
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface XiaofeiyusuanService extends IService<XiaofeiyusuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofeiyusuanVO> selectListVO(Wrapper<XiaofeiyusuanEntity> wrapper);
   	
   	XiaofeiyusuanVO selectVO(@Param("ew") Wrapper<XiaofeiyusuanEntity> wrapper);
   	
   	List<XiaofeiyusuanView> selectListView(Wrapper<XiaofeiyusuanEntity> wrapper);
   	
   	XiaofeiyusuanView selectView(@Param("ew") Wrapper<XiaofeiyusuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofeiyusuanEntity> wrapper);
   	
}

