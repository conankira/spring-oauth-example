package com.thumbor.example.aouth.server.db.dao;

import com.thumbor.example.aouth.server.db.entity.ClientAuthority;
import com.thumbor.example.aouth.server.db.entity.ClientAuthorityExample.Criteria;
import com.thumbor.example.aouth.server.db.entity.ClientAuthorityExample.Criterion;
import com.thumbor.example.aouth.server.db.entity.ClientAuthorityExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ClientAuthoritySqlProvider {

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public String countByExample(ClientAuthorityExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tbl_client_authority");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public String deleteByExample(ClientAuthorityExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tbl_client_authority");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public String insertSelective(ClientAuthority record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tbl_client_authority");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getClient_id() != null) {
            sql.VALUES("client_id", "#{client_id,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthority() != null) {
            sql.VALUES("authority", "#{authority,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public String selectByExample(ClientAuthorityExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("client_id");
        sql.SELECT("authority");
        sql.FROM("tbl_client_authority");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        ClientAuthority record = (ClientAuthority) parameter.get("record");
        ClientAuthorityExample example = (ClientAuthorityExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("tbl_client_authority");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getClient_id() != null) {
            sql.SET("client_id = #{record.client_id,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthority() != null) {
            sql.SET("authority = #{record.authority,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tbl_client_authority");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("client_id = #{record.client_id,jdbcType=VARCHAR}");
        sql.SET("authority = #{record.authority,jdbcType=VARCHAR}");
        
        ClientAuthorityExample example = (ClientAuthorityExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public String updateByPrimaryKeySelective(ClientAuthority record) {
        SQL sql = new SQL();
        sql.UPDATE("tbl_client_authority");
        
        if (record.getClient_id() != null) {
            sql.SET("client_id = #{client_id,jdbcType=VARCHAR}");
        }
        
        if (record.getAuthority() != null) {
            sql.SET("authority = #{authority,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    protected void applyWhere(SQL sql, ClientAuthorityExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}