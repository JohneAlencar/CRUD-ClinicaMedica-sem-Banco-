
package Model;

public class Paciente {
    
    private String nome;
    private String rg;
    private String cpf;
    private String email;
    
    Funcionario func;
    FuncionarioGer funcG;
    Endereco end;
    Contato cont;
    
  public Paciente (){
      
      
      //func = new Funcionario();
      //funcG = new FuncionarioGer();
      
      end = new Endereco();
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

   
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }
  
    public String getNomeFuncionario(){
        
        return func.getNome();
    }
    
    public void setNomeFuncionario(String nome){
        
        this.func.setNome(nome);
    }
    
    public String getNomeGerente(){
        
        return funcG.getNome();
    }
    
    public void setNomeGerente(String nome){
        
        this.funcG.setNome(nome);
    }
    
    public String getRua(){
        
        return end.getRua();
    }
    
    public void setRua(String rua){
        
        this.end.setRua(rua);
    }
    
    public String getCasa(){
        return end.getCasa();
    }
    
    public void setCasa(String casa){
        this.end.setCasa(casa);
    }
  
    public String getBairro(){
        return end.getBairro();
    }
  
    public void setBairro(String bairro){
        this.end.setBairro(bairro);
    }
    
    public String getFone(){
        return cont.getFone();
    }
    
    public void setFone(String fone){
        this.cont.setFone(fone);
    }
}

