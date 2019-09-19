import java.util.ArrayList;

public class Person {
    private String name;
    private String email;
    private String phone;  //formation required
    private ArrayList<Education> educations;
    private ArrayList<Work> works;
    private ArrayList<Skill> skills;

    public Person(){
        this.educations=new ArrayList<Education>();
        this.works=new ArrayList<Work>();
        this.skills=new ArrayList<Skill>();
    }
    public Person(String name,String email,String phone){
        this();
        this.name=name;
        this.email=email;
        this.phone=phone;
    }
    public Person(String name,String email,String phone,Skill s){
        this(name,email,phone);
        this.skills.add(s);
    }
    public Person(String name,String email,String phone,ArrayList<Education> e){
        this(name,email,phone);
        this.educations=e;
    }

    public Person(String name,String email,String phone,ArrayList<Education> e,ArrayList<Work> w){
        this(name,email,phone,e);
        this.works=w;
    }

    public Person(String name,String email,String phone,ArrayList<Education> e,ArrayList<Work> w, ArrayList<Skill> s){
        this(name,email,phone,e,w);
        this.skills=s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(Education e) {
        this.educations.add(e);
    }

    public ArrayList<Work> getWorks() {
        return works;
    }

    public void setWorks(Work w) {
        this.works.add(w);
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Skill s) {
        this.skills.add(s);
    }
}
