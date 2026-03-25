package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShengqianmiaozhaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShengqianmiaozhaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShengqianmiaozhaoView;


/**
 * 省钱妙招
 *
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public interface ShengqianmiaozhaoService extends IService<ShengqianmiaozhaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShengqianmiaozhaoVO> selectListVO(Wrapper<ShengqianmiaozhaoEntity> wrapper);
   	
   	ShengqianmiaozhaoVO selectVO(@Param("ew") Wrapper<ShengqianmiaozhaoEntity> wrapper);
   	
   	List<ShengqianmiaozhaoView> selectListView(Wrapper<ShengqianmiaozhaoEntity> wrapper);
   	
   	ShengqianmiaozhaoView selectView(@Param("ew") Wrapper<ShengqianmiaozhaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShengqianmiaozhaoEntity> wrapper);
   	
}

