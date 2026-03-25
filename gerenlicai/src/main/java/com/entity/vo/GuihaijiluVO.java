package com.entity.vo;

import com.entity.GuihaijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 归还记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
public class GuihaijiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 归还方式
	 */
	
	private String guihaifangshi;
		
	/**
	 * 归还金额
	 */
	
	private Float guihaijine;
		
	/**
	 * 归还时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihaishijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：归还方式
	 */
	 
	public void setGuihaifangshi(String guihaifangshi) {
		this.guihaifangshi = guihaifangshi;
	}
	
	/**
	 * 获取：归还方式
	 */
	public String getGuihaifangshi() {
		return guihaifangshi;
	}
				
	
	/**
	 * 设置：归还金额
	 */
	 
	public void setGuihaijine(Float guihaijine) {
		this.guihaijine = guihaijine;
	}
	
	/**
	 * 获取：归还金额
	 */
	public Float getGuihaijine() {
		return guihaijine;
	}
				
	
	/**
	 * 设置：归还时间
	 */
	 
	public void setGuihaishijian(Date guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	
	/**
	 * 获取：归还时间
	 */
	public Date getGuihaishijian() {
		return guihaishijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
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
			
}
