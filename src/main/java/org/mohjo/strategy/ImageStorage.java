package org.mohjo.strategy;

public class ImageStorage {
   /*
    private final Compressor compressor;
    private final Filter filter;
    */

    /*
        Problem with this code is; it violates the SRP(Single Responsibility Principle)
        And if in future we want to add more compressors or Filter that will make the code a mess
    */

    public void store(String filename, Compressor compressor, Filter filter){
        /*
        if(compressor.equals("jpeg")){
            System.out.println("compressing image in JPEG");
        }else if(compressor.equals("png")){
            System.out.println("compressing image in PNG");
        }

        if(Filter.equals("b&w")){
            System.out.println("adding black and white Filter");
        }else if(Filter.equals("high_contrast")){
            System.out.println("adding high contrast Filter");
        }
        */
        compressor.compress(filename);
        filter.apply(filename);

        System.out.println(filename +  " has been saved to the database.");
    }
}
