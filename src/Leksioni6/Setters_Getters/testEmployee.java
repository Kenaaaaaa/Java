package Leksioni6.Setters_Getters;

public class testEmployee {
    public static void main(String[] args) {

        Employee punetor1=new Employee();
        punetor1.setDepartament("Informatike");
        punetor1.setEmployeeID("UE3245678");
        punetor1.setTotalHours(300);
        punetor1.setEmploySalaryHour(500);

        punetor1.AfishoDetaje();

        Employee punetor2=new Employee();
        punetor2.setTotalHours(190);

        if(punetor2.getTotalHours()> punetor1.getTotalHours()){
            System.out.println("Punetori i dyte ka ore pune me shume");
        }
        else {
            System.out.println("Punetori i pare ka ore pune me shume");
        }

    }
    }

