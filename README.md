# Bitwise Practice (Java)

Projeto de prática para aprender e revisar operações bit a bit em Java.

## 📚 Conteúdo do projeto

O projeto contém exercícios progressivos sobre binário e operadores bitwise:

- `BitExercise01` — conversão de números decimais para binário (`Integer.toBinaryString`).
- `BitExercise02` — operadores básicos: `&`, `|` e `^`.
- `BitExercise03` — verificação de número par/ímpar usando `n & 1`.
- `BitExercise04` — sistema simples de permissões com flags (`READ`, `WRITE`, `DELETE`).
- `BitExercise05` — deslocamento de bits com `<<` e `>>`.
- `UserPermissionSystem` — mini sistema interativo de permissões com menu no terminal.

## 🗂️ Estrutura

```text
src/
└── bit/
    └── practice/
        ├── BitExercise01.java
        ├── BitExercise02.java
        ├── BitExercise03.java
        ├── BitExercise04.java
        ├── BitExercise05.java
        └── UserPermissionSystem.java
```

## ✅ Pré-requisitos

- Java JDK 17+ (ou compatível com sua máquina)
- Terminal (Linux/macOS/Windows)

## ▶️ Como compilar

Na raiz do projeto:

```bash
mkdir -p out
javac -d out src/bit/practice/*.java
```

## ▶️ Como executar

Depois de compilar, execute qualquer classe principal:

```bash
java -cp out bit.practice.BitExercise01
java -cp out bit.practice.BitExercise02
java -cp out bit.practice.BitExercise03
java -cp out bit.practice.BitExercise04
java -cp out bit.practice.BitExercise05
java -cp out bit.practice.UserPermissionSystem
```

## 💡 Objetivo de aprendizado

Este repositório é focado em:

- entender representação binária;
- praticar operações bitwise em cenários reais;
- usar flags para modelar permissões de forma eficiente;
- reforçar lógica de programação com manipulação de bits.
