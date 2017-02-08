/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfidf.kmeans;

import java.util.List;

/**
 *
 * @author hammadakhan
 */
class TFIDFClass {
    
    public TFIDFClass(){
    
    }
    
    public double tf(List<String> doc, String term) {
        double result = 0;
        
        for (String word : doc) {
           if (term.equalsIgnoreCase(word))
                  result++;
           }
        //System.out.println(result);
        return result;// / doc.size();
    }
    
    public double idf(List<List<String>> docs, String term) {
        double n = 0;
        for (List<String> doc : docs) {
            for (String word : doc) {
                if (term.equalsIgnoreCase(word)) {
                    n++;
                    break;
                }
            }
        }
        //System.out.println(Math.log(docs.size() / n));
        return Math.log(docs.size() / n)/Math.log(2);
    }
    
    public double tfIdf(List<String> doc, List<List<String>> docs, String term) {
        return tf(doc, term) * idf(docs, term);
    }
    
}
