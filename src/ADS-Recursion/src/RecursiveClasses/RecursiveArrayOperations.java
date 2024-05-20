package RecursiveClasses;

import java.util.Random;

public class RecursiveArrayOperations {
    private int[] elementList;
    private int mayor=0;
    private int evenSum=0;
    private String arrayContents="";
    private String evenNumbersList="";
    private String linearSearchResult="";
    public RecursiveArrayOperations(){
        elementList= new int[20];

    }
    public void initializeArray(){
        Random r=new Random();
        for (int i=0;i<=19;i++){
            elementList[i]=r.nextInt(100);
        }
    }
    public int maxInt(int arraySize) {
        if (arraySize != 0&&arraySize<= elementList.length) {
            if (elementList[arraySize] > mayor) {
                mayor = elementList[arraySize];
            }
            return maxInt(arraySize - 1);
        } else {
            return mayor;
        }
    }

    public int addEvenNumbers(int arraySize){
        if (arraySize != 0&&arraySize<= elementList.length) {
            if(elementList[arraySize]%2==0){
                evenSum=evenSum+elementList[arraySize];
            }
            return addEvenNumbers(arraySize-1);
        }else{
            return evenSum;
        }
    }

    public String arrayContents(int arraySize){
        if (arraySize != 0&&arraySize<= elementList.length) {
            arrayContents=arrayContents+elementList[arraySize]+',';
            return arrayContents(arraySize-1);
        }
        else{
            return arrayContents;
        }
    }

    public String getEvenNumbers(int arraySize){
        if (arraySize != 0&&arraySize<= elementList.length) {
            if(elementList[arraySize]%2==0){
                evenNumbersList=evenNumbersList+elementList[arraySize]+',';
            }
            return getEvenNumbers(arraySize-1);
        }else{
            return evenNumbersList;
        }
    }
    public String linearSearch(int arraySize, int searchElement){
        if (arraySize != 0&&arraySize<= elementList.length) {
            if(elementList[arraySize]==searchElement){
                linearSearchResult="El elemento "+searchElement+" se encuentra en la posicion "+arraySize;
                return linearSearch(0,searchElement);
            }else{
                return linearSearch(arraySize-1,searchElement);
            }
        }else{
            return linearSearchResult;
        }
    }

}
