package com.varela;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }
        double areaToPaint = width * height;
        double areaBucketsCanPaint = 0;
        int buckets;
        for(buckets = 0; areaBucketsCanPaint <= areaToPaint; buckets++) {
            areaBucketsCanPaint += areaPerBucket;
        }
        System.out.println("Buckets needed = " + (buckets - extraBuckets));
        return (buckets - extraBuckets);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double areaToPaint = width * height;
        double areaBucketsCanPaint = 0;
        int buckets;
        for(buckets = 0; areaBucketsCanPaint <= areaToPaint; buckets++) {
            areaBucketsCanPaint += areaPerBucket;
        }
        System.out.println("Buckets needed = " + buckets);
        return buckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        int buckets = 1;
        double areaBucketsCanPaint = buckets * areaPerBucket;
       while(areaBucketsCanPaint < area) {
           buckets++;
           areaBucketsCanPaint = buckets * areaPerBucket;
       }
        System.out.println("Buckets needed = " + buckets);
        return buckets;
    }
}


