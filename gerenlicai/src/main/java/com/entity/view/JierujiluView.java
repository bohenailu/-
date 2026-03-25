package com.entity.view;

import com.entity.JierujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 借入记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@TableName("jierujilu")
public class JierujiluView  extends JierujiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JierujiluView(){
	}
 
 	public JierujiluView(JierujiluEntity jierujiluEntity){
 	try {
			BeanUtils.copyProperties(this, jierujiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
