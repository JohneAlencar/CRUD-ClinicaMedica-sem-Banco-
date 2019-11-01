
package Dao;

import Model.Usuario;
import javax.swing.JOptionPane;


public class UsuarioDao {
    
    
    public Usuario RealizarLogin(Usuario user){
        
        if(user.getLogin().equals("ADM") && user.getSenha().equals("123")){
            
            
            return user;
            
        }
        
        return null;
    }
    
}
