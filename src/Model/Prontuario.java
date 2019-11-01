
package Model;


public class Prontuario {
    
    private String diagnostico;
    private String prescricao;
    Medico med;
    FuncionarioGer funcG;
    Paciente paciente;
    
    
    public Prontuario(){
        
        med = new Medico();
        funcG = new FuncionarioGer();
        paciente = new Paciente();
        
    }

   
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    
    public String getPrescricao() {
        return prescricao;
    }

   
    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }
    
     public String getNomePaciente(){
        return paciente.getNome();
    }
    
    public void setNomePaciente(String nome){
        this.paciente.setNome(nome);
    }
    
    public String getNomeMedico(){
        return med.getNome();
    }
    
    public void setNomeMedico(String nome){
        this.med.setNome(nome);
    }
    
     public String getNomeGerente(){
        
        return funcG.getNome();
    }
 
    public void setNomeGerente(String nome){
        this.funcG.setNome(nome);
    }
    
    
    
    
}
