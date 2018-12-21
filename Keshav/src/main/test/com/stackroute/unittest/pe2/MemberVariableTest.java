package com.stackroute.unittest.pe1;
import org.junit.Test;

import org.junit.Before;

import static org.junit.Assert.*;

public class MemberVariableTest {
    private MemberVariable memberVarObjOne;
    private Member memberVarObjTwo;

    @Before
    public void setUp(){
        memberVarObjOne=new MemberVariable();
        memberVarObjTwo=new Member();
    }

    @Test
    public void memberTestOne(){
        memberVarObjTwo.setName("keshav");
        memberVarObjTwo.setAge(24);
        memberVarObjTwo.setSalary(1000.00);
        assertEquals(memberVarObjTwo.toString(),memberVarObjOne.displayMembers().toString());
    }

}
