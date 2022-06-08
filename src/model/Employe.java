package model;

public class Employe {
    private  String code;
    private String nom;
    private String prenom;
    private String ville;
    private String deptNo;

    public Employe(String code, String nom, String prenom, String ville, String deptNo) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.deptNo = deptNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "code='" + code + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ville='" + ville + '\'' +
                ", deptNo='" + deptNo + '\'' +
                '}';
    }

}
