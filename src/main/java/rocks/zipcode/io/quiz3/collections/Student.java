package rocks.zipcode.io.quiz3.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private Map<Lab, LabStatus> labMap;

    public Student() {
        this(new TreeMap<>());
    }

    public Student(Map<Lab, LabStatus> labMap) {
        this.labMap = labMap;
    }

    public Lab getLab(String labName) {
        for(Lab lab : labMap.keySet()){
            if(lab.getName().equals(labName)){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if(getLab(labName) == null){
            throw new UnsupportedOperationException("Lab has not been forked!");
        }
        labMap.put(getLab(labName), labStatus);
    }

    public void forkLab(Lab lab) {
        labMap.put(lab, LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
       return labMap.get(getLab(labName));
    }

    public String toString(){
        String result = "";
        for(Map.Entry entry : labMap.entrySet()){
            result += entry.getKey().toString() + " > " + entry.getValue() + "\n";
        }
        return result.substring(0, result.length() - 1);
    }
}
