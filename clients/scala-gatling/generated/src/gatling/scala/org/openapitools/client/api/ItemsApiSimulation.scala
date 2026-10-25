package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class ItemsApiSimulation extends Simulation {

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
    val itemAttributeListPerSecond = config.getDouble("performance.operationsPerSecond.itemAttributeList") * rateMultiplier * instanceMultiplier
    val itemAttributeRetrievePerSecond = config.getDouble("performance.operationsPerSecond.itemAttributeRetrieve") * rateMultiplier * instanceMultiplier
    val itemCategoryListPerSecond = config.getDouble("performance.operationsPerSecond.itemCategoryList") * rateMultiplier * instanceMultiplier
    val itemCategoryRetrievePerSecond = config.getDouble("performance.operationsPerSecond.itemCategoryRetrieve") * rateMultiplier * instanceMultiplier
    val itemFlingEffectListPerSecond = config.getDouble("performance.operationsPerSecond.itemFlingEffectList") * rateMultiplier * instanceMultiplier
    val itemFlingEffectRetrievePerSecond = config.getDouble("performance.operationsPerSecond.itemFlingEffectRetrieve") * rateMultiplier * instanceMultiplier
    val itemListPerSecond = config.getDouble("performance.operationsPerSecond.itemList") * rateMultiplier * instanceMultiplier
    val itemPocketListPerSecond = config.getDouble("performance.operationsPerSecond.itemPocketList") * rateMultiplier * instanceMultiplier
    val itemPocketRetrievePerSecond = config.getDouble("performance.operationsPerSecond.itemPocketRetrieve") * rateMultiplier * instanceMultiplier
    val itemRetrievePerSecond = config.getDouble("performance.operationsPerSecond.itemRetrieve") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val item_attribute_listQUERYFeeder = csv(userDataDirectory + File.separator + "itemAttributeList-queryParams.csv").random
    val item_attribute_retrievePATHFeeder = csv(userDataDirectory + File.separator + "itemAttributeRetrieve-pathParams.csv").random
    val item_category_listQUERYFeeder = csv(userDataDirectory + File.separator + "itemCategoryList-queryParams.csv").random
    val item_category_retrievePATHFeeder = csv(userDataDirectory + File.separator + "itemCategoryRetrieve-pathParams.csv").random
    val item_fling_effect_listQUERYFeeder = csv(userDataDirectory + File.separator + "itemFlingEffectList-queryParams.csv").random
    val item_fling_effect_retrievePATHFeeder = csv(userDataDirectory + File.separator + "itemFlingEffectRetrieve-pathParams.csv").random
    val item_listQUERYFeeder = csv(userDataDirectory + File.separator + "itemList-queryParams.csv").random
    val item_pocket_listQUERYFeeder = csv(userDataDirectory + File.separator + "itemPocketList-queryParams.csv").random
    val item_pocket_retrievePATHFeeder = csv(userDataDirectory + File.separator + "itemPocketRetrieve-pathParams.csv").random
    val item_retrievePATHFeeder = csv(userDataDirectory + File.separator + "itemRetrieve-pathParams.csv").random

    // Setup all scenarios

    
    val scnitemAttributeList = scenario("itemAttributeListSimulation")
        .feed(item_attribute_listQUERYFeeder)
        .exec(http("itemAttributeList")
        .httpRequest("GET","/api/v2/item-attribute/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnitemAttributeList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemAttributeList.inject(
        rampUsersPerSec(1) to(itemAttributeListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemAttributeListPerSecond) during(durationSeconds),
        rampUsersPerSec(itemAttributeListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemAttributeRetrieve = scenario("itemAttributeRetrieveSimulation")
        .feed(item_attribute_retrievePATHFeeder)
        .exec(http("itemAttributeRetrieve")
        .httpRequest("GET","/api/v2/item-attribute/${id}/")
)

    // Run scnitemAttributeRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemAttributeRetrieve.inject(
        rampUsersPerSec(1) to(itemAttributeRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemAttributeRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(itemAttributeRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemCategoryList = scenario("itemCategoryListSimulation")
        .feed(item_category_listQUERYFeeder)
        .exec(http("itemCategoryList")
        .httpRequest("GET","/api/v2/item-category/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnitemCategoryList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemCategoryList.inject(
        rampUsersPerSec(1) to(itemCategoryListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemCategoryListPerSecond) during(durationSeconds),
        rampUsersPerSec(itemCategoryListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemCategoryRetrieve = scenario("itemCategoryRetrieveSimulation")
        .feed(item_category_retrievePATHFeeder)
        .exec(http("itemCategoryRetrieve")
        .httpRequest("GET","/api/v2/item-category/${id}/")
)

    // Run scnitemCategoryRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemCategoryRetrieve.inject(
        rampUsersPerSec(1) to(itemCategoryRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemCategoryRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(itemCategoryRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemFlingEffectList = scenario("itemFlingEffectListSimulation")
        .feed(item_fling_effect_listQUERYFeeder)
        .exec(http("itemFlingEffectList")
        .httpRequest("GET","/api/v2/item-fling-effect/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnitemFlingEffectList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemFlingEffectList.inject(
        rampUsersPerSec(1) to(itemFlingEffectListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemFlingEffectListPerSecond) during(durationSeconds),
        rampUsersPerSec(itemFlingEffectListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemFlingEffectRetrieve = scenario("itemFlingEffectRetrieveSimulation")
        .feed(item_fling_effect_retrievePATHFeeder)
        .exec(http("itemFlingEffectRetrieve")
        .httpRequest("GET","/api/v2/item-fling-effect/${id}/")
)

    // Run scnitemFlingEffectRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemFlingEffectRetrieve.inject(
        rampUsersPerSec(1) to(itemFlingEffectRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemFlingEffectRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(itemFlingEffectRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemList = scenario("itemListSimulation")
        .feed(item_listQUERYFeeder)
        .exec(http("itemList")
        .httpRequest("GET","/api/v2/item/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnitemList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemList.inject(
        rampUsersPerSec(1) to(itemListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemListPerSecond) during(durationSeconds),
        rampUsersPerSec(itemListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemPocketList = scenario("itemPocketListSimulation")
        .feed(item_pocket_listQUERYFeeder)
        .exec(http("itemPocketList")
        .httpRequest("GET","/api/v2/item-pocket/")
        .queryParam("q","${q}")
        .queryParam("offset","${offset}")
        .queryParam("limit","${limit}")
)

    // Run scnitemPocketList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemPocketList.inject(
        rampUsersPerSec(1) to(itemPocketListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemPocketListPerSecond) during(durationSeconds),
        rampUsersPerSec(itemPocketListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemPocketRetrieve = scenario("itemPocketRetrieveSimulation")
        .feed(item_pocket_retrievePATHFeeder)
        .exec(http("itemPocketRetrieve")
        .httpRequest("GET","/api/v2/item-pocket/${id}/")
)

    // Run scnitemPocketRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemPocketRetrieve.inject(
        rampUsersPerSec(1) to(itemPocketRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemPocketRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(itemPocketRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnitemRetrieve = scenario("itemRetrieveSimulation")
        .feed(item_retrievePATHFeeder)
        .exec(http("itemRetrieve")
        .httpRequest("GET","/api/v2/item/${id}/")
)

    // Run scnitemRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnitemRetrieve.inject(
        rampUsersPerSec(1) to(itemRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(itemRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(itemRetrievePerSecond) to(1) during(rampDownSeconds)
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
