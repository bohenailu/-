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
 * 消费等级
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-10-12 23:36:57
 */
@TableName("xiaofeidengji")
public class XiaofeidengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaofeidengjiEntity() {
		
	}
	
	public XiaofeidengjiEntity(T t) {
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
	 * 消费等级
	 */
					
	private String xiaofeidengji;
	
	/**
	 * 等级说明
	 */
					
	private String dengjishuoming;
	
	
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
	 * 设置：消费等级
	 */
	public void setXiaofeidengji(String xiaofeidengji) {
		this.xiaofeidengji = xiaofeidengji;
	}
	/**
	 * 获取：消费等级
	 */
	public String getXiaofeidengji() {
		return xiaofeidengji;
	}
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
