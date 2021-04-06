package com.duying.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data @AllArgsConstructor
public class Guest {

    @NotBlank
    private String name;
    @NotBlank
    private String role;

}
