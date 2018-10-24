/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubquiz;

import java.util.Vector;

/**
 *
 * @author Piotr
 */
public class Team {
    private String nazwa;
    private int ilosc;
    private int punkty;
    private boolean dogrywka;
    
    public Team(String nazwa, int ilosc)
    {
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.punkty = 0;
        this.dogrywka = false;
        
    };
    
    public void dodaj_zespol(Vector<Team> druzyny, Team druzyna)
    {
        druzyny.add(druzyna);
    }
          
    public String getNazwa() {
        return nazwa;
    }

    public int getIlosc() {
        return ilosc;
    }

    public int getPunkty() {
        return punkty;
    }

    public boolean isDogrywka() {
        return dogrywka;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public void setDogrywka(boolean dogrywka) {
        this.dogrywka = dogrywka;
    }
    
}
