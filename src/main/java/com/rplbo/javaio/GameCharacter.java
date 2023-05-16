package com.rplbo.javaio;
import java.io.*;
public class GameCharacter implements Serializable
//merupakan kelas yang akan diserialisasi
{
    int power;
    //membuat variabel power dengan tipe data integer
    String type;
    //membuat variabel type dengan tipe data string
    String[] weapons;
    //membuat array weapons dengan tipe data string

    public GameCharacter(int p, String t, String[] w)
    {
        power = p;
        type = t;
        weapons = w;
    }

    public int getPower(){
        return power;
    }

    public String getType(){
        return type;
    }

    public String getWeapons(){
        String weaponList = "";
        for(int i = 0; i < weapons.length; i++)
        {
            weaponList += weapons[i]+" ";
        }
        return weaponList;
    }
}
