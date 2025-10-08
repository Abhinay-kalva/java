import java.awt.*; 
class PanelFrame  
{ 
PanelFrame() 
{ 
Frame f=new Frame(); 
f.setSize(600,400); 
f.setBackground(Color.pink); 
f.setLayout(new BorderLayout()); 
Panel p1=new Panel(); 
p1.setBackground(Color.blue); 
Label l1 =new Label("Enter Uname"); 
TextField tf1=new TextField(15); 
Label l2=new Label("Enter Passward"); 
TextField tf2=new TextField(15); 
p1.add(l1); 
p1.add(tf1); 
p1.add(l2); 
p1.add(tf2); 
f.add("North",p1); 
Panel p2=new Panel(); 
p2.setBackground(Color.yellow); 
Button b1=new Button("Send"); 
Button b2=new Button("Clear"); 
p2.add(b1); 
p2.add(b2); 
f.add("South",p2); 
f.setVisible(true);} 
public static void main(String[] args)  
{ 
PanelFrame pf=new PanelFrame();  
} 
}