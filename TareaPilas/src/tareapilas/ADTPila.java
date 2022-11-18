/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapilas;



/**
 *
 * @author david
 * @param <T>
 */
public class ADTPila<T> {

    private T[] stack;
    private int top;

    public ADTPila(int tamanho) {
        stack = (T[]) new Object[tamanho];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else if (top != 0) {
            return false;
        }
         return isEmpty();
    }

    public int lenght() {
        return stack.length;
    }
    
    public void pop() {
        if (!isEmpty()) {
            top--;
        }
    }
    
    public String peek(){
        return stack[top].toString();
    }

    public void push(T valueToAdd) {
            top++;
            stack[top] = valueToAdd;   
    }

    public boolean isFull() {
        return !(top+1 < stack.length);
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = top; i >= 0; i--) {
            result += stack[i] + " ";
        }
        result += "]";
        return result;
    }
}
