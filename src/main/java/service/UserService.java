package service;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<Map<String,Object>> MHselect(String s);

    List<Map<String,Object>> AJselect(String s);

    List<Map<String,Object>> AMselect(String s);

    List<Map<String,Object>> SelectAll();

    int DeleteUser(String Uid);
}
