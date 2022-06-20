package prob3;

@FunctionalInterface
public interface PredicateWithException<T> {
	boolean test(T t) throws Exception;
}
