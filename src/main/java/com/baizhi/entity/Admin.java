package com.baizhi.entity;

import lombok.*;

import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Admin implements Serializable {
    private  String id;
    private  String name ;
}
