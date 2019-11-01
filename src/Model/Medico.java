
package Model;


public class Medico {
    
    private String nome;
    private String rg;
    private String cpf;
    private String crm;
    private String especialidade;
    FuncionarioGer func;
    Contato cont;
    
 public Medico(){
     
     
     cont = new Contato();
 }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getRg() {
        return rg;
    }

  
    public void setRg(String rg) {
        this.rg = rg;
    }

 
    public String getCpf() {
        return cpf;
    }

   
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    
    public String getCrm() {
        return crm;
    }

    
    public void setCrm(String crm) {
        this.crm = crm;
    }

 
    public String getEspecialidade() {
        return especialidade;
    }

   
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public String getNomeGerente(){
        
        return func.getNome();
    }
 
    public void setNomeGerente(String nome){
        this.func.setNome(nome);
    }
    
    public String getFone(){
        
        return cont.getFone();
    }
    
    
    public void setFone(String fone){
        this.cont.setFone(fone);
    }
    
}
