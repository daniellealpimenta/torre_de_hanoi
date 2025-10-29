# 🏗️ Torre de Hanói

**Torre de Hanói** é um clássico problema matemático e lógico, frequentemente utilizado para ensinar **recursão** em programação.  
Este projeto é uma implementação simples e interativa feita em **Java**, exibida diretamente no **terminal**.

---

## 🧠 O que é a Torre de Hanói?

A **Torre de Hanói** consiste em **três hastes (ou pinos)** e **vários discos de tamanhos diferentes** empilhados em uma delas, do maior na base ao menor no topo.

🎯 **Objetivo:**  
Mover toda a pilha para outro pino, obedecendo às seguintes regras:

1. Apenas **um disco** pode ser movido por vez.  
2. Um disco **nunca pode ser colocado sobre um menor**.  
3. Todos os discos devem terminar empilhados na **terceira haste**.

---

## ⚙️ Como o código funciona

O programa utiliza **recursão** para resolver o problema.  
A ideia é dividir o desafio em partes menores:

1. Mover `n-1` discos da haste de origem para a haste auxiliar.  
2. Mover o **maior disco** diretamente para a haste de destino.  
3. Mover novamente os `n-1` discos da haste auxiliar para a haste de destino.

Em Java, isso é implementado com uma **função recursiva** que chama a si mesma até que reste apenas **um disco a ser movido**.

Exemplo simplificado:

```java
void moverDiscos(int n, char origem, char destino, char auxiliar) {
    if (n == 1) {
        System.out.println("Mover disco 1 de " + origem + " para " + destino);
        return;
    }

    moverDiscos(n - 1, origem, auxiliar, destino);
    System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
    moverDiscos(n - 1, auxiliar, destino, origem);
}
```

### ▶️ Execução

## 1. Compile o código Java:

```bash
javac TorreDeHanoi.java
```

## 2. Execute o programa:

```bash
java TorreDeHanoi
```

## 3. Informe a quantidade de discos (ex: 3) e acompanhe o passo a passo no terminal.

### 🧩 Tecnologias Utilizadas

* ☕ Java
* 🧠 Recursão
* 🖥️ Execução em terminal

### ✍️ Autores

