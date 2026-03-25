package com.entity.vo;

import com.entity.XiaofeidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 消费等级
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public class XiaofeidengjiVO  implements Serializable {
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
