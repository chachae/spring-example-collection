package com.chachae.entity.bo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @author chachae
 * @date 2019/12/20 11:02
 */
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "t_user_info")
public class UserInfo extends Model<UserInfo> {

  // id
  private Long id;
  // 邮箱地址
  private String email;
  // 手机号码
  @Length(max = 15, message = "手机号长度不能超过15位")
  private String mobile;
  // 是否为管理员
  private Boolean admin;
  // 性别
  private Integer gender;
  // 部门id
  private Integer departmentId;
  // 头像地址
  private String avatar;
  // QQ号
  @Length(max = 15, message = "QQ号长度不能超过15位")
  private Integer qqNumber;
  // 微信id
  @Length(max = 20, message = "微信号不能超过20位")
  private String wechatId;
  // 个人主页
  @Length(max = 50, message = "个人主页不能超过50位")
  private String site;
  // 个人介绍
  @Length(max = 50, message = "个人介绍不能超过50个字")
  private String description;
  // 创建时间
  private Date createTime;
  // 更新时间
  private Date updateTime;
  // 登陆时间
  private Date loginTime;
  // 登录IP
  private String loginIp;
}