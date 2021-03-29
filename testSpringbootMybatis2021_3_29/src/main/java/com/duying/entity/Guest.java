package com.duying.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guest implements Serializable{


    private Integer id;


    private String name;


    private String role;
}