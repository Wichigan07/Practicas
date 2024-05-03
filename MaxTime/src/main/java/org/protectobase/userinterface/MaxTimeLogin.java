package org.protectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class MaxTimeLogin extends PageObject {
    public static final Target USER_NAME = Target.the("whrite the user")
            .located(By.id("Logon_v0_MainLayoutEdit_xaf_l30_xaf_dviUserName_Edit_I"));
    public static final Target PASSWORD = Target.the("Write the password")
            .located(By.id("Logon_v0_MainLayoutEdit_xaf_l35_xaf_dviPassword_Edit_I"));
    public static final Target BTN_CONNECT = Target.the("Click button connect")
            .located(By.xpath("//*[@id=\"Logon_PopupActions_Menu_DXI0_T\"]"));

}
