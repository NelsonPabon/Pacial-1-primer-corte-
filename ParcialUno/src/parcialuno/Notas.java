package parcialuno;

public class Notas {
    
    int []notica = new int[4];
    double totalNotas = 0;
    
    public double NotasM () {
        
        
        for ( int i= 0; i<4; i++){
            
            totalNotas = totalNotas + notica [i];   
            
        }
        
        totalNotas = (totalNotas)/notica.length;
        
        return totalNotas;  
    }
    
}
