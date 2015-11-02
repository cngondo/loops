/**
 * Created by ngondo on 11/2/15.
 */
/*
* Class that prints number 1 - 10 using a while loop
* It makes use of a constructor 'While()' that is initially called once the
* class is invoked
* NB: Please ensure that you do not have infinite loops!! Your program will crash
* */
public class While {
    public While() {
        int y = 1;
        while (y <= 10 ){
            System.out.println(y);
//            Increments y with a stepsize of 1
            y++;
        }
    }
}
