package TrainingClasses.Generics.builtin;
public class generic{
    static class Box<T>{
        private T content;
        public void add(T item)
        {
            this.content = item;
        }
        public T getContent(){
            return this.content;
        }
    }
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.add(10);
        System.out.println(box.getContent());

        Box<String> box2 = new Box<>();
        box2.add("Hello");
        System.out.println(box2.getContent());
    }
}