package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    private Dog defaultDog;

    @Before
    public void setUp() throws Exception {
        String name = "Rocco";
        Date birthDate = new Date();
        Integer id = 0;
        defaultDog = new Dog(name, birthDate, id);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }


    @Test
    public void testSpeak() {
        //give
        String dogsActualSpeech = "bark!";
        //when
        defaultDog.speak();
        //then
        String expectedSpeech = defaultDog.speak();
        Assert.assertEquals(expectedSpeech, dogsActualSpeech);
    }

    @Test
    public void testBirthDate() {
        //given
        Date actualBirthDate = new Date();
        //when
        defaultDog.getBirthDate();
        //then
        Date expectedBirthDate = defaultDog.getBirthDate();
        Assert.assertEquals(expectedBirthDate,actualBirthDate);
    }

    @Test
    public void testEatFood() {
        //given
        Food foodToEat = new Food();
        Integer expectedMealsEaten = 1;
        //when
        defaultDog.eat(foodToEat);
        Integer actualMealsEaten = defaultDog.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expectedMealsEaten,actualMealsEaten);
    }

    @Test
    public void testGetIntId() {
        //given
        Integer expectedDogId = 0;
        //when
        Integer actualDogId = defaultDog.getId();
        //then
        Assert.assertEquals(expectedDogId,actualDogId);
    }

    @Test
    public void animalInheritanceTest() {
        //given
        boolean isAnimal = defaultDog instanceof Animal;
        //then
        Assert.assertTrue(isAnimal);
    }


    @Test
    public void mammalInheritanceTest() {
        //given
        boolean isAnimal = defaultDog instanceof Mammal;
        //then
        Assert.assertTrue(isAnimal);
    }
}
