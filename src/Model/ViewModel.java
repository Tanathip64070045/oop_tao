package Model;

import java.io.Serializable;

public class ViewModel implements Serializable{
    private String fName;

    public ViewModel() {
        this.fName = "demo.png";
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
        System.err.println(fName);
    }

    public ViewModel(String fName) {
        this.fName = fName;
    }

}
