package com.workintech.developers;

public class HRManager extends Employee{
    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }
    public void work(){
        System.out.println("HRManager starts to working");
        setSalary(getSalary() + 100);
    }
    private JuniorDeveloper[] juniorDevs;
    private MidDeveloper[] midDevs;
    private SeniorDeveloper[] seniorDevs;
    public void addEmployee(JuniorDeveloper jd){
if(jd==null)return;
 if(juniorDevs==null){
     juniorDevs=new JuniorDeveloper[1];
     juniorDevs[0]=jd;
}else {
     JuniorDeveloper[] temp = new JuniorDeveloper[juniorDevs.length + 1];
          for (int i = 0; i < juniorDevs.length; i++) {
     temp[i] = juniorDevs[i];}
     temp[juniorDevs.length] = jd;
     juniorDevs = temp;
 }
    }
    public void addEmployee(MidDeveloper md){
        if(md==null)return;
        if(midDevs==null){
            midDevs=new MidDeveloper[1];
            midDevs[0]=md;
        }else {
            MidDeveloper[] temp = new MidDeveloper[midDevs.length + 1];
            for (int i = 0; i < midDevs.length; i++) {
                temp[i] = midDevs[i];}
            temp[midDevs.length] = md;
            midDevs = temp;
        }
    }
    public void addEmployee(SeniorDeveloper sd){
        if(sd==null)return;
        if(seniorDevs==null){
            seniorDevs=new SeniorDeveloper[1];
            seniorDevs[0]=sd;
        }else {
            SeniorDeveloper[] temp = new SeniorDeveloper[seniorDevs.length + 1];
            for (int i = 0; i < seniorDevs.length; i++) {
                temp[i] = seniorDevs[i];}
            temp[seniorDevs.length] = sd;
            seniorDevs = temp;
        }
    }
}
