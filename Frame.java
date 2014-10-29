import javax.swing.*;

/**
 * Created by Criticalstone on 29-Oct-14.
 */
public class Frame extends JFrame {
    public Frame(){
        setSize(1000,1000);
        setTitle("Histogram");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        double[] staplar = {10,4,5,3,6,8,3,6,1,8};
        Histogram h = new Histogram(staplar);
        add(h);

//        double[] staplar1 = {0,3,10,1,3,4,5,1,2,3};
//        h.setValues(staplar1 );
        h.addValue(8.5);
        setVisible(true);
    }

    public static void main(String[] args){
        new Frame();
    }
}
