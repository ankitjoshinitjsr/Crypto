// "static void main" must be defined in a public class.
import java.lang.Math;
import java.util.Scanner;

public class Main {
    static Double fValue, lValue, priceDiff;
    static long grid;
    
    private static long calcGrid() {
        Double temp = lValue - fValue;
        return (long)Math.round(Math.ceil(temp/priceDiff));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        fValue = input.nextDouble(); 
        lValue = input.nextDouble(); 
        priceDiff = input.nextDouble(); 
        grid = calcGrid();
        System.out.println(grid);
    } 
}
