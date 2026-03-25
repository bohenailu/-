package com.entity.vo;

import com.entity.ShouruEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 收入
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public class ShouruVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 收支类型
	 */
	
	private String shouzhileixing;
		
	/**
	 * 账号类型
	 */
	
	private String zhanghaoleixing;
		
	/**
	 * 金额
	 */
	
	private Float jine;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
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
	 * 设置：名称
	 */
	 
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
				
	
	/**
	 * 设置：收支类型
	 */
	 
	public void setShouzhileixing(String shouzhileixing) {
		this.shouzhileixing = shouzhileixing;
	}
	
	/**
	 * 获取：收支类型
	 */
	public String getShouzhileixing() {
		return shouzhileixing;
	}
				
	
	/**
	 * 设置：账号类型
	 */
	 
	public void setZhanghaoleixing(String zhanghaoleixing) {
		this.zhanghaoleixing = zhanghaoleixing;
	}
	
	/**
	 * 获取：账号类型
	 */
	public String getZhanghaoleixing() {
		return zhanghaoleixing;
	}
				
	
	/**
	 * 设置：金额
	 */
	 
	public void setJine(Float jine) {
		this.jine = jine;
	}
	
	/**
	 * 获取：金额
	 */
	public Float getJine() {
		return jine;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
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
