package library.bajji.com.bajjilib;

/**
 * Created by Bajji on 7/12/17.
 */

public class BajjiLib {
   private String name ;
   private String cin ;
   private String job ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "My  " +
                "name is '" + name + '\'' +
                ":D";
    }


}
