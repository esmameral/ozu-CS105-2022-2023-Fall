package lab1.question4;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        double temp_amount = getAmount();
        double final_amount = temp_amount - getCustomerDiscount()*temp_amount/100;
        setAmount(final_amount);
        return final_amount;
    }

    @Override
    public String toString() {
        return "Invoice id:" + getId() + " Customer name:" + getCustomerName() + " Discount: " + getCustomerDiscount()
                + " Amount: " + getAmount();
    }
}
