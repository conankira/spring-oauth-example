package com.thumbor.example.aouth.server.db.dao;

import com.thumbor.example.aouth.server.db.entity.ClientAuthority;
import com.thumbor.example.aouth.server.db.entity.ClientAuthorityExample;
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
public interface ClientAuthorityMapper {
    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @SelectProvider(type=ClientAuthoritySqlProvider.class, method="countByExample")
    long countByExample(ClientAuthorityExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @DeleteProvider(type=ClientAuthoritySqlProvider.class, method="deleteByExample")
    int deleteByExample(ClientAuthorityExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @Delete({
        "delete from tbl_client_authority",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @Insert({
        "insert into tbl_client_authority (id, client_id, ",
        "authority)",
        "values (#{id,jdbcType=INTEGER}, #{client_id,jdbcType=VARCHAR}, ",
        "#{authority,jdbcType=VARCHAR})"
    })
    int insert(ClientAuthority record);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @InsertProvider(type=ClientAuthoritySqlProvider.class, method="insertSelective")
    int insertSelective(ClientAuthority record);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @SelectProvider(type=ClientAuthoritySqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="client_id", property="client_id", jdbcType=JdbcType.VARCHAR),
        @Result(column="authority", property="authority", jdbcType=JdbcType.VARCHAR)
    })
    List<ClientAuthority> selectByExample(ClientAuthorityExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @Select({
        "select",
        "id, client_id, authority",
        "from tbl_client_authority",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="client_id", property="client_id", jdbcType=JdbcType.VARCHAR),
        @Result(column="authority", property="authority", jdbcType=JdbcType.VARCHAR)
    })
    ClientAuthority selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, client_id, authority",
            "from tbl_client_authority",
            "where client_id = #{clientId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="client_id", property="client_id", jdbcType=JdbcType.VARCHAR),
            @Result(column="authority", property="authority", jdbcType=JdbcType.VARCHAR)
    })
    List<ClientAuthority> selectByClientId(String clientId);


    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @UpdateProvider(type=ClientAuthoritySqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClientAuthority record, @Param("example") ClientAuthorityExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @UpdateProvider(type=ClientAuthoritySqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ClientAuthority record, @Param("example") ClientAuthorityExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @UpdateProvider(type=ClientAuthoritySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClientAuthority record);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @Update({
        "update tbl_client_authority",
        "set client_id = #{client_id,jdbcType=VARCHAR},",
          "authority = #{authority,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClientAuthority record);
}