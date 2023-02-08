package services;

public class PaypalService implements OnlinePaymentServices{

    public Double installment;
    @Override
    public Double paymentFee(Double amount) {
        return amount * 0.02;
    }
    @Override
    public Double interest(Double amount, Integer months) {
        return amount * 0.01 * months;
    }

}
