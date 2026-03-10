# Validador de Múltiplos em Java

Este projeto é um programa simples em Java que solicita dois números ao usuário e verifica se o segundo número informado é múltiplo do primeiro.  
Além disso, o programa ignora números menores que o primeiro e continua pedindo novas entradas até que seja digitado um número válido ou não múltiplo.

## 📋 Funcionalidades
- Solicita um número inicial.
- Solicita um segundo número:
  - Ignora valores menores que o primeiro número.
  - Verifica se o segundo número é múltiplo do primeiro.
- Exibe mensagens informando se o número é válido ou não.

## 🖥️ Exemplo de uso
Validador de multiplos

Informe um número:
5

Informe outro número:
3

Número ignorado (Digite um numero maior que o primeiro!)

Informe outro número:
10

Número válido! o 10 é multiplo de 5.

Informe outro número:
12

O número 12 não é multiplo de 5.

## 📂 Estrutura do código
- Scanner é utilizado para capturar entradas do usuário.
- System.out.println exibe mensagens no console.
- System.out.printf formata a saída final.
- O laço while (true) mantém o programa em execução até que seja digitado um número não múltiplo.
- O operador % (módulo) é usado para verificar se o segundo número é múltiplo do primeiro.

## 🔧 Requisitos
- Java 11 ou superior.

Feito para fins de aprendizado e prática de estruturas de repetição e operadores em Java.


