class MyQueue {
    Stack<Integer> stk2;
    Stack<Integer> stk1;
    public MyQueue() {
        this.stk1=new Stack<Integer>();
        this.stk2=new Stack<Integer>();
    }
    
    public void push(int x) {
        while(this.stk1.size()>0){
            this.stk2.push(this.stk1.pop());
        }
        this.stk1.push(x);
        while(this.stk2.size()>0){
            this.stk1.push(this.stk2.pop());
        }
    }
    
    public int pop() {
        int t=this.stk1.pop();
        return t;
    }
    
    public int peek() {
        return stk1.peek();
    }
    
    public boolean empty() {
        return this.stk1.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */