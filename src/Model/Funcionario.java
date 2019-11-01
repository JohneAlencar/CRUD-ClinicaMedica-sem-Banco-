
package Model;


public class Funcionario extends Usuario {
    
    private String nome;
    private int mat;
    FuncionarioGer func;
    
    public Funcionario(){
            
      // func = new FuncionarioGer();
    }

   
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setMat(int mat) {
        this.mat = mat;
    }
    
    public int getMat(){
        
        return mat;
    }
    
    public  String getNomeGerente(){
        
        return func.getNomeGerente();
        
    }
    
    public void setNomeGerente(String nomeGerente){
        
        func.setNomeGerente(nomeGerente);
        
                 
    }
    
}
