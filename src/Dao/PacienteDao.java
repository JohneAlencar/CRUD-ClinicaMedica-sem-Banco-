
package Dao;

import Model.Paciente;
import java.util.ArrayList;


public class PacienteDao {
    
    ArrayList<Paciente> listaPaciente = new ArrayList();
    
    
    
    
    public void Cadastro(Paciente pac){
    
    listaPaciente.add(pac);
}
    
    public void Excluir(Paciente pac){
        
        for(Paciente aux:listaPaciente){
            
            if(aux.getNome().equals(pac.getNome())){
                
                listaPaciente.remove(aux);
            }
        }
        
    }
    
    public void Alterar(Paciente pac){
        
        int cont= -1;
        
        for(Paciente aux:listaPaciente){
            
            cont++;
            
            if(aux.getNome().equals(pac.getNome())){
                
                listaPaciente.get(cont).setNome(pac.getNome());
                listaPaciente.get(cont).setCpf(pac.getCpf());
                listaPaciente.get(cont).setRg(pac.getRg());
                listaPaciente.get(cont).setFone(pac.getFone());
                listaPaciente.get(cont).setEmail(pac.getEmail());
                listaPaciente.get(cont).setRua(pac.getRua());
                listaPaciente.get(cont).setCasa(pac.getCasa());
                listaPaciente.get(cont).setBairro(pac.getBairro());
                
            }
            
        }
        
    }
    
    public Paciente PesquisarNome(String nome){
        
        for(Paciente aux:listaPaciente){
            
            if(aux.getNome().equals(nome))
                return aux;
        }
          return null;
    }
    
    
    public Paciente PesquisaCpf(String cpf){
        
        for(Paciente aux:listaPaciente){
            
            if(aux.getCpf().equals(cpf))
                  return aux;
            }
 
        return null;
    }
    
}
