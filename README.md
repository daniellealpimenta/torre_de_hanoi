 <div>
    <img src="https://capsule-render.vercel.app/api?type=waving&height=100&section=header&reversal=false&fontSize=70&fontColor=FFFFFF&fontAlign=50&fontAlignY=50&stroke=-&descSize=20&descAlign=50&descAlignY=50&color=gradient"  style="width:100%; max-width:1600px;"/>
</div>

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

### 👩‍💻 Autores

- **Daniel Leal Pimenta**  
  - GitHub: [@daniellealpimenta](https://github.com/daniellealpimenta)  
  - LinkedIn: [Daniel Leal Pimenta](https://www.linkedin.com/in/daniel-leal-pimenta)

--- 
# 🌍 English Version

# 🏗️ Tower of Hanoi

**Tower of Hanoi** is a classic mathematical and logical problem, often used to teach **recursion** in programming. This project is a simple and interactive implementation in **Java**, displayed directly in the **terminal**.

---

## 🧠 What is the Tower of Hanoi?

The **Tower of Hanoi** consists of **three rods (or pegs)** and **several disks of different sizes** stacked on one of them, from largest at the bottom to smallest at the top.

🎯 **Goal:**  
Move the entire stack to another rod while following these rules:

1. Only **one disk** can be moved at a time.  
2. A disk **cannot be placed on top of a smaller disk**.  
3. All disks must end up stacked on the **third rod**.

---

## ⚙️ How the Code Works

The program uses **recursion** to solve the problem. The idea is to break the challenge into smaller steps:

1. Move `n-1` disks from the source rod to the auxiliary rod.  
2. Move the **largest disk** directly to the destination rod.  
3. Move the `n-1` disks from the auxiliary rod to the destination rod.

In Java, this is implemented with a **recursive function** that calls itself until there is only **one disk left to move**.

Simplified example:

```java
void moveDisks(int n, char source, char destination, char auxiliary) {
    if (n == 1) {
        System.out.println("Move disk 1 from " + source + " to " + destination);
        return;
    }

    moveDisks(n - 1, source, auxiliary, destination);
    System.out.println("Move disk " + n + " from " + source + " to " + destination);
    moveDisks(n - 1, auxiliary, destination, source);
}
```
### ▶️ Running the Program

## 1. Compile the Java code:

```bash
javac TorreDeHanoi.java
```

## 2. Run the program:

```bash
java TorreDeHanoi
```

## 3. Enter the number of disks (e.g., 3) and follow the step-by-step instructions in the terminal.

### 🧩 Technologies Used

* ☕ Java
* 🧠 Recursão
* 🖥️ Execução em terminal

### 👩‍💻 Authors

- **Daniel Leal Pimenta**  
  - GitHub: [@daniellealpimenta](https://github.com/daniellealpimenta)  
  - LinkedIn: [Daniel Leal Pimenta](https://www.linkedin.com/in/daniel-leal-pimenta)
