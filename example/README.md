# Jacroid Examples

O plugin Jacroid permite a criação de aplicações com enfase em crowdsensing ou people as a service. As aplicações que serão criadas com a ferramenta 
serão especificamente para Android.

Existem duas IDE's que podem ser utilizadas o Eclipse e o Android Studio. 

Dois exemplos de código fonte gerado pela ferramenta estão disponíveis em [Android Studio](https://github.com/willamys/msc.android.jacroid/tree/master/example/androidstudio/projeto) e [Eclipse](https://github.com/willamys/msc.android.jacroid/tree/master/example/eclipse/projeto).


## Modelagem
O exemplos são baseados na modelagem descrita pela figura a seguir. 

<img src="https://github.com/willamys/msc.android.jacroid/blob/master/example/diagrama_metamodelo_aedes_points.png"/>

### Arquivo gerado pela modelagem com o plugin.

````
<?xml version="1.0" encoding="UTF-8"?>
<jacroidEMF:Projeto xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:jacroidEMF="jacroidEMF">
  <classes name="AedesPoints" tableName="AedesPoints">
    <attributes classname="AedesPoints" columnTable="tipo" exhibitionName="Tipo" name="tipo" typeData="Enumerate"/>
    <attributes classname="AedesPoints" columnTable="descricao" exhibitionName="Descricao" input="text" name="descricao"/>
    <attributes classname="AedesPoints" columnTable="localizacao" exhibitionName="Localizacao" input="text" name="localizacao"/>
    <attributes classname="AedesPoints" columnTable="foto" exhibitionName="Foto" input="image" isColumn="true" name="foto" typeData="Image"/>
    <attributes classname="AedesPoints" columnTable="turno" exhibitionName="Turno" input="radiobutton" isColumn="true" name="turno" typeData="Enumerate"/>
    <attributes classname="AedesPoints" columnTable="validado" exhibitionName="Validado" input="checkbox" isColumn="true" name="validado" typeData="Boolean"/>
  </classes>
  <classes name="Caso" tableName="Caso">
    <attributes classname="Caso" columnTable="doenca" exhibitionName="doenca" isColumn="true" name="doenca" typeData="Enumerate"/>
    <attributes classname="Caso" columnTable="localizacao" exhibitionName="localizacao" input="text" isColumn="true" name="localizacao"/>
  </classes>
  <component name="Maps" type="GPS"/>
  <component name="Camera" type="CAMERA"/>
  <enumerate name="tipo">
    <item name="Agua parada"/>
    <item name="Lixo"/>
    <item name="Esgoto"/>
  </enumerate>
  <enumerate name="turno">
    <item name="Manha"/>
    <item name="Tarde"/>
    <item name="Noite"/>
  </enumerate>
  <enumerate name="doenca">
    <item name="Dengue"/>
    <item name="Zika"/>
    <item name="Chikungunya"/>
  </enumerate>
  <firebaseAuth name="Authentication"/>
  <relationAttributeToComponent source="//@classes.0/@attributes.2" target="//@component.0"/>
  <relationAttributeToComponent source="//@classes.0/@attributes.3" target="//@component.1"/>
  <relationAttributeToComponent source="//@classes.1/@attributes.1" target="//@component.0"/>
</jacroidEMF:Projeto>
````
## Mais Informações

[Dissertação](https://github.com/willamys/msc.android.jacroid/blob/master/UMA%20ABORDAGEM%20ORIENTADA%20A%20MODELOS%20PARA%20GERA%C3%87%C3%83O%20DE%20APLICA%C3%87%C3%95ES%20BASEADAS%20EM%20INTERNET%20DAS%20COISAS%20PARA%20SMARTPHONES.pdf)