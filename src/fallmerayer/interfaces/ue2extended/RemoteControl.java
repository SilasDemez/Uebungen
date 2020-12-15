package fallmerayer.interfaces.ue2extended;
import javax.swing.JOptionPane;

public class RemoteControl {
    public static void control(Robot robot){

        String str = JOptionPane.showInputDialog("Bitte geben Sie eine Reihe dieser Buchstaben ein: p, a, l, r");
        str = str.toLowerCase();


        for(int i=0; i<str.length();i++){
           switch (str.charAt(i)) {
               case 'p':
                   //System.out.println(robot.getPos());
                   double[] xy = robot.getPos();
                   System.out.println("Position des Robots (x|y):");
                   System.out.println("  x: " + xy[0] + "\n  y: " + xy[1]);
                   break;
               case 'a':
                   robot.advance();
                   break;
               case 'l':
                   robot.turnLeft();
                   break;
               case 'r':
                   robot.turnRight();
                   break;
               default:
                   System.out.println("Da hast du etwas falsch eingegeben!");
           }
        }
    }
}