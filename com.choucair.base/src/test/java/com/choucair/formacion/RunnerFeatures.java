package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features ="src/test/resources/features/ColorLib/Forms/PopupValidation.feature")
@CucumberOptions(features ="src/test/resources/features/ColorLib/Forms/BlockAndInlineValidation.feature")
public class RunnerFeatures {

}


