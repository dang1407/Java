public class App {
    public static void main(String[] args) throws Exception {
        Array_example array_example = new Array_example();
        System.out.println(array_example.toString());
    }
}

class Array_example {
    public int[] arr = new int[5];

    public Array_example(){
        for(int i=0;i<5;i++){
            arr[i] = i;
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            res = res + arr[i] + " ";
        }
        System.out.println("");
        return res;
    }
}