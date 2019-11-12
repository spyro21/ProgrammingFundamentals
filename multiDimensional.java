import java.util.Scanner;


class Main {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    int ARR_HEIGHT = 4;
    int ARR_WIDTH = 4;
    int[][] arr = {{1,2,3,4}
                  ,{2,3,4,1}
                  ,{3,4,1,2}
                  ,{4,1,2,3}};

      printArr(ARR_WIDTH, ARR_HEIGHT, arr);

    userInputMethod(ARR_HEIGHT, ARR_WIDTH, arr, input);

  }

  public static void getRow(int n,int width,int[][] oArr)
  {
    System.out.print("\nthis is row #" + n +":");

    for(int col = 0; col < width;col++){
      System.out.print(" " + oArr[n][col]);
    }
  }

  public static void getCol(int n,int height,int[][] oArr)
  {
    System.out.print("\nthis is col #" + n +":");

    for(int row = 0; row < height;row++){
      System.out.print(" " + oArr[row][n]);
    }
  }

  public static int[][] changeArr(int row, int col, int n, int[][] array) {
      array[row][col] = n;
      return array;
  }

  public static void printArr(int width, int height, int[][] arr){
    for(int row = 0;row < height;row++){
      for(int col = 0; col < width;col++){
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }
  }

  public static void userInputMethod(int height,int width, int[][] arr, Scanner input)
  { 
    
    
    System.out.println("\noptions: get row, get col, input int. (1,2,3) respectively");
    int userIn = input.nextInt();

    switch(userIn){
      case 1: 
      System.out.println("what row would you like to see (0-3): "); 
      getRow(input.nextInt(), width, arr);
      break;

      case 2:
      System.out.println("what col would you like to see (0-3): "); 
      getCol(input.nextInt(), height, arr);
      break;

      case 3:
      System.out.println("row (0-3)?");
      int input_row = input.nextInt();
      System.out.println("col (0-3)?");
      int input_col = input.nextInt();

      System.out.println("what integer would you like to input");
      int input_var = input.nextInt();
      arr = changeArr(input_col,input_row,input_var,arr);
      printArr(height,width,arr);
      break;

      default: 
      System.out.println("error");
      break;
    }
    userInputMethod(height, width, arr, input);
  }
}
