
package com.altinity.clickhouse.sink.connector;

public enum ClickHouseSinkConnectorConfigVariables {

    THREAD_POOL_SIZE("thread.pool.size"),
    BUFFER_COUNT("buffer.count"),
    DEDUPLICATION_POLICY("deduplication.policy"),

    CLICKHOUSE_TOPICS_TABLES_MAP("clickhouse.topic2table.map"),

    CLICKHOUSE_URL("clickhouse.server.url"),
    CLICKHOUSE_USER("clickhouse.server.user"),
    CLICKHOUSE_PASS("clickhouse.server.pass"),
    CLICKHOUSE_DATABASE("clickhouse.server.database"),
    CLICKHOUSE_PORT("clickhouse.server.port"),

    PROVIDER_CONFIG( "provider"),
    TASK_ID("task_id"),

    // Flag thats configurable by the user to store kafka metadata information
    // in clickhouse tables.
    STORE_KAFKA_METADATA( "store.kafka.metadata"),

    // Flag to store the raw data as JSON string in clickhouse.
    STORE_RAW_DATA("store.raw.data"),

    ENABLE_KAFKA_OFFSET("enable.kafka.offset"),
    KAFKA_OFFSET_METADATA_TABLE("kafka.offset.metadata.table"),

    // Column to store the raw data.
    STORE_RAW_DATA_COLUMN( "store.raw.data.column"),

    // Buffer flush time in milliseconds.
    BUFFER_FLUSH_TIME( "buffer.flush.time.ms"),

    // Maximum size of buffer before its flushed.
    BUFFER_MAX_RECORDS("buffer.max.records"),

    // Flush timeout(in milliseconds) if max records is not reached.
    BUFFER_FLUSH_TIMEOUT( "buffer.flush.timeout.ms"),

    // Flag to enable prometheus metrics and to start a prometheus scrape server endpoint.
    ENABLE_METRICS("metrics.enable"),

    // Defines the port in which the metrics endpoint will be started
    // for prometheus to scrape metrics.
    METRICS_ENDPOINT_PORT("metrics.port"),

    REPLACING_MERGE_TREE_DELETE_COLUMN("replacingmergetree.delete.column"),

    //Config variable for auto creating tables if they dont exist.
    AUTO_CREATE_TABLES("auto.create.tables"),

    // Config variable when set to true, columns will be added.
    ENABLE_SCHEMA_EVOLUTION("schema.evolution"),

    SNOWFLAKE_ID("snowflake.id");


    private String label;

    ClickHouseSinkConnectorConfigVariables(String s) {
        this.label = s;
    }

    @Override
    public String toString() {
        return this.label;
    }
}