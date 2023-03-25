public class Telephone {
    //variables
    private String areaCode;
    private int number;
    static int numberOfTelephoneObject = 0;

    //constructor
    public Telephone(String areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    //accessor and mutator
    public String areaCode() {
        return areaCode;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    public int number() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumberOfTelephoneObject(){ return numberOfTelephoneObject;}

    //method
    public String makeFullNumber(){
        return areaCode + "-" + number;
    }
    public static void main(String[] args) {
        Telephone[] telephoneNumber = new Telephone[5];

        int num = 79676300;
        for (int i = 0; i < telephoneNumber.length; i++) {
            telephoneNumber[i] = new Telephone("03", num++);
        }
        for (int i = 0; i < telephoneNumber.length; i++) {
            System.out.println(telephoneNumber[i].makeFullNumber());
        }
        System.out.println("number of telephone objects: " + telephoneNumber[0].getNumberOfTelephoneObject());
    }
}

