package com.bm.jeu.common.net;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import com.bm.jeu.common.ef.Component;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;

public class JSONExclusionStrategy implements ExclusionStrategy {
	
	private static HashMap<Class<?>,String[]> excludedFields;  
	
	public JSONExclusionStrategy(){  
        excludedFields = new HashMap<>();  
        //class maps to array of fields to skip in class  
        excludedFields.put(Component.class, new String[]{"networkFlag"});  
        excludedFields.put(Component.class, new String[]{"lock"});  
          
        //all arrays of fields are sorted lexically for faster lookup  
        for(Entry<Class<?>,String[]> entry : excludedFields.entrySet()){  
            Arrays.sort(entry.getValue());  
        }  
    }  

	 public boolean shouldSkipClass(Class<?> arg0) {  
         return false;  
     }  

     public boolean shouldSkipField(FieldAttributes fieldAttributes) {  
         if(excludedFields.containsKey(fieldAttributes.getDeclaredClass())){  
             return Arrays.binarySearch(excludedFields.get(fieldAttributes.getDeclaredClass()),fieldAttributes.getName())>=0;   
         }  
         return false;  
     } 

}
