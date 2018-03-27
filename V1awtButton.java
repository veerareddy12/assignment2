import java.awt.*;
import java.awt.event.*;
public class V1awtButton extends Frame
{
Label label1,label2,label3;
Button b1,b2,b3;
public static void main(String a[])
{
V1awtButton A= new V1awtButton();
}
public V1awtButton()
{
super("awt application window");
setLayout(new FlowLayout());
label1 = new Label("left");
label2 = new Label("center");
label3 = new Label("right");
b1=new Button("ok");
b2=new Button("cancel");
b3=new Button("submit");
add(label1);
add(label2);
add(label3);
add(b1);
add(b2);
add(b3);
setSize(300,200);
addWindowListener(new V1awtButton.WindowEventHandler());
setVisible(true);
}
class WindowEventHandler extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}
}
