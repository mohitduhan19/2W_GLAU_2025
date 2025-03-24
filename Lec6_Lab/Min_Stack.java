package W.Lec6_Lab;

import java.util.Stack;

public class Min_Stack {
    Stack<Long>stk = new Stack<>();
    long min = Long.MAX_VALUE;
    public void push(int val) {
        if(stk.size() == 0){
            stk.push(1l*val);
            min = (long)val;
        }else if(val < min){
            stk.push(2l*val - min);
            min = (long)val;
        }else{
            stk.push(1l*val);
        }
    }

    public void pop() {
        if(stk.size() == 0)return;
        if(stk.peek() < min){
            min = 2l* min - stk.pop();
        }else{
            stk.pop();
        }
    }

    public int top() {
        if(stk.size() == 0)return -1;
        if(stk.peek() < min)return (int)min;
        long top = stk.peek();
        return (int) top;
    }

    public int getMin() {
        if(stk.size() == 0)return -1;
        return (int)min;
    }
}
