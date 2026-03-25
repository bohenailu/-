package com.entity.view;

import com.entity.ZhichuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 支出
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@TableName("zhichu")
public class ZhichuView  extends ZhichuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhichuView(){
	}
 
 	public ZhichuView(ZhichuEntity zhichuEntity){
 	try {
			BeanUtils.copyProperties(this, zhichuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
