import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class ResumeApp {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        ArrayList<Education> educations=new ArrayList<Education>();
        ArrayList<Work> works=new ArrayList<Work>();
        ArrayList<Skill> skills=new ArrayList<Skill>();


        System.out.println("Please entry Your name");
        String name=k.nextLine();
        System.out.println("Please entry Your email");
        String email=k.nextLine();
        System.out.println("Please entry Your phone number");
        String phone=k.nextLine();

        System.out.println("Please entry \"y\" to go to educational info part. Entry \"q\" to kip this part");
        String e_check=k.nextLine();
        while(e_check.equalsIgnoreCase("y")) {
            if(e_check.equalsIgnoreCase("q")){break;}
            else{
                System.out.println("Please entry Your degree type (Associate's, Bachelor's, Master's, PhD, etc.)");
                String degree_type = k.nextLine();
                System.out.println("Please entry Your major");
                String major = k.nextLine();
                System.out.println("Please entry Your university name");
                String university_name = k.nextLine();
                System.out.println("Please entry Your graduation year");
                String graduation_year = k.nextLine();
                Education education = new Education(degree_type,major,university_name,graduation_year);
                educations.add(education);
            }
            System.out.println("Entry \"y\" to add another education info,\"q\" to add work experience part");
            e_check=k.nextLine();
        }



        System.out.println("Please entry \"y\" to start entry your work experience. Entry \"q\" to kip this part");
        e_check=k.nextLine();
        while(e_check.equalsIgnoreCase("y")) {
            if(e_check.equalsIgnoreCase("q")){break;}
            else{
                System.out.println("Please entry Your company,");
                String company = k.nextLine();
                System.out.println("Please entry Your job title");
                String job_title = k.nextLine();
                System.out.println("Please entry Your start date");
                String start_date = k.nextLine();
                System.out.println("Please entry Your end date");
                String end_date = k.nextLine();
                System.out.println("Please entry Your job description");
                String job_description = k.nextLine();
                Work work = new Work(company,job_title,start_date,end_date,job_description);
                works.add(work);
            }
            System.out.println("Entry \"y\" to add another work experience,\"q\" to go to skills part");
            e_check=k.nextLine();
        }


        System.out.println("Please entry \"y\" to start entry Your skills. Entry \"q\" to kip this part");
        e_check=k.nextLine();
        while(e_check.equalsIgnoreCase("y")) {
            if(e_check.equalsIgnoreCase("q")){break;}
            else{
                System.out.println("Please entry skill name,");
                String s_name = k.nextLine();
                System.out.println("How do you rate this skill? (Fundamental, Novice, Intermediate, Advanced, Expert)");
                String rating = k.nextLine();

                Skill skill = new Skill(s_name,rating);
                skills.add(skill);
            }
            System.out.println("Entry \"y\" to add another work experience,\"q\" when you've done");
            e_check=k.nextLine();
        }

        Person person=new Person(name,email,phone,educations,works,skills);
        Recruiter recruiter=new Recruiter(person);
        recruiter.add_5person();
        recruiter.search_by_skill("java");
        /*
        for(Person r:recruiter.getDatabase()){
            System.out.println(r.getName());
        }

         */






        System.out.println("=============================================================");
        System.out.println(person.getName());
        System.out.println(person.getEmail());
        System.out.println(person.getPhone());
        System.out.println();
        System.out.println("Education");
        System.out.println();
        for(Education e:person.getEducations()){
            System.out.println(e.getDegree_type()+" in "+e.getMajor()+",\n"+e.getUniversity_name()+", "+e.getGraduation_year());
        }
        System.out.println();
        System.out.println("Experience");
        System.out.println();
        for(Work w:person.getWorks()){
            System.out.println(w.getJob_title()+"\n "+w.getCompany()+", "+w.getStart_date()+" - "+w.getEnd_date()+"\n-Duty: "+w.getJob_description());
        }
        System.out.println();
        System.out.println("Skills");
        System.out.println();
        for(Skill s:person.getSkills()){
            System.out.println(s.getName()+", "+s.getRating());
        }




    }
}