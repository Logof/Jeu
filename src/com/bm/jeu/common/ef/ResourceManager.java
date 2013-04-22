package com.bm.jeu.common.ef;

public class ResourceManager {
	
	private static ResourceLoader loader_;
	
	/* Here is the instance of the Singleton */
	private static ResourceManager instance_;

	/* Need the following object to synchronize */
	/* a block */
	private static Object syncObject_ = new Object();


	// Prevent direct access to the constructor
	private ResourceManager() {
		super();
		loader_ = null;
	}

	public static ResourceManager getinstance() {

		/*
		 * in a non-thread-safe version of a Singleton the following line could
		 * be executed, and the thread could be immediately swapped out
		 */
		if (instance_ == null) {

			synchronized (syncObject_) {

				if (instance_ == null) {
					instance_ = new ResourceManager();
				}
			}
		}
		return instance_;
	}
	
	public void load(Entity entity){
		
		loader_.loadEntity(entity);
	}
	
	public void save(Entity entity){
		
	}
	
	public void initialize(ResourceLoader loader){
		loader_ = loader;
		loader_.loadWorkingEnvironment();
	}
	
	//TODO: how the hell am i supposed to design this?

}
