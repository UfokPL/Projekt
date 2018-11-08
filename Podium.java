/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubquiz;

/**
 *
 * @author Fifi
 */
public class Podium {
    
    Team firstPlace;
    Team secondPlace;
    Team thirdPlace;
    Team fourthPlace;
    
    public Podium(Team winner, Team sec, Team third, Team fourth)
    {
        this.firstPlace = winner ;
        this.secondPlace = sec;
        this.thirdPlace = third;
        this.fourthPlace = fourth;

    };
}
