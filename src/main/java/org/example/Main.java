package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static void runOperations() {

        Healthplan healthplan1 = new Healthplan(1, "Sigorta A", Plan.BASIC);

        System.out.println(healthplan1);



        String[] employeeHealthPlans = {"Sigorta A"};
        Employee employee1 = new Employee(1, "John Doe", "john.doe@test.com", "password123", employeeHealthPlans);
        System.out.println(employee1);


        String[] companyEmployees = {"John Doe"};
        Company company = new Company(1, "TechCorp", 5000, companyEmployees);
        System.out.println(company);


        try {
            company.setGiro(-1000); // Bu işlem hata verecek çünkü giro negatif olamaz
        } catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}