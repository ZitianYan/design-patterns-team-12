package command;
/**
 * A class that executes the five minute countdown from the StopWatch class
 * @author Logan Munn
 */
public class FiveMinCommand implements Command{
    private StopWatch watch;
    /**
     * A constructor that creates a new instance of the StopWatch class
     * @param watch
     */
    public FiveMinCommand(StopWatch watch){
        this.watch = watch;
    }
    /**
     * A method that executes the five minute countdown command from the StopWatch class
     */
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        watch.countDownFiveMin();
    }
    
}
