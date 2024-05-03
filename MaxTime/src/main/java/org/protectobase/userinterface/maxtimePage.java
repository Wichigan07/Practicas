package org.protectobase.userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://operacion.choucairtesting.ca/Maxtime/Login.aspx?ReturnUrl=%2fMaxtime%2f#ShortcutViewID=ReporteDiaSoloAnalista_ListView&ShortcutObjectClassName=MaxTime.Module.BusinessObjects.ReporteDia")
public class maxtimePage extends PageObject {
    public static final Target SELECT_DAY= Target.the("Select day")
            .located(By.xpath("//*[@id=\"Vertical_v1_LE_v2_cell0_0_xaf_Fecha\"]"));



}
