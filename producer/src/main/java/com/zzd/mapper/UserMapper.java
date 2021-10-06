package com.zzd.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzd.entity.User;
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
public interface UserMapper extends BaseMapper<User> {

    User byid(String id);

    IPage<User> list(IPage<User> page);

    User byMapperOtherEntity(@Param("id") String id);
}
