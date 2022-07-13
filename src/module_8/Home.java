package module_8;

class Home{
	private int square_feet;
	private String address;
	private String city;
	private String state;
	private int zip_code;
	private String Model_name;
	private String sale_status;
	
	public Home() {
		square_feet = 0;
		address = "";
		city = "";
		state = "";
		zip_code = 00000;
		Model_name = "";
		sale_status = "";
	}
	
	public Home(int sq_feet, String add, String cty, String st, int zip, String model, String sale) {
		square_feet = sq_feet;
		address = add;
		city = cty;
		state = st;
		zip_code = zip;
		Model_name = model;
		sale_status = sale;
	}

	public int getSquare_feet() {
		return square_feet;
	}

	public void setSquare_feet(int square_feet) {
		this.square_feet = square_feet;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	public String getModel_name() {
		return Model_name;
	}

	public void setModel_name(String model_name) {
		Model_name = model_name;
	}

	public String getSale_status() {
		return sale_status;
	}

	public boolean setSale_status(String sale_status) {
		this.sale_status = sale_status;
		return true;
	}
		
	
}
