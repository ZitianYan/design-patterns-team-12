package command;
/**
 * A class that executes the thirty second countdown from the StopWatch class
 * @author Logan Munn
 */
public class ThirtySecCommand implements Command{
    private StopWatch watch;
    /**
     * A constructor that creates a new instance of the StopWatch class
     * @param watch
     */
    public ThirtySecCommand(StopWatch watch){
        this.watch = watch;
    }
    /**
     * A method that executes the thirty second countdown command from the StopWatch class
     */
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        watch.countDownThirtySec();
    }
    
}
