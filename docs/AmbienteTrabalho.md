# Preparar o ambiente de trabalho

## 1. Objetivo

Neste projeto, não deves alterar diretamente os ficheiros existentes no repositório disponibilizado pelo formador.

O repositório deverá ser utilizado apenas para:

```text
Descarregar a versão inicial do projeto
Receber atualizações disponibilizadas pelo formador
Consultar ficheiros de referência
```

Para desenvolver o exercício, deverás criar uma segunda pasta local sem ligação ao Git.

No final, terás três pastas:

```text

cli-user-interface
└── cópia ligada ao Git

escola-projeto-treino
└── cópia ligada ao Git
└── não deve ser alterada

escola-trabalho
└── cópia local sem ligação ao Git
└── utilizada para realizar o exercício


```

---

## 2. Pré-requisitos

Antes de começar, confirma que tens o Git instalado.

Executa no terminal:

```bash
git --version
```

Deverá ser apresentada uma versão semelhante a:

```text
git version 2.43.0
```

Também deverás possuir acesso por SSH ao servidor Git da ATEC.

---

## 3. Criar uma pasta para guardar os projetos

Escolhe uma pasta onde pretendes guardar os exercícios. De preferência uma pasta vazia.

### macOS ou Linux

```bash
mkdir -p ~/atec-java
cd ~/atec-java
```

### Windows PowerShell

```powershell
New-Item -ItemType Directory -Force $HOME\atec-java
Set-Location $HOME\atec-java
```

---

## 4. Fazer clone do repositório

Executa:

```bash
(clone da cli-user-interface) git clone git@git.atec.kissweb.pt:....
(clone do projeto Escola) git clone git@git.atec.kissweb.pt:....
```

Este comando cria a pasta:

```text
cli-user-interface
escola-projeto-treino
```

As pastas ficam ligadas ao repositório Git disponibilizado pelo formador.

---

## 5. Confirmar que o clone foi realizado corretamente

Entra na pasta:

### macOS, Linux ou Windows PowerShell

```bash
cd escola-projeto-treino
```

Executa:

```bash
git status
```

Deverás obter uma mensagem semelhante a:

```text
On branch main
Your branch is up to date with 'origin/main'.

nothing to commit, working tree clean
```

Volta à pasta anterior:

```bash
cd ..
```

---

## 6. Criar a pasta de trabalho

Agora deverás criar uma cópia do projeto para realizar os exercícios.

Esta nova pasta não deverá manter qualquer ligação ao Git.

---

### 6.1. macOS ou Linux

Executa:

```bash
cp -R escola-projeto-treino escola-trabalho
rm -rf escola-trabalho/.git
```

---

### 6.2. Windows PowerShell (Também pode ser feito de forma visual)

Executa:

```powershell
Copy-Item escola-projeto-treino escola-trabalho -Recurse
Remove-Item escola-trabalho\.git -Recurse -Force
```

---

## 7. Confirmar a estrutura final

No final, deverás possuir:

```text
atec-java
├── cli-user-interface
│   ├── .git
│   ├── .idea
│   └── ...
|
├── escola-projeto-treino
│   ├── .git
│   ├── .idea
│   └── ...
│
└── escola-trabalho
    ├── .idea
    └── ...
```

As pastas:

```text
cli-user-interface
escola-projeto-treino
```

continuam ligadas ao Git, pelo que podes receeber o trabalho realizado pelo formador.

A pasta:

```text
escola-trabalho
```

já não possui a pasta:

```text
.git
```

Por esse motivo, não está ligada ao repositório remoto e aí podes trabalhar. Obviamente que no projeto de avaliação
terás o teu repositório Git para guardar as tuas alterações

---

## 8. Abrir o projeto no IntelliJ IDEA

No IntelliJ IDEA, seleciona:

```text
File
└── Open
```

Abre apenas a pasta:

```text
escola-trabalho
```

Não desenvolvas diretamente dentro de:

```text
escola-projeto-treino
```

> **Atenção:** A pasta `escola-projeto-treino` deverá ser utilizada apenas para receber atualizações.

---

## 9. Verificar que estás na pasta correta

Antes de começar a trabalhar, confirma o nome da pasta aberta no IntelliJ IDEA.

Deverá ser:

```text
escola-trabalho
```

Evita alterar ficheiros dentro de:

```text
escola-projeto-treino
```

> Vais reparar que também terás acesso a ver o código da cli-user-interface. Isso deve-se ao Maven. Podes descobrir um pouco mais se leres a documentação
> 
> [Maven.md](Maven.md)

---

# Receber atualizações do formador

## 10. Atualizar a pasta base

Quando forem disponibilizadas atualizações, abre um terminal e executa:

```bash
cd ~/atec-java/escola-projeto-treino
git pull (ou pelos comandos do IDE)
```

No Windows PowerShell, poderás utilizar:

