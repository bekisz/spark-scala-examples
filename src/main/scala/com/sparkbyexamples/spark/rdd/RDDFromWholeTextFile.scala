package com.sparkbyexamples.spark.rdd

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.SparkSession

object RDDFromWholeTextFile {

  def main(args:Array[String]): Unit = {

    val spark:SparkSession = SparkSession.builder()

        .getOrCreate()
    val sc = spark.sparkContext

    val rdd = sc.wholeTextFiles("C://000_Projects/opt/BigData/alice.txt")
    rdd.foreach(a=>println(a._1+"---->"+a._2))

  }
}
