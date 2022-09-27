public class LimitException extends Exception{
    private String message;
    private double remainingAmount;

    public LimitException(String message, double amount){
        this.message = message;
        this.remainingAmount = amount;
    }
    public double getRemainingAmount(){
        System.out.println(message);
        return remainingAmount;
    }
}
