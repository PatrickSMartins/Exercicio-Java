package uscs2;

import uscs1.Departamento;
import uscs1.Empregado;

public class TesteRH {
    public static void main(String[] args) {
        Departamento d=new Departamento(10,"Departamento");
        Empregado e1= new Empregado(1,"Antonio",35,"Compras");
        Empregado e2= new Empregado(2,"Ana Maria",29,"Compras");
        e1.ImprimeEmpregado();
        e2.ImprimeEmpregado();
 
    }
}
