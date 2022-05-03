package com.panosen.dbschema;

import com.panosen.codedom.mysql.builder.SelectSqlBuilder;
import com.panosen.dbschema.information_schema.Column;
import com.panosen.dbschema.information_schema.KeyColumnUsage;
import com.panosen.dbschema.information_schema.Statistics;
import com.panosen.dbschema.information_schema.Table;
import com.panosen.orm.DalClient;
import com.panosen.orm.DalQueryDao;
import com.panosen.orm.EntityManagerFactory;
import com.panosen.orm.mapper.EntityMapper;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

public class SchemaRepository {

    private static final String INFORMATION_SCHEMA = "information_schema";
    private static final String TABLES = "tables";
    private static final String COLUMNS = "columns";
    private static final String KEY_COLUMN_USAGE = "key_column_usage";
    private static final String STATISTICS = "statistics";

    private static final String TABLE_SCHEMA = "TABLE_SCHEMA";
    private static final String TABLE_NAME = "TABLE_NAME";
    private static final String TABLE_TYPE = "TABLE_TYPE";
    private static final String BASE_TABLE = "BASE TABLE";

    private static final String ORDINAL_POSITION = "ordinal_position";

    private final EntityMapper<Table> tableEntityMapper = new EntityMapper<>(EntityManagerFactory.getOrCreateManager(Table.class));
    private final EntityMapper<Column> columnEntityMapper = new EntityMapper<>(EntityManagerFactory.getOrCreateManager(Column.class));
    private final EntityMapper<KeyColumnUsage> keyColumnUsageEntityMapper = new EntityMapper<>(EntityManagerFactory.getOrCreateManager(KeyColumnUsage.class));
    private final EntityMapper<Statistics> statisticsEntityMapper = new EntityMapper<>(EntityManagerFactory.getOrCreateManager(Statistics.class));

    /**
     * Get all tables
     *
     * @param dataSource  DataSource
     * @param tableSchema Database Name
     * @return all tables
     * @throws Exception Exceptions
     */
    public List<Table> getTables(DataSource dataSource, String tableSchema) throws Exception {

        SelectSqlBuilder selectSqlBuilder = new SelectSqlBuilder()
                .from(TABLES, INFORMATION_SCHEMA);
        selectSqlBuilder.where().must()
                .equal(TABLE_SCHEMA, Types.VARCHAR, tableSchema)
                .equal(TABLE_TYPE, Types.VARCHAR, BASE_TABLE);

        return DalQueryDao.queryList(new DalClient(dataSource), selectSqlBuilder, tableEntityMapper);
    }

    /**
     * Get all fields of tables and views
     *
     * @param dataSource  DataSource
     * @param tableSchema Database name
     * @return all fields
     * @throws Exception Exceptions
     */
    public List<Column> getColumns(DataSource dataSource, String tableSchema) throws Exception {

        SelectSqlBuilder selectSqlBuilder = new SelectSqlBuilder()
                .from(COLUMNS, INFORMATION_SCHEMA);
        selectSqlBuilder.where()
                .equal(TABLE_SCHEMA, Types.VARCHAR, tableSchema);
        selectSqlBuilder.orderBy(ORDINAL_POSITION);

        return DalQueryDao.queryList(new DalClient(dataSource), selectSqlBuilder, columnEntityMapper);
    }

    /**
     * 获取数据库指定表的字段
     * Get all fields of specific table
     *
     * @param dataSource  DataSource
     * @param tableSchema Database Name
     * @param tableName   Table Name
     * @return fields
     * @throws Exception Exceptions
     */
    public List<Column> getColumns(DataSource dataSource, String tableSchema, String tableName) throws Exception {

        SelectSqlBuilder selectSqlBuilder = new SelectSqlBuilder()
                .from(COLUMNS, INFORMATION_SCHEMA);
        selectSqlBuilder.where().must()
                .equal(TABLE_SCHEMA, Types.VARCHAR, tableSchema)
                .equal(TABLE_NAME, Types.VARCHAR, tableName);
        selectSqlBuilder.orderBy(ORDINAL_POSITION);

        return DalQueryDao.queryList(new DalClient(dataSource), selectSqlBuilder, columnEntityMapper);
    }

    /**
     * Get all constraints of database
     *
     * @param dataSource  Datasource
     * @param tableSchema Database name
     * @return all constraints of database
     * @throws Exception Exceptions
     */
    public List<KeyColumnUsage> getKeyColumnUsages(DataSource dataSource, String tableSchema) throws Exception {

        SelectSqlBuilder selectSqlBuilder = new SelectSqlBuilder()
                .from(KEY_COLUMN_USAGE, INFORMATION_SCHEMA);
        selectSqlBuilder.where()
                .equal(TABLE_SCHEMA, Types.VARCHAR, tableSchema);

        return DalQueryDao.queryList(new DalClient(dataSource), selectSqlBuilder, keyColumnUsageEntityMapper);
    }

    /**
     * Get all fields of specific table
     *
     * @param dataSource  Datasource
     * @param tableSchema Database name
     * @param tableName   Table name
     * @return all fields of specific name
     * @throws Exception Exceptions
     */
    public List<KeyColumnUsage> getKeyColumnUsages(DataSource dataSource, String tableSchema, String tableName) throws Exception {

        SelectSqlBuilder selectSqlBuilder = new SelectSqlBuilder()
                .from(KEY_COLUMN_USAGE, INFORMATION_SCHEMA);
        selectSqlBuilder.where().must()
                .equal(TABLE_SCHEMA, Types.VARCHAR, tableSchema)
                .equal(TABLE_NAME, Types.VARCHAR, tableName);

        return DalQueryDao.queryList(new DalClient(dataSource), selectSqlBuilder, keyColumnUsageEntityMapper);
    }

    /**
     * Get all statistics of database
     *
     * @param dataSource  Datasource
     * @param tableSchema Database name
     * @return all statistics of database
     * @throws Exception Exceptions
     */
    public List<Statistics> getStatistics(DataSource dataSource, String tableSchema) throws Exception {

        SelectSqlBuilder selectSqlBuilder = new SelectSqlBuilder()
                .from(STATISTICS, INFORMATION_SCHEMA);
        selectSqlBuilder.where()
                .equal(TABLE_SCHEMA, Types.VARCHAR, tableSchema);

        return DalQueryDao.queryList(new DalClient(dataSource), selectSqlBuilder, statisticsEntityMapper);
    }

    /**
     * Get all statistics of database
     *
     * @param dataSource  Datasource
     * @param tableSchema Database name
     * @param tableName   Table name
     * @return all statistics of database
     * @throws Exception Exceptions
     */
    public List<Statistics> getStatistics(DataSource dataSource, String tableSchema, String tableName) throws Exception {

        SelectSqlBuilder selectSqlBuilder = new SelectSqlBuilder()
                .from(STATISTICS, INFORMATION_SCHEMA);
        selectSqlBuilder.where().must()
                .equal(TABLE_SCHEMA, Types.VARCHAR, tableSchema)
                .equal(TABLE_NAME, Types.VARCHAR, tableName);

        return DalQueryDao.queryList(new DalClient(dataSource), selectSqlBuilder, statisticsEntityMapper);
    }
}
