package nexus.jedai.pyramid.com.constants;

import java.util.Hashtable;
import java.util.TimeZone;

public class CommonConstIF {
public static final boolean IS_OS_WINDOWS 				= (System.getProperty("os.name").toUpperCase().indexOf("WINDOWS") > -1) ? true : false;
	public static boolean IS_WEB_START						= false;
	public static boolean NX_TEST_SVR						= false;
	public static boolean LOCAL_PC_FOREST					= false;
	public static boolean LOCAL_PC_NORA						= false;
	public static String SVR_LOCAL_IP						= "";					// 서버 local IP

	public static String EMS_NAME							= "U_Agent";
	public static String EMS_VER							= "";
	public static String CB									= "";					// cache buster
	public static String SITE_NAME							= "COMPANY";
	public static String SITE_TITLE							= "U_Agent";
	public static boolean EMS_LOG_REMOTE_PORT				= false;				// EMS request remote port 로그 출력[yes/no]

	public static String JDBC_URL							= "";
	public static final boolean TimeZone_AsiaSeoul			= "Asia/Seoul".equalsIgnoreCase(TimeZone.getDefault().getID());

	public static String SIP_ACCEPT_SC						= "[]/:&+$-_.!~*'()";	// SIP 허용 특수문자

	public static final String REDIS_PREFIX_LOGIN			= "U_Agent_login_";		// redis 세션 저장 prefix
	public static String G_EncKey							= "";
	
	public static final int    REDIS_EXPIRE_TIMEOUT			= 1800;							// 30분 default

	/**
	 * 현재시간 설정 기준
	 * 0:WAS서버의 시간을 기준, 1:Database 시간을 기준
	 */
	public static final int SVR_DATETIME_GB 				= 0; 

	/**
	 * DB Null insert type
	 */
	public static final byte NULL_SQL_Types_VARCHAR 		= 0;
	public static final byte NULL_SQL_Types_TINYINT 		= 1;
	public static final byte NULL_SQL_Types_SMALLINT		= 2;
	public static final byte NULL_SQL_Types_INTEGER 		= 4;
	public static final byte NULL_SQL_Types_BIGINT 			= 5;
	
	/**
	 * 로그
	 * 
	 * 로그는 웹서비스 폴더 밖에 위치해야 함 : 로그파일 처리 중지
	 */
	public static final String BASE_LOG_PATH				= "/home/Proj/webroot/emsLog";
	public static final String infoDir						= BASE_LOG_PATH + "/info";
	public static final String warnDir						= BASE_LOG_PATH + "/warn";
	public static final String errorDir						= BASE_LOG_PATH + "/error";
	public static final String sqlDir						= BASE_LOG_PATH + "/sql";
	public static final String systemDir					= BASE_LOG_PATH + "/system";
	public static final String ifDir						= BASE_LOG_PATH + "/if";
	public static final String deviceDir					= BASE_LOG_PATH + "/dev";
	public static final String LOG_PATHS[]					= { infoDir, warnDir, errorDir, sqlDir, systemDir, ifDir, deviceDir };
	public static final String LOG_FILE_PREFIX				= "JEDAI_Pyramid";
	public static final String LOG_FORMAT					= "YYYY-MM-DD HH24:MI:SS";
	public static String LOG_DELTE_DAY 						= "30";
	public static final String LogPrefix					= "[U_Agent] ";		// JPY : JEDAI-Pyramid
	public static final String LogPrefixWeb					= "[U_Agent ] ";		// client browser

	public static final long LOG_FILE_SIZE_1M 				= 1048576;		// 1M
	public static final long LOG_FILE_SIZE_2M 				= 2097152;		// 2M
	public static final long LOG_FILE_SIZE_4M 				= 4194304;		// 4M
	public static final long LOG_FILE_SIZE_8M 				= 8388608;		// 8M
	public static 		long LOG_FILE_SIZE	 				= LOG_FILE_SIZE_4M;
	public static final int  LOG_FILE_KEEP_DAYS				= 180;

	/**/
	public static final int SessionExpireTimeSec			= IS_OS_WINDOWS ? 1800 : 600;			// 시험
	/*/
	public static final int SessionExpireTimeSec			= 600;									// default 10분
	/**/

	/**
	public static final boolean RSA_MANGE_SERVER			= true;			// 1회용 RSA PrivateKey 자체 관리
	/*/
	public static final boolean RSA_MANGE_SERVER			= false;		// 1회용 RSA PrivateKey 세션에 보관
	/**/

	public static boolean pyramidSqlLog						= false;		// 자체 sql 로그 처리

	// 로그 출력
	public static boolean JDBC_LOG							= false;
	public static boolean JDBC_LOG_ALL						= false;
	public static boolean JDBC_LOG_LOGIN					= false;
	public static boolean JDBC_LOG_HOME						= false;
	public static boolean JDBC_LOG_INTERACTION				= false;
	public static boolean JDBC_LOG_MONITORING				= false;
	public static boolean JDBC_LOG_REPORT					= false;
	public static boolean JDBC_LOG_MANAGEMENT				= false;
	public static boolean JDBC_LOG_SCENARIO					= false;
	public static boolean JDBC_LOG_VOC						= false;
	public static boolean JDBC_LOG_OUTBOUND					= false;
	public static boolean JDBC_LOG_WALLBOARD				= false;
	public static boolean JDBC_LOG_COMMON					= false;
	public static boolean JDBC_LOG_ETC						= false;
	public static boolean NXADAPTOR_LOG						= false;
	public static boolean USE_RECORD_URL					= false;

	/**
	 * 화면에 적용할 로고
	 */
	public static String LOGO_LOGIN							= "ubase";
	
	
	public static Boolean USE_NX_POST						= false;
	public static Boolean USE_BROWSER_CASHE_SAVE			= true;
	
	
	
	/**
	 * Thread
	 * 	: application 종료 시 반드시 종료(destroy).
	 */
//	public static MainScheduler mainScheduler				= null;
//	public static NxRsaScheduler nxRsaScheduler				= null;

	public static String KAKAO_CMS_DOMAIN = "";
	public static String KAKAO_CMS_DOMAIN_DETAIL = "";
	public static String NX_KAKAO_SERVER_URL = "";
	public static String RECORD_SERVER_URL = "";
	public static String CTI_REST_API  = "";
	public static String KAKAO_API_URL = "";
	/**
	 * ems config 설정
	 */
	public static Hashtable<String,String> ACCESS_CONTROL_ALLOW_ORIGIN		= new Hashtable<String,String>();

	public static boolean BROWSER_CACHE_SAVE								= true;			// 브라우저 캐시 저장 여부 (default:true)
	
	//public static boolean __APPLY_NX_ADAPTOR								= false;		// WsGateway 제거	: 임시 사용
	//public static boolean __APPLY_NX_ADAPTOR_WAS							= false;		// WsGateway 제거	: 임시 사용

	public static String JSON_NX_ADAPTOR_TABLES				= "";
	public static int SESSION_TIME_OUT                      = 259200;
	
	public static final String SHA512_ASTERISK				= "********************************************************************************************************************************";		// 128

	// SSO test 서버
	//public static String SSO_TEST_URL = "";
}
