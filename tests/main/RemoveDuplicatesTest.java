package main;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {

    @Test
    public void removeMethod() throws Exception{
        RemoveDuplicates RemoveDupicateObj = new RemoveDuplicates("wwwaaaywwywsd");
        RemoveDupicateObj.RemoveMethod();
        assertEquals("waysd", RemoveDupicateObj.getS());
    }

    @Test
    public void testEdge() throws Exception {
        RemoveDuplicates RemoveDupicateObj = new RemoveDuplicates("");
        RemoveDupicateObj.RemoveMethod();
        assertEquals("", RemoveDupicateObj.getS());
    }
}