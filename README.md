# Desafio de Operadores Lógicos em Java

## Descrição do Projeto

Este projeto em Java implementa um programa que simula um cenário de tomada de decisão utilizando **operadores lógicos**. O desafio modela uma situação do cotidiano onde dois trabalhos podem ou não ser confirmados durante a semana, e com base nisso, diferentes decisões são tomadas pela família.

O objetivo é demonstrar o uso de variáveis booleanas e operadores lógicos (`&&`, `||`, `^`, `!`) em Java para resolver um problema prático de lógica condicional.

## Descrição do Problema

Imagine que você tem dois trabalhos previstos para a próxima semana:

*   **Trabalho na terça-feira** (`trabTerca`): pode ser confirmado ou não (`true` ou `false`).
*   **Trabalho na quinta-feira** (`trabQuinta`): pode ser confirmado ou não (`true` ou `false`).

Com base na confirmação desses trabalhos, as seguintes situações ocorrem:

*   **Se os dois trabalhos derem certo** → Compra uma televisão de **50 polegadas**.
*   **Se apenas um dos dois trabalhos der certo** → Compra uma televisão de **32 polegadas**.
*   **Se ao menos um trabalho der certo** (qualquer um dos dois casos acima) → A família vai ao shopping tomar **sorvete** para comemorar.
*   **Se nenhum trabalho der certo** → A família fica em casa, e por não tomar sorvete, fica **mais saudável**.

## Funcionalidades

*   **TV 50 polegadas** (`tv50`): Modelada com o operador lógico `&&` (E) — `trabTerca && trabQuinta`. Ambos os trabalhos devem ser `true`.
*   **TV 32 polegadas** (`tv32`): Modelada com o operador lógico `^` (OU exclusivo) — `trabTerca ^ trabQuinta`. Apenas um dos trabalhos deve ser `true`.
*   **Tomar sorvete** (`sorvete`): Modelado com o operador lógico `||` (OU) — `tv50 || tv32`. Ao menos uma TV foi comprada.
*   **Ficou mais saudável** (`maisSaudavel`): Modelado com o operador lógico `!` (negação) — `!sorvete`. Negação do resultado de tomar sorvete.

## Tecnologias Utilizadas

*   **Java**: Linguagem de programação principal.

## Estrutura do Código

O código é estruturado em uma classe `DesafioLogicos` dentro do pacote `desafios`. O método `main` contém:

*   Duas variáveis booleanas (`trabTerca` e `trabQuinta`) que representam a confirmação de cada trabalho.
*   Variáveis booleanas derivadas para cada cenário: `tv50`, `tv32`, `sorvete` e `maisSaudavel`.
*   Impressão no console do resultado de cada variável utilizando `System.out.printf`.

## Exemplo de Saída

Com `trabTerca = true` e `trabQuinta = true`, a saída no console será:

```
O trabalho de terça deu certo? true
O trabalho de quinta deu certo? true

Você comprou a TV de 50"'? true. Vamos tomar sorvete? true
Você comprou a TV de 32"'? false. Vamos tomar sorvete? true
Se não tomou sorvete, ficou mais saudável. false
```

## Como Executar Localmente

Para executar este projeto, siga os passos abaixo:

1.  Certifique-se de ter o **Java Development Kit (JDK)** instalado em sua máquina.
2.  Clone o repositório para a sua máquina local:
    ```bash
    git clone https://github.com/vinioliveira-a/DesafioLogicos.git
    ```
3.  Acesse a pasta do projeto:
    ```bash
    cd DesafiosLogicos
    ```
4.  Execute o programa.
5.  O resultado de cada cenário será exibido no console.

> 💡 **Dica**: Para simular diferentes situações, altere diretamente no código os valores de `trabTerca` e `trabQuinta` entre `true` e `false` e execute novamente para ver como os resultados mudam.