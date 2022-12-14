package com.example.querydsl.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Data
@ToString(of = {"id","userName","age"})
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String userName;

    private int age;

    @ManyToOne(fetch = FetchType.LAZY)
    private Team team;
}
