class TimerSingelton {

    private static TimerSingelton instance = null;
    private long startTime;
    private long endTime;
    private boolean calculating;



    private TimerSingelton() {
        this.calculating = false;

    }

    public static TimerSingelton getInstance() {
        if(instance==null)
        instance = new TimerSingelton();

        return instance;
    }

    public void startTimer(){
        this.calculating = true;
        startTime = System.currentTimeMillis();

    }

    public void stopTimer(){
        this.calculating = false;
        endTime = System.currentTimeMillis();

        
    }

    public long getElapsedTime() {
        if (calculating)
        return System.currentTimeMillis() - startTime;
        else 
        return endTime - startTime;

    }

}