

public class cadamil 
{
 
    public static void main(String[] args) 
    {
        String s = "98654321";      
        s = separarMiles(s);
        System.out.println(s);
    }
 
    public static String separarMiles(String s)
    {
        StringBuilder aux = new StringBuilder(s);           
        aux.reverse();    
        int posicion = 3; 
        while(posicion < aux.length())
        {   
            aux.insert(posicion,'.'); 
            posicion+=4;
        }
         
        aux.reverse();   
        return aux.toString();
    }
}
