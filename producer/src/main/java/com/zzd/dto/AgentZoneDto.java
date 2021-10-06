package com.zzd.dto;

import com.zzd.annotation.CheckParam;
import lombok.Data;

@Data
public class AgentZoneDto {

    @CheckParam(errorMsg = "123")
    private String zoneCode;
    private Long agentid;
}
