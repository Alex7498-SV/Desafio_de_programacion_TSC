package desafio;

import GUI.Inicio;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;
import javax.swing.UIManager;

public class Desafio{

    public static void main(String[] args) {
        
        try{
            UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
        }
        catch(Exception e){}
       
        new Inicio().setVisible(true);
        
    }
    
}
