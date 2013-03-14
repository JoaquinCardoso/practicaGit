/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author Joaquin Cardoso Buzon
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	System.out.println("modificado por alum1"); // insertado por alum1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
        System.out.println("Modificaciones hechas por alumno2"); //modif alumno2
   	//Linea modificada
   }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
        System.out.println("Modificaciones hechas por alumno2"); //modif alumno2
	// modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");
   }
   public void testGitaux(){
   	// metodo rama testing
	System.out.println("Metodo de testing");
   }
}
