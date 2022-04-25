package com.panosen.dbschema.information_schema;

import com.panosen.orm.annonation.Type;

import java.sql.Types;

/**
 * 主键和外键
 * INFORMATION_SCHEMA.KEY_COLUMN_USAGE
 * https://dev.mysql.com/doc/mysql-infoschema-excerpt/8.0/en/information-schema-key-column-usage-table.html
 */
public class KeyColumnUsage {

  /**
     * 约束所属的目录的名称。 该值始终为def
     */
    @com.panosen.orm.annonation.Column(name = "CONSTRAINT_CATALOG")
    @Type(type = Types.VARCHAR)
    private String constraintCatalog;

    /**
     * 约束所属的结构（数据库）的名称
     */
    @com.panosen.orm.annonation.Column(name = "CONSTRAINT_SCHEMA")
    @Type(type = Types.VARCHAR)
    private String constraintSchema;

    /**
     * 约束名称
     */
    @com.panosen.orm.annonation.Column(name = "CONSTRAINT_NAME")
    @Type(type = Types.VARCHAR)
    private String constraintName;

    /**
     * 包含索引的表所属的目录的名称。 该值始终为def
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_CATALOG")
    @Type(type = Types.VARCHAR)
    private String tableCatalog;

    /**
     * 具有约束的表的数据库名称
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_SCHEMA")
    @Type(type = Types.VARCHAR)
    private String tableSchema;

    /**
     * 具有约束的表的名称
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_NAME")
    @Type(type = Types.VARCHAR)
    private String tableName;

    /**
     * 具有约束的列的名称。如果约束是外键，那么这是外键的列，而不是外键引用的列
     */
    @com.panosen.orm.annonation.Column(name = "COLUMN_NAME")
    @Type(type = Types.VARCHAR)
    private String columnName;

    /**
     * 列在约束内的位置，而不是列在表中的位置。 列位置从1开始编号
     */
    @com.panosen.orm.annonation.Column(name = "ORDINAL_POSITION")
    @Type(type = Types.INTEGER)
    private int ordinalPosition;

    /**
     * NULL表示唯一和主键约束。 对于外键约束，此列是正在引用的表的键中的序号位置
     */
    @com.panosen.orm.annonation.Column(name = "POSITION_IN_UNIQUE_CONSTRAINT")
    @Type(type = Types.VARCHAR)
    private String positionInUniqueConstraint;

    /**
     * 约束引用的结构（数据库）的名称
     */
    @com.panosen.orm.annonation.Column(name = "REFERENCED_TABLE_SCHEMA")
    @Type(type = Types.VARCHAR)
    private String referencedTableSchema;
    /**
     * 约束引用的表的名称
     */
    @com.panosen.orm.annonation.Column(name = "REFERENCED_TABLE_NAME")
    @Type(type = Types.VARCHAR)
    private String referencedTableName;

    /**
     * 约束引用的列的名称
     */
    @com.panosen.orm.annonation.Column(name = "REFERENCED_COLUMN_NAME")
    @Type(type = Types.VARCHAR)
    private String referencedColumnName;

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public int getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(int ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getPositionInUniqueConstraint() {
        return positionInUniqueConstraint;
    }

    public void setPositionInUniqueConstraint(String positionInUniqueConstraint) {
        this.positionInUniqueConstraint = positionInUniqueConstraint;
    }

    public String getReferencedTableSchema() {
        return referencedTableSchema;
    }

    public void setReferencedTableSchema(String referencedTableSchema) {
        this.referencedTableSchema = referencedTableSchema;
    }

    public String getReferencedTableName() {
        return referencedTableName;
    }

    public void setReferencedTableName(String referencedTableName) {
        this.referencedTableName = referencedTableName;
    }

    public String getReferencedColumnName() {
        return referencedColumnName;
    }

    public void setReferencedColumnName(String referencedColumnName) {
        this.referencedColumnName = referencedColumnName;
    }
}