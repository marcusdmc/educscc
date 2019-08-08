package home;

public class FizzBuzz {
    private int fizzBuzz;

    public FizzBuzz(int fizzBuzz){
        this.fizzBuzz = fizzBuzz;
    }

    public String calculateFizzOrBuzz(){
        if (fizzBuzz == 0){
            return noFizzOrBuzz();
        }
        else if(fizzBuzz%3 + fizzBuzz%5 == 0){
            return typeFizz()+typeBuzz();
        }
        else if(fizzBuzz%3 == 0){
            return typeFizz();
        }
        else if(fizzBuzz%5 == 0){
            return typeBuzz();
        }
        else return noFizzOrBuzz();
    }

    private String typeFizz(){
        return "fizz";
    }

    private String typeBuzz(){
        return "buzz";
    }

    private String noFizzOrBuzz(){
        return String.valueOf(fizzBuzz);
    }
}
