import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Criticalstone on 29-Oct-14.
 */
public class Histogram extends JPanel{
    public List<Double> histogram;

    public Histogram(){
        histogram = new ArrayList<Double>();
    }

    public Histogram(double[] staplar){
        histogram = new ArrayList<Double>(staplar.length);
        for(double d : staplar){
            histogram.add(d);
        }
        repaint();
    }

    public void setValues(double[] staplar){
        histogram.clear();
        for(int i = 0; i < staplar.length; i++) {
            histogram.add(staplar[i]);
        }
        repaint();
    }

    public void addValue(double d){
        histogram.add(d);
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i = 0; i < histogram.size(); i++){
            double y = histogram.get(i);
            g.fillRect(i*100, (int)(1000-y*100), 90, (int)(y*100) );
            System.out.print(y);
        }
    }

    public void placeraStaplar(){

    }

}
