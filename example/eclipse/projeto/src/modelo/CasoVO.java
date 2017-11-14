package modelo;
import java.util.*;
import java.io.Serializable;

/**@author Willamys Araujo
**Generate for Jacroid**/

public class CasoVO implements Serializable{

	public String doenca;
	public String localizacao;

	public String getDoenca() {
		 return doenca;
	}
	public void setDoenca(String doenca) {
		 this.doenca = doenca;
	}
	public String getLocalizacao() {
		 return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		 this.localizacao = localizacao;
	}
 	public Map<String, Object> toMap(){
		HashMap<String, Object> result =  new HashMap<>();
		result.put("doenca", getDoenca());
		result.put("localizacao", getLocalizacao());
	return result;
  	}
}