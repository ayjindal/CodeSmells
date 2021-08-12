package com.directi.training.codesmells.featureenvy;

public class RAddress {
	
	private String _addressLine1;
    private String _addressLine2;
    private String _city;
    private String _state;
    private String _country;
    private String _postalCode;
	
	public RAddress(String _addressLine1, String _addressLine2, String _city, String _state, String _country,
			String _postalCode) {
		super();
		this._addressLine1 = _addressLine1;
		this._addressLine2 = _addressLine2;
		this._city = _city;
		this._state = _state;
		this._country = _country;
		this._postalCode = _postalCode;
	}



	public String get_addressLine1() {
		return _addressLine1;
	}



	public void set_addressLine1(String _addressLine1) {
		this._addressLine1 = _addressLine1;
	}



	public String get_addressLine2() {
		return _addressLine2;
	}



	public void set_addressLine2(String _addressLine2) {
		this._addressLine2 = _addressLine2;
	}



	public String get_city() {
		return _city;
	}



	public void set_city(String _city) {
		this._city = _city;
	}



	public String get_state() {
		return _state;
	}



	public void set_state(String _state) {
		this._state = _state;
	}



	public String get_country() {
		return _country;
	}



	public void set_country(String _country) {
		this._country = _country;
	}



	public String get_postalCode() {
		return _postalCode;
	}



	public void set_postalCode(String _postalCode) {
		this._postalCode = _postalCode;
	}

	@Override
	public String toString() {
		return "Address [_addressLine1=" + _addressLine1 + ", _addressLine2=" + _addressLine2 + ", _city=" + _city
				+ ", _state=" + _state + ", _country=" + _country + ", _postalCode=" + _postalCode + "]";
	}

	

}
