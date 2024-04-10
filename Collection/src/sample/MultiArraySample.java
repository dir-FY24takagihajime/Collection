package sample;

public class MultiArraySample {

    public static void main(String[] args) {
        var matrix = new int[3][4];//3*4の2次元配列
        
        //2次元配列へのアクセスと代入
        //以下の作業をiの要素数分繰り返す
        for(var i = 0; i < matrix.length; i++) {
          //i行の処理をjの要素数分繰り返す
            for(var j = 0; j < matrix[i].length; j++) {
              //値の代入
                matrix[i][j] = i * 2 + j + 3;
            }
        }
        
        //2次元配列の要素を表示
        for(var i = 0; i < matrix.length; i++) {
            for(var j = 0; j < matrix[i].length; j++) {
                //i行におけるjの要素への処理ごとに出力
                System.out.print(matrix[i][j] + " ");
            }
            //jの要素数分繰り返したのちi行の処理として出力
            System.out.println();  
        }
    }
}
