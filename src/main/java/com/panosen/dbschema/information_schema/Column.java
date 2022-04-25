package com.panosen.dbschema.information_schema;

import com.panosen.orm.annonation.Type;

import java.sql.Types;

/**
 * 字段
 * information_schema.columns
 */
public class Column {


    /**
     * 固定值def
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_CATALOG")
    @Type(type = Types.VARCHAR)
    private String tableCatalog;

    /**
     * 表名
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_SCHEMA")
    @Type(type = Types.VARCHAR)
    private String tableSchema;

    /**
     * 表名
     */
    @com.panosen.orm.annonation.Column(name = "TABLE_NAME")
    @Type(type = Types.VARCHAR)
    private String tableName;

    /**
     * 名称
     */
    @com.panosen.orm.annonation.Column(name = "COLUMN_NAME")
    @Type(type = Types.VARCHAR)
    private String columnName;

    /**
     * 列排序
     */
    @com.panosen.orm.annonation.Column(name = "ORDINAL_POSITION")
    @Type(type = Types.BIGINT)
    private long ordinalPosition;

    /**
     * 默认值
     */
    @com.panosen.orm.annonation.Column(name = "COLUMN_DEFAULT")
    @Type(type = Types.VARCHAR)
    private String columnDefault;

    /**
     * 字段是否可为空
     * YES 或 NO
     */
    @com.panosen.orm.annonation.Column(name = "IS_NULLABLE")
    @Type(type = Types.VARCHAR)
    private String isNullable;

    /**
     * 数据类型
     * 比如 varchar, int, bigint 不包含长度
     */
    @com.panosen.orm.annonation.Column(name = "DATA_TYPE")
    @Type(type = Types.VARCHAR)
    private String dataType;

    /**
     * 字段的最大字符数。
     * 假如字段设置为varchar(50)，那么这一列记录的值就是50。
     * 该列只适用于二进制数据，字符，文本，图像数据。其他类型数据比如int，float，datetime等，在该列显示为NULL。
     */
    @com.panosen.orm.annonation.Column(name = "CHARACTER_MAXIMUM_LENGTH")
    @Type(type = Types.BIGINT)
    private Long characterMaximumLength;

    /**
     * 字段的最大字节数。
     * 和最大字符数一样，只适用于二进制数据，字符，文本，图像数据，其他类型显示为NULL。
     * 和最大字符数的数值有比例关系，和字符集有关。比如UTF8类型的表，最大字节数就是最大字符数的3倍。
     */
    @com.panosen.orm.annonation.Column(name = "CHARACTER_OCTET_LENGTH")
    @Type(type = Types.BIGINT)
    private Long characterOctetLength;

    /**
     * 数字精度。
     * 适用于各种数字类型比如int，float之类的。
     * 如果字段设置为int(10)，那么在该列保存的数值是9，少一位，还没有研究原因。
     * 如果字段设置为float(10,3)，那么在该列报错的数值是10。
     * 非数字类型显示为在该列NULL。
     */
    @com.panosen.orm.annonation.Column(name = "NUMERIC_PRECISION")
    @Type(type = Types.BIGINT)
    private Long numericPrecision;

    /**
     * 小数位数。
     * 和数字精度一样，适用于各种数字类型比如int，float之类。
     * 如果字段设置为int(10)，那么在该列保存的数值是0，代表没有小数。
     * 如果字段设置为float(10,3)，那么在该列报错的数值是3。
     * 非数字类型显示为在该列NULL。
     */
    @com.panosen.orm.annonation.Column(name = "NUMERIC_SCALE")
    @Type(type = Types.BIGINT)
    private Long numericScale;

    /**
     * datetime类型和SQL-92interval类型数据库的子类型代码。
     * 我本地datetime类型的字段在该列显示为0。
     * 其他类型显示为NULL。
     */
    @com.panosen.orm.annonation.Column(name = "DATETIME_PRECISION")
    @Type(type = Types.BIGINT)
    private Long datetimePrecision;

    /**
     * 字段字符集名称。比如utf8。
     */
    @com.panosen.orm.annonation.Column(name = "CHARACTER_SET_NAME")
    @Type(type = Types.VARCHAR)
    private String characterSetName;

    /**
     * 字符集排序规则。
     * 比如utf8_general_ci，是不区分大小写一种排序规则。utf8_general_cs，是区分大小写的排序规则。
     */
    @com.panosen.orm.annonation.Column(name = "COLLATION_NAME")
    @Type(type = Types.VARCHAR)
    private String collationName;

    /**
     * 字段类型。
     * 比如 varchar(10), int(11), bigint(20) 包含长度
     */
    @com.panosen.orm.annonation.Column(name = "COLUMN_TYPE")
    @Type(type = Types.VARCHAR)
    private String columnType;

    /**
     * 索引类型。
     * 可包含的值有PRI，代表主键，UNI，代表唯一键，MUL，可重复。
     */
    @com.panosen.orm.annonation.Column(name = "COLUMN_KEY")
    @Type(type = Types.VARCHAR)
    private String columnKey;

    /**
     * 额外的信息
     * 示例：自增长的列(auto increment)
     */
    @com.panosen.orm.annonation.Column(name = "EXTRA")
    @Type(type = Types.VARCHAR)
    private String extra;

    /**
     * 权限
     * 多个权限用逗号隔开，比如 select, insert, update, references
     */
    @com.panosen.orm.annonation.Column(name = "PRIVILEGES")
    @Type(type = Types.VARCHAR)
    private String privileges;

    /**
     * 字段注释
     */
    @com.panosen.orm.annonation.Column(name = "COLUMN_COMMENT")
    @Type(type = Types.VARCHAR)
    private String columnComment;

    /**
     * 组合字段的公式。
     */
    @com.panosen.orm.annonation.Column(name = "GENERATION_EXPRESSION")
    @Type(type = Types.VARCHAR)
    private String generationExpression;

    /**
     * SRS_ID
     */
    @com.panosen.orm.annonation.Column(name = "SRS_ID")
    @Type(type = Types.VARCHAR)
    private String srsId;


}
