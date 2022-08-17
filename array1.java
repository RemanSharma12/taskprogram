public class array1 {
    public static void main(String args[]){
        int array[] ={24,45,67,89,75,105};
        int large,i,small;
        large=array[0];
        small=array[0];
        for(i=0;i<array.length;i++) {
            if (array[i] > large) {
                large = array[i];
                if (array[i] < small)
                    small = array[i];
            }
        }
             System.out.println("largest"+large);
            System.out.println("smallest"+small);

        }
    }
