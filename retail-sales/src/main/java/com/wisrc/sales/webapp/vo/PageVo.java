package com.wisrc.sales.webapp.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;

@Data
@ApiModel(description = "页面VO插件")
public class PageVo {
    @ApiModelProperty(value = "页码", required = false)
////    @NotNull(message = "缺少页码")
//    @Min(value = 1, message = "非法页码")
    private Integer pageNum;
    //
    @ApiModelProperty(value = "单页数量", required = false)
////    @NotNull(message = "缺少单页数量")
    @Min(value = 1, message = "非法单页数量")
    private Integer pageSize;
}
