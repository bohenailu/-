package com.entity.model;

import com.entity.JierujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 借入记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public class JierujiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 借钱对象
	 */
	
	private String jieqianduixiang;
		
	/**
	 * 借钱方式
	 */
	
	private String jieqianfangshi;
		
	/**
	 * 借入金额
	 */
	
	private Float jierujine;
		
	/**
	 * 借入时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jierushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：借钱对象
	 */
	 
	public void setJieqianduixiang(String jieqianduixiang) {
		this.jieqianduixiang = jieqianduixiang;
	}
	
	/**
	 * 获取：借钱对象
	 */
	public String getJieqianduixiang() {
		return jieqianduixiang;
	}
				
	
	/**
	 * 设置：借钱方式
	 */
	 
	public void setJieqianfangshi(String jieqianfangshi) {
		this.jieqianfangshi = jieqianfangshi;
	}
	
	/**
	 * 获取：借钱方式
	 */
	public String getJieqianfangshi() {
		return jieqianfangshi;
	}
				
	
	/**
	 * 设置：借入金额
	 */
	 
	public void setJierujine(Float jierujine) {
		this.jierujine = jierujine;
	}
	
	/**
	 * 获取：借入金额
	 */
	public Float getJierujine() {
		return jierujine;
	}
				
	
	/**
	 * 设置：借入时间
	 */
	 
	public void setJierushijian(Date jierushijian) {
		this.jierushijian = jierushijian;
	}
	
	/**
	 * 获取：借入时间
	 */
	public Date getJierushijian() {
		return jierushijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
