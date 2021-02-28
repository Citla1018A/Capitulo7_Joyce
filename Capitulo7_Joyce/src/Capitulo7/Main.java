/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo7;

import Capitulo7.CasePEvent.Event;
import Capitulo7.CasePRental.Rental;
import Capitulo7.GZRockPaperScissors.RockPaperScissors;
import Capitulo7.GameZoneCard.Card;
import java.util.ArrayList;

/**
 *
 * @author Citlalli
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("CASE PROBLEM");
        System.out.println("1");
        Event fiesta = new Event();
        fiesta.setNumeroDeTelefono();
        System.out.println(fiesta.getNumeroDeTelefono());
        System.out.println(fiesta.getEvento());
        System.out.println("2");
        Rental renta = new Rental(100,"C1018");
        renta.setNoTelefono("95112345678");
        System.out.println(renta.getNoTelefono());
        System.out.println(renta.getNoContrato());
        System.out.println("GAME ZONE");
        System.out.println("1");
         Card carta = new Card();
         carta.mostrarCarta();
         System.out.println("2");
         RockPaperScissors jugar = new RockPaperScissors();
        ArrayList a = new ArrayList();

        for (int i = 0; i < 10; i++) {
            jugar.jugar();
            a.add(jugar.getJugador());
        }

        for (int i = 0; i <a.size() ; i++) {
            System.out.println(a.get(i));
        }
        System.out.println("3");
        
    }
}
