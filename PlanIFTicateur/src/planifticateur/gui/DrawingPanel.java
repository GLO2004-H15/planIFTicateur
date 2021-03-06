/* Classe Drawing Panel
 * 
 * 
*/
package planifticateur.gui;
import planifticateur.drawing.HoraireDrawing;
import planifticateur.domain.HoraireController;
import java.awt.*;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class DrawingPanel extends JPanel implements Serializable
  {
    private MainWindow mainWindow;      //fenêtre principal du programme (parent 1er)
    private Dimension initialDimension; //Dimension du panel
    private HoraireDrawing mainHoraire;
    
    public DrawingPanel(){
        //Constructeur
    }
    
    public DrawingPanel(MainWindow mainWindow){
        //Constructeur avec frame principal en paramètre
        this.mainWindow = mainWindow;
        int width = mainWindow.initialDimension.width;
        int height = mainWindow.initialDimension.height;
        initialDimension = new Dimension(width, height);
        setPreferredSize(initialDimension);
        setVisible(true);
    }
    
    @Override
    protected void paintComponent( Graphics g )
    {   
        //méthode pour l'affichage des éléments visuels
        if (mainWindow != null){
            super.paintComponent(g);
            mainHoraire = new HoraireDrawing(mainWindow.horaireController, this.initialDimension);
            mainHoraire.draw(g);
        }
    }
    
    public HoraireDrawing getMainHoraire(){
        return mainHoraire;
    }
    
    public MainWindow getMainWindow(){
        return mainWindow;
    }
    
    public void setMainWindow(MainWindow mainWindow){
        this.mainWindow = mainWindow;
    }
    
    public Dimension getInitialDimension(){
        return initialDimension;
    }
    
    public void setInitialDimension(Dimension initialDimension){
        this.initialDimension = initialDimension;
        this.setPreferredSize(this.initialDimension);
    }
    
    public void setHeight(int y){
        this.setPreferredSize(new Dimension(this.initialDimension.width, y));
        this.repaint();
    }
  }