package com.wisrc.basic.vo.swagger;

import com.wisrc.basic.vo.CompanyBasicInfoVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class CompanyBasicModel {
    @ApiModelProperty(value = "返回状态吗", position = 1)
    private int code;

    @ApiModelProperty(value = "返回消息", position = 2)
    private int msg;

    @ApiModelProperty(value = "公司基本信息", position = 3)
    private CompanyBasicInfoVO companyBasicInfoVO;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMsg() {
        return msg;
    }

    public void setMsg(int msg) {
        this.msg = msg;
    }

    public CompanyBasicInfoVO getCompanyBasicInfoVO() {
        return companyBasicInfoVO;
    }

    public void setCompanyBasicInfoVO(CompanyBasicInfoVO companyBasicInfoVO) {
        this.companyBasicInfoVO = companyBasicInfoVO;
    }
}
