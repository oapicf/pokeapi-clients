package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class BerriesApiSimulation extends Simulation {

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
    val berryFirmnessListPerSecond = config.getDouble("performance.operationsPerSecond.berryFirmnessList") * rateMultiplier * instanceMultiplier
    val berryFirmnessRetrievePerSecond = config.getDouble("performance.operationsPerSecond.berryFirmnessRetrieve") * rateMultiplier * instanceMultiplier
    val berryFlavorListPerSecond = config.getDouble("performance.operationsPerSecond.berryFlavorList") * rateMultiplier * instanceMultiplier
    val berryFlavorRetrievePerSecond = config.getDouble("performance.operationsPerSecond.berryFlavorRetrieve") * rateMultiplier * instanceMultiplier
    val berryListPerSecond = config.getDouble("performance.operationsPerSecond.berryList") * rateMultiplier * instanceMultiplier
    val berryRetrievePerSecond = config.getDouble("performance.operationsPerSecond.berryRetrieve") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val berry_firmness_listQUERYFeeder = csv(userDataDirectory + File.separator + "berryFirmnessList-queryParams.csv").random
    val berry_firmness_retrievePATHFeeder = csv(userDataDirectory + File.separator + "berryFirmnessRetrieve-pathParams.csv").random
    val berry_flavor_listQUERYFeeder = csv(userDataDirectory + File.separator + "berryFlavorList-queryParams.csv").random
    val berry_flavor_retrievePATHFeeder = csv(userDataDirectory + File.separator + "berryFlavorRetrieve-pathParams.csv").random
    val berry_listQUERYFeeder = csv(userDataDirectory + File.separator + "berryList-queryParams.csv").random
    val berry_retrievePATHFeeder = csv(userDataDirectory + File.separator + "berryRetrieve-pathParams.csv").random

    // Setup all scenarios

    
    val scnberryFirmnessList = scenario("berryFirmnessListSimulation")
        .feed(berry_firmness_listQUERYFeeder)
        .exec(http("berryFirmnessList")
        .httpRequest("GET","/api/v2/berry-firmness/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnberryFirmnessList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnberryFirmnessList.inject(
        rampUsersPerSec(1) to(berryFirmnessListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(berryFirmnessListPerSecond) during(durationSeconds),
        rampUsersPerSec(berryFirmnessListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnberryFirmnessRetrieve = scenario("berryFirmnessRetrieveSimulation")
        .feed(berry_firmness_retrievePATHFeeder)
        .exec(http("berryFirmnessRetrieve")
        .httpRequest("GET","/api/v2/berry-firmness/${id}/")
)

    // Run scnberryFirmnessRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnberryFirmnessRetrieve.inject(
        rampUsersPerSec(1) to(berryFirmnessRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(berryFirmnessRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(berryFirmnessRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnberryFlavorList = scenario("berryFlavorListSimulation")
        .feed(berry_flavor_listQUERYFeeder)
        .exec(http("berryFlavorList")
        .httpRequest("GET","/api/v2/berry-flavor/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnberryFlavorList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnberryFlavorList.inject(
        rampUsersPerSec(1) to(berryFlavorListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(berryFlavorListPerSecond) during(durationSeconds),
        rampUsersPerSec(berryFlavorListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnberryFlavorRetrieve = scenario("berryFlavorRetrieveSimulation")
        .feed(berry_flavor_retrievePATHFeeder)
        .exec(http("berryFlavorRetrieve")
        .httpRequest("GET","/api/v2/berry-flavor/${id}/")
)

    // Run scnberryFlavorRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnberryFlavorRetrieve.inject(
        rampUsersPerSec(1) to(berryFlavorRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(berryFlavorRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(berryFlavorRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnberryList = scenario("berryListSimulation")
        .feed(berry_listQUERYFeeder)
        .exec(http("berryList")
        .httpRequest("GET","/api/v2/berry/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnberryList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnberryList.inject(
        rampUsersPerSec(1) to(berryListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(berryListPerSecond) during(durationSeconds),
        rampUsersPerSec(berryListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnberryRetrieve = scenario("berryRetrieveSimulation")
        .feed(berry_retrievePATHFeeder)
        .exec(http("berryRetrieve")
        .httpRequest("GET","/api/v2/berry/${id}/")
)

    // Run scnberryRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnberryRetrieve.inject(
        rampUsersPerSec(1) to(berryRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(berryRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(berryRetrievePerSecond) to(1) during(rampDownSeconds)
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
