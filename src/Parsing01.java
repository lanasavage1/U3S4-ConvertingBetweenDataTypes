public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        
        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dfs";
        
        //Parse shirtPrice and taxRate, and print the total tax
        double price = Double.parseDouble(shirtPrice);
        double tax = Double.parseDouble(taxRate);
        double totalTax = price * tax;
        System.out.println("Total tax" + totalTax);
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}
