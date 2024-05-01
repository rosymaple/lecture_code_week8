package week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import static input.InputUtils.*;

public class TireComparison {

    public static void main(String[] args) {

//        Tire example = new Tire("Bridgestone", 40, 10000);
//        System.out.println("S" + example.pricePer1000Miles());
//        System.out.println(example);
//        System.out.println(example.costForSet());

        List<Tire> tireReports = new ArrayList<>();

        do {
            Tire tire = getTireInfo();
            tireReports.add(tire);
        } while (yesNoInput("More tires to add to compare?"));


        Collections.sort(tireReports);
        printReportTable(tireReports);
    }

    private static Tire getTireInfo() {
        String name = stringInput("Enter name of tire? ");
        double price = positiveDoubleInput("Enter price of " + name + "?");
        int mileWarranty = positiveIntInput("Enter number of miles warranty?");

        Tire tire = new Tire(name, price, mileWarranty);
        return tire;
    }

    private static void printReportTable(List<Tire> tireReports) {
        for (Tire tire: tireReports) {

            System.out.println(tire + " Cost per set of 4 is $" + tire.costForSet());
        }
    }
}
