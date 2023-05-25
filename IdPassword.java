import java.util.HashMap;

public class IdPassword {
    HashMap<String,String> loginInfo=new HashMap<String,String>();
    IdPassword(){
        loginInfo.put("Anu","kittu");
        loginInfo.put("Alekya","jhon");
        loginInfo.put("boom","son");
    }
    public HashMap getLoginInfo() {

        return loginInfo;
    }

}
