package Eps;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(100));

		System.out.println(Math.random() * 10);

		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextInt(20));

	}

}
