package nexus.jedai.pyramid.com.constants;

public class EmsVer {
	private final String EMS_VER	= "v6.2.1.133_1";	private final String BUILD_DAY = "2025-07-24";		private final String BUILD_TIME = "21-30-00";		// eric
	
	private final String EMS_NM		= "UCONNECT_Agent";

	public String getVerInfoDay() {
		String version = EMS_VER +" [ "+ BUILD_DAY +" ]";
		return version;
	}
	public String getVerInfoDayTime() {
		String version = EMS_VER +" [ "+ BUILD_DAY +" "+ BUILD_TIME +" ]";
		return version;
	}
	public String getEMS_VER() {
		return EMS_VER;
	}
	public String getBUILD_DAY() {
		return BUILD_DAY;
	}
	public String getBUILD_TIME() {
		return BUILD_TIME;
	}
	public String getEMS_NM() {
		return EMS_NM;
	}
}
