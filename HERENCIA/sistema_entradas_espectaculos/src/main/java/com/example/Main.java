package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n<<< SISTEMA DE ENTRADAS PARA ESPECTACULOS >>>\n");

        StandardTicket st1 = new StandardTicket(10.5, "Concierto de Miley Cyrus");
        StandardTicket st2 = new StandardTicket(9.5, "Concierto de Justin Bieber");
        
        VipTicket vt1 = new VipTicket(5.5, 19.5, "Concierto de Bad Bunny");
        VipTicket vt2 = new VipTicket(7.0, 17.0, "Concierto de Drake");

        DiscountedTicket dt1 = new DiscountedTicket(13.5, "Concierto de Il Divo", 20);
        DiscountedTicket dt2 = new DiscountedTicket(12.0, "Concierto de Aitana", 15);

        List<Ticket> tickets = new ArrayList<>();

        tickets.add(st1);
        tickets.add(st2);
        tickets.add(vt1);
        tickets.add(vt2);
        tickets.add(dt1);
        tickets.add(dt2);

        for (Ticket ticket : tickets) {
            System.out.println("Tipo de entrada: " + ticket.getClass().getName());
            System.out.println("Nombre del evento: " + ticket.getEventName());
            System.out.println("Precio base: " + ticket.getBasePrice());
            System.out.println("Precio final: " + ticket.calculateFinalPrice());
            System.out.println();
        }
    }
}