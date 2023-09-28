import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BancoTest {
    @Test
    void deveRetornarFuncionarios(){
        Banco banco = new Banco();
        banco.registrar("João", "Alex", "123");
        banco.registrar("Jose", "Alex", "123");
        banco.registrar("Reinaldo", "Ana", "1234");
        banco.registrar("Frederico", "Jaime", "1238");

        assertEquals(3, FuncionarioFactory.getTotalFuncionarios());
    }

    @Test
    void deveRetonarPessoa(){
        Banco banco = new Banco();
        banco.registrar("João", "Alex", "123");
        banco.registrar("Jose", "Ana", "1234");
        banco.registrar("Frederico", "Jaime", "1238");

        List<String> out = Arrays.asList(
                "Pessoa{nome: 'João', funcionario(a): 'Alex', registro: '123'}",
                "Pessoa{nome: 'Jose', funcionario(a): 'Ana', registro: '1234'}",
                "Pessoa{nome: 'Frederico', funcionario(a): 'Jaime', registro: '1238'}"
        );
        assertEquals(out, banco.listaPessoas());
    }
}
