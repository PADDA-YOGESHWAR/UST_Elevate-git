
public class userGeneric {
    static class pair<T,U>{
        private T first;
        private U second;
        public pair(T first,U second){
            this.first=first;
            this.second=second;
        }
        public T getFirst() {
            return first;
        }
        public U getSecond() {
            return second;
        }
        public void setFirst(T first) {
            this.first = first;
        }
        public void setSecond(U second) {
            this.second = second;
        }

        public String toString(){
            return first+" "+second;
        }
    }
    public static void main(String[] args) {
        pair<String,Integer> pair1 = new pair<>("java",17);
        pair<Double,String> pair2 = new pair<>(3.14,"Pi");
        
        pair1.setFirst("c++");
        pair2.setFirst(3.14726);
        
        System.out.println(pair1.toString());
        System.out.println(pair2.toString());
        
    }
}
