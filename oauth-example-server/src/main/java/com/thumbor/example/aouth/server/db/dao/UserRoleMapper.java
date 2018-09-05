package com.thumbor.example.aouth.server.db.dao;

import com.thumbor.example.aouth.server.db.entity.UserRole;
import com.thumbor.example.aouth.server.db.entity.UserRoleExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface UserRoleMapper {
    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @SelectProvider(type = UserRoleSqlProvider.class, method = "countByExample")
    long countByExample(UserRoleExample example);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @DeleteProvider(type = UserRoleSqlProvider.class, method = "deleteByExample")
    int deleteByExample(UserRoleExample example);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @Delete({
            "delete from tbl_user_role",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @Insert({
            "insert into tbl_user_role (id, user_id, ",
            "role_id)",
            "values (#{id,jdbcType=INTEGER}, #{user_id,jdbcType=INTEGER}, ",
            "#{role_id,jdbcType=INTEGER})"
    })
    int insert(UserRole record);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @InsertProvider(type = UserRoleSqlProvider.class, method = "insertSelective")
    int insertSelective(UserRole record);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @SelectProvider(type = UserRoleSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_id", property = "user_id", jdbcType = JdbcType.INTEGER),
            @Result(column = "role_id", property = "role_id", jdbcType = JdbcType.INTEGER)
    })
    List<UserRole> selectByExample(UserRoleExample example);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @Select({
            "select",
            "id, user_id, role_id",
            "from tbl_user_role",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_id", property = "user_id", jdbcType = JdbcType.INTEGER),
            @Result(column = "role_id", property = "role_id", jdbcType = JdbcType.INTEGER)
    })
    UserRole selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "tur.id, tur.user_id, tur.role_id,r.name",
            "from tbl_user_role as tur inner join tbl_role as r on r.id = tur.role_id",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "user_id", property = "user_id", jdbcType = JdbcType.INTEGER),
            @Result(column = "role_id", property = "role_id", jdbcType = JdbcType.INTEGER)
    })
    List<UserRole> selectByUserId(Integer userId);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @UpdateProvider(type = UserRoleSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @UpdateProvider(type = UserRoleSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") UserRole record, @Param("example") UserRoleExample example);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @UpdateProvider(type = UserRoleSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @Update({
            "update tbl_user_role",
            "set user_id = #{user_id,jdbcType=INTEGER},",
            "role_id = #{role_id,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserRole record);
}