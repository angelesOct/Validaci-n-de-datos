package extras;

import javax.swing.JOptionPane;

/**
 *
 * @author Octaviano
 */
public class DataValidation {
    public float String2Int(String value){
        float numero =0;
        try{
            numero = Integer.parseInt(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Error ingresa solo datos numericos");
            numero=0;
        }
        return numero;
    }
    
    public float String2Float(String value){
        float numero1 =0.0f;
        try{
            numero1 = Float.parseFloat(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Error ingresa solo datos numericos");
            numero1=0.0f;
        }
        return numero1;
    }
    
    public double String2Double(String value){
        double numero2 =0.0;
        try{
             numero2 = Double.parseDouble(value);
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Error ingresa solo datos numericos");
            numero2=0.0;
        }
        return numero2;
    }
    
}
