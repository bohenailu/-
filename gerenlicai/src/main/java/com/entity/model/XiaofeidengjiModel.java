package com.entity.model;

import com.entity.XiaofeidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 消费等级
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public class XiaofeidengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 等级说明
	 */
	
	private String dengjishuoming;
				
	
	/**
	 * 设置：等级说明
	 */
	 
	public void setDengjishuoming(String dengjishuoming) {
		this.dengjishuoming = dengjishuoming;
	}
	
	/**
	 * 获取：等级说明
	 */
	public String getDengjishuoming() {
		return dengjishuoming;
	}
			
}
