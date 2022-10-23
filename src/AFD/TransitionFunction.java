/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AFD;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author joseg
 */
public class TransitionFunction {
     private final Map<Integer, Map<Character, Integer>> function = 
          new HashMap<>();

    public void setTransition(Integer startState, 
                              Integer goalState,
                              char character) {
        function.computeIfAbsent(startState, k -> new HashMap<>()).put(character, goalState);
    }

    public Integer process(Integer startState, char character) {
        return function.getOrDefault(startState, Collections.emptyMap()).get(character);
    }
}
