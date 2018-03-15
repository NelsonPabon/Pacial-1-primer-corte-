package parcialuno;

public class Materia {
    
    String Nom_Mat;

    Notas mater = new Notas();

    public String getNom_Mat() {
        return Nom_Mat;
    }

    public void setNom_Mat(String Nom_Mat) {
        this.Nom_Mat = Nom_Mat;
    }
    
    public String Datos_Materia () {
    
        return " | Materia: " + Nom_Mat;
    
    }
    
}
