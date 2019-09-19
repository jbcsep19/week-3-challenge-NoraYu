import java.util.ArrayList;

public class Recruiter{
    private ArrayList<Person> database=new ArrayList<Person>();

    public Recruiter(Person p) {
        this.database.add(p);
    }

    public ArrayList<Person> search_by_skill(String s){
        ArrayList<Person> result=new ArrayList<Person>();
        for(Person p:database){
            for(Skill skill:p.getSkills()){
                if(skill.getName().equalsIgnoreCase(s)){
                    System.out.println(p.getName()+" has this skill. That is the person you are looking for. ");
                    result.add(p);
                    break;
                } } }
        if (result.size()==0){
            System.out.println("There's no such person");}
        else{
        }
        return result;
        }

    public ArrayList<Person> getDatabase() {
        return database;
    }

    public void setDatabase(Person p) {
        this.database.add(p);
    }

    public Recruiter add_5person(){
        for(int i=0;i<5;i++){
            if(i==3){
                Skill s= new Skill("java","Fundamental");
                Person p=new Person("person "+i,"xxx@gmail.com","xxx-xxxx-xxxx",s);
                this.setDatabase(p);}
            else{
            Person p=new Person("person "+i,"xxx@gmail.com","xxx-xxxx-xxxx");
            this.setDatabase(p);
        }}
        return this;
    }
}

