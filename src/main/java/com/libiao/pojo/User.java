package com.libiao.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Setter@Getter
public class User {

    @Id
    @GeneratedValue
    private Integer u_id;

    @Column(nullable = false, unique = true)
    private String u_name;

    @Column(nullable = false)
    private String u_password;

    @Column
    private String u_state;

    @Column
    private String u_address;

    @Column
    private Long u_phone;

    @Column
    private String u_like;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_state='" + u_state + '\'' +
                ", u_address='" + u_address + '\'' +
                ", u_phone=" + u_phone +
                ", u_like='" + u_like + '\'' +
                '}';
    }
}
