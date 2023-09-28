import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void registrar(String nome, String nomeFuncionario, String registroFuncionario){
        Funcionario funcionario = FuncionarioFactory.getFuncionario(nomeFuncionario, registroFuncionario);
        Pessoa pessoa = new Pessoa(nome, funcionario);
        pessoas.add(pessoa);
    }

    public List<String> listaPessoas(){
        List<String> out = new ArrayList<String>();
        for(Pessoa pessoa : this.pessoas){
            out.add(pessoa.getPessoa());
        }
        return out;
    }

}
