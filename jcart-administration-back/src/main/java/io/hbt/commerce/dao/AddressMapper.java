package io.hbt.commerce.dao;

import io.hbt.commerce.po.Address;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);
}