package com.zerobank.steddefinitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {



    /**
     * similar to TestBase.java in TestNG framework
     * We open close browsers here etc.
     */


        @Before()
        public void setUpScenario() {
            System.out.println("BEFORE - setUp method is running before the scenario ");
        }

        @After
        public void tearDownScenario() {
            System.out.println("AFTER - tearDown method is running after the scenario");
            Driver.closeDriver();
        }
    }

