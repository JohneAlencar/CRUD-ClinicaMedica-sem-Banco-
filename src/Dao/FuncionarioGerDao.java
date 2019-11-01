
package Dao;

import Model.FuncionarioGer;
import java.util.ArrayList;

public class FuncionarioGerDao {
    
    
      ArrayList<FuncionarioGer>listaGerente = new ArrayList();
    
    
    public void Cadastrar(FuncionarioGer func){
        
        listaGerente.add(func);
    }
    
    
}
