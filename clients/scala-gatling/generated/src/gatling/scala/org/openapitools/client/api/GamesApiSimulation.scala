package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class GamesApiSimulation extends Simulation {

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
    val generationListPerSecond = config.getDouble("performance.operationsPerSecond.generationList") * rateMultiplier * instanceMultiplier
    val generationRetrievePerSecond = config.getDouble("performance.operationsPerSecond.generationRetrieve") * rateMultiplier * instanceMultiplier
    val pokedexListPerSecond = config.getDouble("performance.operationsPerSecond.pokedexList") * rateMultiplier * instanceMultiplier
    val pokedexRetrievePerSecond = config.getDouble("performance.operationsPerSecond.pokedexRetrieve") * rateMultiplier * instanceMultiplier
    val versionGroupListPerSecond = config.getDouble("performance.operationsPerSecond.versionGroupList") * rateMultiplier * instanceMultiplier
    val versionGroupRetrievePerSecond = config.getDouble("performance.operationsPerSecond.versionGroupRetrieve") * rateMultiplier * instanceMultiplier
    val versionListPerSecond = config.getDouble("performance.operationsPerSecond.versionList") * rateMultiplier * instanceMultiplier
    val versionRetrievePerSecond = config.getDouble("performance.operationsPerSecond.versionRetrieve") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val generation_listQUERYFeeder = csv(userDataDirectory + File.separator + "generationList-queryParams.csv").random
    val generation_retrievePATHFeeder = csv(userDataDirectory + File.separator + "generationRetrieve-pathParams.csv").random
    val pokedex_listQUERYFeeder = csv(userDataDirectory + File.separator + "pokedexList-queryParams.csv").random
    val pokedex_retrievePATHFeeder = csv(userDataDirectory + File.separator + "pokedexRetrieve-pathParams.csv").random
    val version_group_listQUERYFeeder = csv(userDataDirectory + File.separator + "versionGroupList-queryParams.csv").random
    val version_group_retrievePATHFeeder = csv(userDataDirectory + File.separator + "versionGroupRetrieve-pathParams.csv").random
    val version_listQUERYFeeder = csv(userDataDirectory + File.separator + "versionList-queryParams.csv").random
    val version_retrievePATHFeeder = csv(userDataDirectory + File.separator + "versionRetrieve-pathParams.csv").random

    // Setup all scenarios

    
    val scngenerationList = scenario("generationListSimulation")
        .feed(generation_listQUERYFeeder)
        .exec(http("generationList")
        .httpRequest("GET","/api/v2/generation/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scngenerationList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerationList.inject(
        rampUsersPerSec(1) to(generationListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(generationListPerSecond) during(durationSeconds),
        rampUsersPerSec(generationListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenerationRetrieve = scenario("generationRetrieveSimulation")
        .feed(generation_retrievePATHFeeder)
        .exec(http("generationRetrieve")
        .httpRequest("GET","/api/v2/generation/${id}/")
)

    // Run scngenerationRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenerationRetrieve.inject(
        rampUsersPerSec(1) to(generationRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(generationRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(generationRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokedexList = scenario("pokedexListSimulation")
        .feed(pokedex_listQUERYFeeder)
        .exec(http("pokedexList")
        .httpRequest("GET","/api/v2/pokedex/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnpokedexList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokedexList.inject(
        rampUsersPerSec(1) to(pokedexListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokedexListPerSecond) during(durationSeconds),
        rampUsersPerSec(pokedexListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokedexRetrieve = scenario("pokedexRetrieveSimulation")
        .feed(pokedex_retrievePATHFeeder)
        .exec(http("pokedexRetrieve")
        .httpRequest("GET","/api/v2/pokedex/${id}/")
)

    // Run scnpokedexRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokedexRetrieve.inject(
        rampUsersPerSec(1) to(pokedexRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokedexRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(pokedexRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnversionGroupList = scenario("versionGroupListSimulation")
        .feed(version_group_listQUERYFeeder)
        .exec(http("versionGroupList")
        .httpRequest("GET","/api/v2/version-group/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnversionGroupList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnversionGroupList.inject(
        rampUsersPerSec(1) to(versionGroupListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(versionGroupListPerSecond) during(durationSeconds),
        rampUsersPerSec(versionGroupListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnversionGroupRetrieve = scenario("versionGroupRetrieveSimulation")
        .feed(version_group_retrievePATHFeeder)
        .exec(http("versionGroupRetrieve")
        .httpRequest("GET","/api/v2/version-group/${id}/")
)

    // Run scnversionGroupRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnversionGroupRetrieve.inject(
        rampUsersPerSec(1) to(versionGroupRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(versionGroupRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(versionGroupRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnversionList = scenario("versionListSimulation")
        .feed(version_listQUERYFeeder)
        .exec(http("versionList")
        .httpRequest("GET","/api/v2/version/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnversionList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnversionList.inject(
        rampUsersPerSec(1) to(versionListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(versionListPerSecond) during(durationSeconds),
        rampUsersPerSec(versionListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnversionRetrieve = scenario("versionRetrieveSimulation")
        .feed(version_retrievePATHFeeder)
        .exec(http("versionRetrieve")
        .httpRequest("GET","/api/v2/version/${id}/")
)

    // Run scnversionRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnversionRetrieve.inject(
        rampUsersPerSec(1) to(versionRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(versionRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(versionRetrievePerSecond) to(1) during(rampDownSeconds)
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
