package basics;
public class student_details
{
    public static void main(String arg[])
    {
        Student aditya = new Student();
        aditya.name = "Aditya";
        aditya.english = 87;
        aditya.hindi = 76;
        aditya.maths = 100;
        aditya.science = 92;
        aditya.social = 88;
        aditya.fn = "Aditya Dadheech";
        aditya.ad = "Jaipur, Rajasthan";
        aditya.pn = 8107966141L;
        aditya.gh = "github.com/F1oppy";
        aditya.ig = "instagram.com/adi_d18";
        
        
        System.out.println("-------------------------------------------------");
        System.out.println("Detailed Marks");
        System.out.println("-------------------------------------------------");
        aditya.printMarksDetails();
        System.out.println("-------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("Summary Marks");
        System.out.println("-------------------------------------------------");
        aditya.printMarksSummary();
        System.out.println("-------------------------------------------------");
        System.out.println("Student Details");
        System.out.println("-------------------------------------------------");
        aditya.studentDetails();
        System.out.println("-------------------------------------------------");
    }
}

class Student
{
    String name;
    String fn;
    String ad;
    long pn;
    String ig;
    String gh;
    int english;
    int hindi;
    int maths;
    int science;
    int social;

    int getLanguagesTotal()
    {
        return english  + hindi;
    }

    int getNonLanguagesTotal()
    {
        return maths + science + social;
    }

    int getAllSubjectsTotal()
    {
        return getLanguagesTotal() + getNonLanguagesTotal();
    }

    double getPCMPercentage()
    {
        return 100.0 * (maths + science) / 200.0;
    }

    void printMarksSummary()
    {
        System.out.println("Languages: " + getLanguagesTotal());
        System.out.println("Non languages: " + getNonLanguagesTotal());
        System.out.println("PCM Percentage: " + getPCMPercentage());
        System.out.println("Total: " + getAllSubjectsTotal());
    }

    void printMarksDetails()
    {
        System.out.println("English : " + english);
        System.out.println("Hindi : " + hindi);
        System.out.println("Maths : " + maths);
        System.out.println("Science : " + science);
        System.out.println("Social : " + social);
    }
    void studentDetails()
    {
        System.out.println("Full Name " + fn);
        System.out.println("Address : " + ad);
        System.out.println("Phone Number : " + pn);
        System.out.println("Github : " + gh);
        System.out.println("Github : " + ig);
    }
}