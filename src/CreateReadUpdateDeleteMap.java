import java.util.*; 
class CreateReadUpdateDeleteMap { 
    public static void main(String args[]) 
    { 
        Map<Integer, String> hm1 = new HashMap<>(); 
        Map<Integer, String> hm2 = new HashMap<Integer, String>(); 
        hm1.put(1, "varma"); 
        hm1.put(2, "darma"); 
        hm1.put(3, "dinesh"); 
        hm2.put(new Integer(1), "sasi"); 
        hm2.put(new Integer(2), "praveen"); 
        hm2.put(new Integer(3), "nagendra"); 
        System.out.println(hm1); 
        System.out.println(hm2);
        for (Map.Entry mapElement : hm2.entrySet()) { 
            int key = (int)mapElement.getKey(); 
            String value = (String)mapElement.getValue(); 
            System.out.println(key + " : " + value); 
        } 
        hm1.put(new Integer(2), "lankada"); 
        System.out.println("updated map is : "+hm1);
        hm1.remove(new Integer(3));
        System.out.println("removed element from map: "+hm1);
    } 
}