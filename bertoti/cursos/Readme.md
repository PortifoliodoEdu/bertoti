  
  
**LISTA DE ATIVIDADES **

De 1 a 4 contidas nesse mesmo arquivo, em texto:
    1. comentários do livro SWE at Google
    2. três exemplos de tradeoffs
    3. análise dos requisitos não funcionais e tradeoffs das arquiteturas dos slides 24 à 29
    
    --- daqui pra frente tudo aplicado em um sistema que você mesmo escolhe-----
    4. definição da arquitetura

Em arquivos no repositório
    5. classes uml: Na pasta raiz do repositorio: bertorti (Nome do arquivo: Atividade 5 - classes uml )
    6. código java: No endereço: main\java\org\example
    7. testes: No endereço: test\java





**ATIVIDADE 1️⃣ comentários do livro SWE at Google**

Texto de estudo:
     Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming. 

# Baseado no texto acima, responda 'O que é Engenharia de software?'

#O que consegui compreender do texto é que a engenharia de software é sim baseada em programação mas não se limita a isso, é uma metodologia, ou melhor, um conjunto de formas de pensar que aplicadas à programação garantem que grandes organizações possam tomar decisões assertivas e de longo prazo, 

RESPOSTA DO PROFESSOR: ENG.SOFTWARE = PROGRAMAÇÃO + TRADE OFFICE + ESCALA + TEMPO
-> TEMPO: Mudanças do cliente referente a requisitos, porém o mais importante em relação a tempo é que o código em si pode piorar ao longo do tempo, você percebe as falhas, as vezes é bem mais fácil começar do zero, principalmente se você fez péssimas decisões anteriormente.
-> ESCALA: Escalar é expandir, escalar um sistema é difícil,
-> TRADE-OFF: TUDO é um jogo de perde-ganha, é a coisa mais chata em engenharia de software é cara que gosta de defender tecnologia, como quem acha que uma linguagem é superior a todas,
tradeoff é entender quais são as fraquezas de cada tecnologia e seu custo-benefício


**ATIVIDADE 2️⃣ - três exemplos de tradeoffs**

Alguns exemplos de trade-offs:



Linguagem de Programação: Python vs Java:

    Benefício do Python: Sintaxe simples e legível, fácil de aprender e usar.
    Ônus do Python: Menor desempenho em comparação com Java devido à natureza interpretada.
    Benefício do Java: Alta performance devido à natureza compilada e máquina virtual Java (JVM).
    Ônus do Java: Sintaxe mais verbosa e complexa, curva de aprendizado inicial mais íngreme comparada ao Python.


Framework Web: Flask vs Django:
    Benefício do Flask: Leve e minimalista, ideal para pequenas aplicações e APIs.
    Ônus do Flask: Menos funcionalidades integradas comparado ao Django.
    Benefício do Django: Framework completo com ORM (Object-Relational Mapping), administração de painel e autenticação integrada.
    Ônus do Django: Mais complexidade e maior curva de aprendizado comparado ao Flask.


Banco de Dados Relacional vs. Banco de Dados NoSQL:

    Benefício do Banco de Dados Relacional: Estruturação rigorosa dos dados, consistência e suporte a transações ACID.
    Ônus do Banco de Dados Relacional: Menor escalabilidade horizontal em comparação com bancos de dados NoSQL, como MongoDB.
    Benefício do Banco de Dados NoSQL: Alta escalabilidade e flexibilidade para grandes volumes de dados não estruturados.
    Ônus do Banco de Dados NoSQL: Menor suporte a transações complexas e, em alguns casos, consistência eventual em vez de consistência imediata.
          


**ATIVIDADE 3️⃣- análise dos requisitos não funcionais e tradeoffs das arquiteturas dos slides 24 à 29**

Atividade 3:
Vamos associar cada arquitetura a um sistema específico para ilustrar melhor os requisitos não funcionais escolhidos. 

1. **Layered Architecture Style:**
   - *Bom Requisito Não Funcional:* Simplicidade
     - *Explicação:* Uma camada de arquitetura é adicionada por vez, facilitando a compreensão e manutenção do sistema. Isso é adequado para sistemas temporários ou paliativos que serão substituídos.
   - *Mau Requisito Não Funcional:* Desempenho
     - *Explicação:* A abordagem em camadas pode adicionar complexidade e impactar o desempenho, especialmente se muitas camadas forem empilhadas.

