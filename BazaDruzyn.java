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
public class BazaDruzyn {
    public static Vector<Team> druzyny;
    public BazaDruzyn()
    {
        druzyny = null;
    }
    public void dodaj_zespol(Team druzyna)
    {
        this.druzyny.add(druzyna);
    }
    
    public void wyswietl_zespoly()
    {
        for(Team druzyna : this.druzyny)
        {
            System.out.println(druzyna.getNazwa());
        }
    }
    
}
