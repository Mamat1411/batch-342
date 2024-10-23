package com.xa.batch342;

// import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// import com.github.javafaker.Faker;
import com.xa.batch342.entities.Category;
import com.xa.batch342.entities.Product;
import com.xa.batch342.entities.Variant;
import com.xa.batch342.repositories.CategoryRepository;
import com.xa.batch342.repositories.ProductRepository;
import com.xa.batch342.repositories.VariantRepository;

@SpringBootApplication
public class Batch342Application {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ProductRepository productRepository;

	@Autowired
	VariantRepository variantRepository;

	public static void main(String[] args) {
		SpringApplication.run(Batch342Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			// Category Seeding
			Category food = new Category("Food", "food", "All kinds of food");
			Category beverage = new Category("Beverage", "beverage", "All kinds of drinks");
			Category medicine = new Category("Medicine", "medicine", "All kinds of meds");
			// Category fastFood = new Category("Fast Food", "fast-food");
			categoryRepository.save(food);
			categoryRepository.save(beverage);
			categoryRepository.save(medicine);
			// categoryRepository.save(fastFood);

			// Faker faker = new Faker(new Locale("es"));
			// int categories = 5;
			// for (int i = 0; i < categories; i++) {
			// 	Category categorySeed = new Category(faker.name().fullName(), faker.internet().slug());
			// 	categoryRepository.save(categorySeed);
			// }

			Product burgerBangor = new Product("Burger Bangor", "burger-bangor", "Best Local Burgers", 1L);
			Product indomie = new Product("Indomie", "indomie", "Best Indonesian Instant Noodles", 1L);
			Product oatside = new Product("OatSide", "oatside", "Oat Flavored Plant-Based Milk", 2L);
			Product youC1000 = new Product("You C1000", "youc1000", "Your Daily Supplement of Vitamin C", 2L);
			Product paracetamol = new Product("Paracetamol", "paracetamol", "Fever and Cold Medicine", 3L);
			Product antasida = new Product("Antasida", "antasida", "Gerd and Pyrosis Medicine", 3L);
			productRepository.save(burgerBangor);
			productRepository.save(indomie);
			productRepository.save(oatside);
			productRepository.save(youC1000);
			productRepository.save(paracetamol);
			productRepository.save(antasida);

			Variant doubleTrouble = new Variant("Double Trouble Mozzarella Cheese Burger", "double-trouble-mozzarella-cheese-burger", "Burger with 2 pieces of 100gr Beef Patty and Double Mozzarella Cheese", 1L, 20, 100000L);
			Variant indomieGoreng = new Variant("Indomie Goreng", "indomie-goreng", "Traditional Mie Goreng Flavored Instant Noodle", 2L, 100, 2500L);
			Variant oatsideVanilla = new Variant("OatSide Vanilla 250ml", "oatside-vanilla-250ml", "Vanilla Flavored Oat Milk", 3L, 50, 10000L);
			Variant youC1000Orange = new Variant("You C1000 Orange 250ml", "you-c1000-orange-250ml", "Orange Flavored Vitamin C Supplement", 4L, 30, 15000L);
			Variant sanmolParacetamol = new Variant("Sanmol Paracetamol 500mg", "sanmol-paracetamol-500mg", "Medium Dose of Paracetamol for Fever and Cold", 5L, 50, 20000L);
			Variant polysilaneAntasida = new Variant("Polysilane Antasida 150ml", "polysilane-antasida-150ml", "Small Bottled Gerd and Pyrosis Medicine", 6L, 40, 25000L);
			variantRepository.save(doubleTrouble);
			variantRepository.save(indomieGoreng);
			variantRepository.save(oatsideVanilla);
			variantRepository.save(youC1000Orange);
			variantRepository.save(sanmolParacetamol);
			variantRepository.save(polysilaneAntasida);
		};
	}
}
