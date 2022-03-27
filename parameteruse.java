package com.company;
//Tip the waiter
public class parameteruse {

    public static void main(String[] args) {
        double bill = 53.5;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        tip(bill);
    }
    public static void tip(double billmoney) {
        double tipMoney = (15d / 100) * billmoney;
        System.out.println(" Your service was wonderful! Please, accept this tip: " + tipMoney);
    }

}
