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
 * 消费预算
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@TableName("xiaofeiyusuan")
public class XiaofeiyusuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaofeiyusuanEntity() {
		
	}
	
	public XiaofeiyusuanEntity(T t) {
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
	 * 账号
	 */
					
	private String zhanghao;
	
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
