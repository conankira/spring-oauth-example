package com.thumbor.example.aouth.server.db.dao;

import com.thumbor.example.aouth.server.db.entity.ClientRedirect;
import com.thumbor.example.aouth.server.db.entity.ClientRedirectExample;
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
public interface ClientRedirectMapper {
    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @SelectProvider(type=ClientRedirectSqlProvider.class, method="countByExample")
    long countByExample(ClientRedirectExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @DeleteProvider(type=ClientRedirectSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClientRedirectExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @Delete({
        "delete from tbl_client_redirect",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @Insert({
        "insert into tbl_client_redirect (id, client_id, ",
        "redirect_uri)",
        "values (#{id,jdbcType=INTEGER}, #{client_id,jdbcType=VARCHAR}, ",
        "#{redirect_uri,jdbcType=VARCHAR})"
    })
    int insert(ClientRedirect record);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @InsertProvider(type=ClientRedirectSqlProvider.class, method="insertSelective")
    int insertSelective(ClientRedirect record);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @SelectProvider(type=ClientRedirectSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="client_id", property="client_id", jdbcType=JdbcType.VARCHAR),
        @Result(column="redirect_uri", property="redirect_uri", jdbcType=JdbcType.VARCHAR)
    })
    List<ClientRedirect> selectByExample(ClientRedirectExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @Select({
        "select",
        "id, client_id, redirect_uri",
        "from tbl_client_redirect",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="client_id", property="client_id", jdbcType=JdbcType.VARCHAR),
        @Result(column="redirect_uri", property="redirect_uri", jdbcType=JdbcType.VARCHAR)
    })
    ClientRedirect selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, client_id, redirect_uri",
            "from tbl_client_redirect",
            "where client_id = #{clientId,jdbcType=VARCHAR}"
    })
    @Results({
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="client_id", property="client_id", jdbcType=JdbcType.VARCHAR),
            @Result(column="redirect_uri", property="redirect_uri", jdbcType=JdbcType.VARCHAR)
    })
    List<ClientRedirect> selectByClientId(String clientId);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @UpdateProvider(type=ClientRedirectSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ClientRedirect record, @Param("example") ClientRedirectExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @UpdateProvider(type=ClientRedirectSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ClientRedirect record, @Param("example") ClientRedirectExample example);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @UpdateProvider(type=ClientRedirectSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ClientRedirect record);

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @Update({
        "update tbl_client_redirect",
        "set client_id = #{client_id,jdbcType=VARCHAR},",
          "redirect_uri = #{redirect_uri,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ClientRedirect record);
}