package com.demo.HibernateDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "test_teacher")
public class Teacher implements Serializable {
    private static final long serialVersionUID=1L;
    @Id //primary key rakhna
    @GeneratedValue(strategy = GenerationType.AUTO) //(Auto Increment of ID)
    @Column(name = "teacher_id")
    private  Integer id;
    @Column(name = "teacher_name",length = 30)
    private String name;
    @Column(name = "teacher_address",length = 30)
    private String address;
    @Column(name = "salary")
    private Long salary;
}
