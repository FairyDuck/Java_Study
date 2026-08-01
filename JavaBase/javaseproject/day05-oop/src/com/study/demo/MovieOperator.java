package com.study.demo;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies() {
        System.out.println("所有电影信息");
        for (int i = 0; i < movies.length; i++) {
            System.out.println("电影名" + movies[i].getName());
            System.out.println("主演" + movies[i].getActor());
            System.out.println("价格" + movies[i].getPrice());
        }
    }

    public void searchMovieById() {
        System.out.println("请输入要查询的id");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            if (id == movies[i].getId()) {
                System.out.println("电影名" + movies[i].getName());
                System.out.println("主演" + movies[i].getActor());
                System.out.println("价格" + movies[i].getPrice());
                return;
            }
        }
        System.out.println("没有此id");
    }
}