2. **Pipeline Architecture Style:**
   - *Bom Requisito Não Funcional:* Evolucionário
     - *Explicação:* A arquitetura de pipeline permite modificações e melhorias graduais no sistema ao longo do tempo para atender a novas necessidades.
   - *Mau Requisito Não Funcional:* Escalabilidade
     - *Explicação:* Embora seja confiável, a arquitetura de pipeline pode não ser facilmente escalável para acomodar um grande número de usuários.

3. **Microkernel Architecture Style:**
   - *Bom Requisito Não Funcional:* Implementabilidade
     - *Explicação:* Esta arquitetura é fácil de implementar, adequada para projetos com tempo e recursos limitados.
   - *Mau Requisito Não Funcional:* Escalabilidade
     - *Explicação:* Apresenta péssima escalabilidade, não sendo ideal para sistemas que planejam crescer significativamente no futuro.

4. **Service-Based Architecture Style:**
   - *Bom Requisito Não Funcional:* Evolucionário
     - *Explicação:* Altamente adaptável a mudanças, permitindo a adição de novos serviços e funcionalidades sem impactar o sistema existente.
   - *Mau Requisito Não Funcional:* Simplicidade
     - *Explicação:* Devido à sua natureza distribuída, pode ser mais complexo gerenciar e entender o sistema como um todo.

5. **Event-Driven Architecture Style:**
   - *Bom Requisito Não Funcional:* Elasticidade
     - *Explicação:* A capacidade de lidar com eventos de forma dinâmica permite que o sistema se adapte facilmente a diferentes volumes de carga.
   - *Mau Requisito Não Funcional:* Custo Total
     - *Explicação:* A simplicidade é sacrificada em troca de alta tolerância a erros e desempenho, o que pode resultar em custos mais elevados.

6. **Microservices Architecture:**
   - *Bom Requisito Não Funcional:* Escalabilidade
     - *Explicação:* Projetado para ser altamente escalável, permitindo que diferentes partes do sistema cresçam independentemente.
   - *Mau Requisito Não Funcional:* Custo Total
     - *Explicação:* A abordagem de microservices geralmente envolve custos mais elevados devido à gestão e coordenação de serviços distribuídos.






**ATIVIDADE 4️⃣** 

**Arquitetura em Camadas (Layered Architecture)**

A arquitetura em camadas em engenharia de software divide um sistema em camadas distintas, onde cada camada tem uma responsabilidade específica e comunica-se apenas com camadas adjacentes. Isso promove a modularidade, a reutilização e facilita a manutenção do código.

No seu caso, os códigos não seguem exatamente o padrão de arquitetura em camadas típica, como apresentado em sistemas complexos. No entanto, podemos considerar uma adaptação simplificada dessa arquitetura:

    Camada de Modelo (Model Layer): Representada pelas classes CadastrarAluno, Curso, e Instrutor, que encapsulam dados e comportamentos específicos relacionados a alunos, cursos e instrutores.

    Camada de Lógica de Negócio (Business Logic Layer): Representada pela classe GerenciamentoCursos, que contém lógica para gerenciar cursos, matrículas e cancelamentos.

    Embora essas classes não estejam completamente separadas em camadas distintas como em um sistema complexo, podemos argumentar que há uma separação parcial de responsabilidades:

    Camada de Modelo: CadastrarAluno, Curso, e Instrutor são responsáveis por encapsular os dados e operações básicas relacionadas aos alunos, cursos e instrutores.

    Camada de Lógica de Negócio: GerenciamentoCursos é responsável por gerenciar os cursos, incluindo adicionar cursos, matricular alunos, cancelar matrículas e listar cursos disponíveis.

Por que essa foi a arquitetura escolhida?
    Separação de Responsabilidades: As classes estão organizadas de forma a separar os dados (modelos) das operações de lógica de negócio (gerenciamento de cursos).

Reutilização de Código: Cada classe representa um tipo de entidade (aluno, curso, instrutor) com suas próprias propriedades e métodos, facilitando a reutilização e manutenção do código.

Simplicidade e Clareza: Para um sistema simples como o desenvolvido, essa organização pode ser suficiente para manter o código organizado e fácil de entender.

Considerações finais:
Embora essa estrutura não seja uma implementação completa de arquitetura em camadas, ela mostra uma intenção de separação de responsabilidades entre modelos de dados e lógica de negócio, o que é um princípio fundamental da arquitetura em camadas.






