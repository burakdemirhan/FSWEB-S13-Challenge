package org.example;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    // Constructor
    public Employee(long id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    // Healthplan ekleme metodu
    public void addHealthplan(int index, String name) {
        if (index < 0 || index >= healthplans.length) {
            System.out.println("Geçersiz index: Dizinin sınırları dışı.");
            return;
        }
        if (healthplans[index] != null) {
            System.out.println("Bu index zaten dolu: " + index);
        } else {
            healthplans[index] = name;
            System.out.println("Healthplan '" + name + "' başarıyla eklendi.");
        }
    }


    @Override
    public String toString() {
        StringBuilder plans = new StringBuilder();
        for (String plan : healthplans) {
            if (plan != null) {
                plans.append(plan).append(" ");
            }
        }
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "', healthplans=" + plans.toString().trim() + "}";
    }
}
