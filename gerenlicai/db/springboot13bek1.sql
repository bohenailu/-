/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : gerenlicai

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2021-10-25 16:39:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `config`
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES ('1', 'picture1', 'upload/1634053229526.jpg');
INSERT INTO `config` VALUES ('2', 'picture2', 'upload/picture2.jpg');
INSERT INTO `config` VALUES ('3', 'picture3', 'upload/picture3.jpg');

-- ----------------------------
-- Table structure for `guihaijilu`
-- ----------------------------
DROP TABLE IF EXISTS `guihaijilu`;
CREATE TABLE `guihaijilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `guihaiduixiang` varchar(200) DEFAULT NULL COMMENT '归还对象',
  `guihaifangshi` varchar(200) DEFAULT NULL COMMENT '归还方式',
  `guihaijine` float DEFAULT NULL COMMENT '归还金额',
  `guihaishijian` date DEFAULT NULL COMMENT '归还时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `guihaijilu_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `guihaijilu_id` (`guihaijilu_id`),
  CONSTRAINT `guihaijilu_ibfk_1` FOREIGN KEY (`guihaijilu_id`) REFERENCES `zhichu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='归还记录';

-- ----------------------------
-- Records of guihaijilu
-- ----------------------------

-- ----------------------------
-- Table structure for `jierujilu`
-- ----------------------------
DROP TABLE IF EXISTS `jierujilu`;
CREATE TABLE `jierujilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `jieqianduixiang` varchar(200) DEFAULT NULL COMMENT '借钱对象',
  `jieqianfangshi` varchar(200) DEFAULT NULL COMMENT '借钱方式',
  `jierujine` float DEFAULT NULL COMMENT '借入金额',
  `jierushijian` date DEFAULT NULL COMMENT '借入时间',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `jierujilu_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `jierujilu_id` (`jierujilu_id`),
  CONSTRAINT `jierujilu_ibfk_1` FOREIGN KEY (`jierujilu_id`) REFERENCES `shouru` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8 COMMENT='借入记录';

-- ----------------------------
-- Records of jierujilu
-- ----------------------------

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  `news_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `news_id` (`news_id`),
  CONSTRAINT `news_ibfk_1` FOREIGN KEY (`news_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1634053263840 DEFAULT CHARSET=utf8 COMMENT='新闻咨询';

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for `shengqianmiaozhao`
-- ----------------------------
DROP TABLE IF EXISTS `shengqianmiaozhao`;
CREATE TABLE `shengqianmiaozhao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `neirong` longtext COMMENT '内容',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `shengqianmiaozhao_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `shengqianmiaozhao_id` (`shengqianmiaozhao_id`),
  CONSTRAINT `shengqianmiaozhao_ibfk_1` FOREIGN KEY (`shengqianmiaozhao_id`) REFERENCES `xuesheng` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1634053214026 DEFAULT CHARSET=utf8 COMMENT='省钱妙招';

-- ----------------------------
-- Records of shengqianmiaozhao
-- ----------------------------

-- ----------------------------
-- Table structure for `shouru`
-- ----------------------------
DROP TABLE IF EXISTS `shouru`;
CREATE TABLE `shouru` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shouzhileixing` varchar(200) DEFAULT NULL COMMENT '收支类型',
  `zhanghaoleixing` varchar(200) DEFAULT NULL COMMENT '账号类型',
  `jine` float DEFAULT NULL COMMENT '金额',
  `shijian` date DEFAULT NULL COMMENT '时间',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='收入';

-- ----------------------------
-- Records of shouru
-- ----------------------------

-- ----------------------------
-- Table structure for `shouzhileixing`
-- ----------------------------
DROP TABLE IF EXISTS `shouzhileixing`;
CREATE TABLE `shouzhileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shouzhileixing` varchar(200) DEFAULT NULL COMMENT '收支类型',
  `shouzhileixing_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `shouzhileixing_id` (`shouzhileixing_id`),
  CONSTRAINT `shouzhileixing_ibfk_1` FOREIGN KEY (`shouzhileixing_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='收支类型';

-- ----------------------------
-- Records of shouzhileixing
-- ----------------------------

-- ----------------------------
-- Table structure for `token`
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES ('1', '1', 'abo', 'users', '管理员', 'xg4kmr61eo66t1m1skv3yxy8b2i3ppml', '2021-10-12 23:39:09', '2021-10-13 00:39:33');
INSERT INTO `token` VALUES ('2', '1634053130241', '11', 'xuesheng', '用户', 'yp7zrrut1a73a4nzxddkye55lbc5binv', '2021-10-12 23:41:16', '2021-10-13 00:41:17');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of users
-- ----------------------------

-- ----------------------------
-- Table structure for `xiaofeidengji`
-- ----------------------------
DROP TABLE IF EXISTS `xiaofeidengji`;
CREATE TABLE `xiaofeidengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiaofeidengji` varchar(200) DEFAULT NULL COMMENT '消费等级',
  `dengjishuoming` longtext COMMENT '等级说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='消费等级';

-- ----------------------------
-- Records of xiaofeidengji
-- ----------------------------

-- ----------------------------
-- Table structure for `xiaofeiyusuan`
-- ----------------------------
DROP TABLE IF EXISTS `xiaofeiyusuan`;
CREATE TABLE `xiaofeiyusuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `yusuanjine` float DEFAULT NULL COMMENT '预算金额',
  `meizhoujine` float DEFAULT NULL COMMENT '每周金额',
  `shiyongshijian` varchar(200) DEFAULT NULL COMMENT '使用时间',
  `xiaofeiyusuan_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `xiaofeiyusuan_id` (`xiaofeiyusuan_id`),
  CONSTRAINT `xiaofeiyusuan_ibfk_1` FOREIGN KEY (`xiaofeiyusuan_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='消费预算';

-- ----------------------------
-- Records of xiaofeiyusuan
-- ----------------------------

-- ----------------------------
-- Table structure for `xuesheng`
-- ----------------------------
DROP TABLE IF EXISTS `xuesheng`;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `xuesheng_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`),
  KEY `xuesheng_id` (`xuesheng_id`),
  CONSTRAINT `xuesheng_ibfk_1` FOREIGN KEY (`xuesheng_id`) REFERENCES `xiaofeidengji` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1634053130242 DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
-- Records of xuesheng
-- ----------------------------

-- ----------------------------
-- Table structure for `xuexiaojianjie`
-- ----------------------------
DROP TABLE IF EXISTS `xuexiaojianjie`;
CREATE TABLE `xuexiaojianjie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `neirong` longtext COMMENT '内容',
  `shijian` datetime DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1634053190372 DEFAULT CHARSET=utf8 COMMENT='理财新闻';

-- ----------------------------
-- Records of xuexiaojianjie
-- ----------------------------

-- ----------------------------
-- Table structure for `zhichu`
-- ----------------------------
DROP TABLE IF EXISTS `zhichu`;
CREATE TABLE `zhichu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shouzhileixing` varchar(200) DEFAULT NULL COMMENT '收支类型',
  `zhanghaoleixing` varchar(200) DEFAULT NULL COMMENT '账号类型',
  `jine` float DEFAULT NULL COMMENT '金额',
  `shijian` date DEFAULT NULL COMMENT '时间',
  `beizhu` longtext COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='支出';

-- ----------------------------
-- Records of zhichu
-- ----------------------------
