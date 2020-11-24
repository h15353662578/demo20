package com.hs.store.module.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

import java.util.List;

/**
 * @author 华生
 * 2020/11/12
 */

@Data
@ApiModel("订单实体")
@TableName(value = "order")
public class Order {

    @ApiModelProperty(value = "订单id")
    @TableId(type = IdType.AUTO)
    private Long orderId;

    @ApiModelProperty(value = "商品名")
    @TableField
    private String orderStoreName;

    @ApiModelProperty(value = "商品价格")
    @TableField
    private String orderStorePrice;

    @ApiModelProperty(value = "商品数量")
    @TableField
    private String orderStoreMath;

    @ApiModelProperty(value = "订单合计")
    @TableField
    private String orderStoreTot;

    @ApiModelProperty(value = "订单状态")
    @TableField
    private String orderStatus;

    @ApiModelProperty(value = "订单收货地址")
    @TableField
    private String orderUserAddress;

}
