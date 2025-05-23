package data.models;

import data.Repository.Residents;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ResidentTest {
   Residents residents;
   @BeforeEach
    void setUp() {
       residents = new Residents();
   }

   @Test
    public void testThatCountIsZero(){
       assertEquals(0, residents.count());
   }

   @Test
    public void addOneResident_CountIsOne(){
       Resident firstResident = new Resident();
       residents.save(firstResident);

       assertEquals(1, residents.count());
   }

   @Test
    public void findResidentByIdReturnsResident(){
       Resident firstResident = new Resident();
       firstResident.setFullName("Quyum Alabi");
       residents.save(firstResident);

       assertEquals(firstResident, residents.findById(1).get());

   }

   @Test
   public void testThatSaveTwoResident_DeleteOneResidentById_countIsOne(){
      Resident firstResident = new Resident();
      Resident secondResident = new Resident();

      residents.save(firstResident);
      residents.save(secondResident);

      assertEquals(2, residents.count());
      residents.deleteById(2);
      assertEquals(1, residents.count());
   }

   @Test
   public void testThatFindByFullNameReturnsTheResidentThatEqualsTheFullNameBeingSearched(){
      Resident firstResident = new Resident();
      firstResident.setFullName("Quyum Alabi");
      residents.save(firstResident);

      Resident secondResident = new Resident();
      secondResident.setFullName("Oderinde Suliyah");
      residents.save(secondResident);

      assertEquals(firstResident, residents.findByFullName("Quyum Alabi").get());
   }


   @Test
   public void testThatSaveThreeResidents_FindAResidentById_DeleteTwoResidents_CountIsThree(){
      Resident firstResident = new Resident();
      Resident secondResident = new Resident();
      Resident thirdResident = new Resident();

      residents.save(firstResident);
      residents.save(secondResident);
      residents.save(thirdResident);

      assertEquals(3, residents.count());
      assertEquals(secondResident, residents.findById(2).get());

      residents.deleteById(2);
      assertEquals(2, residents.count());

   }

   @Test
   public void testThatSaveThreeResidents_CountIsThree_DeleteAll_CountIsZero(){
      Resident firstResident = new Resident();
      Resident secondResident = new Resident();
      Resident thirdResident = new Resident();

      residents.save(firstResident);
      residents.save(secondResident);
      residents.save(thirdResident);

      assertEquals(3, residents.count());
      residents.deleteAll();
      assertEquals(0, residents.count());
   }

   @Test
   public void testThatSaveOneResident_UpdateTheSameResidentWorks(){
      Resident firstResident = new Resident();
      firstResident.setFullName("Quyum Alabi");
      residents.save(firstResident);

      Resident secondResident = new Resident();

      secondResident.setId(firstResident.getId());
      residents.save(secondResident);

      assertEquals(secondResident, residents.findById(1).get());
   }

//   @Test
//   public void testThatFindAllReturnsAllTheResidents(){
//      Resident firstResident = new Resident();
//      Resident secondResident = new Resident();
//      Resident thirdResident = new Resident();
//
//      residents.save(firstResident);
//      residents.save(secondResident);
//      residents.save(thirdResident);
//
//      assertEquals(3, residents.count());
//      assertEquals(3, residents.findAll());
//   }
}