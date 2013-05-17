import javax.swing.JFrame;
public class Executa
{
   public static void main (String args[])
   {
  JFrame frame = new JFrame("Desenhando Poligonos HUEHUEBR");
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  Poligonos poligonos = new Poligonos();
	  frame.add(poligonos);
	  frame.setSize(300,300);
	  frame.setVisible(true);
   }
} 
