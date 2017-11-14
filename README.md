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

Esse projeto está sendo desenvolvido como produto da Dissertação de Mestrado do aluno Willamys Gomes Fonseca Araújo para o curso de Ciência da Computação na Universidade Federal de Pernambuco.

Aluno: Willamys Gomes Fonseca Araújo

Orientador: Vinícius Cardoso Garcia

Trabalho: UMA ABORDAGEM ORIENTADA A MODELOS PARA GERAÇÃO DE APLICAÇÕES BASEADAS EM INTERNET DAS COISAS PARA SMARTPHONES <a href="https://github.com/willamys/msc.android.jacroid/blob/master/Disserta%C3%A7%C3%A3o%20-%20Willamys%20Ara%C3%BAjo%20-%20vers%C3%A3o%2030082017%20-%20Final%20ap%C3%B3s%20corre%C3%A7%C3%B5es.pdf">(link)</a>

OBS: Um exemplo do uso da biblioteca pode ser encontrado <a href="https://github.com/willamys/msc.android.jacroid/tree/master/example">(link)</a>.


## Como começar

Este plugin foi desenvolvido para funcionar na IDE Eclipse. Para isso, antes de mais nada, é necessário realizar o download do plugin e instalá-lo na versão do Eclipse Luna ou superior.

### Pré-requisitos

Para a instalação é necessário que possua o JDK 7 ou superior instalado no Sistema Operacional (Windows, Linux ou Mac OS).

### Instalação

O passo a passo para a instalação do plugin será descrito a seguir:

```
1. Download Eclipse [eclipse-SDK-x.x-win32-x86_64.zip] e extraia os arquivos.
2. Download o Plugin msc.android.jacroid;
3. Instale o plugin:
3.1 Inicie Eclipse, selecione o workbench;
3.2 Selecione Help > Install New Software;
3.3 Clique em Add em "Work with", depois em Local e selecione "msc.android.jacroid.zip" no seu computador;
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

Explain what these tests test and why

```
1. Selecione File > New > Others;
2. Clique em "JacroidEMF Diagram";
3. Selecione o Projeto criado anteriormente;
4. Clique em "Finish".
```

### O Plugin

Na Figura a seguir é ilustrado o Editor GMF. Com o propósito de permitir um melhor
entendimento, foram enumeradas as partes que o compõem.

<img src="" title="editor">

1. Área de desenho - destinada a montagem de diagramas. Nesse espaço, componentes selecionados na paleta de construtores são dispostos de maneira a montar todo o
contexto diagramático.

2. Construtores - Paleta criada obedecendo a conceitos da UML Profiles, de modo a facilitar e instruir a usuários utilizarem a ferramenta. Dentro de uma lógica de
associação mnemônica, o usuário é levado a compor seu modelo, utilizando componentes num esquema de cima para baixo nas seções estabelecidas, assim em qualquer 
criação de regra parte-se da utilização dessa sequência de seções, para utilização dos construtores. A paleta de construtores está ilustrada na Figura 3.9 e possui as seguintes ações:

<img src="" title="Paleta de construtores">

2.1 Objects - estabelece os componentes principais da área de desenho. ClassesDescriptor é um Object que define uma classe do metamodelo de entrada. 
O AttributeDescriptor é um Object que define atributos que devem ser associados as ClassesDescriptor. O Component é um Object que define o Component/Sensor que o usuário deseja utilizar. O Enumerate é
um Object para representar um AttributeDescriptor que possua uma lista de opções, essas opções são definidas por cada ItemEnum. O FirebaseAuth
é Object que tem a função de permitir a autenticação na base de dados do firebase. 

2.2.Connections - estabelece a ligação entre os Objects. Para isso, em suas propriedades ele armazena a origem (source) e o destino (target). O
RelationClasseDescriptor permite a ligação entre as ClassesDescriptor e o RelationAttributeDescriptorToComponent entre uma AttributeDescriptor e um Component.

3. Propriedades - Na aba propriedades é possível estabelecer valores de entrada para
as propriedades dos componentes inseridos na área de desenho do diagrama.

4. Geração de Código e o Botão Gen Code - nessa área, em que está localizado o projeto criado inicialmente, irá abrigar uma pasta( gen), com o código fonte da aplicação
que foi modelada e de acordo com a IDE selecionada (por exemplo, gen/eclipse). Para isso, é preciso estar com o diagrama aberto e clicar no botão "Gen Code". Ao clicar
no botão, a Classe M2TAction dentro de msc.android.jacroid.diagram irá recuperar a informação do metamodelo construído no editor e efetuará a transformação junto aos
templates.

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
