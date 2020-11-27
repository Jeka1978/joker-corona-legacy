package com.naya.corona.legacy.model;

import lombok.*;

import java.util.Collection;
import java.util.Collections;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private String name;
    private int age;
    private String method;

}
