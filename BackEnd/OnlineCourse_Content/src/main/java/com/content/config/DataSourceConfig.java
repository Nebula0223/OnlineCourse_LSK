package com.content.config;

import com.base.utils.ConfigUtils;
import com.base.dto.ConfigDto;
import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(DataSourceProperties.class)
public class DataSourceConfig {
    @Bean
    public DataSource dataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setUrl("jdbc:mysql://localhost:3306/online_course?serverTimezone=UTC");
        try {
            ConfigDto configDto = ConfigUtils.getConfig();
            mysqlDataSource.setUser(configDto.getSqlusername());
            mysqlDataSource.setPassword(configDto.getSqlpassword());
        } catch (Exception e) {
            e.printStackTrace();
        }


        return mysqlDataSource;
    }
}
