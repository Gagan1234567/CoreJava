import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        /*
******* non repeating character index
        String str = "aaabbbcdd";
        int index=nonRepeatChar(str);
        System.out.println("char=" + str.charAt(index)+" "+"index=" + index);

    }

    public static int nonRepeatChar(String str) {
        Map<Character, Integer> mp = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (mp.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
         */
        //target sum
        int[] arr= {13,2,11,8,5};
        //target-10
        int target=0;
        System.out.println(targetSum(arr,target)[0]+" "+targetSum(arr,target)[1]);
    }

    private static int[] targetSum(int[] arr, int target) {
        Pair[] p=new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            p[i]=new Pair(i,arr[i]);
        }
       
        Arrays.sort(p);

        int[] res=new int[2];
        int i=0;
        int j=p.length-1;
        while(i<j){
            if(p[i].value+p[j].value>target){
                j--;
            }
            if(p[i].value+p[j].value<target){
                i++;
            }
            else if(p[i].value+p[j].value==target){
                res[0]=p[i].index;
                res[1]=p[j].index;
              break;
            }
        }
        return res;
    }
}
 class Pair implements Comparable<Pair>{
    int index,value;
    public Pair(){

    }
    public Pair(int index, int value) {
        this.index = index;
        this.value = value;
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Pair pair = (Pair) o;
         return index == pair.index && value == pair.value;
     }

     @Override
     public int hashCode() {
         return Objects.hash(index, value);
     }

     @Override
     public String toString() {
         return "Pair{" +
                 "index=" + index +
                 ", value=" + value +
                 '}';
     }

     @Override
     public int compareTo(Pair o) {
         return this.value-o.value;
     }
 }