public class BankAccount {
    private double amount;

    public double getAmount() {
        System.out.println("Bash schet");
        return amount;
    }

    public void deposit(double sum) throws LimitException {
        if (sum > 60000) {
            throw new LimitException("Vyshe 60000 polozhit nelzia", amount);
        } else {
            amount += sum;
        }
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > 50000 ) {
            throw new LimitException("50000den ashyk chechilbeit", amount);
        } else if ( sum>amount) {
            throw new LimitException("Sizdin balansynyz jetpeit", amount);

        } else {
            amount -= sum;
        }
    }


}
