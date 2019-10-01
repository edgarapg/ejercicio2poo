package ejercicio2poo;
import javax.swing.JOptionPane;
public class Ejercicio2poo {
    datosviaje vip,vip1,vip2;
    
    public static void main(String[] args) {
     Ejercicio2poo obj=new Ejercicio2poo();
    obj.imprimir();
    }
    public Ejercicio2poo(){
        vip=new datosviaje();
        vip1=new datosviaje();
        vip2=new datosviaje();
    }
    
    public void imprimir(){
     vip.setNombre("juan");
     vip.setValor(30000);
     vip.setNviaje(1);
     vip.setDia(12);
     vip.setMes("octubre");
     vip.setFecha(2019);
     vip.setHora(10);
     vip.setMin(30);

     vip1.setNombre("pedro");
     vip1.setValor(40000);
     vip1.setNviaje(1);
     vip1.setDia(12);
     vip1.setMes("octubre");
     vip1.setFecha(2019);
     vip1.setHora(10);
     vip1.setMin(50);
     
     vip2.setNombre("julian");
     vip2.setValor(20000);
     vip2.setNviaje(1);
     vip2.setDia(12);
     vip2.setMes("octubre");
     vip2.setFecha(2019);
     vip2.setHora(11);
     vip2.setMin(10);
     
     JOptionPane.showMessageDialog(null,"tiketes #1\n" + "# de viaje=" +vip.getNviaje() + "\nnombre del pasajero=" +vip.getNombre() + "\ncosto del tikete=" +vip.getValor() + "\nfecha=" +vip.getDia() + "/" +vip.getMes() + "/" +vip.getFecha()+ "\nhora=" +vip.getHora() + ":" +vip.getMin());
     JOptionPane.showMessageDialog(null,"tiketes #2\n" + "# de viaje=" +vip1.getNviaje() + "\nnombre del pasajero=" +vip1.getNombre() + "\ncosto del tikete=" +vip1.getValor() + "\nfecha=" +vip1.getDia() + "/" +vip1.getMes() + "/" +vip1.getFecha()+ "\nhora=" +vip1.getHora() + ":" +vip1.getMin());
     JOptionPane.showMessageDialog(null,"tiketes #3\n" + "# de viaje=" +vip2.getNviaje() + "\nnombre del pasajero=" +vip2.getNombre() + "\ncosto del tikete=" +vip2.getValor() + "\nfecha=" +vip2.getDia() + "/" +vip2.getMes() + "/" +vip2.getFecha()+ "\nhora=" +vip2.getHora() + ":" +vip2.getMin());
     JOptionPane.showMessageDialog(null,"costo total = " +(vip.getValor()+vip1.getValor()+vip2.getValor()));
    }
    
}
