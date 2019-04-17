package bokovelsys.servises;

import bokovelsys.cards.SkiPass;
import bokovelsys.cards.SkiPassType;

import java.util.HashMap;
import java.util.Map;

public class Turnstile {
    private Map<SkiPassType, Integer> counterPassed = new HashMap<>();
    private Map<SkiPassType, Integer> counterCanceled = new HashMap<>();


    public Turnstile() {


        for (SkiPassType SkiPassType : SkiPassType.values()) {
     counterPassed.put(skiPassType, 0);
        }

        for (SkiPassType SkiPassType : SkiPassType.values()) {
            counterCanceled.put(skiPassType, 0);
        }
    }

    public Map<SkiPassType, Integer> getCounterPassed() {
        return counterPassed;
    }

    public void setCounterPassed(Map<SkiPassType, Integer> counterPassed) {
        this.counterPassed = counterPassed;
    }

    public Map<SkiPassType, Integer> getCounterCanceled() {
        return counterCanceled;
    }

    public void setCounterCanceled(Map<SkiPassType, Integer> counterCanceled) {
        this.counterCanceled = counterCanceled;
    }

    public void getstat() {
        //TODO fix this
        System.out.println("Total passed: " + counterPassed.size() + " . " + "Total canceled:" + counterCanceled.size());
    }

    public void getstat(SkiPassType skiPassType) {

        switch (skiPassType) {
            case SEASON:
                System.out.println("Total passed: " + counterPassed.get(skiPassType) + " . " + "Total canceled:" + counterCanceled.get(skiPassType));
                break;

            case DAY_LIMIT:
                System.out.println("Total passed Daylimit Skipass: " + counterPassed.get(skiPassType) + " . " + "Total canceled:" + counterPassed.get(skiPassType));
                break;

            case HALF_DAY_AFTERNOON:
                System.out.println("Total passed HALF_DAY_AFTERNOON Skipass: " + counterPassed.get(skiPassType) + " . " + "Total canceled HALF_DAY_AFTERNOON:" + counterPassed.get(skiPassType));
                break;

            case HOLIDAY_DAY_LIMIT:
                System.out.println("Total passed HOLIDAY_DAY_LIMIT Skipass: " + counterPassed.get(skiPassType) + " . " + "Total canceled HOLIDAY_DAY_LIMIT:" + counterPassed.get(skiPassType));
                break;

            case HOLIDAY_HALF_DAY_MORNING:
                System.out.println("Total passed HOLIDAY_HALF_DAY_MORNING Skipass: " + counterPassed.get(skiPassType) + " . " + "Total canceled HOLIDAY_HALF_DAY_MORNING:" + counterPassed.get(skiPassType));
                break;
        }
    }
}
