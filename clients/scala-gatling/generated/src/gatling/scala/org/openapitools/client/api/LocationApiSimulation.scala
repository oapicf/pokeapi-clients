package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class LocationApiSimulation extends Simulation {

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
    val locationAreaListPerSecond = config.getDouble("performance.operationsPerSecond.locationAreaList") * rateMultiplier * instanceMultiplier
    val locationAreaRetrievePerSecond = config.getDouble("performance.operationsPerSecond.locationAreaRetrieve") * rateMultiplier * instanceMultiplier
    val locationListPerSecond = config.getDouble("performance.operationsPerSecond.locationList") * rateMultiplier * instanceMultiplier
    val locationRetrievePerSecond = config.getDouble("performance.operationsPerSecond.locationRetrieve") * rateMultiplier * instanceMultiplier
    val palParkAreaListPerSecond = config.getDouble("performance.operationsPerSecond.palParkAreaList") * rateMultiplier * instanceMultiplier
    val palParkAreaRetrievePerSecond = config.getDouble("performance.operationsPerSecond.palParkAreaRetrieve") * rateMultiplier * instanceMultiplier
    val regionListPerSecond = config.getDouble("performance.operationsPerSecond.regionList") * rateMultiplier * instanceMultiplier
    val regionRetrievePerSecond = config.getDouble("performance.operationsPerSecond.regionRetrieve") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val location_area_listQUERYFeeder = csv(userDataDirectory + File.separator + "locationAreaList-queryParams.csv").random
    val location_area_retrievePATHFeeder = csv(userDataDirectory + File.separator + "locationAreaRetrieve-pathParams.csv").random
    val location_listQUERYFeeder = csv(userDataDirectory + File.separator + "locationList-queryParams.csv").random
    val location_retrievePATHFeeder = csv(userDataDirectory + File.separator + "locationRetrieve-pathParams.csv").random
    val pal_park_area_listQUERYFeeder = csv(userDataDirectory + File.separator + "palParkAreaList-queryParams.csv").random
    val pal_park_area_retrievePATHFeeder = csv(userDataDirectory + File.separator + "palParkAreaRetrieve-pathParams.csv").random
    val region_listQUERYFeeder = csv(userDataDirectory + File.separator + "regionList-queryParams.csv").random
    val region_retrievePATHFeeder = csv(userDataDirectory + File.separator + "regionRetrieve-pathParams.csv").random

    // Setup all scenarios

    
    val scnlocationAreaList = scenario("locationAreaListSimulation")
        .feed(location_area_listQUERYFeeder)
        .exec(http("locationAreaList")
        .httpRequest("GET","/api/v2/location-area/")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnlocationAreaList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlocationAreaList.inject(
        rampUsersPerSec(1) to(locationAreaListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(locationAreaListPerSecond) during(durationSeconds),
        rampUsersPerSec(locationAreaListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlocationAreaRetrieve = scenario("locationAreaRetrieveSimulation")
        .feed(location_area_retrievePATHFeeder)
        .exec(http("locationAreaRetrieve")
        .httpRequest("GET","/api/v2/location-area/${id}/")
)

    // Run scnlocationAreaRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlocationAreaRetrieve.inject(
        rampUsersPerSec(1) to(locationAreaRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(locationAreaRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(locationAreaRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlocationList = scenario("locationListSimulation")
        .feed(location_listQUERYFeeder)
        .exec(http("locationList")
        .httpRequest("GET","/api/v2/location/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnlocationList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlocationList.inject(
        rampUsersPerSec(1) to(locationListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(locationListPerSecond) during(durationSeconds),
        rampUsersPerSec(locationListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlocationRetrieve = scenario("locationRetrieveSimulation")
        .feed(location_retrievePATHFeeder)
        .exec(http("locationRetrieve")
        .httpRequest("GET","/api/v2/location/${id}/")
)

    // Run scnlocationRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlocationRetrieve.inject(
        rampUsersPerSec(1) to(locationRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(locationRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(locationRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpalParkAreaList = scenario("palParkAreaListSimulation")
        .feed(pal_park_area_listQUERYFeeder)
        .exec(http("palParkAreaList")
        .httpRequest("GET","/api/v2/pal-park-area/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnpalParkAreaList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpalParkAreaList.inject(
        rampUsersPerSec(1) to(palParkAreaListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(palParkAreaListPerSecond) during(durationSeconds),
        rampUsersPerSec(palParkAreaListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpalParkAreaRetrieve = scenario("palParkAreaRetrieveSimulation")
        .feed(pal_park_area_retrievePATHFeeder)
        .exec(http("palParkAreaRetrieve")
        .httpRequest("GET","/api/v2/pal-park-area/${id}/")
)

    // Run scnpalParkAreaRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpalParkAreaRetrieve.inject(
        rampUsersPerSec(1) to(palParkAreaRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(palParkAreaRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(palParkAreaRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnregionList = scenario("regionListSimulation")
        .feed(region_listQUERYFeeder)
        .exec(http("regionList")
        .httpRequest("GET","/api/v2/region/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnregionList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnregionList.inject(
        rampUsersPerSec(1) to(regionListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(regionListPerSecond) during(durationSeconds),
        rampUsersPerSec(regionListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnregionRetrieve = scenario("regionRetrieveSimulation")
        .feed(region_retrievePATHFeeder)
        .exec(http("regionRetrieve")
        .httpRequest("GET","/api/v2/region/${id}/")
)

    // Run scnregionRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnregionRetrieve.inject(
        rampUsersPerSec(1) to(regionRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(regionRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(regionRetrievePerSecond) to(1) during(rampDownSeconds)
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
