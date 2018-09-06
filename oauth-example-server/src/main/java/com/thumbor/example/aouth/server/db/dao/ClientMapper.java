package com.thumbor.example.aouth.server.db.dao;

import com.thumbor.example.aouth.server.db.entity.Client;
import com.thumbor.example.aouth.server.db.entity.ClientExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface ClientMapper {
    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @SelectProvider(type = ClientSqlProvider.class, method = "countByExample")
    long countByExample(ClientExample example);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @DeleteProvider(type = ClientSqlProvider.class, method = "deleteByExample")
    int deleteByExample(ClientExample example);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @Delete({
            "delete from tbl_client",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @Insert({
            "insert into tbl_client (id, client_id, ",
            "client_secret)",
            "values (#{id,jdbcType=INTEGER}, #{client_id,jdbcType=VARCHAR}, ",
            "#{client_secret,jdbcType=VARCHAR})"
    })
    int insert(Client record);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @InsertProvider(type = ClientSqlProvider.class, method = "insertSelective")
    int insertSelective(Client record);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @SelectProvider(type = ClientSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "client_id", property = "client_id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "client_secret", property = "client_secret", jdbcType = JdbcType.VARCHAR)
    })
    List<Client> selectByExample(ClientExample example);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @Select({
            "select",
            "id, client_id, client_secret",
            "from tbl_client",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "client_id", property = "client_id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "client_secret", property = "client_secret", jdbcType = JdbcType.VARCHAR)
    })
    Client selectByPrimaryKey(Integer id);


    @Select({
            "select",
            "id, client_id, client_secret",
            "from tbl_client",
            "where client_id = #{clientId,jdbcType=VARCHAR} limit 1"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "client_id", property = "client_id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "client_secret", property = "client_secret", jdbcType = JdbcType.VARCHAR)
    })
    Client selectByClient(String clientId);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @UpdateProvider(type = ClientSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @UpdateProvider(type = ClientSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @UpdateProvider(type = ClientSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Client record);

    /**
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @Update({
            "update tbl_client",
            "set client_id = #{client_id,jdbcType=VARCHAR},",
            "client_secret = #{client_secret,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Client record);
}