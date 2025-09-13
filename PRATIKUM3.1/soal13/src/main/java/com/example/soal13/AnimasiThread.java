package com.example.soal13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AnimasiThread extends Application {
    private double y = 0;
    private double dy = 2;
    private final double sizeBola = 60;

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Thread thread = new BallThread(gc, canvas.getHeight());
        thread.setDaemon(true);
        thread.start();

        StackPane pane = new StackPane(canvas);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Bola Memantul - Thread");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class BallThread extends Thread {
        private GraphicsContext gc;
        private double canvasHeight;

        public BallThread(GraphicsContext gc, double canvasHeight) {
            this.gc = gc;
            this.canvasHeight = canvasHeight;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(3);
                }
                catch (InterruptedException e) {
                    break;
                }

                y += dy;
                if (y <= 0 || y >= canvasHeight - sizeBola) {
                    dy *= -1;
                }

                javafx.application.Platform.runLater(() -> {
                    gc.clearRect(0, 0, 400, 300);
                    gc.setFill(Color.RED);
                    gc.fillOval(170, y, sizeBola, sizeBola);
                });
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
