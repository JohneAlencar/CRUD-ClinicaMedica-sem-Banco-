
package Dao;

import Model.Funcionario;
import Model.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FuncionarioDao extends UsuarioDao {
    
    ArrayList<Funcionario>listaFuncionario = new ArrayList();
    
    
    public void Cadastrar(Funcionario func){
        
        listaFuncionario.add(func);
        
    }
    
    
    @Override
     public Usuario RealizarLogin(Usuario user){
         
         for(Funcionario aux:listaFuncionario){
             
             if(aux.getLogin().equals(user.getLogin()) && aux.getSenha().equals(user.getSenha())){
                 
                 return aux;
             }
         }
          return null;
    }
     
     
     public void Excluir(Funcionario func){
         
         for(Funcionario aux:listaFuncionario){
             
             if(aux.getNome().equals(func.getNome())){
                 
                listaFuncionario.remove(aux);
                 
             }
          }
     }
    
     public void Alterar(Funcionario func){
         
         int cont=-1;
         
         for(Funcionario aux:listaFuncionario){
             
             cont++;
             
             if(aux.getNome().equals(func.getNome())){
                 
                 listaFuncionario.get(cont).setNome(func.getNome());
                 listaFuncionario.get(cont).setMat(func.getMat());
                 listaFuncionario.get(cont).setLogin(func.getLogin());
                 listaFuncionario.get(cont).setSenha(func.getSenha());
             }
         }
     }
     
     
     public Funcionario PesquisaNome(String nome){
         
         for(Funcionario aux:listaFuncionario){
             
             if(aux.getNome().equals(nome)){
                 
                 return aux;
             }
         }
         
         return null;
            
     }
     
       public Funcionario PesquisaMat(int mat){
         
         for(Funcionario aux:listaFuncionario){
             
             if(aux.getMat()==mat){
                 
                 return aux;
             }
         }
         
         return null;
            
     }
     
     
}







