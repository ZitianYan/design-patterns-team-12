package command;

public class FiveMinCommand implements Command{
    private StopWatch watch;
    public FiveMinCommand(StopWatch watch){
        this.watch = watch;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        watch.countDownFiveMin();
    }
    
}
