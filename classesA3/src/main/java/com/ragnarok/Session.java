/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ragnarok;

/**
 *
 * @author Victor
 */
public class Session {

    private static Session instance;
    private int id;

    public void setSession(int id) {
        this.id = id;
    }

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public boolean deleteInstance(int valueInstance) {
        if (valueInstance == this.id) {
            this.id = 0;
            return true;
        }
        return false;
    }
}
