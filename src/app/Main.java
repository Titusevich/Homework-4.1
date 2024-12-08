package app;

public class Main {
    public static int productNumber;
    public static String product;
    public static int daysSales;
    public static double totalSales;
    private static final String CURRENCY = "EUR";
    public static double avgSales;

    public static void main(String[] args) {
        productNumber = 1;
        product = "smartphone";
        daysSales = 5;
        totalSales = 12153.41;
        avgSales = totalSales / daysSales;
        System.out.printf("%nProduct № %d: %s," +
                "%ntotal sales for %d days is %s %.2f," +
                "%nsales by day is %s %.2f.%n",
                productNumber, product, daysSales, CURRENCY,
                totalSales, CURRENCY, avgSales);
    }
}
