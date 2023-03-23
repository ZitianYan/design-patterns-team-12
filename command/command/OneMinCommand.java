package command;
/**
 * A class that executes the one minute countdown from the StopWatch class
 * @author Logan Munn
 */
public class OneMinCommand implements Command{
    private StopWatch watch;
    /**
     * A constructor that creates a new instance of the StopWatch class
     * @param watch
     */
    public  OneMinCommand(StopWatch watch){
        this.watch = watch;
    }
    /**
     * A method that executes the one minute countdown command from the StopWatch class
     */
    public void execute() {
        watch.countDownOneMin();
	}
}
