public class Pessoa {
   private String nome;
   private Funcionario funcionario;

   public Pessoa(String nome, Funcionario funcionario){
      this.nome = nome;
      this.funcionario = funcionario;
   }

   public String getPessoa(){
      return "Pessoa{" + "nome: '" + this.nome + '\'' +
              ", funcionario(a): '" + funcionario.getNome() + '\'' +
              ", registro: '" + funcionario.getRegistro() + '\'' +
              '}';
   }

}
