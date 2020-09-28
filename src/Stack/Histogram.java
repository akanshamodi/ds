package Stack;

import java.util.Stack;

public class Histogram {
    public static int[] NSFL(int[] arr){
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int brr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                brr[i]=-1;
            }
            else if(stack.peek().first>=arr[i]){
                while(!stack.isEmpty()){
                    stack.pop();
                    if(stack.isEmpty()){
                        brr[i]=-1;
                        break;
                    }
                    else if(stack.peek().first<arr[i]){
                        brr[i] = stack.peek().second;
                        break;
                    }
                }
            }
            else{
                brr[i] = stack.peek().second;
            }
            stack.push(Pair.of(arr[i],i));
        }
        return brr;
    }
    public static int[] NSFR(int[] arr){
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int brr[] = new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            if(stack.isEmpty()){
                brr[i]=arr.length;
            }
            else if(stack.peek().first>=arr[i]){
                while(!stack.isEmpty()){
                    stack.pop();
                    if(stack.isEmpty()){
                        brr[i]=arr.length;
                        break;
                    }
                    else if(stack.peek().first<arr[i]){
                        brr[i] = stack.peek().second;
                        break;
                    }
                }
            }
            else{
                brr[i] = stack.peek().second;
            }
            stack.push(Pair.of(arr[i],i));
        }
        return brr;
    }
    public static int histogram(int arr[]){
        int left[] = NSFL(arr);
        int right[] = NSFR(arr);
        int greatestArea = 0,temp;
        for(int i=0;i< arr.length;i++){
          temp = arr[i]*((i-left[i])+(right[i]-i-1));
          if(greatestArea < temp){
              greatestArea = temp;
          }
        }
        return greatestArea;
    }
    public static void main(String args[]){
        int arr[] = {6,2,5,4,5,1,6};
        System.out.println("The greatest Area is "+histogram(arr));
    }
}
