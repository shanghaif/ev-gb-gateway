package com.dyy.tsp.evgb.gateway.protocol.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 车辆缓存
 * created by dyy
 */
@SuppressWarnings("all")
@Data
public class VehicleCache {

    @ApiModelProperty(value = "是否车辆登入")
    private Boolean login;

    @ApiModelProperty(value = "最后一次登入时间")
    private String lastLoginTime;

    @ApiModelProperty(value = "最后一次登入流水号")
    private Integer lastLoginSerialNum;

    @ApiModelProperty(value = "最后一次登出时间")
    private String lastLogoutTime;

    @ApiModelProperty(value = "最后一次登出流水号")
    private Integer lastLogoutSerialNum;
}
