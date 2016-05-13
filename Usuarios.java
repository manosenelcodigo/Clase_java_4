
package com.manosenelcodigo.clase;

public class Usuarios {
    
    //private public 
    private String nombre;
    private String correo;
    private int edad;
    
    //es un método que se usa para
    //inicializar valores
    Usuarios()
    {
        this.nombre="César Cancino";
        this.correo="yo@cesarcancino.com";
        this.edad=35;
    }
    
    //métodos de ejecución
    
    public void setNombre()
    {
        String nombre="Pedro Pérez";
        this.nombre="James Rodríguez";
    } 
    
    //métodos de retorno
     
    public String getNombre()
    {
        return this.nombre;
    }
    public String getCorreo()
    {
        return this.correo;
    }
    public int dimeLaEdad()
    {
        return this.edad;
    }
    
}
