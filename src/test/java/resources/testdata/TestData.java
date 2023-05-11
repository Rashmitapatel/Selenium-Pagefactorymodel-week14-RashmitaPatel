package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay Vaghani
 */
public class TestData {
    @DataProvider(name ="credentials") // this data set only for credencials...if you want for registration then copy and change the getRegistration Data()in second line
    public Object[][] getData(){     // this is standard method for data driven
        Object[][] data = new Object[][]{
                {"test1@gmail.com","test123"} ,
                {"test2@gmail.com","test123"} ,
                {"test3@gmail.com","test123"}
        };
        return  data;
    }

}
