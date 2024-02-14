package ex4.entities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;
    public double perc;

    public double NetSalary(){
        return GrossSalary-Tax;
    }
    public void IncreaseSalary(double percentage){
        this.GrossSalary*= (1+(percentage/100));
    }

    public String toString(){
        return "\nUpdated data: "
            + Name
            + ", $ "
            + String.format("%.2f",NetSalary());
    }
}