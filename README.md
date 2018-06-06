# Jacroid Plugin

A internet das coisas (IoT) traz à tona a ideia de dispositivos de computação identificáveis,
que são conectados à internet e incorporados a objetos do nosso dia-a-dia ou ligados a animais
ou pessoas (ATZORI; IERA; MORABITO, 2010), ou seja, poderiam ser vistos também pela
ótica de que pessoas possam vir a atuar como sensores. Em consonância à IoT, a utilização
de smartfphones tem tornado-se cada vez mais popular e acessível. De acordo com LEE; LEE
(2015), a evolução das principais tecnologias IoT em relação a softwares e algoritmos com
projeção para depois de 2020 são: softwares orientados para o usuário, o IoT invisível, 
easyto-deploy de softwares IoT, colaboração things-to-humans, e IoT para todos. 

Nesse sentido, como forma de atender as premissas supracitadas, a utilização de técnicas de Programação
Generativa (CZARNECKI et al., 2000) em que coloca seu foco na maximização da automação do
desenvolvimento de aplicativos; e a abordagem da Arquitetura Orientada a Modelos (WARMER;
KLEPPE, 2003), cujo diferencial está no fato do desenvolvimento ser baseado nas atividades
de modelagem, trazendo flexibilidade e portabilidade para os softwares desenvolvidos; ambos
podem ser vistos como uma alternativa para a criação de aplicações no âmbito de pessoas como
sensores. 

Diante deste contexto, o presente trabalho apresenta uma abordagem orientada a
modelos para o desenvolvimento de aplicativos na plataforma Android, dentro do domínio de
pessoas como sensores, por meio da combinação de componentes de software reutilizáveis e
os sensores presentes nos smartphones. 

## Como começar

Este plugin foi desenvolvido para funcionar na IDE Eclipse. Para isso, antes de mais nada, é necessário realizar o download do plugin e instalá-lo na versão do Eclipse Luna ou superior.

### Pré-requisitos

Para a instalação é necessário que possua o JDK 7 ou superior instalado no Sistema Operacional (Windows, Linux ou Mac OS).

### Instalação

O passo a passo para a instalação do plugin será descrito a seguir:

```
1. Download Eclipse [eclipse-epsilon-1.4-win32-x86_64.zip] e extraia os arquivos.
2. Download o Plugin em  https://github.com/willamys/msc.android.jacroid/tree/master/plugin;
3. Instale o plugin:
3.1 Inicie Eclipse, selecione o workbench;
3.2 Selecione Help > Install New Software;
3.3 Clique em Add em "Work with", depois em Local e selecione no seu computador;
3.4 Clique em "Next", Review, then "Next", aceite os termos da licença e "Finish";
3.5 Reinicie o Eclipse.
```
## Utilizando o Jacroid Plugin

### Criando um novo projeto:

No Eclipse faça:

```
1. Selecione File > New > Project;
2. Defina um nome para o projeto;
3. Clique em "Finish".
```

### Criando arquivo de modelagem do Jacroid Plugin

```
1. Selecione File > New > Others;
2. Clique em "JacroidEMF Diagram";
3. Selecione o Projeto criado anteriormente;
4. Clique em "Finish".
```

### O Plugin

Na Figura a seguir é ilustrado o Editor GMF. Com o propósito de permitir um melhor
entendimento, foram enumeradas as partes que o compõem.

<img src="https://github.com/willamys/msc.android.jacroid/blob/master/img/editor_enum_.png" title="editor"/>

1.Área de desenho - destinada a montagem de diagramas. Nesse espaço, componentes selecionados na paleta de construtores são dispostos de maneira a montar todo o
contexto diagramático.

2.Construtores - Paleta criada obedecendo a conceitos da UML Profiles, de modo a facilitar e instruir a usuários utilizarem a ferramenta. Dentro de uma lógica de
associação mnemônica, o usuário é levado a compor seu modelo, utilizando componentes num esquema de cima para baixo nas seções estabelecidas, assim em qualquer 
criação de regra parte-se da utilização dessa sequência de seções, para utilização dos construtores. A paleta de construtores está ilustrada na Figura abaixo e possui as seguintes ações:

<img src="https://github.com/willamys/msc.android.jacroid/blob/master/img/paleta.PNG" title="Paleta de construtores"/>

a.Objects - estabelece os componentes principais da área de desenho. ClassesDescriptor é um Object que define uma classe do metamodelo de entrada. 
O AttributeDescriptor é um Object que define atributos que devem ser associados as ClassesDescriptor. O Component é um Object que define o Component/Sensor que o usuário deseja utilizar. O Enumerate é
um Object para representar um AttributeDescriptor que possua uma lista de opções, essas opções são definidas por cada ItemEnum. O FirebaseAuth é Object que tem a função de permitir a autenticação na base de dados do firebase.

b.Connections - estabelece a ligação entre os Objects. Para isso, em suas propriedades ele armazena a origem (source) e o destino (target). O
RelationClasseDescriptor permite a ligação entre as ClassesDescriptor e o RelationAttributeDescriptorToComponent entre uma AttributeDescriptor e um Component.

3.Propriedades - Na aba propriedades é possível estabelecer valores de entrada para as propriedades dos componentes inseridos na área de desenho do diagrama.

4.Geração de Código e o Botão Gen Code - nessa área, em que está localizado o projeto criado inicialmente, irá abrigar uma pasta( gen), com o código fonte da aplicação
que foi modelada e de acordo com a IDE selecionada (por exemplo, gen/eclipse). Para isso, é preciso estar com o diagrama aberto e clicar no botão "Gen Code". Ao clicar
no botão, a Classe M2TAction dentro de msc.android.jacroid.diagram irá recuperar a informação do metamodelo construído no editor e efetuará a transformação junto aos
templates.

## Exemplos

Um exemplo do uso da biblioteca pode ser encontrado:


[Exemplos](https://github.com/willamys/msc.android.jacroid/tree/master/example).


## Construído com:

* [EuGENIA](http://www.eclipse.org/epsilon/doc/eugenia/) - EuGENia is a tool that automatically generates the .gmfgraph, .gmftool and .gmfmap models needed to implement a GMF editor
* [Eclipse Epsilon](http://www.eclipse.org/epsilon/) - Eclipse Epsilon

## Autores

* **Willamys Araújo** - *Desenvolvedor* - [Willamys](https://github.com/willamys)
* **Vinícius Cardoso Garcia** - *Orientador*

* **Trabalho:** UMA ABORDAGEM ORIENTADA A MODELOS PARA GERAÇÃO DE APLICAÇÕES BASEADAS EM INTERNET DAS COISAS PARA SMARTPHONES - [Dissertação](https://github.com/willamys/msc.android.jacroid/blob/master/UMA%20ABORDAGEM%20ORIENTADA%20A%20MODELOS%20PARA%20GERA%C3%87%C3%83O%20DE%20APLICA%C3%87%C3%95ES%20BASEADAS%20EM%20INTERNET%20DAS%20COISAS%20PARA%20SMARTPHONES.pdf)
## Licença

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/willamys/msc.android.jacroid/tree/master/license/LICENSE.md) file for details
