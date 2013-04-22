package com.bm.jeu.guitest;

import java.util.HashMap;
import java.util.Map;

import com.bm.jeu.common.ef.Component;

public class StateMapperComponent extends Component {
	
	
	private Map<Integer, Integer> stateMapper;

	public StateMapperComponent() {
		stateMapper = new HashMap<Integer, Integer>();
	}
	
	public int getState(Integer action){
		return stateMapper.get(action);
	}
	
	public void addMapping(Integer action, Integer state){
		stateMapper.put(action, state);
	}

}
