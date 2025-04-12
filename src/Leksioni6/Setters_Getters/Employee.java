package Leksioni6.Setters_Getters;

public class Employee {

    private String employeeID;
    private int employSalaryHour;
    private int totalHours;
    private String departament;

    //Konstruktori bosh
    public Employee(){}

    //Konstruktori me parametra
    public Employee(String employeeID,int employSalaryHour,int totalHours,String departament){

        this.employeeID=employeeID;
        this.departament=departament;
        this.employSalaryHour=employSalaryHour;
        this.totalHours=totalHours;
    }


    //SETTERS

    public void setDepartament(String departament){
        this.departament=departament;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID=employeeID;
    }

    public void setEmploySalaryHour(int employSalaryHour) {
        this.employSalaryHour = employSalaryHour;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

//GETTERS


    public int getEmploySalaryHour() {
        return employSalaryHour;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartament() {
        return departament;
    }

    public void AfishoDetaje(){

        System.out.println("Departamenti "+ departament);
        System.out.println("Pay/Hour "+ employSalaryHour);
        System.out.println("Total Hours "+ totalHours);
    }



    }
