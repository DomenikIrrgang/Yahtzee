/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;

/**
 *
 * @author Marc
 */
public class Twos extends Rule{
private String name = "Twos";
    @Override
    public int calculatePoints(DiceBox dicebox) {
        int result = 0;
      return result = dicebox.countNumber(2) * 2;
    }
    
}
