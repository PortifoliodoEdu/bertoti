```markdown
# engenhariadesoftwarefatec
atividade da aula 19/02/23 - Prof Juliano - 1º Aula do semestre - 2º semestre

# Texto da url: https://dontpad.com/engenhariadesoftwarefatec

# "Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t prograng.  "
#"Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t prograng.  "

#"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth."

#📖📚 https://abseil.io/resources/swe-book

#(Tradução)

#'Na Google, dizemos por vezes que "a engenharia de software é a programação integrada ao longo do tempo". 
A programação é certamente uma parte importante da engenharia de software: afinal de contas, a programação é a forma de criar novo software. Se aceitarmos esta distinção, também se torna claro que podemos precisar de delinear entre tarefas de programação (desenvolvimento) e tarefas de engenharia de software (desenvolvimento, modificação, manutenção). A adição do tempo acrescenta uma nova dimensão importante à programação. Os cubos não são quadrados, a distância não é a velocidade. A engenharia de software não é um programa. Vemos três diferenças críticas entre a programação e a engenharia de software: tempo, escala e os compromissos em jogo. Num projeto de engenharia de software, os engenheiros precisam de estar mais preocupados com a passagem do tempo e a eventual necessidade de mudança. Numa organização de engenharia de software, precisamos de estar mais preocupados com a escala e a eficiência, tanto para o software que produzimos como para a organização que o está a produzir. Finalmente, como engenheiros de software, somos solicitados a tomar decisões mais complexas com resultados mais arriscados, muitas vezes baseados em estimativas imprecisas de tempo e crescimento.

#Traduzido com a versão gratuita do tradutor - DeepL.com'

#(Os dois parágrafos são do livro chamado ' Sofware Enginering at Google' )

--------------------------------------------------------------------
--------------------------------------------------------------------

#📝 ATIVIDADE: 1 - Baseado no texto acima, responda 'O que é Engenharia de software?'

#O que consegui compreender do texto é que a engenharia de software é sim baseada em programação mas não se limita a isso, é uma metodologia, ou melhor, um conjunto de formas de pensar que aplicadas à programação garantem que grandes organizações possam tomar decisões assertivas e de longo prazo, 

RESPOSTA DO PROFESSOR: ENG.SOFTWARE = PROGRAMAÇÃO + TRADE OFFICE + ESCALA + TEMPO
-> TEMPO: Mudanças do cliente referente a requisitos, porém o mais importante em relação a tempo é que o código em si pode piorar ao longo do tempo, você percebe as falhas, as vezes é bem mais fácil começar do zero, principalmente se você fez péssimas decisões anteriormente.
-> ESCALA: Escalar é expandir, escalar um sistema é difícil,
-> TRADE-OFF: TUDO é um jogo de perde-ganha, é a coisa mais chata em engenharia de software é cara que gosta de defender tecnologia, como quem acha que uma linguagem é superior a todas,
tradeoff é entender quais são as fraquezas de cada tecnologia e seu custo-benefício

NINGUÉM em uma empresa GRANDE de tecnologia usa mais de UMA linguagem, exemplo de uma pessoa que trabalha no IFOOD, tem vaga que o ÚNICO REQUISITO é saber uma única linguagem, porque em empresas grandes, diferentes de empresas pequenas, você vai trabalhar em um setor específico usando uma única tecnologia.

APRENDA O DIFÍCIL, isso que te gera vaga.
FRONTEND está com escassez de vagas.
Há muita vaga em Java.
Faculdade pode ser relevante para conseguir vagas mais disputadas ou de outro nível.

--- https://duckdb.org/ (Antes tinha um pedaço no site escrito 'Onde não usar', é um exemplo que em toda tecnologia tem locais que você tem de ter em mente onde não usar, nenhuma ferramenta é aplicada em todas as situações)

Ruby é uma linguagem de programação muito lenta.

----------------

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
