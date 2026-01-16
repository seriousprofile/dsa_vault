//HINT: recursion :) nothing else to say, just use your brain until it fries (1 hour max).

class Solution {
    public void reverseStack(Stack<Integer> st) {

      //edge case!
        if(st.size() <= 1) return;
        int x = st.pop(); //every time this function is called, the element in the stack gets popped and stored in the function.

        
        reverseStack(st); //calls this very method again (so the same line occurs where the element gets popped again.
        reverse(st, x); //refers to an external function who takes in the current stack and the popped element.
    }

    private void reverse(Stack<Integer> st, int x){
        if(st.isEmpty()){ //remember that the previous function pops elements until the stack is empty. when it is empty:
            st.push(x); //push the number back in (as there is no other method to use except for push (intuitive thinking)
            return; //now return back to the beginning 
        }
        int top = st.pop(); //OTHERWISE, in case there is an element already pushed, it should be popped so that the current element gets pushed in as we are reversing the stack!
        reverse(st, x); //calls the reverse function which performs the same operation by popping the pushed in number and pushing in this element instead.
        st.push(top); //now push in the current element so that we end up re building the stack in the reverse order. 
    }
}
