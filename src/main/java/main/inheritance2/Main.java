package main.inheritance2;

import main.inheritance2.CustomerManager;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new DatabaseLogger());
    }
}
