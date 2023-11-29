class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> minSt;
    public MinStack() {
        st= new Stack<>();
        minSt =new Stack<>();
    }

    public void push(int val) {
        st.push(val);

        int x = Math.min(val, minSt.isEmpty()? val: minSt.peek());
        minSt.push(x);
    }

    public void pop() {
        st.pop();
        minSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */