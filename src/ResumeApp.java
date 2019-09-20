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

        System.out.println("Please entry \"y\" to go to educational info part. Entry \"q\" to skip this part");
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
            System.out.println();
            e_check=k.nextLine();
        }



        System.out.println("Please entry \"y\" to start entry your work experience. Entry \"q\" to skip this part");
        e_check=k.nextLine();
        while(e_check.equalsIgnoreCase("y")) {
            if(e_check.equalsIgnoreCase("q")){break;}
            else{
                ArrayList<String>job_description=new ArrayList<String>();
                System.out.println("Please entry Your company,");
                String company = k.nextLine();
                System.out.println("Please entry Your job title");
                String job_title = k.nextLine();
                System.out.println("Please entry Your start date");
                String start_date = k.nextLine();
                System.out.println("Please entry Your end date");
                String end_date = k.nextLine();
                System.out.println("Please entry Your job description");
                String job_des= k.nextLine();
                job_description.add(job_des);
                do{

                    System.out.println("Entry \"y\" to add another job description,\"q\" when you finish this part");

                    job_des= k.nextLine();
                    if(!job_des.equalsIgnoreCase("y")&&!job_des.equalsIgnoreCase("q")){
                    job_description.add(job_des);}}
                while (job_des.equalsIgnoreCase("y"));

                Work work = new Work(company,job_title,start_date,end_date,job_description);
                works.add(work);
            }
            System.out.println("Entry \"y\" to add another work experience,\"q\" to go to skills part");
            e_check=k.nextLine();
        }


        System.out.println("Please entry \"y\" to start entry Your skills. Entry \"q\" to skip this part");
        e_check=k.nextLine();
        while(e_check.equalsIgnoreCase("y")) {
            if(e_check.equalsIgnoreCase("q")){break;}
            else{
                System.out.println("Please entry skill name,");
                String s_name = k.nextLine();
                System.out.println("How do you rate this skill? (Fundamental, Novice, Intermediate, Advanced, Expert)");
                String rating = k.nextLine();

                Skill skill = new Skill(s_name,rating);
                System.out.println();
                skills.add(skill);
            }
            System.out.println("Entry \"y\" to add another skill,\"q\" when you've done");
            e_check=k.nextLine();
        }
        System.out.println();

        Person person=new Person(name,email,phone,educations,works,skills);
        Recruiter recruiter=new Recruiter(person);
        recruiter.add_5person();
        recruiter.search_by_skill("java");

        person.print_resume();

        System.out.println("Do you want to change your name? Entry new name or \"n\" to make no change.");
        e_check=k.nextLine();
        if(!e_check.equalsIgnoreCase("n")){
            person.change_name(e_check);
        }
        System.out.println("Do you want to change your email? Entry new email or \"n\" to make no change.");
        e_check=k.nextLine();
        if(!e_check.equalsIgnoreCase("n")){
            person.change_email(e_check);
        }
        System.out.println("Do you want to change your phone number? Entry new phone number or \"n\" to make no change.");
        e_check=k.nextLine();
        if(!e_check.equalsIgnoreCase("n")){
            person.change_phone(e_check);
        }

        person.print_resume();
    }
}