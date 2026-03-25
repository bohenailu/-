package com.entity.view;

import com.entity.XuexiaojianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 理财新闻
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@TableName("xuexiaojianjie")
public class XuexiaojianjieView  extends XuexiaojianjieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexiaojianjieView(){
	}
 
 	public XuexiaojianjieView(XuexiaojianjieEntity xuexiaojianjieEntity){
 	try {
			BeanUtils.copyProperties(this, xuexiaojianjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
