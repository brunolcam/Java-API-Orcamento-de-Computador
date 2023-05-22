# Java-API-Orçamento-de-Computador

API Orçamento de Computador

Comprar um computador pode ser uma tarefa desafiadora, e requer algum conhecimento a respeito dos componentes principais, faixa de preço e também do que há de mais atual no mercado. Compradores mais experientes em geral preferem montar os seus PCs ou fazer upgrades de acordo com suas próprias demandas, selecionando cada uma das peças, ao invés de adquirir equipamentos pré-configurados. Lojas especializadas em produtos de informática oferecem tal possibilidade, comercializando uma variedade de peças e acessórios para diferentes bolsos e necessidades. 

A solução apresentada neste código se aplica a esse tipo de empreendimento. A ferramenta permite a um eventual cliente montar um PC de maneira rápida e fácil, fazendo a seleção dos componentes principais e definindo a configuração ideal para as suas necessidades. O cliente realiza a busca e visualiza as opções disponíveis em estoque para placa-mãe, processador, memória e dispositivo de armazenamento (HD ou SSD). Todas as peças são acompanhadas de uma descrição com informações sobre fabricante, modelo, especificações técnicas e preço, de modo que o usuário pode fazer diferentes combinações e escolher produtos compatíveis entre si. A partir da lista de componentes selecionados, a aplicação registra os valores agregados e apresenta ao final o orçamento resultante. 

Funcionalidades da API

A API Orçamento de Computador fornece o serviço de cotação para o consumidor montar um PC do zero ou adquirir peças para upgrade. Para o uso da aplicação, o cliente percorre as seguintes etapas: 

Passo 1. Dando início ao processo de elaboração do orçamento, a aplicação exibe um menu de componentes categorizados como “Placa-mãe”, “Processador”, “Memória” e “Armazenamento”. 

Passo 2. Selecionando, por exemplo, a opção “Processador”, o usuário é direcionado a uma lista que apresenta as opções de processadores em estoque, elencando os seus detalhes técnicos, preço e um número de identificação (ID). Para os processadores, em específico, é possível escolher de acordo com a marca, família e também soquete – característica essencial que terá influência sobre a placa-mãe a ser escolhida. 

Passo 3. Para fazer a opção por um dos itens da lista, é solicitado ao usuário que digite o identificador do produto, seguido da quantidade de unidades a ser adicionada ao carrinho de compras. 

Passo 4. Após essa definição o cliente é direcionado de volta ao menu principal e, se tiver interesse em outros componentes, o restante da seleção segue a mesma estrutura. Dessa forma, o consumidor repete o processo para cada componente desejado, selecionando aquilo que seja compatível com o restante do sistema. 

Passo 5. Ao final do processo o comprador digita a código do carrinho e é então exibido na tela o somatório dos valores das peças escolhidas para compor ou atualizar sua máquina. Um percentual de desconto de 5% é aplicado caso o montante seja superior a R$ 5.000,00. 

Clonar código-fonte:

git clone https://github.com/hebertcezar/Java-API-Orcamento-de-Computador.git

![API Orçamento de Computador - Diagrama de Classes](https://github.com/hebertcezar/Java-Orcamento-de-PC/assets/133036299/06428af0-cf78-400f-adb4-16a03addbbec)

