package com.rpg.thare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rpg.thare.spells.mage;
@SpringBootApplication
public class ThareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThareApplication.class, args);

		System.out.println(mage.blizzard(12,6,16));
	}

}
