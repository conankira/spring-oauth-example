package com.thumbor.example.aouth.server.db.dao;

import com.thumbor.example.aouth.server.db.entity.ClientScope;
import com.thumbor.example.aouth.server.db.entity.ClientScopeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ClientScopeMapper {
    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @SelectProvider(type=ClientScopeSqlProvider.class, method="countByExample")
    long countByExample(ClientScopeExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @DeleteProvider(type=ClientScopeSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClientScopeExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @Delete({
        "delete from tbl_client_scope",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @Insert({
        "insert into tbl_client_scope (id, client_id, ",
        "scope)",
        "values (#{id,jdbcType=INTEGER}, #{client_id,jdbcType=VARCHAR}, ",
        "#{scope,jdbcType=VARCHAR})"
    })
    int insert(ClientScope record);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @InsertProvider(type=ClientScopeSqlProvider.class, method="insertSelective")
    int insertSelective(ClientScope record);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @SelectProvider(type=ClientScopeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="client_id", property="client_id", jdbcType=JdbcType.VARCHAR),
        @Result(column="scope", property="scope", jdbcType=JdbcType.VARCHAR)
    })
    List<ClientScope> selectByExample(ClientScopeExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @Select({
        "select",
        "id, client_id, scope",
        "from tbl_client_scope",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="client_id", property="client_id", jdbcType=JdbcType.VARCHAR),
        @Result(column="scope", property="scope", jdbcType=JdbcType.VARCHAR)
    })
    ClientScope selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, client_id, scope",
            "from tbl_client_scope",
            "where client_id = #{clientId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="client_id", property="client_id", jdbcType=JdbcType.VARCHAR),
            @Result(column="scope", property="scope", jdbcType=JdbcType.VARCHAR)
    })
    List<ClientScope> selectByClientId(String clientId);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @UpdateProvider(type=ClientScopeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClientScope record, @Param("example") ClientScopeExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @UpdateProvider(type=ClientScopeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ClientScope record, @Param("example") ClientScopeExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @UpdateProvider(type=ClientScopeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClientScope record);

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @Update({
        "update tbl_client_scope",
        "set client_id = #{client_id,jdbcType=VARCHAR},",
          "scope = #{scope,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClientScope record);
}