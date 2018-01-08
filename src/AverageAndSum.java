/**
 * Created by ozakarias on 1/4/2018.
 */
public class AverageAndSum {

    String status;
    float average;
    double sum;

    public AverageAndSum(String status) {
        this.status = status;
    }

    public AverageAndSum(String status, float average, double sum) {
        this.status = status;
        this.average = average;
        this.sum = sum;
    }

    public AverageAndSum(float average, double sum) {
        this.average = average;
        this.sum = sum;
    }



}
