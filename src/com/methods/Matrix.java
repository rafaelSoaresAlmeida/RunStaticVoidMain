package com.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Matrix {
    private Integer n;
    private int matrix[][];

    public Matrix(int matrix[][], Integer n){
        this.n = n;
        this.matrix = matrix;
    }

    public Integer sumRightDiagonal() {
        final List<Integer> nuns = new ArrayList<Integer>();
        IntStream.range(0, n).forEach(index -> {
            nuns.add(matrix[index][(n-1)-index]);
        });
        return nuns.stream().reduce(0, Integer::sum);
    }

    public Integer sumLeftDiagonal() {
        final List<Integer> nuns = new ArrayList<Integer>();
        IntStream.range(0, n).forEach(index -> {
            nuns.add(matrix[index][index]);
        });
        return nuns.stream().reduce(0, Integer::sum);
    }

    public int diffDiagonal(){
        return (sumLeftDiagonal() - sumRightDiagonal());
    }
}
