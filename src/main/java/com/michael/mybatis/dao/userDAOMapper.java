package com.michael.mybatis.dao;

import com.michael.mybatis.pojo.userDAO;
import com.michael.mybatis.pojo.userDAOExample;
import com.michael.mybatis.pojo.userDAOKey;
import com.michael.mybatis.pojo.userDAOWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userDAOMapper {
    long countByExample(userDAOExample example);

    int deleteByExample(userDAOExample example);

    int deleteByPrimaryKey(userDAOKey key);

    int insert(userDAOWithBLOBs record);

    int insertSelective(userDAOWithBLOBs record);

    List<userDAOWithBLOBs> selectByExampleWithBLOBs(userDAOExample example);

    List<userDAO> selectByExample(userDAOExample example);

    userDAOWithBLOBs selectByPrimaryKey(userDAOKey key);

    int updateByExampleSelective(@Param("record") userDAOWithBLOBs record, @Param("example") userDAOExample example);

    int updateByExampleWithBLOBs(@Param("record") userDAOWithBLOBs record, @Param("example") userDAOExample example);

    int updateByExample(@Param("record") userDAO record, @Param("example") userDAOExample example);

    int updateByPrimaryKeySelective(userDAOWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(userDAOWithBLOBs record);

    int updateByPrimaryKey(userDAO record);
}