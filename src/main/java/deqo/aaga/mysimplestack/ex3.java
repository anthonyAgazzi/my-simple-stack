package deqo.aaga.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public class ex3 implements SimpleStack{
    Stack stack = new Stack();
    int taille = 0;

    public boolean isEmpty(){
        return this.stack.empty();
    }
    public int getSize(){
        return this.taille;
    }
    public void push(Item item){
        this.stack.push(item);
        this.taille++;
    }

    public Item peek() throws EmptyStackException{
        if (taille >= 1) {
            return (Item) this.stack.peek();
        }
        else{
            throw new EmptyStackException();
        }

    }
    public Item pop() throws EmptyStackException {
        if (taille >= 1) {
            this.taille--;
            return (Item) this.stack.pop();

        }
        else{
            throw new EmptyStackException();
        }
    }
}
