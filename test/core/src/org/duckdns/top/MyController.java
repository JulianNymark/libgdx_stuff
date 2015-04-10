package org.duckdns.top;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.ControllerListener;
import com.badlogic.gdx.controllers.PovDirection;
import com.badlogic.gdx.math.Vector3;

public class MyController implements ControllerListener {

	TestGame game;
	
	public MyController(TestGame testGame) {
		// TODO Auto-generated constructor stub
		game = testGame;
	}

	@Override
	public void connected(Controller controller) {
		// TODO Auto-generated method stub
		Gdx.app.log("gamepad:", "connected");

	}

	@Override
	public void disconnected(Controller controller) {
		// TODO Auto-generated method stub
		Gdx.app.log("gamepad", "disconnected");

	}

	@Override
	public boolean buttonDown(Controller controller, int buttonCode) {
		// TODO Auto-generated method stub
		Gdx.app.log("gamepad", buttonCode + " down");
		return false;
	}

	@Override
	public boolean buttonUp(Controller controller, int buttonCode) {
		// TODO Auto-generated method stub
		Gdx.app.log("gamepad:", buttonCode + " up");
		return false;
	}

	@Override
	public boolean axisMoved(Controller controller, int axisCode, float value) {
		// TODO Auto-generated method stub
		Gdx.app.log("gamepad:", axisCode + " axis move: " + value);
		return false;
	}

	@Override
	public boolean povMoved(Controller controller, int povCode,
			PovDirection value) {
		// TODO Auto-generated method stub
		Gdx.app.log("gamepad:", povCode + " dpad value:" + value.toString());
		return false;
	}

	@Override
	public boolean xSliderMoved(Controller controller, int sliderCode,
			boolean value) {
		// TODO Auto-generated method stub
		Gdx.app.log("gamepad:", sliderCode + " xslider value " + value);
		return false;
	}

	@Override
	public boolean ySliderMoved(Controller controller, int sliderCode,
			boolean value) {
		// TODO Auto-generated method stub
		Gdx.app.log("gamepad:", sliderCode + " yslider value " + value);
		return false;
	}

	@Override
	public boolean accelerometerMoved(Controller controller,
			int accelerometerCode, Vector3 value) {
		// TODO Auto-generated method stub
		Gdx.app.log("gamepad:", accelerometerCode + " accel value: " + value);
		return false;
	}

}
