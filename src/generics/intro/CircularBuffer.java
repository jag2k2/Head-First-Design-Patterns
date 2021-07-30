package generics.intro;

public class CircularBuffer<T> {

    private final T[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public CircularBuffer(int size){
        this.buffer = (T[]) new Object[size];
    }

    public boolean push(T value){
        if (buffer[writeCursor] != null) {
            return false;
        }

        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public T pop(){
        T value = buffer[readCursor];
        if (value != null){
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return value;
    }

    private int next(int index){
        return(index + 1) % buffer.length;
    }
}