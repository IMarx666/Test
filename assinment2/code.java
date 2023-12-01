package com.example.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(4, tri.Triang(5, 2, 7));
        assertEquals(4, tri.Triang(-1, 2, 7));
        assertEquals(4, tri.Triang(1, -2, 7));
        assertEquals(4, tri.Triang(1, 2, -7));
        assertEquals(2, tri.Triang(7, 2, 7));
        assertEquals(2, tri.Triang(8, 8, 7));
        assertEquals(2, tri.Triang(4, 6, 6));
        assertEquals(1, tri.Triang(6, 2, 7));
        assertEquals(4, tri.Triang(1, 1, 7));
        assertEquals(4, tri.Triang(7, 2, 2));
        assertEquals(4, tri.Triang(7, 20, 7));
        assertEquals(3, tri.Triang(7, 7, 7));
        assertEquals(2, tri.Triang(700000, 700000, 200000));
        assertEquals(4, tri.Triang(7, 70, 2));
    }


    //dicision : (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 ||
    //                    Side1+Side3 <= Side2)
    @Test
    public void TritypeConditionTest(){
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(7, 70, 2));
        assertEquals(1, tri.Triang(7, 8, 2));



    }
    @Test
    public void TritypeDecisionTest(){
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(7, 70, 2));
        assertEquals(4, tri.Triang(20, 8, 2));
        assertEquals(4, tri.Triang(2, 8, 20));


    }
    @Test
    public void TritypeMCDCTest(){
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(7, 70, 2));
        assertEquals(4, tri.Triang(20, 8, 2));
        assertEquals(4, tri.Triang(2, 8, 20));

    }
}
