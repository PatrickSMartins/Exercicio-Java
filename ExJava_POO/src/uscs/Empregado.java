package uscs;

public class Empregado {
    private String nome;
    private String endereco;
    private double valorH;
    private double quantidadeT;
    private double salario;

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorH() {
        return valorH;
    }

    public void setValorH(double valorH) {
        this.valorH = valorH;
    }

    public double getQuantidadeT() {
        return quantidadeT;
    }

    public void setQuantidadeT(double quantidadeT) {
        this.quantidadeT = quantidadeT;
    }
     public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Empregado(){
    }
    
    public Empregado(String nome, String endereco, double valorH, double quantidadeT){
    this.nome=nome;
    this.endereco=endereco;
    this.valorH=valorH;
    this.quantidadeT=quantidadeT;
   
    
    }
    
    public void ImprimeEmpregado(){
    System.out.println(nome);
    System.out.println(endereco);
    System.out.println(valorH);
    System.out.println(quantidadeT);
    
    }
    public double CalculaSalario(){
    salario = valorH*quantidadeT;
    return salario;
    }
    
    public void ImprimeSalario(){
    System.out.println("nome = "+nome + " \nsalario = "+CalculaSalario());
    
    }

}
