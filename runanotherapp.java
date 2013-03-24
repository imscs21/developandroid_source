public class Test extends Activity {
	private Intent intent;
	//실행할 다른 앱의 패키지명
	private final String appPackageName = "com.grayd.book";   
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //intent에 패키지명 설정 string type
        intent = this.getPackageManager().getLaunchIntentForPackage(appPackageName);
        //다른앱을 실행
        startActivity(intent);
    }
}

