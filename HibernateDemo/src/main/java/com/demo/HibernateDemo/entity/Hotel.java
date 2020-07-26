package com.demo.HibernateDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Hotel")

public class Hotel implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hotel_id")
    private  Integer id;
    @Column(name = "hotel_name",length = 30)
    private String name;
    @Column(name = "hotel_address",length = 30)
    private String address;
    @Column(name = "hotel_type")
    private Integer hotel_type;

    //OnetoOne to name dina
    @OneToOne
    @JoinColumn(name = "typeId")
    private HotelType hotelType;

    @OneToMany(mappedBy = "hotel")
    private Collection<Employee> employees;
}
