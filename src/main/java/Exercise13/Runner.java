package Exercise13;

// BEGINNER, INTERMEDIATE, ADVANCED

public enum Runner {
    BEGINNER(160, Integer.MAX_VALUE),
    INTERMEDIATE(140,159),
    ADVANCED(0,139);

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    private int minTime;
    private int maxTime;


    public static Runner getFitnessLevel(int time){
        if(BEGINNER.minTime <= time){
            return BEGINNER;
        } else if (INTERMEDIATE.minTime <= time && time <= INTERMEDIATE.maxTime) {
            return INTERMEDIATE;
        }else {
            return ADVANCED;
        }
    }

    public static Runner getFitnessLevel2(int time){
        for (Runner runner : Runner.values()) {
            if(runner.minTime <= time && time <= runner.maxTime){
                return runner;
            }
        }
        return null;

    }
}
