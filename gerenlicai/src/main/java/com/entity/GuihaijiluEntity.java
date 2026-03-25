package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 归还记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@TableName("guihaijilu")
public class GuihaijiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GuihaijiluEntity() {
		
	}
	
	public GuihaijiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 归还对象
	 */
					
	private String guihaiduixiang;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：归还对象
	 */
	public void setGuihaiduixiang(String guihaiduixiang) {
		this.guihaiduixiang = guihaiduixiang;
	}
	/**
	 * 获取：归还对象
	 */
	public String getGuihaiduixiang() {
		return guihaiduixiang;
	}
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
