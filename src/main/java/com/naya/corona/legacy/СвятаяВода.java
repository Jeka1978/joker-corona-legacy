package com.naya.corona.legacy;


import com.naya.corona.legacy.model.Patient;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class СвятаяВода implements Лечение {

    @Inject
    private БожьяСила божьяСила;
    @Override
    public void применить(Patient patient) {
        божьяСила.освятитьВоду();
        System.out.println("Стакан святой воды запивать спиртом  по три стакана в сутки");
    }
}
