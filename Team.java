/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubquiz;

/**
 *
 * @author Piotr
 */
public class Team {
    private final int katSize = 9;

   
    private String nazwa;
    private int ilosc;
    private int punkty;
    private int odpDogrywka;
    private int[] kat;
    private int podium;
    private boolean isRanked;

       
    public Team(String nazwa, int ilosc, boolean isRanked)
    {
        this.kat = new int[katSize];
        this.nazwa = nazwa;
        this.ilosc = ilosc;
        this.punkty = 0;
        this.odpDogrywka = 0;
        this.podium = -1;
        this.isRanked = isRanked;
        
    };

    public void setOdpDogrywka(int odpDogrywka) {
        this.odpDogrywka = odpDogrywka;
    }
    
    public void setPodium(int podium) {
        this.podium = podium;
    }

    public void setIsRanked(boolean isRanked) {
        this.isRanked = isRanked;
    }

    public int getPodium() {
        return podium;
    }

    public boolean isIsRanked() {
        return isRanked;
    }
 
    public int getOdpDogrywka() {
        return odpDogrywka;
    }

     public int getKatSize() {
        return katSize;
    }
     
    public void setKat(int[] kat) {
        this.kat = kat;
    }
    
    public void setKatElement(int index, int value)
    {
        this.kat[index] = value;
    }

    public int[] getKat() {
        return kat;
    }
    
    public void wyswietl_dane_zespolu(){
        System.out.println(getNazwa());
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


    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public void setPunkty() {
        for(int i=0;i<getKatSize();i++)
            this.punkty+=getKat()[i];
    }
    
    public void setPunkty(int value) {
        this.punkty = value;
    }

    
    public boolean isEqual(String name){
        if (name==this.nazwa)
            return true;
        return false;
    }
    
}
