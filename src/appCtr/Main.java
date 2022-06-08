package appCtr;

import model.Employe;
import model.RegisteEmploye;
import model.RegistreDept;

public class Main {
    public static void main(String[] args) {

        Employe emp1 = new Employe("1", "Flouflou" , "Bob","Lavaltrie", "Technique");
        Employe emp2 = new Employe("1", "Flouflou" , "Bob","Lavaltrie", "Ventes");
        Employe emp3 = new Employe("1", "Flouflou" , "Bob","Lavaltrie", "Technique");
        Employe emp4 = new Employe("1", "Flouflou" , "Bob","Lavaltrie", "Construction");

        RegisteEmploye registeEmp = new RegisteEmploye();

        registeEmp.ajouterEmp(emp1);
        registeEmp.ajouterEmp(emp2);
        registeEmp.ajouterEmp(emp3);
        registeEmp.ajouterEmp(emp4);


        RegistreDept registreDept = new RegistreDept();
        registreDept.ajouterRegistreEmp(registeEmp);



    }
}
