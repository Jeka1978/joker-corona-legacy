package com.naya.corona.legacy;


import com.naya.corona.legacy.model.Patient;

/**
 * @author Evgeny Borisov
 */
public interface Лечение {
    void применить(Patient patient);

    String АЛКОГОЛЬ = "alcohol";
}
