import java.util.*;

public class distanceconverter {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\nEnter an origin unit: ");
        String origin = in .nextLine();

        while (!(origin.equals("miles")) && !(origin.equals("inches")) && !(origin.equals("feet")) && !(origin.equals("yards"))) {
            System.out.print("Enter an origin unit: ");
            origin = in .nextLine();
        }

        System.out.print("Enter a destination unit: ");
        String destination = in .nextLine();

        while (!(destination.equals("miles")) && !(destination.equals("inches")) && !(destination.equals("feet")) && !(destination.equals("yards"))) {
            System.out.print("Enter a destination unit: ");
            destination = in .nextLine();
        }

        System.out.print("Enter a value: ");
        int value = in .nextInt();

        double conversionFactor = 0;

        if (origin.equals("miles") && destination.equals("inches")) {
            conversionFactor = 63360;
        } else if (origin.equals("miles") && destination.equals("feet")) {
            conversionFactor = 5280;
        } else if (origin.equals("miles") && destination.equals("yards")) {
            conversionFactor = 1760;
        } else if (origin.equals("inches") && destination.equals("miles")) {
            conversionFactor = 0.00001578282;
        } else if (origin.equals("inches") && destination.equals("feet")) {
            conversionFactor = 0.08333333333;
        } else if (origin.equals("inches") && destination.equals("yards")) {
            conversionFactor = 0.02777777777;
        } else if (origin.equals("yards") && destination.equals("miles")) {
            conversionFactor = 0.00056818181;
        } else if (origin.equals("yards") && destination.equals("feet")) {
            conversionFactor = 3;
        } else if (origin.equals("yards") && destination.equals("inches")) {
            conversionFactor = 36;
        } else if (origin.equals("feet") && destination.equals("miles")) {
            conversionFactor = 0.00018939393;
        } else if (origin.equals("feet") && destination.equals("inches")) {
            conversionFactor = 12;
        } else if (origin.equals("feet") && destination.equals("yards")) {
            conversionFactor = 0.33333333333;
        }

        double finalConversion = value * conversionFactor;
        System.out.print("\nThere ");
        if(finalConversion != 1) {
          System.out.print("are ");
        } else {
          System.out.print("is ");
        }
        System.out.printf("%,.1f", finalConversion);
        System.out.printf(" " + destination + " ");
        System.out.print("in " + value + " " + origin + ".\n\n");
    }
}
