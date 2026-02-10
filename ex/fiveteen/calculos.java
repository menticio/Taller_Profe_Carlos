package fiveteen;

public class calculos {
    
    String nombre;
    String curso;
    double nota1;
    double nota2;
    double nota3;


    public calculos(String nombre,String curso,double nota1,double nota2,double nota3){

       this.nombre = nombre; 
       this.curso = curso;
       this.nota1 = nota1;
       this.nota2 = nota2;
       this.nota3 = nota3;
    }

    public double calcular(){

       return  (nota1 + nota2 + nota3)/3;
    }
    

      public boolean aprueba() {
        return calcular() >= 3.0;
    }

      
 }






