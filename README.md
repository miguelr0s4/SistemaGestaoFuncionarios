# Sistema de Gestão de Funcionários

## Descrição
O projeto consiste em um sistema de gestão de funcionários desenvolvido em Java, utilizando orientação a objetos e princípios de boas práticas de programação. O sistema permite realizar diversas operações com funcionários, tais como adicionar, remover, aumentar salários, agrupar por função, calcular estatísticas como idade do funcionário mais velho, entre outras funcionalidades.

## Funcionalidades Implementadas

- **Cadastro de Funcionários:**
  - Permite inserir funcionários com informações como nome, data de nascimento, salário e função.
  
- **Remoção de Funcionário:**
  - Possibilidade de remover um funcionário da lista pelo nome.
  
- **Aumento de Salário:**
  - Capacidade de aumentar o salário de todos os funcionários por um percentual especificado.
  
- **Agrupamento por Função:**
  - Agrupa os funcionários por função, exibindo os funcionários de cada função em uma lista.
  
- **Busca por Aniversariantes:**
  - Permite buscar e exibir os funcionários que fazem aniversário em determinado mês.
  
- **Identificação do Funcionário Mais Velho:**
  - Encontra e exibe o funcionário mais velho da lista, calculando sua idade com base na data de nascimento.
  
- **Ordenação Alfabética:**
  - Ordena e exibe os funcionários em ordem alfabética pelo nome.
  
- **Cálculo do Total de Salários:**
  - Calcula e exibe o total dos salários de todos os funcionários cadastrados.
  
- **Cálculo de Salários Mínimos:**
  - Calcula e exibe quantos salários mínimos cada funcionário recebe, com base em um valor de salário mínimo especificado.

## Tecnologias Utilizadas

- Java 8+
- Maven para gerenciamento de dependências
- Utilização de streams e lambdas do Java para operações funcionais
- Formatação de datas e valores monetários com `java.time.LocalDate` e `java.math.BigDecimal`

## Organização do Projeto

O projeto está estruturado em classes e pacotes para separação de responsabilidades, seguindo princípios de orientação a objetos e modularização.
