import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Properties;

class properties
{
public static void main(String args[]) throws IOException
{
Properties properties1 = new Properties();

/*Set states;
String outString;
properties1.setProperty("Property 0", "Value 0");
properties1.setProperty("Property 1", "Value 1");
properties1.setProperty("Property 2", "Value 2");
properties1.setProperty("Property 3", "Value 3");
properties1.setProperty("Property 4", "Value 4");
properties1.setProperty("Property 5", "Value 5");
properties1.setProperty("Property 6", "Value 6");
outString = properties1.getProperty("Property 3", "Missing");
System.out.println(outString);
outString = properties1.getProperty("Property 7", "Missing");
System.out.println(outString);*/

FileReader reader = new FileReader("C:\\deloitte\\mydb.properties");
properties1.load(reader);

System.out.println(properties1.get("username"));
System.out.println(properties1.get("password"));
System.out.println(properties1.get("driver"));
System.out.println(properties1.get("url"));
System.out.println(properties1.get("hello"));


}
}
