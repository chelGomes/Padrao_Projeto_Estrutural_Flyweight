import java.util.HashMap;
import java.util.Map;

public class FuncionarioFactory {

    private static Map<String, Funcionario> funcionarios = new HashMap<>();

    public static Funcionario getFuncionario(String nome, String registro){
        Funcionario funcionario = funcionarios.get(registro);
        if(funcionario == null){
            funcionario = new Funcionario(nome, registro);
            funcionarios.put(registro, funcionario);
        }
        return funcionario;
    }

    public static int getTotalFuncionarios(){
        return funcionarios.size();
    }
}
