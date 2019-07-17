package mypackage;

public class Country {
	String name;
	public String captial;
	int flagImage;
	
	public Country(String name, String captial, int flagImage) {
		super();
		this.name = name;
		this.captial = captial;
		this.flagImage = flagImage;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the captial
	 */
	public String getCaptial() {
		return captial;
	}

	/**
	 * @param captial the captial to set
	 */
	public void setCaptial(String captial) {
		this.captial = captial;
	}

	/**
	 * @return the flagImage
	 */
	public int getFlagImage() {
		return flagImage;
	}

	/**
	 * @param flagImage the flagImage to set
	 */
	public void setFlagImage(int flagImage) {
		this.flagImage = flagImage;
	}
	
	
	
	

}
