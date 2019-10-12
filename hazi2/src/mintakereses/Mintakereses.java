package mintakereses;

public class Mintakereses {
    
    public static boolean isConsecutiveFour(int[] values){
        if(values.length < 4)
            return false;
        int szamlalo = 1;
        for (int i = 0; i < values.length-1; i++) {
              if(values[i] == values[i+1]){
                  szamlalo++;
              }
              else if(szamlalo == 4){
                  return true;
              }
              else
                  szamlalo = 1;
        }
        if(szamlalo == 4)
            return true;
        else
            return false;
            
    }
    
    public static void main(String[] args) {
        int[] tomb = new int[]{2,2,2, 5, 6,6,6,6,6, 3, 3, 3};
        System.out.println(isConsecutiveFour(tomb));
    }
}
