package com.entity.view;

import com.entity.ShengqianmiaozhaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 省钱妙招
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@TableName("shengqianmiaozhao")
public class ShengqianmiaozhaoView  extends ShengqianmiaozhaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShengqianmiaozhaoView(){
	}
 
 	public ShengqianmiaozhaoView(ShengqianmiaozhaoEntity shengqianmiaozhaoEntity){
 	try {
			BeanUtils.copyProperties(this, shengqianmiaozhaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
