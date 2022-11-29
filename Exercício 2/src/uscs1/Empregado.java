package uscs1;

public class Empregado {
    private int CodEmpregado;
    private String nome;
    private int idade;
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    

    public int getCodEmpregado() {
        return CodEmpregado;
    }

    public void setCodEmpregado(int CodEmpregado) {
        this.CodEmpregado = CodEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Empregado(){
    }
    
    public Empregado(int CodEmpregado,String nome, int idade,String departamento){
        
        this.CodEmpregado=CodEmpregado;
        this.nome=nome;
        this.idade=idade;
        this.departamento=departamento;
    }
    
    public void ImprimeEmpregado(){
        System.out.println("Código do empregado: "+ CodEmpregado);
        System.out.println("nome: "+ nome);
        System.out.println("idade: "+ idade);
        System.out.println("departamento: "+ departamento);
    }

}
