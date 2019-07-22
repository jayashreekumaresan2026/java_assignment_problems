package com.company.TicketBooking;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DisplayRoutes Displayroutes = new DisplayRoutes();
        ArrayList<String> Routes = new ArrayList<>(Arrays.asList("Tambaram","Sanatorium","Chrompet","Tirusulam","Meenambakkam"));
        Displayroutes.listOfRoutes(Routes);
    }


}

