package model;

import java.util.HashMap;

public class RegistreDept {
    private HashMap<String, RegisteEmploye> registreDept;

    public RegistreDept() {
        registreDept = new HashMap<>();
    }

    public HashMap<String, RegisteEmploye> getRegistreDept() {
        return registreDept;
    }

    public void setRegistreDept(HashMap<String, RegisteEmploye> registreDept) {
        this.registreDept = registreDept;
    }

    public void ajouterRegistreEmp(String nomDept, RegisteEmploye registeEmp) {
        registreDept.put(nomDept,registeEmp);
    }

//    public void ajouterRegistreEmp(RegisteEmploye registeEmp, ) {
//        registreDept.put(registeEmp.)
//    }
}
