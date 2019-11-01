
package Dao;

import Model.Medico;
import java.util.ArrayList;


public class MedicoDao {
    
    ArrayList<Medico>listaMedico = new ArrayList();
    
    
    
    
     public Medico PesquisarNome(String nome){
        
        for(Medico aux:listaMedico){
            
            if(aux.getNome().equals(nome)){
            return aux;
            }
        }
        
        return null;
     }
     
     
       public Medico PesquisarCpf(String cpf){
        
        for(Medico aux:listaMedico){
            
            if(aux.getCpf().equals(cpf))
            return aux;
        }
        
        return null;
     }
    
    
    
    
    public void Cadastrar(Medico med){
        
        listaMedico.add(med);
    }
    
    public void Excluir(String nome){
        
        for(Medico aux:listaMedico){
            if(aux.getNome().equals(nome)){
                
                listaMedico.remove(aux);
            }
        }
    }
    
    
    public void Alterar(Medico med){
        
        int cont=-1;
        
        for(Medico aux:listaMedico){
            cont ++;
            
            if(aux.getNome().equals(med.getNome())){
                
              listaMedico.get(cont).setNome(med.getNome());
              listaMedico.get(cont).setRg(med.getRg());
              listaMedico.get(cont).setCpf(med.getCpf());
              listaMedico.get(cont).setFone(med.getFone());
              listaMedico.get(cont).setCrm(med.getCrm());
              listaMedico.get(cont).setEspecialidade(med.getEspecialidade());
              
           
            }
            
        }
    }
    
}