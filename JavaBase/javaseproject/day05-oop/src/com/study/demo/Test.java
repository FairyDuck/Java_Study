package com.study.demo;

public class Test {
    static void main(String[] args) {
        // 完成案例
        // 1、设计电影类
        // 2、创建6部电影
        Movie[] movies = new Movie[6];
        movies[0] = new Movie(1, "唐顿庄园1", 20, "张三");
        movies[1] = new Movie(2, "唐顿庄园2", 20, "张三");
        movies[2] = new Movie(3, "唐顿庄园3", 20, "张三");
        movies[3] = new Movie(4, "唐顿庄园4", 20, "张三");
        movies[4] = new Movie(5, "唐顿庄园5", 20, "张三");
        movies[5] = new Movie(6, "唐顿庄园6", 20, "张三");

        // 3、创建电影操作对象，用于业务操作
        MovieOperator operator = new MovieOperator(movies);
        operator.printAllMovies();
        operator.searchMovieById();
    }
}
