package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import Stacks.Stack;

public class Tests {
    // ------------------------------------- STACKS -------------------------------------
    
    @Test
    public void pushAndPeekTest(){
        Stack<Integer> st = new Stack<Integer>();
        st.push(14);
        assertEquals(14, st.peek());
        st.push(15);
        assertEquals(15, st.peek());
    }

    @Test
    public void pullTest(){
        Stack<String> st = new Stack<String>();
        st.push("a");
        assertEquals("a", st.pull());
        assertEquals(null, st.pull());

        st.push("a");
        st.push("b");
        assertEquals("b", st.pull());
        assertEquals("a", st.pull());
        assertEquals(null, st.pull());
    }

    @Test
    public void countTest(){
        Stack<Integer> st = new Stack<Integer>();
        assertEquals(0, st.count());
        st.push(1);
        st.push(2);
        st.push(3);
        assertEquals(3, st.count());

        st.pull();
        assertEquals(2, st.count());
    }

    @Test
    public void isEmptyTest(){
        Stack<String> st = new Stack<String>();
        assertEquals(true, st.isEmpty());
        st.push("a");
        assertEquals(false, st.isEmpty());
        st.pull();
        assertEquals(true, st.isEmpty());
    }
}
