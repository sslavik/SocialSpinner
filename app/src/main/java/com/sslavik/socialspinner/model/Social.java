package com.sslavik.socialspinner.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Objects;

public class Social implements Comparable<Social> {
    private int icon;
    private String name;
    private int totalUser;
    private int dollars;


    public Social(int icon, String name, int totalUser, int dollars) {
        this.icon = icon;
        this.name = name;
        this.totalUser = totalUser;
        this.dollars = dollars;
    }

    public Social(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public int getTotalUser() {
        return totalUser;
    }

    public void setTotalUser(int totalUser) {
        this.totalUser = totalUser;
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @NonNull
    @Override
    public String toString() {
        return getName();
    }

    /**
     * Este metodo se llama automaticamente cuando se tiene una lista de datos Social
     *
     * @param o El objeto a comprarar
     * @return > 0 El objeto es mayor que el objeto que se le pasa
     */
    @Override
    public int compareTo(Social o) {
        return name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return this.name.equals(((Social) obj).name);
    }
}
