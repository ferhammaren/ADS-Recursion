import RecursiveClasses.RecursiveArrayOperations;

public class Main {
    public static void main(String[] args) {
        RecursiveArrayOperations rao=new RecursiveArrayOperations();
        rao.initializeArray();
        System.out.println(rao.arrayContents(19));
        System.out.println(rao.maxInt(19));
        System.out.println(rao.getEvenNumbers(19));
        System.out.println(rao.addEvenNumbers(19));
    }


}