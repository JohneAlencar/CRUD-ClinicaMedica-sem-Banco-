
package Model;


public class Agendamento {
    
    private String data;
    private String hora;
    Funcionario func;
    Paciente paciente;
    Medico med;
    
    public Agendamento(){
        
        func = new Funcionario();
        paciente = new Paciente();
        med = new Medico();
    }

   
    public String getData() {
        return data;
    }

   
    public void setData(String data) {
        this.data = data;
    }

   
    public String getHora() {
        return hora;
    }

    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public String getNomeFunc(){
        return func.getNome();
    }
    
    public void setNomeFunc(String nome){
        this.func.setNome(nome);
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
}