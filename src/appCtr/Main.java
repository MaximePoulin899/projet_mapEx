package appCtr;

import model.Employe;
import model.RegisteEmploye;
import model.RegistreDept;

public class Main {
    public static void main(String[] args) {

        Employe emp1 = new Employe("1", "Flouflou" , "Bob","Lavaltrie", "Technique");
        Employe emp2 = new Employe("2", "Flouflou" , "Bob","Lavaltrie", "Technique");
        Employe emp3 = new Employe("3", "Flouflou" , "Bob","Lavaltrie", "Technique");
        Employe emp4 = new Employe("4", "Flouflou" , "Bob","Lavaltrie", "Technique");

        Employe emp5 = new Employe("5", "Flouflou" , "Bob","Lavaltrie", "Vente");
        Employe emp6 = new Employe("6", "Flouflou" , "Bob","Lavaltrie", "Vente");
        Employe emp7 = new Employe("7", "Flouflou" , "Bob","Lavaltrie", "Vente");
        Employe emp8 = new Employe("8", "Flouflou" , "Bob","Lavaltrie", "Vente");

        Employe emp9 = new Employe("9", "Flouflou" , "Bob","Lavaltrie", "Construction");
        Employe emp10 = new Employe("10", "Flouflou" , "Bob","Lavaltrie", "Construction");
        Employe emp11 = new Employe("11", "Flouflou" , "Bob","Lavaltrie", "Construction");
        Employe emp12 = new Employe("12", "Flouflou" , "Bob","Lavaltrie", "Construction");

        RegisteEmploye registeEmp = new RegisteEmploye();

        registeEmp.ajouterEmp(emp1);
        registeEmp.ajouterEmp(emp2);
        registeEmp.ajouterEmp(emp3);
        registeEmp.ajouterEmp(emp4);


        RegistreDept registreDept = new RegistreDept();
        registreDept.ajouterRegistreEmp("Technique",registeEmp);




    }
}
