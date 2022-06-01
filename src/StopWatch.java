public class StopWatch {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println("DEMO" + i);
        }

        //Calculation for elapsed time
        long endTime = System.currentTimeMillis();
        long elapseTime = endTime - startTime;

        //Print the execution time taken
        System.out.println("Execution of program time " + elapseTime);
    }
}
