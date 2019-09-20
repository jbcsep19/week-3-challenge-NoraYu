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

    public void change_name(String n){
        this.name=n;
    }
    public void change_email(String e){
        this.email=e;
    }
    public void change_phone(String p){
        this.phone=p;
    }

    public void print_resume(){
        System.out.println("=============================================================");
        System.out.println(this.getName());
        System.out.println(this.getEmail());
        System.out.println(this.getPhone());
        System.out.println();
        System.out.println("Education");
        System.out.println();
        for(Education e:this.getEducations()){
            System.out.println(e.getDegree_type()+" in "+e.getMajor()+",\n"+e.getUniversity_name()+", "+e.getGraduation_year());
            System.out.println();
        }
        System.out.println();
        System.out.println("Experience");
        System.out.println();
        for(Work w:this.getWorks()){
            System.out.println(w.getJob_title()+"\n "+w.getCompany()+", "+w.getStart_date()+" - "+w.getEnd_date());
            for(String jb:w.getCompany_duty().get(w.getCompany())){
                System.out.println("-Duty: "+jb);
            }
            System.out.println();}
        System.out.println();
        System.out.println("Skills");
        System.out.println();
        for(Skill s:this.getSkills()){
            System.out.println(s.getName()+", "+s.getRating());
            System.out.println();
        }

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
