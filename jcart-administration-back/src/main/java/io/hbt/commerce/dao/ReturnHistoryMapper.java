package io.hbt.commerce.dao;

import io.hbt.commerce.po.ReturnHistory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReturnHistoryMapper {
    int deleteByPrimaryKey(Long returnHistoryId);

    int insert(ReturnHistory record);

    int insertSelective(ReturnHistory record);

    ReturnHistory selectByPrimaryKey(Long returnHistoryId);

    int updateByPrimaryKeySelective(ReturnHistory record);

    int updateByPrimaryKey(ReturnHistory record);

    List<ReturnHistory> selectListByReturnId(Integer returnId);
}