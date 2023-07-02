package model;

import java.util.List;
import java.util.ArrayList;
/**
 * Classe Filial herda de Enterprises e simula o comportamento de uma filial.
 * @author Julio Roberto e Guilherme Silva
 * @since 2023
 * @version 1.1
 *
 */

public class Filial extends Enterprises {
	
	// ATRIBUTES
	private int value;
	private List<Patrimony> patrimony;
	
	//Constructor
	
	public Filial(String name) {
		this(name,null);
	}
	
	public Filial(String name, Address adress) {
		setName(name);
		setAddress(adress);
		setPatrimony(new ArrayList<Patrimony>());
	}

	// GETTERS AND SETTERS
	
	public void setPatrimony(ArrayList<Patrimony> patrimony) {
		this.patrimony = patrimony;
	}

	public List<Patrimony> getPatrimony() {
		return patrimony;
	}
	
	public double getValue() {
		double value = 0;
		
		for(int i = 0; i < getPatrimony().size(); i++) {
			value += getPatrimony().get(i).getValue() * getPatrimony().get(i).getAmount() ;
		}
		
		return value;
	}
	//Methods
	
	//Into a Filial create a Patrimony with all arguments
	public boolean creatV(String name,int amount, double value, String model, String brand, int productionYear) {
		boolean verifica = false;
		if(getPatrimony().size() == 0 && (name.isEmpty() == false)) {
			
			getPatrimony().add(new Vehicle(name, amount,value,  model,brand, productionYear));
			verifica = true;
			
		} else {
			if(name.isEmpty() == false) {
				for(int i = 0; i < getPatrimony().size(); i++) {
					if(getPatrimony().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
						return false;
						
					} else if(i == getPatrimony().size() - 1) {
						patrimony.add(new Vehicle(name, amount,value,  model,brand, productionYear));
						verifica = true;
						return true;
					}
				}
			} else {
				return false;
			}
		}
		
		
		return verifica;
	
		
	}
	
	public boolean creatV(String name, double value) {
		boolean verifica = false;
		
		if(getPatrimony().size() == 0 && (name.isEmpty() == false)) {
			getPatrimony().add(new Vehicle(name, value));
			verifica = true;
		} else {
			if(name.isEmpty() == false) {
				for(int i = 0; i < getPatrimony().size(); i++) {
					if(getPatrimony().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
						return false;
					} else if(i == getPatrimony().size() - 1) {
						patrimony.add(new Vehicle(name, value));
						verifica = true;
						return true;
					}
				}
			} else {
				verifica = false;
				
			}
		}
		
		return verifica;
	
	}
	
	public boolean creatV(String name,int amount, double value) {
		boolean verifica = false;
		
		if(getPatrimony().size() == 0 && (name.isEmpty() == false)) {
			getPatrimony().add(new Vehicle(name, amount, value));
			verifica = true;
		} else {
			if(name.isEmpty() == false) {
				for(int i = 0; i < getPatrimony().size(); i++) {
					if(getPatrimony().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
						return false;
					} else if(i == getPatrimony().size() - 1) {
						patrimony.add(new Vehicle(name, amount, value));
						verifica = true;
						return true;
					}
				}
			} else {
				verifica = false;
			}
		}
		
		return verifica;
		
	}
	
	//Into a Filial create a Patrimony only with name 
	public boolean createV(String name) {
		boolean verifica = false;
		
		if(getPatrimony().size() == 0 && (name.isEmpty() == false)) {
			getPatrimony().add(new Vehicle(name));
			verifica = true;
		} else {
			if(name.isEmpty() == false) {
				for(int i = 0; i < getPatrimony().size(); i++) {
					if(getPatrimony().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
						return false;
					} else if(i == getPatrimony().size() - 1){
						patrimony.add(new Vehicle(name));
						verifica = true;
						return true;
					}
				}
			} else {
				verifica = false;
			}
			
		}
		
		
		return verifica;
	
	}
	
	public boolean creatB(String name, int amount, double value, int floorsQTD, double area) {
		boolean verifica = false;
		
		if(getPatrimony().size() == 0 && (name.isEmpty() == false))  {
			getPatrimony().add(new Buildings(name, amount, value, floorsQTD, area));
			verifica = true;
			
		} else {
			if(name.isEmpty() == false) {
				for(int i = 0; i < getPatrimony().size(); i++) {
					if(getPatrimony().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
						return false;
					} else if(i == getPatrimony().size() - 1){
						getPatrimony().add(new Buildings(name, amount, value, floorsQTD, area));
						verifica = true;
						return true;
					}
				}
			} else {
				verifica = false;
			}
		}
		
		return verifica;
		
	}
	
