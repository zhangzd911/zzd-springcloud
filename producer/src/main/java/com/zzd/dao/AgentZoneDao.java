package com.zzd.dao;

import com.zzd.entity.AgentZone;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface AgentZoneDao
		extends PagingAndSortingRepository<AgentZone, String>, JpaSpecificationExecutor<AgentZone> {


}
