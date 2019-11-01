
package Dao;

import Model.Paciente;
import Model.Prontuario;
import java.util.ArrayList;


public class ProntuarioDao {
    
    ArrayList<Prontuario>listaProntuario = new ArrayList();
    
    
    public void Consulta(Prontuario pront){
        
        listaProntuario.add(pront);
    }
    
    public Prontuario Relatorio(String nome){
        
        for(Prontuario aux:listaProntuario){
            
            if(aux.getNomePaciente().equals(nome)){
                
                return aux;
            }
        }
         return null;
        
    }
    
    
}
