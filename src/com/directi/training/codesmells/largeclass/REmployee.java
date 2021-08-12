package com.directi.training.codesmells.largeclass;

public class REmployee {
	
	private final String _name;
	private final InformationEmployee informationEmployee;
	
	public REmployee(String _name, InformationEmployee informationEmployee) {
		super();
		this._name = _name;
		this.informationEmployee = informationEmployee;
	}

	public String get_name() {
		return _name;
	}

	public InformationEmployee getInformationEmployee() {
		return informationEmployee;
	}
	
	

}