```powershell
Set-Location $HOME\atec-java\escola-projeto-treino
git pull
```

Este comando atualiza apenas a pasta:

```text
escola-projeto-treino
```

---

## 11. Copiar ficheiros atualizados para a pasta de trabalho

Depois de executar:

```bash
git pull
```

deverás copiar manualmente os ficheiros novos ou alterados para:

```text
escola-trabalho
```

Esta abordagem evita apagar acidentalmente o trabalho que já realizaste.

---

## 12. Não substituir ficheiros sem confirmar

Antes de copiar um ficheiro atualizado, confirma se já alteraste esse ficheiro dentro da pasta:

```text
escola-trabalho
```

Caso já existam alterações, compara as duas versões antes de substituir o ficheiro.

---

# Criar uma cópia de segurança

## 13. Efetuar backup antes de atualizações importantes

Antes de copiar vários ficheiros atualizados, cria uma cópia de segurança.

### macOS ou Linux

```bash
cd ~/atec-java
cp -R escola-trabalho escola-trabalho-backup
```

### Windows PowerShell

```powershell
Set-Location $HOME\atec-java
Copy-Item escola-trabalho escola-trabalho-backup -Recurse
```

---

# Reiniciar o exercício

## 14. Criar novamente a pasta de trabalho

Caso pretendas reiniciar o exercício a partir da versão mais recente, elimina a pasta de trabalho e cria uma nova cópia.

> **Atenção:** este processo apaga o trabalho realizado anteriormente. Cria primeiro uma cópia de segurança.

### macOS ou Linux

```bash
cd ~/atec-java

cp -R escola-trabalho escola-trabalho-backup

rm -rf escola-trabalho
cp -R escola-projeto-treino escola-trabalho
rm -rf escola-trabalho/.git
```

### Windows PowerShell

```powershell
Set-Location $HOME\atec-java

Copy-Item escola-trabalho escola-trabalho-backup -Recurse

Remove-Item escola-trabalho -Recurse -Force
Copy-Item escola-projeto-treino escola-trabalho -Recurse
Remove-Item escola-trabalho\.git -Recurse -Force
```

---

# Problemas frequentes

## 15. Erro de permissões SSH

Ao executar o clone, poderá surgir uma mensagem semelhante a:

```text
Permission denied (publickey)
```

Isto significa que a chave SSH ainda não está configurada corretamente.

Confirma primeiro se consegues estabelecer ligação ao servidor:

```bash
ssh -T git@git.atec.kissweb.pt
```

Caso o acesso continue a falhar, confirma se a tua chave pública SSH foi adicionada à tua conta no servidor Git.

---

## 16. Alterei ficheiros dentro de `escola-projeto-treino`

Caso tenhas alterado ficheiros acidentalmente dentro da pasta base, entra nessa pasta:

```bash
cd ~/atec-java/escola-projeto-treino
```

Confirma os ficheiros alterados:

```bash
git status
```

Caso não pretendas guardar as alterações locais, executa:

```bash
git restore .
```

Depois atualiza novamente:

```bash
git pull
```

> **Atenção:** `git restore .` elimina as alterações locais realizadas dentro da pasta base.

---

## 17. Não consigo executar `git pull`

Confirma que estás dentro da pasta correta:

```bash
cd ~/atec-java/escola-projeto-treino
```

Depois executa:

```bash
git status
```

A pasta:

```text
escola-trabalho
```

não está ligada ao Git. Por isso, não deverá ser utilizada para executar:

```bash
git pull
```

---

# Resumo rápido

## Primeira configuração

### macOS ou Linux

```bash
mkdir -p ~/atec-java
cd ~/atec-java

git clone git@git.atec.kissweb.pt:tpsi-cas-0226/escola-projeto-treino.git escola-projeto-treino

cp -R escola-projeto-treino escola-trabalho
rm -rf escola-trabalho/.git
```

### Windows PowerShell

```powershell
New-Item -ItemType Directory -Force $HOME\atec-java
Set-Location $HOME\atec-java

git clone git@git.atec.kissweb.pt:tpsi-cas-0226/escola-projeto-treino.git escola-projeto-treino

Copy-Item escola-projeto-treino escola-trabalho -Recurse
Remove-Item escola-trabalho\.git -Recurse -Force
```

---

## Atualizações posteriores

### macOS ou Linux

```bash
cd ~/atec-java/escola-projeto-treino
git pull
```

### Windows PowerShell

```powershell
Set-Location $HOME\atec-java\escola-projeto-treino
git pull
```

---

# Regra principal

> **Importante**
>
> Desenvolve apenas dentro da pasta:
>
> ```text
> escola-trabalho
> ```
>
> Utiliza a pasta:
>
> ```text
> escola-projeto-treino
> ```
>
> apenas para receber atualizações através de:
>
> ```bash
> git pull
> ```
