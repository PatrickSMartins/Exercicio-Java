package uscs;

public class Gerente extends Empregado {
    private double bonus;
private String nomeSec;


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getNomeSec() {
        return nomeSec;
    }

    public void setNomeSec(String nomeSec) {
        this.nomeSec = nomeSec;
    }

   
    
    public Gerente(){
    }
    
    public Gerente(String nome,String endereco,String nomeSec, double valorH, double quantidadeT, double bonus){
        super(nome,endereco,valorH,quantidadeT);
        this.bonus=bonus;
        this.nomeSec=nomeSec;
        
    
    }
   public void ImprimeGerente(){
    super.ImprimeEmpregado();
    System.out.println("Nome secretaria: "+nomeSec + " \nBonus: " + bonus);
   }
  public double CalculaSalario(){
    return super.CalculaSalario()+bonus;
  
  
  }
  
}
