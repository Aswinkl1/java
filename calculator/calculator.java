package calculator;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.multi.MultiButtonUI;



public class calculator  implements Action{
    boolean isoperationpresed=false;
    
    JButton seven_button,eigth_button,nine_button,plus_button,four_button,five_button,six_button,minus_button,one_button,two_button,three_button, div_button,equal_button,dot_button,zero_button,mul_button;
    JFrame jf;
    JButton clear_button;
    JLabel display_label;
    String text ,choice;

    public calculator(){
            jf=new JFrame();
            jf.setLayout(null);
            jf.setSize(450, 700);
            jf.setVisible(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setLocation(500, 130);
            

         display_label=new JLabel();
            display_label.setBounds(30, 50, 380, 80);
            display_label.setBackground(Color.lightGray);
            display_label.setOpaque(true);
            display_label.setHorizontalAlignment(SwingConstants.RIGHT);
            display_label.setFont(new FontUIResource("arial", 0, 40));
         seven_button=new JButton("7");
            seven_button.setBounds(30, 150, 80, 80);
                jf.add(seven_button);
                seven_button.setFont(new FontUIResource("arial", 0, 30));
                
                seven_button.addActionListener(this);
                
         eigth_button=new JButton("8");
                 eigth_button.setBounds(130, 150, 80, 80);
                 jf.add(eigth_button);
                 eigth_button.addActionListener(this);
                 eigth_button.setFont(new FontUIResource("arial", 0, 30));
                 
        
         nine_button=new JButton("9");
                 nine_button.setBounds(230, 150, 80, 80);
                 jf.add(nine_button);
                 nine_button.addActionListener(this);
                 nine_button.setFont(new FontUIResource("arial", 0, 30));
        plus_button=new JButton("+");
                 plus_button.setBounds(330, 150, 80, 80);
                 jf.add(plus_button);
                 plus_button.addActionListener(this);
                 plus_button.setFont(new FontUIResource("arial", 0, 30));


         four_button=new JButton("4");
                 four_button.setBounds(30, 250, 80, 80);
                     jf.add(four_button);
                     four_button.addActionListener(this);
                     four_button.setFont(new FontUIResource("arial", 0, 30));
          five_button=new JButton("5");
                      five_button.setBounds(130, 250, 80, 80);
                      jf.add(five_button);
                      five_button.addActionListener(this);
                      five_button.setFont(new FontUIResource("arial", 0, 30));
             
         six_button=new JButton("6");
                      six_button.setBounds(230, 250, 80, 80);
                      jf.add(six_button);
                      six_button.addActionListener(this);
                      six_button.setFont(new FontUIResource("arial", 0, 30));
         minus_button=new JButton("-");
                      minus_button.setBounds(330, 250, 80, 80);
                      jf.add(minus_button); 
                      minus_button.addActionListener(this);
                      minus_button.setFont(new FontUIResource("arial", 0, 30));
         one_button=new JButton("1");
                      one_button.setBounds(30, 350, 80, 80);
                          jf.add(one_button);
                          one_button.addActionListener(this);
                          one_button.setFont(new FontUIResource("arial", 0, 30));
        two_button=new JButton("2");
                           two_button.setBounds(130, 350, 80, 80);
                           jf.add(two_button);
                           two_button.addActionListener(this);
                           two_button.setFont(new FontUIResource("arial", 0, 30));
                  
        three_button=new JButton("3");
                           three_button.setBounds(230, 350, 80, 80);
                           jf.add(three_button);
                           three_button.addActionListener(this);
                           three_button.setFont(new FontUIResource("arial", 0, 30));
         div_button=new JButton("%");
                           div_button.setBounds(330, 350, 80, 80);
                           jf.add(div_button); 
                           div_button.addActionListener(this);
                           div_button.setFont(new FontUIResource("arial", 0, 30));
        zero_button=new JButton("0"); 
                    zero_button.setBounds(30, 450, 80, 80); 
                    jf.add(zero_button);
                    zero_button.addActionListener(this);
                    zero_button.setFont(new FontUIResource("arial", 0, 30));
         dot_button=new JButton(".");
                    dot_button.setBounds(130, 450, 80, 80);
                    jf.add(dot_button);
                    dot_button.addActionListener(this);
                    dot_button.setFont(new FontUIResource("arial", 0, 30));
        equal_button=new JButton("=");
                    equal_button.setBounds(230, 450, 80, 80);
                     jf.add(equal_button);
                     equal_button.addActionListener(this);
                     equal_button.setFont(new FontUIResource("arial", 0, 30));
        mul_button=new JButton("x");
                     mul_button.setBounds(330, 450, 80, 80);
                      jf.add(mul_button);
                      mul_button.addActionListener(this);
                      mul_button.setFont(new FontUIResource("arial", 0, 30));
        clear_button=new JButton("clear");
                clear_button.setBounds(130, 550, 160, 80);
                jf.add(clear_button);
                clear_button.addActionListener(this);
                clear_button.setFont(new FontUIResource("arial", 0, 30));
 

                 
                 
        jf.add(display_label);

    }
    

    public static void main(String[] args) {

        calculator c = new calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==seven_button){
        if(isoperationpresed==true){
            display_label.setText("7");
           isoperationpresed=false;
        }else{

        
       
        display_label.setText(display_label.getText()+"7");
        }
       }
       else if(e.getSource()==eigth_button){
        if(isoperationpresed==true){
            display_label.setText("8");
            isoperationpresed=false;
        }else{
        display_label.setText(display_label.getText()+"8");
        }

       }
       else if(e.getSource()==nine_button){
        display_label.setText(display_label.getText()+"9");

       }
       else if(e.getSource()==six_button){
        display_label.setText(display_label.getText()+"6");

       }
       else if(e.getSource()==five_button){
        display_label.setText(display_label.getText()+"5");

       }
       else if(e.getSource()==four_button){
        display_label.setText(display_label.getText()+"4");

       }
       else if(e.getSource()==three_button){
        display_label.setText(display_label.getText()+"3");

       }
       else if(e.getSource()==two_button){
        display_label.setText(display_label.getText()+"2");

       }
       else if(e.getSource()==one_button){
        display_label.setText(display_label.getText()+"1");

       }
       else if(e.getSource()==zero_button){
        display_label.setText(display_label.getText()+"0");

       }
       else if(e.getSource()==dot_button){
        
        display_label.setText(display_label.getText()+".");
       }
       else if(e.getSource()==plus_button){
        
        
        isoperationpresed=true;
        text =display_label.getText();
        choice= "plus";

       }
       else if(e.getSource()==minus_button){
        isoperationpresed=true;
        text =display_label.getText();
        choice="minus";
       
       }
       else if(e.getSource()==div_button){
        isoperationpresed=true;
        text =display_label.getText();
        choice= "div";

       }
       else if(e.getSource()==mul_button){
        isoperationpresed=true;
        text =display_label.getText();
        choice="mul";

       }
       else if (e.getSource()==equal_button){
        if(choice=="plus"){
        String newvalue=display_label.getText();
        float newf=Float.parseFloat(newvalue);
        float oldf=Float.parseFloat(text);
        float result=newf+oldf;
        display_label.setText(result+"");
        }
        else if(choice=="minus"){
            String newvalue=display_label.getText();
        float newf=Float.parseFloat(newvalue);
        float oldf=Float.parseFloat(text);
        float result=newf-oldf;
        display_label.setText(result+"");

        }else if(choice=="div"){
            String newvalue=display_label.getText();
        float newf=Float.parseFloat(newvalue);
        float oldf=Float.parseFloat(text);
        float result=newf/oldf;
        display_label.setText(result+"");

        }else if(choice=="mul"){
            String newvalue=display_label.getText();
        float newf=Float.parseFloat(newvalue);
        float oldf=Float.parseFloat(text);
        float result=newf*oldf;
        display_label.setText(result+"");

        }

       }
       else if(e.getSource()==clear_button){
        display_label.setText("");
       }

        
        
    }
   
    @Override
    public Object getValue(String key) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void putValue(String key, Object value) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void setEnabled(boolean b) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        // TODO Auto-generated method stub
        
    }
   
}        