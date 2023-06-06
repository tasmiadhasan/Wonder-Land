
public class Shows {
    private String no;
    private String movie_name;
    private String movie_date;
    private String movie_time;
    Shows(String no,String movie_name, String movie_date, String movie_time){
        this.no=no;
        this.movie_name=movie_name;
        this.movie_date=movie_date;
        this.movie_time=movie_time;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_date() {
        return movie_date;
    }

    public void setMovie_date(String movie_date) {
        this.movie_date = movie_date;
    }

    public String getMovie_time() {
        return movie_time;
    }

    public void setMovie_time(String movie_time) {
        this.movie_time = movie_time;
    }

    public void show(){
        System.out.println("                                                     Movie No:"+no);
        System.out.println("                                                     Movie name:"+movie_name+"        Movie Date:"+movie_date);
        System.out.println("                                                     Movie Time:"+movie_time+"\n");
    }
}
