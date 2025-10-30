package TestScript;
 
import java.io.File;
import java.io.IOException;
import java.util.List;
 
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
 
public class ReadPojo {
 
    public <T> Object[][] getJsonInfo(String fileloc, TypeReference<List<T>> ref) throws IOException {
        ObjectMapper obj = new ObjectMapper();
        List<T> list = obj.readValue(new File(fileloc), ref);
        Object[][] info = new Object[list.size()][1];
        for (int i = 0; i < list.size(); i++) {
            info[i][0] = list.get(i);
        }
        return info;
    }
}