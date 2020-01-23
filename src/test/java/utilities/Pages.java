package utilities;


import pages.AvatarPage;
import pages.LoginPage;
import pages.MIReports;
import pages.AbsentMPage;

public class Pages {

    private LoginPage loginPage;
    private MIReports MIReports;
    private  AbsentMPage AbsentMPage;
    private AvatarPage AvatarPage;
    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }



    public MIReports MIReports() {
        if (MIReports == null) {
            MIReports = new MIReports();
        }
        return MIReports;
    }


    public AbsentMPage AbsentMPage() {
        if (AbsentMPage == null) {
            AbsentMPage = new AbsentMPage();
        }
        return AbsentMPage;
    }

    public AvatarPage AvatarPage() {
        if (AvatarPage== null) {
            AvatarPage = new AvatarPage();
        }
        return AvatarPage;
    }


}
