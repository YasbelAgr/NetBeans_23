import javax.swing.JOptionPane;
public class Cafeteria {
    public static void main (String[] agrs){
        short pago, tot,  descuento;
        String color;
        color=JOptionPane.showInputDialog("ingresa el color que obtuviste");
        pago=Short.parseShort(JOptionPane.showInputDialog("ingresa la cantidad que pagaste "));
        if (color.contentEquals("rojo")){
            descuento= (byte) ((pago*40.0)/100.0);
            tot= (byte)(pago-descuento);
            JOptionPane.showMessageDialog(null, "Al sacar la bola roja su descuento es del 40%, "
                    + " y su total a pagar es de "+tot);
        }else if (color.contentEquals("verde")){
            descuento= (byte) ((pago*28.0)/100.0);
            tot= (byte) (pago-descuento);
            JOptionPane.showMessageDialog(null, "Al sacacr su bola de color verde su descuento es de 28%, "
                    + " y su total a pagar es de "+tot);
        }else if(color.contentEquals("azul")){
            descuento= (byte) ((pago*15.0)/100.0);
            tot= (byte) (pago-descuento);
            
            JOptionPane.showMessageDialog(null, "Al sacar su bola de color azul su descuento es de 15%, "
                    + " y su total a pagar es de "+tot);
        }else if (color.contentEquals("amarillo")){
            descuento= (byte)((pago*5.0)/100.0);
            tot= (byte) (pago-descuento);
            JOptionPane.showMessageDialog(null, "Al sacar su bola de color amarillo su descuento es de 5%, "
                    + " y su total a pagar es de "+tot);
            
        }
    }
}
