package com.similarity.cosine;

/**
 * @author dj.lv
 * @title: Similarity
 * @date 2019-08-28  18:03
 * @description: TODO
 */
public class Similarity {

    public static final  String content1="今和爸爸一起去摘草莓";

    public static final  String content2="今和原里采草莓";


    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        double  score=CosineSimilarity.getSimilarity(content1,content2);
        long end = System.currentTimeMillis();
        System.out.println("相似度："+score+"    运行单次时间为："+(end-start));

        /*score=CosineSimilarity.getSimilarity(content1,content1);
        System.out.println("相似度："+score);*/
    }
}
