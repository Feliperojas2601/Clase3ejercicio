/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase3;

/**
 *
 * @author Estudiante
 */
public class banco {
    private int cuenta; 
    private int clave; 
    private String nombre; 
    private double saldo; 

    public banco(int cuenta, int clave, String nombre, double saldo) {
        this.cuenta = cuenta;
        this.clave = clave;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    


 public boolean  consignar (double plata){
     if (plata >=0){
          this.saldo= this.saldo + plata;
          return true;
     }
    else {
     return false; 
 }}
 
 public boolean retirar (double platar){
     if (platar >0 &&  platar <= this.saldo){
    this.saldo=this.saldo-platar;
    return true;
 }
     else {
     return false;
 }
 }
 public boolean cambio (int nuevaclave) {
     if (nuevaclave>0){
         this.clave= nuevaclave;
         return true; 
     }
     else {
         return false;
     }
 } 
 public  boolean consulta (){
   if (this.saldo >=0){
       return true; 
   }
   else {
     return false; 
 }
}
}
