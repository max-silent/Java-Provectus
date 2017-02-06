/**
 * Created by Max on 11.01.2017.
 */
public class Main {
    public static void main (String [] args){
        Clerk aClerk = new Clerk("ClerkName", "ClerkSurname", 123);
        IT anIT = new IT("ITName", "ITSurname", 234);
        Programmer aProgrammer = new Programmer("ProgrammerName", "ProgrammerSurname", 345);
        ProjectManager aProjectManager = new ProjectManager("ProjectManagerName", "ProjectManagerSurname", 456);
        CTO aCTO = new CTO("CTOName", "CTOSurname", 567);
        HR anHR = new HR("HRName", "HRSurname", 678);
        OfficeManager anOfficeManager = new OfficeManager("OfficeManagerName", "OfficeManagerSurname", 789);
        Cleaner aCleaner = new Cleaner("CleanerName", "CleanerSurname", 890);
        System.out.println("Clerk Name: "+aClerk.getName());
        System.out.println("Clerk Surname: "+aClerk.getSurname());
        System.out.println("Clerk Salary: "+aClerk.getSalary());
        System.out.println("IT Name: "+anIT.getName());
        System.out.println("IT Surname: "+anIT.getSurname());
        System.out.println("IT Salary: "+anIT.getSalary());
        System.out.println("Programmer Name: "+aProgrammer.getName());
        System.out.println("Programmer Surname: "+aProgrammer.getSurname());
        System.out.println("Programmer Salary: "+aProgrammer.getSalary());
        System.out.println("ProjectManager Name: "+aProjectManager .getName());
        System.out.println("ProjectManager Surname: "+aProjectManager .getSurname());
        System.out.println("ProjectManager Salary: "+aProjectManager .getSalary());
        System.out.println("CTO Name: "+aCTO.getName());
        System.out.println("CTO Surname: "+aCTO .getSurname());
        System.out.println("CTO Salary: "+aCTO .getSalary());
        System.out.println("HR Name: "+anHR.getName());
        System.out.println("HR Surname: "+anHR.getSurname());
        System.out.println("HR Salary: "+anHR.getSalary());
        System.out.println("OfficeManager Name: "+anOfficeManager.getName());
        System.out.println("OfficeManager Surname: "+anOfficeManager.getSurname());
        System.out.println("OfficeManager Salary: "+anOfficeManager.getSalary());
        System.out.println("Cleaner Name: "+aCleaner.getName());
        System.out.println("Cleaner Surname: "+aCleaner.getSurname());
        System.out.println("Cleaner Salary: "+aCleaner.getSalary());

    }
}
