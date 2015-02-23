/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threecardsgame; 

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

/**
 *
 * @author Migno
 */
public class FXMLDocumentController implements Initializable {

    @FXML 
    private Label labelEsatte;
    @FXML 
    private Label labelSbagliate;
    @FXML 
    private Label labelPercentuale;    
    @FXML 
    private Button bottone1;
    @FXML 
    private Button bottone2;
    @FXML 
    private Button bottone3;
    @FXML 
    private Button bottoneN;
    
    
    Random estrattore = new Random();
    int rdm;
    
    int partite = 0;
    int esatte = 0; 
    int sbagliate = 0;
    
    
    @FXML
    private void carta1 () { 
        this.gioca(0);
        rdm = estrattore.nextInt(3);
    } 
    
    
    private void dati () {
        labelEsatte.setText(String.valueOf(esatte));
        labelSbagliate.setText(String.valueOf(sbagliate));
        labelPercentuale.setText(String.valueOf(esatte*100/partite+"%"));
    }
    
    @FXML
    private void carta2 () { 
        this.gioca(1);
        rdm = estrattore.nextInt(3);
    }
    
    
    @FXML
    private void sfida (ActionEvent ae) {
        rdm = estrattore.nextInt(3);
        bottone1.setDisable(false);
        bottone2.setDisable(false);
        bottone3.setDisable(false);
        bottoneN.setDisable(true);
        System.out.println("Vediamo se mi batti...");
    } 
    
      
    @FXML
    private void carta3 () { 
        this.gioca(2);
        rdm = estrattore.nextInt(3);
    }
    
    
    private void gioca (int n) {   
        switch (n) {
            case 0:  
                if (this.rdm == 1) {
                    JOptionPane.showMessageDialog(null, "HAI VINTOOOOOOO!!!!!!!!!!!! Hai trovato L'1.", "Congratulazioni", JOptionPane.INFORMATION_MESSAGE);
                    esatte = esatte +1;
                    partite = partite +1;
                }
                else {
                    JOptionPane.showMessageDialog(null, "HAI PERSO!!! Non hai trovato l'1.", "Sarà per la prossima", JOptionPane.INFORMATION_MESSAGE);
                    sbagliate = sbagliate +1;
                    partite = partite +1;
                }
                break;
            case 1:
                if (this.rdm == 1) {
                    JOptionPane.showMessageDialog(null, "HAI VINTOOOOOOO!!!!!!!!!!!! Hai trovato L'1.", "Congratulazioni", JOptionPane.INFORMATION_MESSAGE);                    
                    esatte = esatte +1;
                    partite = partite +1;
                }
                else {
                    JOptionPane.showMessageDialog(null, "HAI PERSO!!! Non hai trovato l'1.", "Sarà per la prossima", JOptionPane.INFORMATION_MESSAGE);
                    sbagliate = sbagliate +1;
                    partite = partite +1;
                }
                break;                
            case 2:
                if (this.rdm == 1) {
                    JOptionPane.showMessageDialog(null, "HAI VINTOOOOOOO!!!!!!!!!!!! Hai trovato L'1.", "Congratulazioni", JOptionPane.INFORMATION_MESSAGE);
                    esatte = esatte +1;
                    partite = partite +1;
                }
                else {
                    JOptionPane.showMessageDialog(null, "HAI PERSO!!! Non hai trovato l'1.", "Sarà per la prossima", JOptionPane.INFORMATION_MESSAGE);
                    sbagliate = sbagliate +1;
                    partite = partite +1;
                }
                break;                
        }
        this.dati();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
