public class TwentyThreeJune {
    public static boolean search(String str, char target){
       if(str.length()==0){
           return false;
       }
       for(int i=0; i<str.length(); i++){
           if(str.charAt(i) == target){
               return true;
           }
       }
       return false;
    }
    public static void main(String[] args) {
        String name = "Vishesh";
        char target = 'e';
        if(search(name, target)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
        System.out.println(search(name, target));
    }
}
