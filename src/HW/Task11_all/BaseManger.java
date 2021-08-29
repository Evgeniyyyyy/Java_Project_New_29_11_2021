package HW.Task11_all;

public abstract class BaseManger extends Worker implements IManager{
    private int numberOfSubordinates;

    public BaseManger(int baseSalary, String name, int salary, int numberOfSubordinates) {
        super(baseSalary, name, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    protected abstract int getValue();



        @Override
        public final int getSalary() {
            if (getNumberOfSubordinates() == 0) {
                return super.getSalary();
            } else {

                return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getValue()));
            }
        }
    }

