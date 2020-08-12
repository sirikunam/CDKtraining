
public class Stack {
    int top;
    String[] s;
    
    public void push(String i){
  	  s[++top] = i;
    }
    
    public String pop(){
  	  return s[top--];
    }
    
    public String top1(){
  	  return s[top];
    }
    
    public boolean isEmpty(){
  	  return (top == -1);
    }
    
}