import javax.swing.JFrame;
public class FrameExtendsJframe extends JFrame{
public FrameExtendsJframe(){
super("My first GUI Frame extends Jframe");
setSize(400,300);
setVisible(true);
}
public static void main(String[] args){
new FrameExtendsJframe();
}
}