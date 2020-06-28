# Avaliação 3 - PPCD
# Aluno: João Victor Bravo

## 1. Na disciplina vimos que o processo de marshalling tem um papel muito importante no projeto e implementação de sistemas distribuídos. 
##    Compare as estratégias de marhalling binário com textual, focando nas vantagens e desvantagens de se usar ProtoBuf ou JSON.

Resposta:

Usando o que foi pedido na questão, é importante destacar que o ProtoBuf é uma tecnologia no formato binário desenvolvida pela Google para superar a performance do JSON mesmo com ele sendo usado nos ambientes de JavaScript. Dito isso, vi que usar o Protobuf traz as seguintes vantagens: Possui mais "Data types" do que o JSON, como enumerates e métodos, é também bastante usado em RPCs(Remote Procedure Calls). Em contrapartida, faltam recursos no ProtoBuf, como por exemplo, uma documentação não tão detalhada e nem muitos posts de pessoas usando ou desenvolvendo com ProtoBuf, algo que acaba sendo uma vantagem para o JSON nesse aspecto. Muito por causa da desvantagem citada acima, vem a segunda desvantagem de se usar ProtoBuf, que é a de ter uma comunidade pequena, pois tendo poucas pessoas usando e perguntando sobre, acaba fazendo com que a comunidade não cresça, sendo outra vantagem para o JSON e o marshalling textual. E a principal desvatagem, na minha opinião, o fato de ser um formato para máquinas, não sendo algo legível para um humano, pois se trata de um formato binário. Sendo mais uma vantagem do JSON, com o formato textual.

## 2. Podemos considerar que dentre as várias formas de comunicação de sistemas distribuídos, duas se destacam: a comunicação síncrona baseada em RPC 
##    (chamada de procedimento remoto) e a assíncrona baseada em troca de mensagens. Compare as duas e destaque as principais vantagens e desvantagens.

Resposta: 

As vantagens de se usar a comunicação síncrona em RPC são: As comunicações dos processos de computadores remotos é feito de forma consideravelmente fácil, por exemplo, não é necessário levar em consideração os detalhes complexos da rede que está sendo usada. Sistemas distribuídos podem trabalhar de maneira mais eficiente por causa da distribuição de tarefas, usando plataformas especializadas para tarefas especiais, como por exemplo servidores de banco de dados. Ainda possuem outras vantagens como, escalabilidade das arquiteturas de cliente-servidor que forem realizadas. Mas também possuem desvatangens como, o fato do sistema RPC não ser adequado para uma transferência grande de dados, se por acaso dividir o processo em diferentes instâncias, a porcentagem de erro aumenta e por isso, mensagens podem acabar sendo perdidas em comunicações, podem ocorrer delays e interrupções podem acabar aumentando. No caso de algum problema no servidor, isso afetará o cliente também, visto que a conexão é síncrona, por exemplo, no caso de o processo de chamada esperar em vão pelo valor de retorno.
Já na comunicação assíncrona baseada em troca de mensagens, as vantagens são: Uma maior flexibilidade, e oferece uma maior disponibilidade, pois o sistema não tem a necessidade de responder imediatamente a qualquer informação que chegar, outro vantagem bastante importante é o fato de que um sistema estando desativado ou "crashado" não impacta o outro lado do sistema. O fator de não ter a necessidade de responder imediatamente pode ser algo vantajoso, mas também pode ser apontado como desvantagem, por não ter uma interação imediata, como por exemplo, caso eu esteja em um chat conversando com alguém, seria péssimo se a pessoa respondesse depois de muito tempo ou até mesmo em uma ligação. Em comparação com a comunicação síncrona RPC, a comunicação assíncrona baseada em troca de mensagens, oferece mais paralelismo, pois um processo não bloqueia outro. Não consegui definir qual o melhor tipo de comunicação, porque depende para que você irá usar cada comunicação, pois as duas funcionam bem para determinado objetivo.

## 3. Com o advento do cgroups no kernel do Linux, vimos o surgimento da computação baseada em contêineres. 
##    Explique as principais vantagens e desvantagens da utilização de contêineres e de máquinas virtuais.

Resposta:

Primeiramente irei abordar as máquinas virtuais, que é basicamente ter um disco rígido que foi criado dentro de ambiente que é físiso por meio de um software, essa é uma das maiores vantagens das máquinas virtuais, o fato de poder usar aplicações e/ou programas sem precisar depender do sistema operacional que está presente no disco físico. Baseado nisso, outra vantagem de usar uma máquina virtual é a economia de gastos, visto que não irá precisar de novos hardwares, espaço físico e manutenção por exemplo. Poder usar outras plataformas está entre as vantagens de se usar uma máquina virtual, pois a mesma não está restrita para usar ou receber apenas uma máquina virtual, podendo fazer uso de mais de uma, podendo assim adicionar vários tipos de aplicações e podendo ter mais segurança, visto que caso o usuário tente fazer uso de algum software suspeito, apenas a máquina virtual irá ser afetada. Na parte das desvantagens de se usar máquina virtual, sobrecargas podem ocorrer, visto que o usuário poderá fazer uso de várias máquinas virtuais ao mesmo tempo, por exemplo, fazendo com que ocorra uma sobrecarga por conta da quantidade de tarefas que o computador irá ter que realizar, fazendo com que todas as máquinas virtuais parem de funcionar. Citado como uma das vantagens, a segurança também se encontra nas desvantagens, visto que numa possível vulnerabilidade em uma máquina virtual, todas as máquinas virtuais estarão vulneráveis, podendo dessa forma, uma máquina virtual que está com vírus, poder afetar outra.
No caso dos contêineres, suas vantagens são: poder criar serviços independentes, esses serviços podem ser movidos sem perda de dados entre máquinas ou ambientes diferentes, tende a ter uma velocidade maior, em questão de operação, do que uma máquina virtual, visto que apenas as aplicações precisam ser inicializadas e não todo um sistema. Possui também um gerenciamento mais fácil, pois esse tipo de tecnologia precisa ser monitorada constantemente, pensando nisso foram criadas ferramentas para gerenciamento, como é o exemplo de Kubernetes. Usando containers, pode também economizar muito mais recursos do que usando uma máquina virtual. Container em comparação à máquina virtual, é algo mais uniforme e de fácil manutenção, pois as imagens que se encontram dentro dos containers, podem ser compartilhadas dentre os desenvolvedores. Passando para as desvantagens de containers, caso uma grande quantidade de CPU precise ser utilizada por alguma aplicação, por exemplo, a mesma irá ficar prejudicada visto que não irá ter o desempenho normal, caso estivesse em uma máquina virtual por exemplo. 

## 4. Podemos implementar, nos sistemas distribuídos, o controle de mudança de estado com duas abordagens distintas: 
##    o algoritmo de Paxos (e derivados) e os relógios vetoriais. Explique as principais diferenças dessas duas abordagens.

Resposta:
