package com.demo.javabeandemo.pojo;

import java.io.Serializable;
import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher implements Serializable{
    private static final long serialVersionUID=1L;
    private int teacherId;
    private String name;
    private  String address;
}
