package com.example.hoaxify.Hoaxify.shared;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author engincanvaran
 * @project Hoaxify
 * @date 10.06.2021 14:00
 */
@Data
@NoArgsConstructor
public class GenericResponse {

    private String msg;

    public GenericResponse(String msg) {
        this.msg = msg;
    }
}
