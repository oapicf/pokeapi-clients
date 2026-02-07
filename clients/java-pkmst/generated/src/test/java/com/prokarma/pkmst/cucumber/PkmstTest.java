package com.prokarma.pkmst.cucumber;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ActiveProfiles("test")
@CucumberOptions(format = { "pretty", "html:target/cucumber-html-report",
 "json:./report/pokemon-report-json/pokemon.json",
 "json:./report/evolution-report-json/evolution.json",
 "json:./report/berries-report-json/berries.json",
 "json:./report/items-report-json/items.json",
 "json:./report/machines-report-json/machines.json",
 "json:./report/location-report-json/location.json",
 "json:./report/contest-report-json/contest.json",
 "json:./report/moves-report-json/moves.json",
 "json:./report/encounters-report-json/encounters.json",
 "json:./report/games-report-json/games.json",
 "json:./report/utility-report-json/utility.json",
 })
public class PkmstTest {
}