import java.awt.*;

import java.applet.*;

import java.awt.event.*;

import java.io.*; 

import java.lang.*;


public class MovieTicket1 extends Applet implements ActionListener{

String msg="";

//static int c50=0,c100=0,c150=0;
public void init(){

        int c50=check("50.txt");

        int c100=check("100.txt");

        int c150=check("150.txt");

    //final Button    b=new Button[c50];

    //final Button    c=new Button[c100];

    //final Button    d=new Button[c150];

    for(int i=0;i<c50;i++){

        Button b=new Button("50");

        b.setBackground(Color.red);

        b.addActionListener(this);

        add(b);
 

    }
        for(int i=0;i<c100;i++){

            Button c=new Button("100");

            c.setBackground(Color.green);

            c.addActionListener(this);

            add(c);
 

        }

        for(int i=0;i<c150;i++){

            Button d=new Button("150");

            d.setBackground(Color.blue);

            d.addActionListener(this);

            add(d);
 

        }
}

public void actionPerformed(ActionEvent ae){

    String str=ae.getActionCommand();

    Button b1;
 

        if(str.equals("50") )

        {msg="Booked 50 Rs/";b1=(Button)ae.getSource();b1.setEnabled(false);}
 

        else if(str.equals("100"))

        {    msg="Booked 100 Rs/";b1=(Button)ae.getSource();b1.setEnabled(false);}
        else if(str.equals("150"))

            {msg="Booked 150/";b1=(Button)ae.getSource();b1.setEnabled(false);}                                    

    repaint();

}
public int check(String file){

    int count=0;
     try{  

           FileInputStream fin=new FileInputStream(file);  

            int i=0;  

            while((i=fin.read())!=-1){  

                         count++; 

                }  

            fin.close();  

      }catch(Exception e){} 
 

return count;

}

public void paint(Graphics g){

    g.drawString(msg,200,400);

}

}