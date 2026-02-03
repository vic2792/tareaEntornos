package org.example;


import org.example.readers.ApartmentReader;
import org.example.readers.BuildingReader;
import org.example.readers.OwnerReader;

import java.util.Scanner;

public class BuildingAppMain {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ownerReader = new OwnerReader(scanner);
        var apartmentReader = new ApartmentReader(scanner, ownerReader);
        var buildingReader = new BuildingReader(scanner, apartmentReader);
        var buildingApp = new BuildingApp1(scanner, buildingReader);

        buildingApp.run();
    }
}
