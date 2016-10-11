package Aerei;

import java.util.List;

public class Aeroporto {
	
	private String code;
	
	public Aeroporto(String code){
		this.code = code;
	}

	public String getCode(){
		return this.code;
	}

	public List<Volo> getArrivi(){
		return null;
	}
	
	public List<Volo> getPartenze(){
		return null;
	}
}
