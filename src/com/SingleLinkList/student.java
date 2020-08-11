package com.SingleLinkList;

import javax.xml.namespace.QName;

public class student
{
    private String name;
    private int rollnumber;
    private int branch_code;
    public void setName(String name)
    {
        this.name = name;
    }
    public void setRollnumber(int rollnumber){ this.rollnumber = rollnumber; }
    public void  setBranch_code(int branch_code){ this.branch_code = branch_code; }
    public String getName() { return name; }
    public int getRollnumber() { return rollnumber; }
    public int getBranch_code() { return branch_code; }
}
