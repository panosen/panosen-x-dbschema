package com.panosen.dbschema.information_schema;

import com.panosen.orm.annonation.Type;

import java.sql.Types;

/**
 * INFORMATION_SCHEMA.STATISTICS
 * https://dev.mysql.com/doc/mysql-infoschema-excerpt/8.0/en/information-schema-statistics-table.html
 */
public class Statistics {

    /**
     * The name of the catalog to which the table containing the index belongs. This value is always def.
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_CATALOG")
    @Type(type = Types.VARCHAR)
    private String tableCatalog;

    /**
     * The name of the schema (database) to which the table containing the index belongs.
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_SCHEMA")
    @Type(type = Types.VARCHAR)
    private String tableSchema;

    /**
     * The name of the table containing the index.
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_NAME")
    @Type(type = Types.VARCHAR)
    private String tableName;

    /**
     * 0 if the index cannot contain duplicates, 1 if it can.
     */
    @com.panosen.orm.annonation.Column(name = "NON_UNIQUE")
    @Type(type = Types.INTEGER)
    private int nonUnique;

    /**
     * The name of the schema (database) to which the index belongs.
     */
    @com.panosen.orm.annonation.Column(name = "INDEX_SCHEMA")
    @Type(type = Types.VARCHAR)
    private String indexSchema;

    /**
     * The name of the index. If the index is the primary key, the name is always PRIMARY.
     */
    @com.panosen.orm.annonation.Column(name = "INDEX_NAME")
    @Type(type = Types.VARCHAR)
    private String indexName;

    /**
     * The column sequence number in the index, starting with 1.
     */
    @com.panosen.orm.annonation.Column(name = "SEQ_IN_INDEX")
    @Type(type = Types.INTEGER)
    private int seqInIndex;

    /**
     * The column name. See also the description for the EXPRESSION column.
     */
    @com.panosen.orm.annonation.Column(name = "COLUMN_NAME")
    @Type(type = Types.VARCHAR)
    private String columnName;

    /**
     * How the column is sorted in the index. This can have values A (ascending), D (descending), or NULL (not sorted).
     */
    @com.panosen.orm.annonation.Column(name = "COLLATION")
    @Type(type = Types.VARCHAR)
    private String collation;

    /**
     * An estimate of the number of unique values in the index. To update this number, run ANALYZE TABLE or (for MyISAM tables) myisamchk -a.
     * CARDINALITY is counted based on statistics stored as integers, so the value is not necessarily exact even for small tables.
     * The higher the cardinality, the greater the chance that MySQL uses the index when doing joins.
     */
    @com.panosen.orm.annonation.Column(name = "CARDINALITY")
    @Type(type = Types.VARCHAR)
    private String cardinality;

    /**
     * The index prefix. That is, the number of indexed characters if the column is only partly indexed, NULL if the entire column is indexed.
     */
    @com.panosen.orm.annonation.Column(name = "SUB_PART")
    @Type(type = Types.VARCHAR)
    private String subPart;

    /**
     * Indicates how the key is packed. NULL if it is not.
     */
    @com.panosen.orm.annonation.Column(name = "PACKED")
    @Type(type = Types.VARCHAR)
    private String packed;

    /**
     * Contains YES if the column may contain NULL values and '' if not.
     */
    @com.panosen.orm.annonation.Column(name = "NULLABLE")
    @Type(type = Types.VARCHAR)
    private String nullable;

    /**
     * The index method used (BTREE, FULLTEXT, HASH, RTREE).
     */
    @com.panosen.orm.annonation.Column(name = "INDEX_TYPE")
    @Type(type = Types.VARCHAR)
    private String indexType;

    /**
     * Information about the index not described in its own column, such as disabled if the index is disabled.
     */
    @com.panosen.orm.annonation.Column(name = "COMMENT")
    @Type(type = Types.VARCHAR)
    private String comment;

    /**
     * Any comment provided for the index with a COMMENT attribute when the index was created.
     */
    @com.panosen.orm.annonation.Column(name = "INDEX_COMMENT")
    @Type(type = Types.VARCHAR)
    private String indexComment;

    /**
     * Whether the index is visible to the optimizer. See Invisible Indexes.
     */
    @com.panosen.orm.annonation.Column(name = "IS_VISIBLE")
    @Type(type = Types.VARCHAR)
    private String isVisible;

    /**
     * MySQL 8.0.13 and higher supports functional key parts
     */
    @com.panosen.orm.annonation.Column(name = "EXPRESSION")
    @Type(type = Types.VARCHAR)
    private String expression;

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

    public int getNonUnique() {
        return nonUnique;
    }

    public void setNonUnique(int nonUnique) {
        this.nonUnique = nonUnique;
    }

    public String getIndexSchema() {
        return indexSchema;
    }

    public void setIndexSchema(String indexSchema) {
        this.indexSchema = indexSchema;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public int getSeqInIndex() {
        return seqInIndex;
    }

    public void setSeqInIndex(int seqInIndex) {
        this.seqInIndex = seqInIndex;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getCollation() {
        return collation;
    }

    public void setCollation(String collation) {
        this.collation = collation;
    }

    public String getCardinality() {
        return cardinality;
    }

    public void setCardinality(String cardinality) {
        this.cardinality = cardinality;
    }

    public String getSubPart() {
        return subPart;
    }

    public void setSubPart(String subPart) {
        this.subPart = subPart;
    }

    public String getPacked() {
        return packed;
    }

    public void setPacked(String packed) {
        this.packed = packed;
    }

    public String getNullable() {
        return nullable;
    }

    public void setNullable(String nullable) {
        this.nullable = nullable;
    }

    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getIndexComment() {
        return indexComment;
    }

    public void setIndexComment(String indexComment) {
        this.indexComment = indexComment;
    }

    public String getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(String isVisible) {
        this.isVisible = isVisible;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}