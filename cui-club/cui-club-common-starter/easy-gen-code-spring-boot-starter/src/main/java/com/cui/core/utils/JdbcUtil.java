package com.cui.core.utils;

import com.cui.core.core.MysqlDataHandler;
import com.cui.core.entity.JdbcConfig;
import com.cui.core.entity.TableInfo;

import java.util.List;

/**
 * jdbc工具 用于查询表字段信息 及 表结构信息
 *
 * @author loser
 * @date 2023/9/4
 */
public class JdbcUtil {

    private JdbcUtil() {
    }

    public static List<TableInfo> queryTableInfo(JdbcConfig config, String table) {

        return new MysqlDataHandler(table, config.getUrl(), config.getUsername(),
                config.getPassword(), config.getDbName(), config.getDriver())
                .searchByDb();

    }

    public static String getComment(JdbcConfig config, String table) {

        return new MysqlDataHandler(table, config.getUrl(), config.getUsername(),
                config.getPassword(), config.getDbName(), config.getDriver())
                .getTableComment();

    }

}
