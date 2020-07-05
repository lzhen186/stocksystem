/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : 127.0.0.1:3306
 Source Schema         : stock

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 05/07/2020 08:31:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dishname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `dishprice` decimal(10, 2) NULL DEFAULT NULL,
  `dishnum` int(11) NULL DEFAULT NULL,
  `dishimg` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `dishinfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '豌豆', 3.12, 100, NULL, '豌豆');
INSERT INTO `goods` VALUES (2, '西瓜', 4.00, 300, NULL, '西瓜');
INSERT INTO `goods` VALUES (3, '南瓜', 3.00, 300, NULL, '南瓜');
INSERT INTO `goods` VALUES (4, '北瓜', 32.00, 500, '', '北瓜');
INSERT INTO `goods` VALUES (5, '冬瓜', 4.00, 700, NULL, '冬瓜');
INSERT INTO `goods` VALUES (6, '土豆', 3.00, 700, NULL, '土豆');
INSERT INTO `goods` VALUES (7, '黄瓜', 2.33, 200, NULL, '黄瓜');
INSERT INTO `goods` VALUES (8, '丝瓜', 2.00, 300, NULL, '丝瓜');
INSERT INTO `goods` VALUES (9, '葫芦', 3.00, 200, NULL, '葫芦');
INSERT INTO `goods` VALUES (10, '西红柿', 3.22, 200, NULL, '西红柿');
INSERT INTO `goods` VALUES (11, '豆角', 2.33, 300, NULL, '豆角');
INSERT INTO `goods` VALUES (12, '茄子', 3.00, 300, NULL, '茄子');
INSERT INTO `goods` VALUES (13, '花菜', 3.00, 300, NULL, '花菜');
INSERT INTO `goods` VALUES (14, '菠菜', 4.00, 300, NULL, '菠菜');
INSERT INTO `goods` VALUES (15, '白菜', 3.00, 700, NULL, '白菜');
INSERT INTO `goods` VALUES (16, '橄榄菜', 4.00, 400, NULL, '橄榄菜');
INSERT INTO `goods` VALUES (17, '青菜', 5.00, 400, NULL, '青菜');
INSERT INTO `goods` VALUES (18, '紫菜', 5.00, 500, NULL, '紫菜');
INSERT INTO `goods` VALUES (19, '娃娃菜', 4.00, 300, NULL, '娃娃菜');

-- ----------------------------
-- Table structure for list
-- ----------------------------
DROP TABLE IF EXISTS `list`;
CREATE TABLE `list`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dishname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `dishnum` int(11) NULL DEFAULT NULL,
  `dishprice` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 115 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of list
-- ----------------------------
INSERT INTO `list` VALUES (109, '豌豆', 100, 3.12);
INSERT INTO `list` VALUES (110, '北瓜', 300, 32.00);
INSERT INTO `list` VALUES (111, '冬瓜', 100, 4.00);
INSERT INTO `list` VALUES (112, '土豆', 100, 3.00);
INSERT INTO `list` VALUES (113, '豆角', 300, 2.33);
INSERT INTO `list` VALUES (114, '南瓜', 200, 3.00);

-- ----------------------------
-- Table structure for orderlist
-- ----------------------------
DROP TABLE IF EXISTS `orderlist`;
CREATE TABLE `orderlist`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `dishname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `dishnum` int(11) NULL DEFAULT NULL,
  `dishprice` decimal(10, 2) NULL DEFAULT NULL,
  `orderid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 99 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `Id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'root', 'root');

SET FOREIGN_KEY_CHECKS = 1;
