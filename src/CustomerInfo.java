public class CustomerInfo extends Shows{
    private String name;
    private String phn;
    private String address;



    public CustomerInfo( String name, String phn, String address,String no,String movie_name, String movie_date, String movie_time){
        super(no,movie_name,movie_date,movie_time);
        this.name = name;
        this.phn = phn;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void bill(){
        System.out.println("                                                     Here is your Bill......");
        System.out.println("                                                     --------------------------------------------------");
        System.out.println("                                                     Name:"+name+"             "+"Phone:"+phn);
        System.out.println("                                                     Address:"+address);
        super.show();
    }

}
