package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class EvolutionApiSimulation extends Simulation {

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
    val evolutionChainListPerSecond = config.getDouble("performance.operationsPerSecond.evolutionChainList") * rateMultiplier * instanceMultiplier
    val evolutionChainRetrievePerSecond = config.getDouble("performance.operationsPerSecond.evolutionChainRetrieve") * rateMultiplier * instanceMultiplier
    val evolutionTriggerListPerSecond = config.getDouble("performance.operationsPerSecond.evolutionTriggerList") * rateMultiplier * instanceMultiplier
    val evolutionTriggerRetrievePerSecond = config.getDouble("performance.operationsPerSecond.evolutionTriggerRetrieve") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val evolution_chain_listQUERYFeeder = csv(userDataDirectory + File.separator + "evolutionChainList-queryParams.csv").random
    val evolution_chain_retrievePATHFeeder = csv(userDataDirectory + File.separator + "evolutionChainRetrieve-pathParams.csv").random
    val evolution_trigger_listQUERYFeeder = csv(userDataDirectory + File.separator + "evolutionTriggerList-queryParams.csv").random
    val evolution_trigger_retrievePATHFeeder = csv(userDataDirectory + File.separator + "evolutionTriggerRetrieve-pathParams.csv").random

    // Setup all scenarios

    
    val scnevolutionChainList = scenario("evolutionChainListSimulation")
        .feed(evolution_chain_listQUERYFeeder)
        .exec(http("evolutionChainList")
        .httpRequest("GET","/api/v2/evolution-chain/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnevolutionChainList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnevolutionChainList.inject(
        rampUsersPerSec(1) to(evolutionChainListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(evolutionChainListPerSecond) during(durationSeconds),
        rampUsersPerSec(evolutionChainListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnevolutionChainRetrieve = scenario("evolutionChainRetrieveSimulation")
        .feed(evolution_chain_retrievePATHFeeder)
        .exec(http("evolutionChainRetrieve")
        .httpRequest("GET","/api/v2/evolution-chain/${id}/")
)

    // Run scnevolutionChainRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnevolutionChainRetrieve.inject(
        rampUsersPerSec(1) to(evolutionChainRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(evolutionChainRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(evolutionChainRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnevolutionTriggerList = scenario("evolutionTriggerListSimulation")
        .feed(evolution_trigger_listQUERYFeeder)
        .exec(http("evolutionTriggerList")
        .httpRequest("GET","/api/v2/evolution-trigger/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnevolutionTriggerList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnevolutionTriggerList.inject(
        rampUsersPerSec(1) to(evolutionTriggerListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(evolutionTriggerListPerSecond) during(durationSeconds),
        rampUsersPerSec(evolutionTriggerListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnevolutionTriggerRetrieve = scenario("evolutionTriggerRetrieveSimulation")
        .feed(evolution_trigger_retrievePATHFeeder)
        .exec(http("evolutionTriggerRetrieve")
        .httpRequest("GET","/api/v2/evolution-trigger/${id}/")
)

    // Run scnevolutionTriggerRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnevolutionTriggerRetrieve.inject(
        rampUsersPerSec(1) to(evolutionTriggerRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(evolutionTriggerRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(evolutionTriggerRetrievePerSecond) to(1) during(rampDownSeconds)
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
