
package Dao;

import Model.Agendamento;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AgendamentoDao {
    
    ArrayList<Agendamento>listaAgendamento = new ArrayList();
    
    
    public void Agendamento(Agendamento agend){
        
        listaAgendamento.add(agend);
        JOptionPane.showMessageDialog(null, "Consulta marcada");
    }
    
}


