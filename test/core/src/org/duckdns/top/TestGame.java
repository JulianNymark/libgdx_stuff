package org.duckdns.top;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

public class TestGame extends ApplicationAdapter {
	private static final String TAG = "controller";
	
	SpriteBatch batch;
	Texture img;
	private BitmapFont font12;

	private ShapeRenderer sr;

	public Vector2 joystick_dir;

	@Override
	public void create() {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(
				Gdx.files.internal("fonts/Bleeding Cowboys.ttf"));
		FreeTypeFontParameter parameter = new FreeTypeFontParameter();
		parameter.size = 40;
		font12 = generator.generateFont(parameter); // font size 12 pixels

		// font12 = new BitmapFont();
		generator.dispose();
		
		// list connected controllers
		for (Controller controller : Controllers.getControllers()) {
		    Gdx.app.log(TAG, controller.getName());
		    controller.addListener(new MyController(this)); // all controllers same listener
		}
		
		sr = new ShapeRenderer();
		
		joystick_dir = new Vector2();
	}

	@Override
	public void render() {
		float dt = Gdx.graphics.getDeltaTime();
		batch.getProjectionMatrix().setToOrtho2D(0, 0, Gdx.graphics.getWidth(),
				Gdx.graphics.getHeight());

		// clear screen
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();

		batch.draw(img, Gdx.graphics.getWidth() / 2 - img.getWidth() / 2,
				Gdx.graphics.getHeight() / 2 - img.getHeight() / 2);

		font12.draw(batch, "Bleeding Cowboys XD", 100, 100);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
