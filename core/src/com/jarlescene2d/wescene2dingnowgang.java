package com.jarlescene2d;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.jarlescene2d.Cards.Deck;

public class wescene2dingnowgang extends ApplicationAdapter {
	private Stage stage;
	private Skin skin;
	OrthographicCamera camera;
	ExtendViewport viewport;

	@Override
	public void create () {

		// Main stage
		camera = new OrthographicCamera();
		viewport = new ExtendViewport(1200, 1200, camera);
		stage = new Stage(viewport);

		// Main skin
		skin = new Skin(Gdx.files.internal("rusty-robot/skin/rusty-robot-ui.json"));

		// Main table
		Table game = new Table();
		game.setFillParent(true);
		game.setDebug(true);
		game.top().left();
		//game.defaults().left();

		// Create board
		Board board = new Board(90, 10, 10);
		board.setDebug(true);
		board.padTop(30);
		//board.top().left();
		//board.setFillParent(true);
		//Tile tile = new Tile();


		// Create cards
		Deck deck = new Deck(skin);

		game.add(board).expandX().top().center();
		game.row();
		game.add(deck).bottom().center();

		stage.addActor(game);

		// CARD
		//Card actor = new Card();
		//stage.addActor(actor);

		// BASE ASSET TEST
		//stage.addActor(new BaseAsset());

		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.57f, 0.77f, 0.85f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();

	}

	@Override
	public void resize(int width, int height) {
		viewport.update(width, height, true);

	}

}
