package com.bm.jeu.guitest;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.bm.jeu.common.ef.Component;

public class StaticGraphicComponent extends Component implements Drawable{
	
	private TextureRegion staticGraphic;

	public StaticGraphicComponent() {
		staticGraphic = null;
	}
	
	public StaticGraphicComponent(TextureRegion staticGraphic) {
		this.staticGraphic = staticGraphic;
	}

	public void setStaticGraphic(TextureRegion region){
		staticGraphic = region;
	}

	public TextureRegion getStaticGraphic(){
		return staticGraphic;
	}

	@Override
	public void draw(SpriteBatch batch, float posX, float posY, float width, float height) {
		batch.draw(staticGraphic,posX, posY, width, height);
	}
	
	public void draw(SpriteBatch batch, float posX, float posY){
		draw(batch, posX, posY, staticGraphic.getRegionWidth(), staticGraphic.getRegionHeight());
	}
}
