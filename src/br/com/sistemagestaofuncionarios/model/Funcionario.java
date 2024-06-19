package br.com.sistemagestaofuncionarios.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.sistemagestaofuncionarios.util.FormatterUtil;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }
    
    public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

    public String getFuncao() {
        return funcao;
    }

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
    public String toString() {
        return "Nome: " + getNome() +
               ", Data de Nascimento: " + FormatterUtil.formatarData(getDataNascimento()) +
               ", Salário: R$ " + FormatterUtil.formatarMoeda(salario) +
               ", Função: " + funcao;
    }
}
