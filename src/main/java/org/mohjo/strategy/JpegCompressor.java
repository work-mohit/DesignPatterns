package org.mohjo.strategy;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String filename) {
        System.out.println("Compressing image in JPEG");
    }
}
