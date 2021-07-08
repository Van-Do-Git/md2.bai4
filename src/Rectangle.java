public class Rectangle {
    int height;
    int width;
    Rectangle(){
        height = 1;
        width = 1;
    }
    Rectangle(int newHeight, int newWidth){
        height = newHeight;
        width = newWidth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea(){
        return height*width;
    }
}
