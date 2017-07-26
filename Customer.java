class Customer{
    private String _name;
    private String _billingAddress;

    public Customer(String name, String billingAddress){
        _name = name;
        _billingAddress = billingAddress;
    }

    public String toString(){
        return String.format("%s, %s", _name, _billingAddress);
    }

}