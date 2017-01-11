package design.prototype;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * name: EngineerShallow.java
 * descirpt:  淺複製員工資料
 * Created by bryant on 2017/1/8.
 */
public class EngineerShallow extends  IEmploy implements  Cloneable{
    private  Profile profile ;
    private  BigDecimal baseSalary;
    private  BigDecimal bouns;
    private  BigDecimal overtimeSalary;

    @Override
    protected void setProfile(Profile profile){
        this.profile = profile;
    }

    @Override
    public Profile getProfile() {
        return profile;
    }

    @Override
    protected void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary ;
    }

    @Override
    protected void setBonus(BigDecimal bouns) {
        this.bouns = bouns ;
    }

    @Override
    protected void setOvertimeSalary(int hour) {
        this.overtimeSalary = (this.baseSalary.divide(new BigDecimal((240)), RoundingMode.HALF_EVEN)).
                multiply(new BigDecimal("1.33")).
                multiply(new BigDecimal(hour));

    }

    @Override
    protected BigDecimal getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    protected BigDecimal getBonus() {
        return this.bouns;
    }

    @Override
    protected BigDecimal getOvertimeSalary() {
        return this.overtimeSalary;
    }

    @Override
    protected BigDecimal getFullSalary() {
        return this.baseSalary.add(this.overtimeSalary).add(this.bouns);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        String s =  "name:"+this.profile.getName()+"," +
                    "base Salary: "+this.getBaseSalary()+"," +
                    "bonus Salary: "+this.getBonus()+"," +
                    "overtime Salary: "+this.getOvertimeSalary()+","+
                    "full Salary: "+this.getFullSalary()+"," ;

        return s;
    }

    //測試Prototype
    public  static void main(String argsp[]){
        EngineerShallow baseEngineer = new EngineerShallow() ;
        Profile baseProfile = new Profile();
        baseProfile.setName("baseProfile");
        baseEngineer.setProfile(baseProfile);
        baseEngineer.setBaseSalary(new BigDecimal(30000));
        baseEngineer.setBonus(new BigDecimal(1000));
        baseEngineer.setOvertimeSalary(40);
        System.out.println(baseEngineer.toString());
        try {
            EngineerShallow emp1 = (EngineerShallow) baseEngineer.clone() ;
            emp1.setBaseSalary(new BigDecimal(35000));
            System.out.println(emp1.toString());
            baseProfile.setName("Mary");
            System.out.println(emp1.toString());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

}
