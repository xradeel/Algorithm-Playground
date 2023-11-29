class Solution {
    
    public boolean isValid(String s) {
        Stack<Character> chStack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(isOpen(ch)){
                chStack.push(ch);
            }
            else if(isClosed(ch) && !chStack.isEmpty()){
                if(ch==')' && chStack.peek() == '(') chStack.pop();
                else if(ch=='}' && chStack.peek() == '{') chStack.pop();
                else if(ch==']' && chStack.peek() == '[') chStack.pop();
                else return false;
            }
            else return false;
        }
        if(!chStack.isEmpty()) return false;
        return true;
    }
    public boolean isOpen(char ch){
        return ch =='(' || ch == '{' || ch == '[';
    }
    public boolean isClosed(char ch){
        return ch ==')' || ch == '}' || ch == ']';
    }
    
}