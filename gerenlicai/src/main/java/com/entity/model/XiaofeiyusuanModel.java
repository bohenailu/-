package com.entity.model;

import com.entity.XiaofeiyusuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 消费预算
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public class XiaofeiyusuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 预算金额
	 */
	
	private Float yusuanjine;
		
	/**
	 * 每周金额
	 */
	
	private Float meizhoujine;
		
	/**
	 * 使用时间
	 */
	
	private String shiyongshijian;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：预算金额
	 */
	 
	public void setYusuanjine(Float yusuanjine) {
		this.yusuanjine = yusuanjine;
	}
	
	/**
	 * 获取：预算金额
	 */
	public Float getYusuanjine() {
		return yusuanjine;
	}
				
	
	/**
	 * 设置：每周金额
	 */
	 
	public void setMeizhoujine(Float meizhoujine) {
		this.meizhoujine = meizhoujine;
	}
	
	/**
	 * 获取：每周金额
	 */
	public Float getMeizhoujine() {
		return meizhoujine;
	}
				
	
	/**
	 * 设置：使用时间
	 */
	 
	public void setShiyongshijian(String shiyongshijian) {
		this.shiyongshijian = shiyongshijian;
	}
	
	/**
	 * 获取：使用时间
	 */
	public String getShiyongshijian() {
		return shiyongshijian;
	}
			
}
