package model;

import java.util.HashMap;

public class RegistreDept {
    private HashMap<String,HashMap<String,Employe>> registreDept;

    public RegistreDept() {
        registreDept = new HashMap<>();
    }

    public HashMap<String, HashMap<String, Employe>> getRegistreDept() {
        return registreDept;
    }

    public void setRegistreDept(HashMap<String, HashMap<String, Employe>> registreDept) {
        this.registreDept = registreDept;
    }

    public void ajouterRegistreEmp(RegisteEmploye registeEmp, ) {
        registreDept.put(registeEmp.)
    }
}
