package command;

public class ThirtySecCommand implements Command{
    private StopWatch watch;
    public ThirtySecCommand(StopWatch watch){
        this.watch = watch;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        watch.countDownThirtySec();
    }
    
}
