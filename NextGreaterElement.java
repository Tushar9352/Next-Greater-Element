import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> stack = new Stack<>();
        int nxt[] = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nxt[i] = -1;
            }else{
                nxt[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(nxt[i]+" ");
        }
        System.out.println();
    }
}
