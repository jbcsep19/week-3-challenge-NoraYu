public class Education {
    private String degree_type;
    private String major;
    private String university_name;
    private String graduation_year;


    public Education(String degree_type,String major,String university_name,String graduation_year){
        this.degree_type=degree_type;
        this.major=major;
        this.university_name=university_name;
        this.graduation_year=graduation_year;
    }

    public String getDegree_type() {
        return degree_type;
    }

    public void setDegree_type(String degree_type) {
        this.degree_type = degree_type;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }

    public String getGraduation_year() {
        return graduation_year;
    }

    public void setGraduation_year(String graduation_year) {
        this.graduation_year = graduation_year;
    }
}
