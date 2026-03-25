package com.entity.view;

import com.entity.GuihaijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 归还记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@TableName("guihaijilu")
public class GuihaijiluView  extends GuihaijiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuihaijiluView(){
	}
 
 	public GuihaijiluView(GuihaijiluEntity guihaijiluEntity){
 	try {
			BeanUtils.copyProperties(this, guihaijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
