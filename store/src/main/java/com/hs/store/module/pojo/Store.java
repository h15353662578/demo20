package com.hs.store.module.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author 华生
 * 2020/11/9
 */

@Data
@ApiModel(value = "商品实体")
@TableName("store")
public class Store {

    @ApiModelProperty(value = "主键ID")
    @TableId(type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品名")
    @TableField
    private String comName;

    @ApiModelProperty(value = "商品价格")
    @TableField
    private String comPrice;

    @ApiModelProperty(value = "品牌首字母")
    @TableField
    private String comFirstChar;

    @ApiModelProperty(value = "商品品牌")
    @TableField
    private String comBrand;

    @ApiModelProperty(value = "商品分类")
    @TableField
    private String comClass;

    @ApiModelProperty(value = "商品状态")
    @TableField
    private String comStatus;
}
