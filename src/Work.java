public class Work {
    private String company;
    private String job_title;
    private String start_date;
    private String end_date;
    private String job_description;

    public Work(String company,String job_title,String start_date,String end_date,String job_description){
        this.company=company;
        this.job_title=job_title;
        this.start_date=start_date;
        this.end_date=end_date;
        this.job_description=job_description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }
}
