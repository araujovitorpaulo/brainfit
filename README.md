# BrainFit

BrainFit é uma aplicação que tem como foco principal conectar pessoas, academias e profissionais de área com diferentes objetivos. A ideia é desenvolver uma rede integrada de serviços e facilitar o acesso à prática de atividades físicas supervisionada por especialistas qualificados.

## 

* [Instalação](#instalação)
  * [Tecnologias necessárias](#tecnologias-necessárias)
  * [Execução](#execução)
* [Endpoints](#endpoints)
* [Segurança](#segurança)
* [Contribuições](#contribuições)
* [Licenciamento](#licenciamento)

## Instalação

#### Tecnologias necessárias
  * [BellSoft Liberica JDK v.17](https://bell-sw.com/libericajdk/)
  * [Apache Maven 3.3.1](https://maven.apache.org/docs/3.3.1/release-notes.html)
  * IDE da sua escolha. Durante a construção do projeto, a [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/) foi utilizada

### Execução

  1. Clone o repositório
```bash
git clone https://github.com/araujovitorpaulo/brainfit.git
```

  2. Navegue até o diretório do projeto através do terminal
```bash
cd brainfit
```

  3. Execute o projeto

> com o Maven Goal:
```bash
  mvn spring-boot:run
```

> com o IntelliJ IDEA:
```bash
  Compile o projeto (Ctrl+F9) e execute-o (Shift+F10)
```

Se não houverem erros, a API estará disponível em ```http://localhost:8080```.

## Endpoints

 * CRUD `/instrutores`
 * CRUD `/academias`
 * CRUD `/alunos`

## Segurança

Sinta-se livre para relatar qualquer brecha ou indicar melhorias na segurança do projeto, afinal, a ideia é trabalhar com um ciclo de melhoria contínua.

## Contribuições

Contribuições são mais que bem vindas! Para contribuir:

* Faça um **fork** do projeto
* Crie uma nova branch (git checkout -b feature/nova-funcionalidade)
* Faça commit das suas alterações seguindo o padrão proposto no [versem.md](semver.md) (git commit -am 'Adicionei uma nova funcionalidade')
* Envie para o branch (git push origin feature/nova-funcionalidade)
* Abra um Pull Request


## Licenciamento

O projeto está disponível sob a licença [MIT](https://opensource.org/licenses/MIT).
