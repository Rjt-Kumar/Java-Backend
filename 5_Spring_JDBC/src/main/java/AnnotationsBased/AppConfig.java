package AnnotationsBased;

import Demo.ImpeStudent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
//@ComponentScan("AnnotationsBased")
public class AppConfig {

    @Bean
    public StudentImp getStudentImp(){
        return new StudentImp();
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate obj = new JdbcTemplate(dmds());
        return obj;
    }

    @Bean
    public DriverManagerDataSource dmds(){
        DriverManagerDataSource obj = new DriverManagerDataSource();
        obj.setDriverClassName("com.mysql.cj.jdbc.Driver");
        obj.setPassword("cdrRjt@123");
        obj.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        obj.setUsername("root");

        return obj;
    }
}
