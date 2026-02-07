package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class EncountersApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://pokeapi.co")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val encounterConditionListPerSecond = config.getDouble("performance.operationsPerSecond.encounterConditionList") * rateMultiplier * instanceMultiplier
    val encounterConditionRetrievePerSecond = config.getDouble("performance.operationsPerSecond.encounterConditionRetrieve") * rateMultiplier * instanceMultiplier
    val encounterConditionValueListPerSecond = config.getDouble("performance.operationsPerSecond.encounterConditionValueList") * rateMultiplier * instanceMultiplier
    val encounterConditionValueRetrievePerSecond = config.getDouble("performance.operationsPerSecond.encounterConditionValueRetrieve") * rateMultiplier * instanceMultiplier
    val encounterMethodListPerSecond = config.getDouble("performance.operationsPerSecond.encounterMethodList") * rateMultiplier * instanceMultiplier
    val encounterMethodRetrievePerSecond = config.getDouble("performance.operationsPerSecond.encounterMethodRetrieve") * rateMultiplier * instanceMultiplier
    val pokemonEncountersRetrievePerSecond = config.getDouble("performance.operationsPerSecond.pokemonEncountersRetrieve") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val encounter_condition_listQUERYFeeder = csv(userDataDirectory + File.separator + "encounterConditionList-queryParams.csv").random
    val encounter_condition_retrievePATHFeeder = csv(userDataDirectory + File.separator + "encounterConditionRetrieve-pathParams.csv").random
    val encounter_condition_value_listQUERYFeeder = csv(userDataDirectory + File.separator + "encounterConditionValueList-queryParams.csv").random
    val encounter_condition_value_retrievePATHFeeder = csv(userDataDirectory + File.separator + "encounterConditionValueRetrieve-pathParams.csv").random
    val encounter_method_listQUERYFeeder = csv(userDataDirectory + File.separator + "encounterMethodList-queryParams.csv").random
    val encounter_method_retrievePATHFeeder = csv(userDataDirectory + File.separator + "encounterMethodRetrieve-pathParams.csv").random
    val pokemon_encounters_retrievePATHFeeder = csv(userDataDirectory + File.separator + "pokemonEncountersRetrieve-pathParams.csv").random

    // Setup all scenarios

    
    val scnencounterConditionList = scenario("encounterConditionListSimulation")
        .feed(encounter_condition_listQUERYFeeder)
        .exec(http("encounterConditionList")
        .httpRequest("GET","/api/v2/encounter-condition/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnencounterConditionList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnencounterConditionList.inject(
        rampUsersPerSec(1) to(encounterConditionListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(encounterConditionListPerSecond) during(durationSeconds),
        rampUsersPerSec(encounterConditionListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnencounterConditionRetrieve = scenario("encounterConditionRetrieveSimulation")
        .feed(encounter_condition_retrievePATHFeeder)
        .exec(http("encounterConditionRetrieve")
        .httpRequest("GET","/api/v2/encounter-condition/${id}/")
)

    // Run scnencounterConditionRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnencounterConditionRetrieve.inject(
        rampUsersPerSec(1) to(encounterConditionRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(encounterConditionRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(encounterConditionRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnencounterConditionValueList = scenario("encounterConditionValueListSimulation")
        .feed(encounter_condition_value_listQUERYFeeder)
        .exec(http("encounterConditionValueList")
        .httpRequest("GET","/api/v2/encounter-condition-value/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnencounterConditionValueList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnencounterConditionValueList.inject(
        rampUsersPerSec(1) to(encounterConditionValueListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(encounterConditionValueListPerSecond) during(durationSeconds),
        rampUsersPerSec(encounterConditionValueListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnencounterConditionValueRetrieve = scenario("encounterConditionValueRetrieveSimulation")
        .feed(encounter_condition_value_retrievePATHFeeder)
        .exec(http("encounterConditionValueRetrieve")
        .httpRequest("GET","/api/v2/encounter-condition-value/${id}/")
)

    // Run scnencounterConditionValueRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnencounterConditionValueRetrieve.inject(
        rampUsersPerSec(1) to(encounterConditionValueRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(encounterConditionValueRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(encounterConditionValueRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnencounterMethodList = scenario("encounterMethodListSimulation")
        .feed(encounter_method_listQUERYFeeder)
        .exec(http("encounterMethodList")
        .httpRequest("GET","/api/v2/encounter-method/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnencounterMethodList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnencounterMethodList.inject(
        rampUsersPerSec(1) to(encounterMethodListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(encounterMethodListPerSecond) during(durationSeconds),
        rampUsersPerSec(encounterMethodListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnencounterMethodRetrieve = scenario("encounterMethodRetrieveSimulation")
        .feed(encounter_method_retrievePATHFeeder)
        .exec(http("encounterMethodRetrieve")
        .httpRequest("GET","/api/v2/encounter-method/${id}/")
)

    // Run scnencounterMethodRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnencounterMethodRetrieve.inject(
        rampUsersPerSec(1) to(encounterMethodRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(encounterMethodRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(encounterMethodRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonEncountersRetrieve = scenario("pokemonEncountersRetrieveSimulation")
        .feed(pokemon_encounters_retrievePATHFeeder)
        .exec(http("pokemonEncountersRetrieve")
        .httpRequest("GET","/api/v2/pokemon/${pokemon_id}/encounters")
)

    // Run scnpokemonEncountersRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonEncountersRetrieve.inject(
        rampUsersPerSec(1) to(pokemonEncountersRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonEncountersRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonEncountersRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
