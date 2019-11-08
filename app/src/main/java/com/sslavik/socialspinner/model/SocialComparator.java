package com.sslavik.socialspinner.model;

import java.util.Comparator;

public class SocialComparator implements Comparator<Social> {
    /**
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Social o1, Social o2) {
        if (o1.getTotalUser() < o2.getTotalUser()) {
            return 1;
        } else if (o1.getTotalUser() == o2.getTotalUser()) {
            // SE REALIZA COMPARACIÓN POR SEGUNDO CRITERIO
            return (Integer.compare(o2.getDollars(), o1.getDollars()));
        } else {
            return -1;
        }
    }
}
