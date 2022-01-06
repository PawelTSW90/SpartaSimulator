package view;

public class InputHandler {
    private static int traineeUpperBound;
    private static int traineeLowerBound;
    private static double centresPerMonth;
    private static int monthsOfSimulation;
    private static int existingCentres;

    public static int getTraineeUpperBound() {
        return traineeUpperBound;
    }

    public static double getCentresPerMonth() {
        return centresPerMonth;
    }

    public static int getMonthsOfSimulation() {
        return monthsOfSimulation;
    }

    public static int getTraineeLowerBound() {
        return traineeLowerBound;
    }

    public static int getExistingCentres() {
        return existingCentres;
    }

    public static void setStartingParameters() {
        monthsOfSimulation = Config.monthsOfSimulation();
        centresPerMonth = Config.centresPerMonth();
        traineeUpperBound = Config.traineeUpperBound();
        traineeLowerBound = Config.traineeLowerBound();
        existingCentres = Config.existingCentres();
    }
}