	public boolean creatB(String name, int amount ,double value) {
		boolean verifica = false;
		
		if(getPatrimony().size() == 0 && (name.isEmpty() == false)) {
			getPatrimony().add(new Buildings(name, amount, value));
			verifica = true;
		} 
		
		if(name.isEmpty() == false) {
			for(int i = 0; i < getPatrimony().size(); i++) {
				if(getPatrimony().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
					return false;
				} else if(i == getPatrimony().size() - 1) {
					patrimony.add(new Buildings(name, amount, value));
					verifica = true;
					return true;
				}
			}
		} else {
			verifica = false;
		}
		
		return verifica;
		
	}

	
	public boolean creatB(String name, double value) {
		boolean verifica = false;
		
		if(getPatrimony().size() == 0 && (name.isEmpty() == false)) {
			getPatrimony().add(new Buildings(name, value));
			verifica = true;
		} 
		
		if(name.isEmpty() == false) {
			for(int i = 0; i < getPatrimony().size(); i++) {
				if(getPatrimony().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
					return false;
				} else if(i == getPatrimony().size() - 1) {
					patrimony.add(new Buildings(name, value));
					verifica = true;
					return true;
				}
			}
		} else {
			verifica = false;
		}
		
		return verifica;
		
		
	}
	

	
	public boolean createB(String name) {
		boolean verifica = false;
		
		if(getPatrimony().size() == 0 && (name.isEmpty() == false)) {
			getPatrimony().add(new Buildings(name));
			verifica = true;
		} 
		
		if(name.isEmpty() == false) {
			for(int i = 0; i < getPatrimony().size(); i++) {
				if(getPatrimony().get(i).getName().toLowerCase().equals(name.toLowerCase())) {
					return false;
				} else if(i == getPatrimony().size() - 1){
					patrimony.add(new Buildings(name));
					verifica = true;
					return true;
				}
			}
		} else {
			verifica = false;
		}
		
		return verifica;
		
	}
	
	//Into a Filial add a Patrimony
	public boolean add(Patrimony patrimony) {
		boolean verifica = false;
		if(getPatrimony().size()!= 0)
		{
			for(int i = 0; i < getPatrimony().size(); i++) {
				if(getPatrimony().get(i).getName().toLowerCase().equals(patrimony.getName().toLowerCase())) {
					return false;
				} else if(patrimony.getName().isEmpty() == false && i == getPatrimony().size() - 1) {
					getPatrimony().add(patrimony);
					verifica = true;
					return verifica;
					
				}
			}
		}
		
		else
		{
			getPatrimony().add(patrimony);
			verifica = true;
		}
	
		
		return verifica;
	}
	
	//Into a Filial edit the name of a Patrimony
	public boolean editPatrimony(String oldName, String newName) {
		boolean verifica = false;
		for(int i = 0; i < getPatrimony().size(); i++) {
			if(getPatrimony().get(i).getName().toLowerCase().equals(newName.toLowerCase())) {
				return verifica;
				
			} else if(i == getPatrimony().size() - 1 && (newName.isEmpty() == false)) { // ter certeza que toda a lista foi verificada
				
				for(int j = 0; j < getPatrimony().size(); j ++) {
					if(getPatrimony().get(j).getName().equals(oldName)) {
						getPatrimony().get(j).edit(newName);
						verifica = true;
						return true;
					}
				}	
			}
		}
		
		return verifica;
	}
	
	//Into a Filial edit the value of a Patrimony
	public void editPatrimony(String oldName, double newValue) {
		
		oldName = oldName.toLowerCase();
		
		for (int i = 0; i < getPatrimony().size(); i++) {
			if(getPatrimony().get(i).getName().toLowerCase().equals(oldName)){
				getPatrimony().get(i).edit(newValue);
			}
		}
	}
	
	//Into a Filial edit the amount of a Patrimony
	public void editPatrimony(String patName, int amount) {
		
		patName = patName.toLowerCase();
		for(int i = 0; i < getPatrimony().size();i++) {
			if(getPatrimony().get(i).getName().toLowerCase().equals(patName)) {
				getPatrimony().get(i).edit(amount);
			}
		}
	}

	//Into a Filial remove a Patrimony
	public boolean remove(String patName) {
		patName = patName.toLowerCase();
		boolean verifica = false;
		
		for (int i = 0; i < getPatrimony().size(); i++) {
			if (getPatrimony().get(i).getName().toLowerCase().equals(patName)) {
				getPatrimony().remove(getPatrimony().get(i));
				verifica = true;
			}
		}
		
		return verifica;
	}
	
	public boolean remove(Patrimony p) {
		boolean verifica = false;
		for(int i = 0; i < getPatrimony().size(); i++) {
			if(getPatrimony().get(i) == p) {
				getPatrimony().remove(p);
				verifica = true;
			}
		}
		
		return verifica;
	}

	//method toString that returns the Filial name, the Adress and the Array of Patrimony into a formated String  
	public String toString() {
		String filial = String.format("Nome: %s\nEndereco: %s\nPatrimonios registrados:\n",getName(),getAddress().toString());
		for(int i = 0; i < patrimony.size(); i++) {
			filial = filial.concat(getPatrimony().get(i).toString());
			filial = filial.concat("\n");
		}
		return filial;
	}
	
	
}