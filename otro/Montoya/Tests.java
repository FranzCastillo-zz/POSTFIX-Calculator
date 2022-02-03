/**
 * @author Francisco Castillo
 * Tests for the Postfix calculator.
 * 
 */


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;


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
    public void popTest(){
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

    PosfixCalc calc;
    @Test
    public void evaluateTest(){
        calc = new PosfixCalc();
        assertEquals(15, calc.Evaluate("1 2 + 4 * 3 +"));
        assertEquals(-16, calc.Evaluate("4 5 7 2 + - *"));
        assertEquals(2, calc.Evaluate("3 4 + 2 * 7 /"));
        assertEquals(48, calc.Evaluate("5 7 + 6 2 - *"));
        assertEquals(18, calc.Evaluate("4 2 + 3 5 1 - * +"));
    }
}
