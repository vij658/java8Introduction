# java8Introduction
Introduction to java 8

1. public static void main -
  a. non static methods cannot be referenced from static methods.
2. for each
3. Interface default and static moethods
4. functional interfaces and lambda expressions
5. streams for bulk data
6. Java time API
7. collection API improvements
8. concurrency API improvemnt
9. Java IO improvements
10. Misc core java improvements - zip file etc..

T, E, ?, ..., in java 
 default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
