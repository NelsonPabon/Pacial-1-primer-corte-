package parcialuno;

public class Estudiante extends Persona{
    
    String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String Informacion() {
        return super.Informacion() + " | Codigo: " + codigo; 
    }
    
    
    
}
