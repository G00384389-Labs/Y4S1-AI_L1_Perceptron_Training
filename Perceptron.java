import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Perceptron {
    private float[] weights;
    private float theta = 0.2f;
    
    public Perceptron(int connection){
        weights = new float[connection];

        var rand = ThreadLocalRandom.current();
        for (int i = 0; i < weights.length; i++) {
            // weights[i] = rand.nextFloat(-1.0f, 1.0f);
            weights[i] = rand.nextFloat() * 2 - 1;
        }

        System.out.println(this);


    }

    public float[] getWeights(){
        return weights;
    }

    public int activate(float[] inputs){
        float sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += inputs[i]*weights[i];
        }
        return sum - theta >= 0 ? 1 : 0;
    }

    public String toString(){
        return "Perceptron (weights= "+ Arrays.toString(weights)+")";
    }

    public float alpha = 0.1f;
    public void train(float[][] inputs, float[] expected, int max_epochs){
        boolean hasError = true;
        float error = 1000;
        int epoch = 0;

        for (; epoch < max_epochs && hasError; epoch++){
            hasError = false;

            for(int row = 0; row < inputs.length; row++){
                int actual = activate(inputs[row]);
                error = expected[row] - actual;
                if(error != 0) hasError = true;

                for(int i = 0; i < weights.length; i++){
                    weights[i] += alpha*error*inputs[row][i];
                }
            }
        }

        System.out.println("Training Complete in "+ epoch + " epochs");
        System.out.println(this);


    }


}