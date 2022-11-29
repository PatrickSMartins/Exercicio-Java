package uscs1;
import java.util.ArrayList;

public class Departamento {
    private int CodDepartamento;
    private String descricao;
    
    private ArrayList<Empregado>lista_de_empregados;{
        this.lista_de_empregados = new ArrayList<Empregado>();
    }
    public ArrayList<Empregado> getLista_de_empregados() {
        return lista_de_empregados;
    }

    public void setLista_de_empregados(ArrayList<Empregado> lista_de_empregados) {
        this.lista_de_empregados = lista_de_empregados;
    }
   

    public int getCodDepartamento() {
        return CodDepartamento;
    }

    public void setCodDepartamento(int CodDepartamento) {
        this.CodDepartamento = CodDepartamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Departamento(){
    }
    
    public Departamento(int CodDepartamento, String descricao){
        this.CodDepartamento=CodDepartamento;
        this.descricao=descricao;
    }
    
    public void ImprimeDepartamento(){
        System.out.println(CodDepartamento);
        System.out.println(descricao);
    }
    public void AdicionaEmpregado (Empregado e){
        this.lista_de_empregados.add(e);
    }
    
    public String RetornaEmpregados(){
        String lista = null;
        for(int i=0;i<this.lista_de_empregados.size();i++)
            lista+=this.lista_de_empregados.get(i).getNome()+"\n";
        return lista;

    } 


}