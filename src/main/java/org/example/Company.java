package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;


    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }


    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro değeri negatif olamaz. Giro değeri sıfır olarak ayarlandı.");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }


    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index: Dizinin sınırları dışı.");
            return;
        }
        if (developerNames[index] != null) {
            System.out.println("Bu index zaten dolu: " + index);
        } else {
            developerNames[index] = name;
            System.out.println("Developer '" + name + "' başarıyla eklendi.");
        }
    }


    @Override
    public String toString() {
        StringBuilder developers = new StringBuilder();
        for (String developer : developerNames) {
            if (developer != null) {
                developers.append(developer).append(" ");
            }
        }
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developers=" + developers.toString().trim() + "}";
    }
}
