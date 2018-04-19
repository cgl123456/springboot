package com.demo.propertity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by cgl on 2018/3/18
 */
@Component
@Configuration
public class TimePropertity {
    
    @Value("${time.year}")
    private String year;
    
    @Value("$(time.month)")
    private String month;
    
    @Value("$(time.day)")
    private String day;
    
    public String getYear() {
        return year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    
    public String getMonth() {
        return month;
    }
    
    public void setMonth(String month) {
        this.month = month;
    }
    
    public String getDay() {
        return day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }
}
