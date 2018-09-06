package com.thumbor.example.aouth.server.db.dao;

import com.thumbor.example.aouth.server.db.entity.ClientResource;
import com.thumbor.example.aouth.server.db.entity.ClientResourceExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface ClientResourceMapper {
    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @SelectProvider(type = ClientResourceSqlProvider.class, method = "countByExample")
    long countByExample(ClientResourceExample example);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @DeleteProvider(type = ClientResourceSqlProvider.class, method = "deleteByExample")
    int deleteByExample(ClientResourceExample example);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @Delete({
            "delete from tbl_client_resource",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @Insert({
            "insert into tbl_client_resource (id, client_id, ",
            "resource_id)",
            "values (#{id,jdbcType=INTEGER}, #{client_id,jdbcType=VARCHAR}, ",
            "#{resource_id,jdbcType=VARCHAR})"
    })
    int insert(ClientResource record);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @InsertProvider(type = ClientResourceSqlProvider.class, method = "insertSelective")
    int insertSelective(ClientResource record);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @SelectProvider(type = ClientResourceSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "client_id", property = "client_id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "resource_id", property = "resource_id", jdbcType = JdbcType.VARCHAR)
    })
    List<ClientResource> selectByExample(ClientResourceExample example);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @Select({
            "select",
            "id, client_id, resource_id",
            "from tbl_client_resource",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "client_id", property = "client_id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "resource_id", property = "resource_id", jdbcType = JdbcType.VARCHAR)
    })
    ClientResource selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, client_id, resource_id",
            "from tbl_client_resource",
            "where client_id = #{clientId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "client_id", property = "client_id", jdbcType = JdbcType.VARCHAR),
            @Result(column = "resource_id", property = "resource_id", jdbcType = JdbcType.VARCHAR)
    })
    List<ClientResource> selectByClientId(String clientId);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @UpdateProvider(type = ClientResourceSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClientResource record, @Param("example") ClientResourceExample example);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @UpdateProvider(type = ClientResourceSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") ClientResource record, @Param("example") ClientResourceExample example);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @UpdateProvider(type = ClientResourceSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClientResource record);

    /**
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @Update({
            "update tbl_client_resource",
            "set client_id = #{client_id,jdbcType=VARCHAR},",
            "resource_id = #{resource_id,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClientResource record);
}