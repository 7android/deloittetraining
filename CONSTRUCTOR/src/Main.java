/*class Demo{   
                int count = 0;
    void Second() throws Exception
    {
        try
        {
            count++;
            
            try
            {
                count++;

                try
                {
                    count++;
                    throw new Exception();

                }
                
                catch(Exception ex)
                {
                    count++;
                    throw new Exception();
                }
            }
            
            catch(Exception ex)
            {
                count = count;
                throw new Exception();
            }
        }
        
        catch(Exception ex)
        {
            count++;
        }

    }

    void display()
    {
        System.out.println(count);
    }
}
public class Main {
    public static void main(String[] args) throws Exception
    {
        Demo obj = new Demo();
        obj.Second();
        obj.display();

    }
}*/

class BC {
    public void Print() {
        System.out.println("Base");
    }         
}

class DC extends BC {    
    public void Print() {
        System.out.println("Derived");
    }
}

class Main{
    public static void DoPrint( BC o ) {
        o.Print();   
    }
    public static void main(String[] args) {
//Your Code Goes Here 
    	BC b = new BC();
    	DC d = new DC();
    	b.Print();
    	d.Print();
    	d.Print();
    }
}