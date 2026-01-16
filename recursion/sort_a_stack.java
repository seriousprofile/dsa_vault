class Solution {
    private void insertSorted(Stack<Integer> st, int x){
        if(st.isEmpty() || st.peek() <= x){
            st.push(x);
            return; 
        }

        int t = st.pop();
        insertSorted(st, x);
        st.push(t);
    }

    public void sortStack(Stack<Integer> st) {
        if(st.size() <= 1) return; 
        int x = st.pop();

        sortStack(st);
        insertSorted(st, x);
    }
}

