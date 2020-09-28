package Stack;

import java.util.Stack;

public class RainWaterTrapping {
    public static int LeftMax(int arr[],int index){
        Stack<Integer> stack = new Stack<>();
        int Lmax = 0;
        for(int i = index;i>=0;i--){
            if(stack.isEmpty()){
                Lmax = arr[i];
            }
            else{
                while(!stack.isEmpty()) {
                    if (stack.peek() > arr[i]) {
                        Lmax = stack.peek();
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    Lmax = arr[i];
                }
            }
            stack.push(arr[i]);
        }
        return Lmax;
    }
    public static int RightMax(int arr[],int index){
        Stack<Integer> stack = new Stack<>();
        int Rmax = 0;
        for(int i = index;i< arr.length;i++){
            if(stack.isEmpty()){
                Rmax = arr[i];
            }
            else{
                while(!stack.isEmpty()) {
                    if (stack.peek() > arr[i]) {
                        Rmax = stack.peek();
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(stack.isEmpty()){
                    Rmax = arr[i];
                }
            }
            stack.push(arr[i]);
        }
        return Rmax;
    }
    public static void main(String args[]){
        int arr[] = {3,0,0,2,0,4};
        int sum=0,Lmax,Rmax;
        for(int i=0;i< arr.length;i++) {
           Lmax  = LeftMax(arr,i);
           Rmax = RightMax(arr,i);
           if(Lmax>Rmax){
               sum = sum + (Rmax-arr[i]);
           }
           else{
               sum = sum + (Lmax - arr[i]);
           }
        }
        System.out.println("The Rain Water Trapping is"+sum);
    }
}
