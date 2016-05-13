
package com.manosenelcodigo.clase;

public class Principal 
{
    
    public static void main(String lnsd[])
    {
        //crear un objeto de la Usuarios
        //ese objeto se llama
        //instancia de la clase
        //Usuarios nombre = new Clase
        
        
        // la variable u pasa a ser
        //una variable de instancia
        Usuarios u=new Usuarios(); 
        System.out.println("Nombre (constructor): "+u.getNombre());
        u.setNombre();
        System.out.println("Nombre (el método de ejecución): "+u.getNombre());
        
        Usuarios u2= new Usuarios();
        System.out.println("Nombre  (la segunda instancia): "+u2.getNombre());
        System.out.println("E-Mail : "+u2.getCorreo());
        System.out.println("Edad : "+u2.dimeLaEdad());
    }
    
}
