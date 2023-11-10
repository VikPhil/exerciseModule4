package by.practice.aggregation_and_composition03.main;

public class Region {
	private City regionalСenter;
	private String regionName;
	
	public Region() {
		
	}
	
	public Region(City regionalСenter, String regionName) {
		this.setRegionalСenter(regionalСenter);
		this.setRegionName(regionName);
	}

	public City getRegionalСenter() {
		return regionalСenter;
	}

	public void setRegionalСenter(City regionalСenter) {
		this.regionalСenter = regionalСenter;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	@Override
	public String toString() {
		return "Область: " + regionName + '\n' +
			   "Областной центр: " + regionalСenter + '\n';
	}
}
