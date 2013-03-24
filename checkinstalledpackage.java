// Package 설치여부 확인


  PackageManager pm = getPackageManager();
  try {
       pm.getApplicationInfo("찾을 패키지명",PackageManager.GET_META_DATA);

       //패키지가 있을경우 실행할 내용
       }

 catch (NameNotFoundException e)

      {

      //패키지가 없을경우 실행할 내용
      }
