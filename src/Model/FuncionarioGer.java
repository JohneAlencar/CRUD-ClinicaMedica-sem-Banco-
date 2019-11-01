

package Model;

public class FuncionarioGer extends Funcionario {
    
    private String cpf;
    Contato cont;
    
public FuncionarioGer(){
    
    cont = new Contato();
}
   
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getFone(){
        
        return cont.getFone();
    }

    public void setFone(String fone){
        
        this.cont.setFone(fone);
    }




}
