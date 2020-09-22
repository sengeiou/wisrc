package com.wisrc.purchase.webapp.entity;

import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

public class EntryWarehouseProductEntity {
    @ApiModelProperty(value = "唯一标识")
    private String uuid;
    @ApiModelProperty(value = "采购入库单号")
    private String entryId;
    @ApiModelProperty(value = "SKU")
    private String skuId;
    @ApiModelProperty(value = "入库数量")
    private int entryNum;
    @ApiModelProperty(value = "入备品数")
    private int entryFrets;
    @ApiModelProperty(value = "批次")
    private String batch;
    @ApiModelProperty(value = "不含税单价")
    private double unitPriceWithoutTax;
    @ApiModelProperty(value = "不含税金额")
    private double amountWithoutTax;
    @ApiModelProperty(value = "税率(%)")
    private double taxRate;
    @ApiModelProperty(value = "含税单价")
    private double unitPriceWithTax;
    @ApiModelProperty(value = "含税金额")
    private double amountWithTax;
    @ApiModelProperty(value = "创建时间")
    private Timestamp createTime;
    @ApiModelProperty(value = "创建人")
    private String createUser;
    @ApiModelProperty(value = "删除标志")
    private int deleteStatus;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(int entryNum) {
        this.entryNum = entryNum;
    }

    public int getEntryFrets() {
        return entryFrets;
    }

    public void setEntryFrets(int entryFrets) {
        this.entryFrets = entryFrets;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getUnitPriceWithoutTax() {
        return unitPriceWithoutTax;
    }

    public void setUnitPriceWithoutTax(double unitPriceWithoutTax) {
        this.unitPriceWithoutTax = unitPriceWithoutTax;
    }

    public double getAmountWithoutTax() {
        return amountWithoutTax;
    }

    public void setAmountWithoutTax(double amountWithoutTax) {
        this.amountWithoutTax = amountWithoutTax;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getUnitPriceWithTax() {
        return unitPriceWithTax;
    }

    public void setUnitPriceWithTax(double unitPriceWithTax) {
        this.unitPriceWithTax = unitPriceWithTax;
    }

    public double getAmountWithTax() {
        return amountWithTax;
    }

    public void setAmountWithTax(double amountWithTax) {
        this.amountWithTax = amountWithTax;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public String toString() {
        return "EntryWarehouseProductEntity{" +
                "uuid='" + uuid + '\'' +
                ", entryId='" + entryId + '\'' +
                ", skuId='" + skuId + '\'' +
                ", entryNum=" + entryNum +
                ", entryFrets=" + entryFrets +
                ", batch=" + batch +
                ", unitPriceWithoutTax=" + unitPriceWithoutTax +
                ", amountWithoutTax=" + amountWithoutTax +
                ", taxRate=" + taxRate +
                ", unitPriceWithTax=" + unitPriceWithTax +
                ", amountWithTax=" + amountWithTax +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", deleteStatus=" + deleteStatus +
                '}';
    }
}