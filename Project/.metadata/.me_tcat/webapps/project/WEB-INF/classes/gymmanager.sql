# Host: 127.0.0.1  (Version: 5.7.4-m14)
# Date: 2014-10-27 19:38:04
# Generator: MySQL-Front 5.3  (Build 4.13)

/*!40101 SET NAMES utf8 */;

#
# Source for table "tb_admin"
#

DROP TABLE IF EXISTS `tb_admin`;
CREATE TABLE `tb_admin` (
  `aID` int(11) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `adminName` varchar(45) DEFAULT NULL,
  `gymName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`aID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_admin"
#


#
# Source for table "tb_field"
#

DROP TABLE IF EXISTS `tb_field`;
CREATE TABLE `tb_field` (
  `fID` int(11) NOT NULL,
  `fieldName` varchar(255) DEFAULT NULL,
  `openDays` varchar(255) DEFAULT NULL,
  `startTime` time DEFAULT NULL,
  `endTime` time DEFAULT NULL,
  `noticeDate` datetime DEFAULT NULL,
  `notices` varchar(999) DEFAULT NULL,
  `capacity` varchar(45) DEFAULT NULL,
  `isBooked` varchar(45) DEFAULT NULL,
  `isFree` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `summary` varchar(999) DEFAULT NULL COMMENT 'The information of the field.',
  PRIMARY KEY (`fID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_field"
#

INSERT INTO `tb_field` VALUES (3001,'男子健美','周一至周六','18:00:00','21:00:00',NULL,NULL,'','',NULL,'正心楼体育馆',NULL),(3002,'有氧健身操（1）','周一三五','19:10:00','20:40:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3003,'有氧健身操（2）','周二四六','18:00:00','19:30:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3004,'瑜伽','周一三五','18:00:00','19:00:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3005,'传统武术','周一三五','12:00:00','13:10:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3006,'少林武术（拳术、器械）','周一三五','18:00:00','19:00:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3007,'散打初级班','周一三五','18:00:00','19:30:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3008,'散打高级班','周一三五','19:40:00','21:10:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3009,'跆拳道初级班','周二四六','18:00:00','19:30:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3010,'跆拳道高级班','周二四六','19:40:00','21:10:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3011,'击剑','周一、五','06:00:00','07:30:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL),(3012,'体育舞蹈','周二四六','18:00:00','19:30:00',NULL,NULL,NULL,NULL,NULL,'正心楼体育馆',NULL);

#
# Source for table "tb_gym"
#

DROP TABLE IF EXISTS `tb_gym`;
CREATE TABLE `tb_gym` (
  `gymName` varchar(100) NOT NULL,
  `gymAddress` varchar(999) DEFAULT NULL,
  `summary` varchar(999) DEFAULT NULL,
  `tel` varchar(999) DEFAULT NULL,
  PRIMARY KEY (`gymName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_gym"
#

INSERT INTO `tb_gym` VALUES ('一区体育馆','哈工大一校区 西侧室内体育馆','健美、武术','负责人：关亚军  联系电话：86416164'),('一区田径场','哈工大一校区 南侧体育场','田径、武术','负责人：罗大林  联系电话：86413180'),('二校区文体活动中心','哈工大二校区 活动中心楼','室内篮球、网球、排球场','负责人：马忠权  联系电话：86282165'),('二校区田径场','哈工大二校区 田径场','田径、室外篮球场','负责人：马忠权  联系电话：86282165'),('室外篮球场','哈工大一校区 繁荣街与校园街街口','撒旦','负责人：张新  联系电话：86403293'),('小足球场','哈工大一校区 田径场东','足球','负责人：张新  联系电话：86403293'),('正心楼体育馆','哈工大一校区 正心楼地 下室','羽毛球、乒乓球、健美室、舞蹈室','负责人：张新  联系电话：86403293');

#
# Source for table "tb_users"
#

DROP TABLE IF EXISTS `tb_users`;
CREATE TABLE `tb_users` (
  `uID` int(11) NOT NULL,
  `username` varchar(45) DEFAULT 'null',
  `password` varchar(45) DEFAULT 'null' COMMENT '用户基本信息',
  `grade` varchar(45) DEFAULT 'null',
  `age` int(11) DEFAULT '0',
  `gender` varchar(45) DEFAULT 'null',
  `height` int(11) DEFAULT '0',
  `weight` int(11) DEFAULT '0',
  `registerTime` datetime DEFAULT NULL,
  `excericeAim` varchar(999) DEFAULT 'null',
  PRIMARY KEY (`uID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "tb_users"
#

