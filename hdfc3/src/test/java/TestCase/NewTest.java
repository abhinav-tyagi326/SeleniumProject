package TestCase;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;

import TestScript.ReadPojo;
import TestScript.SamplePojo;
public class NewTest {
  @Test(dataProvider="data")
  public void f(SamplePojo obj) {
	  System.out.println(obj.getEmail());
	  System.out.println(obj.getPassword());
  }
  @DataProvider
  public Object[][] data() throws IOException{
	  ReadPojo obj = new ReadPojo();
	  Object[][] xx = obj.getJsonInfo(".\\src\\test\\resources\\TestData\\input.json",new TypeReference<List<SamplePojo>>() {});
	  return xx;
  }
}
 
 