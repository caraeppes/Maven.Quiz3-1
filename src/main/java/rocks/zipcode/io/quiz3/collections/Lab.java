package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable{
    private String name;
    private LabStatus labStatus;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        name = labName;
        labStatus = LabStatus.INCOMPLETE;
    }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(o.toString());
    }

    public String toString(){
        return name;
    }

}
