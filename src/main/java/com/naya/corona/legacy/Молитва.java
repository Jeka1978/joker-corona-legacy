package com.naya.corona.legacy;


import com.naya.corona.legacy.model.Patient;

import javax.inject.Singleton;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class Молитва implements Лечение {
    @Override
    public void применить(Patient patient) {

        System.out.println("Прочесть три раза КОРОНА ИЗЫДИ перед чихнуть");
    }
}
