package model;

import java.util.HashMap;

public class RegisteEmploye {
    private HashMap<String, Employe> registreEmp;

    public RegisteEmploye() {
        registreEmp = new HashMap<>();
    }

    public HashMap<String, Employe> getRegistreEmp() {
        return registreEmp;
    }

    public void setRegistreEmp(HashMap<String, Employe> registreEmp) {
        this.registreEmp = registreEmp;
    }

    public void ajouterEmp(Employe emp) {
        registreEmp.put(emp.getCode(),emp);
    }
}
