/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Kelompok A
 * Adelia Rahmawati 18311243
 * Agung Pambudi 18311052
 */
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class DbConnection {
    
    Properties myPanel, myLanguage;
    private String strNamaPanel;
    
    public DbConnection() {
    }
    
    public String settingPanel(String nmPanel) {
        try {
            myPanel = new Properties();
            myPanel.load(new FileInputStream("lib/database.ini"));
            strNamaPanel = myPanel.getProperty(nmPanel);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak Ada Koneksi Database", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        
        return strNamaPanel;
    }
}
