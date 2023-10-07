public class BoundedWaitList<T> extends WaitList<T>{
    int Capacity;
    public BoundedWaitList(int capacity){
        Capacity = capacity;
    }

    public int getCapacity(){
        return getCapacity();
    }

    @Override
    public void add(T element){
        if(Content.size() < Capacity){
            Content.add(element);
        }
    }

    public String toString(T element){
        var str = new StringBuilder();
        for (var elemnt : Content) {
            str.append(elemnt.toString());
        }
        return str + " capacity: " + Capacity;
    }
}
