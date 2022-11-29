import uscs.Empregado;
import uscs.Gerente;

public class TesteGerente {
    public static void main(String[] args) throws Exception {
        Empregado e=new Empregado("Antonio", "Rua Brasil,130", 50.00, 230);
        e.ImprimeEmpregado();
        e.ImprimeSalario();
        
        Gerente g= new Gerente("Carlos", "Rua Silvio Torres,36", "Ana",50.00,230,2000);
        g.ImprimeGerente();
        g.ImprimeSalario();
       

    }
}
