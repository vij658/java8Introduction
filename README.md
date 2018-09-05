# java8Introduction
Introduction to java 8

https://www.youtube.com/playlist?list=PLSg8jHkYTg9H70Okvb5M7iWAk3EPpTn_q
1. lambda expression -- no return type, no name, no access modifier.
2. lambda can be assigned to a functional interface, invocation is to the functional interface's abstract method but you implement using lambda - it is an anonymous method.
3. default method is always public, you can override default method in impl.
4. diamond problem - when you inherit two classes and if it has the same method you dont which one will be invoked.
  java 8 - when two interfaces are implemented by a class and those two have the same default methods, provide a override otherwise it will lead to daimond problem and compilation error.
5. Predicate<T> , T can be of any datatype. it is a funcational interface, takes in a type and returns boolean.
6. you can pass predicate as function to a method - method(p,array) --> method(Predicate p, array)
7. joins in predicate or, and, negate. method(p.negate(),array), method(p1.and(p2),array), method(p1.or(p2),array)





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
T is used for any Type of data 
 default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
