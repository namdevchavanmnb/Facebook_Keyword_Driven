package com.bridgelabz.keyword;

import com.bridgelabz.keyword.engine.KeywordEngine;
import org.testng.annotations.Test;

public class LoginTest {
    KeywordEngine keywordEngine;

    @Test
    public void loginTest() {
        keywordEngine = new KeywordEngine();
        keywordEngine.starExecution("login");
    }

    @Test
    public void facebookLoginTest(){
        keywordEngine = new KeywordEngine();
        keywordEngine.starExecution("facebookLogin");
    }
}