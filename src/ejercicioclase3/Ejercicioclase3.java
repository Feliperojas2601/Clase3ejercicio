
package ejercicioclase3;


public class Ejercicioclase3 {

   
    public static void main(String[] args) {
     banco p1= new banco (1012,1234,"Magdalena Sanchez",0);
     p1.consignar(100000);
      System.out.println(p1.getNombre()+" su nuevo saldo es: "+p1.getSaldo());
     banco p2= new banco (1012,9876,"Joselito perez",500000);
     p2.cambio(8876);
     p2.consulta();
        System.out.println(p2.getNombre()+" su nueva clave es: "+ p2.getClave());
        System.out.println(p2.getNombre()+" su saldo es: " +p2.getSaldo());
    }
    
}
