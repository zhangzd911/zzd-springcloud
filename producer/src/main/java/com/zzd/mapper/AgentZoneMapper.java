package com.zzd.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zzd.dto.AgentZoneDto;
import com.zzd.entity.AgentZone;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2021-06-21
 */
@Mapper
public interface AgentZoneMapper extends BaseMapper<AgentZone> {

    AgentZone byid(String id);

    IPage<AgentZone> list(IPage<AgentZone> page);

    AgentZoneDto byMapperOtherEntity(@Param("id") String id);
}
