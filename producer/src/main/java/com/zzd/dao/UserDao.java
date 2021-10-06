package com.zzd.dao;

import com.zzd.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface UserDao
		extends PagingAndSortingRepository<User, Integer>, JpaSpecificationExecutor<User> {


}
