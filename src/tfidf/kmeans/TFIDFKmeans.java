/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfidf.kmeans;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hammadakhan
 */
public class TFIDFKmeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> doc1 = Arrays.asList("conflict", "conflict", "conflict", "conflict", "employment", "employment", "justice", "justice", "minister", "minister", "minister", "opinion", "veil");
        List<String> doc2 = Arrays.asList("employment", "employment", "employment", "employment", "employment", "humanitarian", "humanitarian", "minister", "minister", "president", "resolution");
        List<String> doc3 = Arrays.asList("conflict", "conflict", "justice", "justice", "justice", "minister", "minister", "opinion", "president", "president", "resolution");
        List<String> doc4 = Arrays.asList("champion", "champion", "champion", "fan", "fan", "fan", "justice", "minister", "president", "show", "song");
        List<String> doc5 = Arrays.asList("champion", "champion", "conflict", "conflict", "humanitarian", "league", "stadium", "stadium", "stadium", "stadium", "stadium");
        List<String> doc6 = Arrays.asList("award", "fan", "league", "league", "stadium", "stadium", "supporter", "supporter", "supporter");
        List<String> doc7 = Arrays.asList("collection", "collection", "fan", "humanitarian", "opinion", "show", "show", "song", "song", "song");
        List<String> doc8 = Arrays.asList("award", "award", "director", "director", "director", "fan", "employment", "employment", "president", "supporter");
        List<String> doc9 = Arrays.asList("champion", "collection", "conflict", "minister", "show", "show", "show", "stadium", "stadium", "stadium");
        List<String> doc10 = Arrays.asList("award", "award", "collection", "collection", "collection", "collection", "employment", "justice", "president", "veil");
        List<String> doc11 = Arrays.asList("collection", "collection", "director", "fan", "minister", "show", "show", "song", "vogue", "vogue", "vogue");
        List<String> doc12 = Arrays.asList("collection", "collection", "collection", "collection", "collection", "director", "show", "show", "show", "show", "vogue");

        List<List<String>> documents = Arrays.asList(doc1, doc2, doc3, doc4, doc5, doc6, doc7, doc8, doc9, doc10, doc11, doc12);

        TFIDFClass tfIdf = new TFIDFClass();
        
        String prevWord = "";

        for (List<String> currDoc : documents) {
            //System.out.println("doc:"+)
            //System.out.println("Current Document: "+currDoc);
            for (String word : currDoc) {

                if (!word.equalsIgnoreCase(prevWord)) {
                    System.out.print(word+":"+tfIdf.tfIdf(currDoc, documents, word)+", ");
                }
                prevWord = word;
            }
            
            System.out.println();
        }
    }

}
