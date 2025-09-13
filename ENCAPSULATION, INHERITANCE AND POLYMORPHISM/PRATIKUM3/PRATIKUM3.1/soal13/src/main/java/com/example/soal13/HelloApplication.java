package com.example.soal13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application{
    private double Y = 0;
    private double DY = 2;
    private double sizeBola = 60;

    @Override
    public void start(Stage primary) {
        Canvas canvas = new Canvas(400, 300);
        StackPane root = new StackPane(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Runnable runnable = new BolaThread(gc, canvas.getHeight());
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        primary.setTitle("bola mantul");
        primary.setScene(new Scene(root));
        primary.show();
    }

    class BolaThread implements Runnable {
        private GraphicsContext gc;
        private double canvasHeight;

        public BolaThread(GraphicsContext gc, double canvasHeight) {
            this.gc = gc;
            this.canvasHeight = canvasHeight;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    break;
                }

                Y += DY;
                if (Y <= 0 || Y >= canvasHeight - sizeBola) {
                    DY *= -1;
                }

                javafx.application.Platform.runLater(() -> {
                    gc.clearRect(0, 0, 400, 300);
                    gc.setFill(Color.BLACK);
                    gc.fillOval(130, Y, sizeBola, sizeBola);
                });
            }
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
