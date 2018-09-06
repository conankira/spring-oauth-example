package com.thumbor.example.aouth.server.db.dao;

import com.thumbor.example.aouth.server.db.entity.ClientGrantType;
import com.thumbor.example.aouth.server.db.entity.ClientGrantTypeExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface ClientGrantTypeMapper {
    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @SelectProvider(type = ClientGrantTypeSqlProvider.class, method = "countByExample")
    long countByExample(ClientGrantTypeExample example);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @DeleteProvider(type = ClientGrantTypeSqlProvider.class, method = "deleteByExample")
    int deleteByExample(ClientGrantTypeExample example);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @Delete({
            "delete from tbl_client_grant_type",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @Insert({
            "insert into tbl_client_grant_type (id, client_id, ",
            "grant_type)",
            "values (#{id,jdbcType=INTEGER}, #{client_id,jdbcType=VARCHAR}, ",
            "#{grant_type,jdbcType=VARCHAR})"
    })
    int insert(ClientGrantType record);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @InsertProvider(type = ClientGrantTypeSqlProvider.class, method = "insertSelective")
    int insertSelective(ClientGrantType record);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @SelectProvider(type = ClientGrantTypeSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "client_id", property = "client_id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "grant_type", property = "grant_type", jdbcType = JdbcType.VARCHAR)
    })
    List<ClientGrantType> selectByExample(ClientGrantTypeExample example);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @Select({
            "select",
            "id, client_id, grant_type",
            "from tbl_client_grant_type",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "client_id", property = "client_id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "grant_type", property = "grant_type", jdbcType = JdbcType.VARCHAR)
    })
    ClientGrantType selectByPrimaryKey(Integer id);


    @Select({
            "select",
            "id, client_id, grant_type",
            "from tbl_client_grant_type",
            "where client_id = #{clientId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "client_id", property = "client_id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "grant_type", property = "grant_type", jdbcType = JdbcType.VARCHAR)
    })
    List<ClientGrantType> selectByClientId(String clientId);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @UpdateProvider(type = ClientGrantTypeSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClientGrantType record, @Param("example") ClientGrantTypeExample example);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @UpdateProvider(type = ClientGrantTypeSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") ClientGrantType record, @Param("example") ClientGrantTypeExample example);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @UpdateProvider(type = ClientGrantTypeSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClientGrantType record);

    /**
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @Update({
            "update tbl_client_grant_type",
            "set client_id = #{client_id,jdbcType=VARCHAR},",
            "grant_type = #{grant_type,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClientGrantType record);
}