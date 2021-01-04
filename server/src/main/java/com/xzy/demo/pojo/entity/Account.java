package com.xzy.demo.pojo.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table test_account
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    /**
     * Database Column Remarks:
     *   主键ID
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-04T10:27:02.49+08:00", comments="Source field: test_account.id")
    private Integer id;

    /**
     * Database Column Remarks:
     *   姓名
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-04T10:27:02.503+08:00", comments="Source field: test_account.user_name")
    private String userName;

    /**
     * Database Column Remarks:
     *   地址
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-04T10:27:02.503+08:00", comments="Source field: test_account.address")
    private String address;

    /**
     * Database Column Remarks:
     *   积分
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-04T10:27:02.504+08:00", comments="Source field: test_account.score")
    private BigDecimal score;

    /**
     * Database Column Remarks:
     *   性别:0-女性;1-男性
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-04T10:27:02.504+08:00", comments="Source field: test_account.sex")
    private Integer sex;

    /**
     * Database Column Remarks:
     *   注册时间
     */
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-01-04T10:27:02.504+08:00", comments="Source field: test_account.register_time")
    private Date registerTime;
}