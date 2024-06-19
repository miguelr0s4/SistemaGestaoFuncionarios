package br.com.sistemagestaofuncionarios;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import br.com.sistemagestaofuncionarios.model.Funcionario;
import br.com.sistemagestaofuncionarios.service.FuncionarioService;
import br.com.sistemagestaofuncionarios.util.FormatterUtil;

public class Principal {
    public static void main(String[] args) {
        FuncionarioService funcionarioService = new FuncionarioService();

        // 3.1 - Inserir todos os funcionários, na mesma ordem e informações da tabela
        funcionarioService.inicializarFuncionarios();

        // 3.2 - Remover o funcionário "João" da lista
        funcionarioService.removerFuncionarioPorNome("João");

        // 3.3 - Imprimir todos os funcionários
        System.out.println("Funcionários:");
        funcionarioService.getFuncionarios().forEach(System.out::println);
        System.out.println();

        // 3.4 - Aumentar o salário dos funcionários em 10%
        funcionarioService.aumentarSalarios(new BigDecimal(10));

        // 3.5 - Agrupar os funcionários por função em um map
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarioService.agruparPorFuncao();

        // 3.6 - Imprimir os funcionários agrupados por função
        System.out.println("Funcionários agrupados por função:");
        funcionariosPorFuncao.forEach((funcao, lista) -> {
            System.out.println(funcao + ":");
            lista.forEach(System.out::println);
            System.out.println();
        });
        System.out.println();

        // 3.8 - Imprimir os funcionários que fazem aniversário nos meses 10 e 12
        System.out.println("Funcionários que fazem aniversário nos meses 10 e 12:");
        funcionarioService.getFuncionariosAniversarioMes(10).forEach(System.out::println);
        funcionarioService.getFuncionariosAniversarioMes(12).forEach(System.out::println);
        System.out.println();

        // 3.9 - Encontrar o funcionário mais velho
        Funcionario maisVelho = funcionarioService.getFuncionarioMaisVelho();
        long idade = 0;
        if (maisVelho != null) {
            idade = funcionarioService.calcularIdade(maisVelho);
            System.out.println("Funcionário mais velho:");
            System.out.println("Nome: " + maisVelho.getNome() + ", Idade: " + idade + " anos");
            System.out.println();
        }

        // 3.10 - Ordenar e imprimir os funcionários por ordem alfabética
        System.out.println("Funcionários por ordem alfabética:");
        List<Funcionario> funcionariosOrdenados = funcionarioService.ordenarPorNome();
        funcionariosOrdenados.forEach(System.out::println);
        System.out.println();

        // 3.11 - Calcular e imprimir o total dos salários dos funcionários
        BigDecimal totalSalarios = funcionarioService.getTotalSalarios();
        System.out.println("Total dos salários dos funcionários: R$ " + FormatterUtil.formatarMoeda(totalSalarios));
        System.out.println();

        // 3.12 - Imprimir quantos salários mínimos ganha cada funcionário
        double salarioMinimo = 1212.00;
        System.out.println("Quantidade de salários mínimos ganhos por cada funcionário:");
        funcionarioService.getFuncionarios().forEach(funcionario ->
                System.out.println(funcionario.getNome() + ": " + funcionarioService.calcularSalariosMinimos(funcionario, salarioMinimo) + " salários mínimos"));
    }
}
