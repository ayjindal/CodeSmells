package com.directi.training.codesmells.largeclass;

public class InformationEmployee {
	
	private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;
	
    public InformationEmployee(String _officeAreaCode, String _officeNumber, String _officeExtensionNumber) {
		super();
		this._officeAreaCode = _officeAreaCode;
		this._officeNumber = _officeNumber;
		this._officeExtensionNumber = _officeExtensionNumber;
	}
	
	@Override
	public String toString() {
		return "InformationEmployee [_officeAreaCode=" + _officeAreaCode + ", _officeNumber=" + _officeNumber
				+ ", _officeExtensionNumber=" + _officeExtensionNumber + "]";
	}
    
}


