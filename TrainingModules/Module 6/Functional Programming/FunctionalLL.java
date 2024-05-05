public class FunctionalLL<E> {
    public static class NoValueException extends RuntimeException {
        public NoValueException(String message) {
            super(message);
        }
    }

    private E head;
    private FunctionalLL<E> tail;

    private FunctionalLL() {}

    private FunctionalLL(E head, FunctionalLL<E> tail) {
        this.head = head;
        this.tail = tail;
    }

    public E head() {
        return head;
    }

    public FunctionalLL<E> tail() {
        return tail;
    }

    public FunctionalLL<E> add(E value) {
        return new FunctionalLL<>(value, this);
    }

    public static final class EmptyList<E> extends FunctionalLL<E> {
        @Override
        public E head() {
            throw new NoValueException("Empty list");
        }

        @Override
        public FunctionalLL<E> tail() {
            throw new NoValueException("Empty list");
        }
    }

    public static <E> FunctionalLL<E> emptyList() {
        return new EmptyList<>();
    }

    public static void main(String[] args) {
        FunctionalLL<Integer> list = FunctionalLL.<Integer>emptyList().add(5).add(1).add(2).add(3);
        while (!(list instanceof EmptyList)) {
            System.out.println(list.head());
            list = list.tail();
        }
    }
}
