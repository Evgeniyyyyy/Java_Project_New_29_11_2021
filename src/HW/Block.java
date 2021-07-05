package HW;

public class Block {
    /*  String str;
      int rs;*/
    int width;
    int length;
    int height;


    //  int surfaceArea;

    /*nt[] arr = new int[]{2, 2, 2};
        Block b = new Block(2, 2, 2);
        Block(int Width, int Length, int Height)*/
    Block(int[] arr) {
        width = arr[0];
        length = arr[1];
        height = arr[2];
    }



    int getWidth() {
        return width;
    }

    int getLength() {
        return length;
    }

    int getHeight() {
        return height;
    }

    int getVolume() {
        return (width * length * height);
    }

    int getSurfaceArea() {
        return (width * length * 2 + width * height * 2 +  + length * height * 2);
    }
}


