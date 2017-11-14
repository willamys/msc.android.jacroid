package com.src.android.projeto.modelo;
import java.util.*;
import java.io.Serializable;

/**@author Willamys Araujo
**Generate for Jacroid**/

public class AedesPointsVO implements Serializable{

	public String tipo;
	public String descricao;
	public String localizacao;
	public String foto;
	public String turno;
	public Boolean validado;

	public String getTipo() {
		 return tipo;
	}
	public void setTipo(String tipo) {
		 this.tipo = tipo;
	}
	public String getDescricao() {
		 return descricao;
	}
	public void setDescricao(String descricao) {
		 this.descricao = descricao;
	}
	public String getLocalizacao() {
		 return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		 this.localizacao = localizacao;
	}
	public String getFoto() {
		 return foto;
	}
	public void setFoto(String foto) {
		 this.foto = foto;
	}
	public String getTurno() {
		 return turno;
	}
	public void setTurno(String turno) {
		 this.turno = turno;
	}
	public Boolean getValidado() {
		 return validado;
	}
	public void setValidado(Boolean validado) {
		 this.validado = validado;
	}
 	public Map<String, Object> toMap(){
		HashMap<String, Object> result =  new HashMap<>();
		result.put("tipo", getTipo());
		result.put("descricao", getDescricao());
		result.put("localizacao", getLocalizacao());
		result.put("foto", getFoto());
		result.put("turno", getTurno());
		result.put("validado", getValidado());
	return result;
  	}
}