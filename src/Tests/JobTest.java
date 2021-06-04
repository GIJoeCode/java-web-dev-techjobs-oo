package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;

    @Before
    public void setUp() {
        job1 = new Job();
        job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(job1.getId(),job2.getId(),1);
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testJobConstructorSetAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().toString());
        assertEquals("Desert", job3.getLocation().toString());
        assertEquals("Quality control", job3.getPositionType().toString());
        assertEquals("Persistence", job3.getCoreCompetency().toString());
        assertTrue(job3 instanceof Job);
    }


    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job4.equals(job5));
    }

    @Test
    public void testToString() {
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\nId: " + testjob.getId() + " " +
                "\nName: " + testjob.getName() + " " +
                "\nEmployer: " + testjob.getEmployer() + " " +
                "\nLocation: " + testjob.getLocation() + " " +
                "\nPosition Type: " + testjob.getPositionType() + " " +
                "\nCore Competency: " +testjob.getCoreCompetency() + " " +
                "\n"
,testjob.toString());

    }
    @Test
    public void testToStringEmptyJobName(){
        Job testjob = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String dataNotAvailable = "Data Not Available";
;        assertEquals("\nId: " + testjob.getId() +  " " +
                        "\nName: " + dataNotAvailable + " " +
                        "\nEmployer: " + testjob.getEmployer() + " " +
                        "\nLocation: " + testjob.getLocation() + " " +
                        "\nPosition Type: " + testjob.getPositionType() + " " +
                        "\nCore Competency: " +testjob.getCoreCompetency() + " " +
                        "\n"
                ,testjob.toString());
    }


    @Test
    public void testToStringEmptyJobEmptyEmployer(){
        Job testjob = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String dataNotAvailable = "Data Not Available";
        assertEquals("\nId: " + testjob.getId() + " " +
                        "\nName: " + testjob.getName() + " " +
                        "\nEmployer: " + dataNotAvailable + " " +
                        "\nLocation: " + testjob.getLocation() + " " +
                        "\nPosition Type: " + testjob.getPositionType() + " " +
                        "\nCore Competency: " +testjob.getCoreCompetency() + " " +
                        "\n"
                ,testjob.toString());
    }

    @Test
    public void testToStringEmptyJobEmptyLocation(){
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String dataNotAvailable = "Data Not Available";
        assertEquals("\nId: " + testjob.getId() + " " +
                        "\nName: " + testjob.getName() + " " +
                        "\nEmployer: " + testjob.getEmployer() + " " +
                        "\nLocation: " + dataNotAvailable+ " " +
                        "\nPosition Type: " + testjob.getPositionType() + " " +
                        "\nCore Competency: " +testjob.getCoreCompetency() + " " +
                        "\n"
                ,testjob.toString());
    }
    @Test
    public void testToStringEmptyJobEmptyPosition(){
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String dataNotAvailable = "Data Not Available";
        assertEquals("\nId: " + testjob.getId() + " " +
                        "\nName: " + testjob.getName() + " " +
                        "\nEmployer: " + testjob.getEmployer() + " " +
                        "\nLocation: " + testjob.getLocation() + " " +
                        "\nPosition Type: " + dataNotAvailable + " " +
                        "\nCore Competency: " +testjob.getCoreCompetency() + " " +
                        "\n"
                ,testjob.toString());
    }
    @Test
    public void testToStringEmptyJobEmptyCoreCompetency(){
        Job testjob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        String dataNotAvailable = "Data Not Available";
        assertEquals("\nId: " + testjob.getId() + " " +
                        "\nName: " + testjob.getName() + " " +
                        "\nEmployer: " + testjob.getEmployer() + " " +
                        "\nLocation: " + testjob.getLocation() + " " +
                        "\nPosition Type: " + testjob.getPositionType() + " " +
                        "\nCore Competency: " +dataNotAvailable+ " " +
                        "\n"
                ,testjob.toString());
    }



}
