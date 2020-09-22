package com.wisrc.replenishment.webapp.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Date;

@Data
public class LogisticWaybillExcel {
    @ApiModelProperty(value = "物流交运单号")
    private String waybillId;
    @ApiModelProperty(value = "物流单号")
    private String logisticsId;
    @ApiModelProperty(value = "物流渠道")
    private String batchNumber;
    @ApiModelProperty(value = "物流渠道")
    private String offerId;
    @ApiModelProperty(value = "下单时间")
    private Date waybillOrderDate;
    @ApiModelProperty(value = "发货时间")
    private Date deliveryTime;
    @ApiModelProperty(value = "预计签收时间")
    private Date estimateDate;
    @ApiModelProperty(value = "实际签收时间")
    private Date signInDate;
    @ApiModelProperty(value = "物流异常说明")
    private String exceptionTypeDesc;
    @ApiModelProperty(value = "抛重/实重")
    private String weighTypeName;
    @ApiModelProperty(value = "预估计费重")
    private Double totalWeight;
    @ApiModelProperty(value = "预估单价")
    private Double unitPrice;
    //@ApiModelProperty(value = "单价附加费（元/KG）")
    //private Double otherFee;
//    @ApiModelProperty(value = "物流附加总单价")
    @ApiModelProperty(value = "其它费用")
    private Double otherFee;
    @ApiModelProperty(value = "附加总费用")
    private Double annexCost;
    @ApiModelProperty(value = "折扣费用")
    private Double discountedAmount;
    @ApiModelProperty(value = "费用合计")
    private Double totalCost;
    //    @ApiModelProperty(value = "实际计费重")
//    @ApiModelProperty(value = "实际运费")
//    @ApiModelProperty(value = "实际附加费")
    @ApiModelProperty(value = "备注")
    private String remark;
}
