package com.entity.view;

import com.entity.XiaofeiyusuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消费预算
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@TableName("xiaofeiyusuan")
public class XiaofeiyusuanView  extends XiaofeiyusuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaofeiyusuanView(){
	}
 
 	public XiaofeiyusuanView(XiaofeiyusuanEntity xiaofeiyusuanEntity){
 	try {
			BeanUtils.copyProperties(this, xiaofeiyusuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
