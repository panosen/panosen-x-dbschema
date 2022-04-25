package com.panosen.dbschema.information_schema;

import com.panosen.orm.annonation.Type;

import java.sql.Types;

/**
 * 表
 * information_schema.tables
 */
public class Table {

    /**
     * 名称
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_NAME")
    @Type(type = Types.VARCHAR)
    private String tableName;

    /**
     * 说明
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_COMMENT")
    @Type(type = Types.VARCHAR)
    private String tableComment;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }
}