package com.hs.store.module.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author 华生
 * 2020/11/9
 */

@Data
@ApiModel(value = "用户实体")
@TableName("user")
public class User implements Serializable {
    /***
     * 主键 自增
     */
    @ApiModelProperty(value = "主键ID")
    @TableId(type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户姓名")
    @TableField
    private String name;

    @ApiModelProperty(value = "账号")
    @TableField
    private String userName;

    @ApiModelProperty(value = "密码")
    @TableField
    private String password;

    @ApiModelProperty(value = "用户性别")
    @TableField
    private String userSex;

    @ApiModelProperty(value = "用户年龄")
    @TableField
    private String userAge;

    @ApiModelProperty(value = "用户电话")
    @TableField
    private String userPhone;

    @ApiModelProperty(value = "用户订单id")
    @TableField
    private BigInteger orderId;
}
