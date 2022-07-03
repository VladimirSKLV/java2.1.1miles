public class ticket {
    public static void main(String[] args) {
        float ticketPrice = 1_250.75F;
        int milePrice = 20;
        int milesEarned = (int) ticketPrice / milePrice;
        System.out.println("У вас есть " + milesEarned + " бесплатных миль");
    }
}
