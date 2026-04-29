import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;

public class Main {
    public static void main(String[] args) {
        HRManager hr=new HRManager(4,"Meryem",800);
        JuniorDeveloper jd=new JuniorDeveloper(1,"Ali",500);
        MidDeveloper md=new MidDeveloper(2,"Veli",600);
        SeniorDeveloper sd=new SeniorDeveloper(3,"Isa",700);
        hr.addEmployee(jd);
        hr.addEmployee(md);
        hr.addEmployee(sd);
            }

}