package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class MovesApiSimulation extends Simulation {

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
    val moveAilmentListPerSecond = config.getDouble("performance.operationsPerSecond.moveAilmentList") * rateMultiplier * instanceMultiplier
    val moveAilmentRetrievePerSecond = config.getDouble("performance.operationsPerSecond.moveAilmentRetrieve") * rateMultiplier * instanceMultiplier
    val moveBattleStyleListPerSecond = config.getDouble("performance.operationsPerSecond.moveBattleStyleList") * rateMultiplier * instanceMultiplier
    val moveBattleStyleRetrievePerSecond = config.getDouble("performance.operationsPerSecond.moveBattleStyleRetrieve") * rateMultiplier * instanceMultiplier
    val moveCategoryListPerSecond = config.getDouble("performance.operationsPerSecond.moveCategoryList") * rateMultiplier * instanceMultiplier
    val moveCategoryRetrievePerSecond = config.getDouble("performance.operationsPerSecond.moveCategoryRetrieve") * rateMultiplier * instanceMultiplier
    val moveLearnMethodListPerSecond = config.getDouble("performance.operationsPerSecond.moveLearnMethodList") * rateMultiplier * instanceMultiplier
    val moveLearnMethodRetrievePerSecond = config.getDouble("performance.operationsPerSecond.moveLearnMethodRetrieve") * rateMultiplier * instanceMultiplier
    val moveListPerSecond = config.getDouble("performance.operationsPerSecond.moveList") * rateMultiplier * instanceMultiplier
    val moveRetrievePerSecond = config.getDouble("performance.operationsPerSecond.moveRetrieve") * rateMultiplier * instanceMultiplier
    val moveTargetListPerSecond = config.getDouble("performance.operationsPerSecond.moveTargetList") * rateMultiplier * instanceMultiplier
    val moveTargetRetrievePerSecond = config.getDouble("performance.operationsPerSecond.moveTargetRetrieve") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val move_ailment_listQUERYFeeder = csv(userDataDirectory + File.separator + "moveAilmentList-queryParams.csv").random
    val move_ailment_retrievePATHFeeder = csv(userDataDirectory + File.separator + "moveAilmentRetrieve-pathParams.csv").random
    val move_battle_style_listQUERYFeeder = csv(userDataDirectory + File.separator + "moveBattleStyleList-queryParams.csv").random
    val move_battle_style_retrievePATHFeeder = csv(userDataDirectory + File.separator + "moveBattleStyleRetrieve-pathParams.csv").random
    val move_category_listQUERYFeeder = csv(userDataDirectory + File.separator + "moveCategoryList-queryParams.csv").random
    val move_category_retrievePATHFeeder = csv(userDataDirectory + File.separator + "moveCategoryRetrieve-pathParams.csv").random
    val move_learn_method_listQUERYFeeder = csv(userDataDirectory + File.separator + "moveLearnMethodList-queryParams.csv").random
    val move_learn_method_retrievePATHFeeder = csv(userDataDirectory + File.separator + "moveLearnMethodRetrieve-pathParams.csv").random
    val move_listQUERYFeeder = csv(userDataDirectory + File.separator + "moveList-queryParams.csv").random
    val move_retrievePATHFeeder = csv(userDataDirectory + File.separator + "moveRetrieve-pathParams.csv").random
    val move_target_listQUERYFeeder = csv(userDataDirectory + File.separator + "moveTargetList-queryParams.csv").random
    val move_target_retrievePATHFeeder = csv(userDataDirectory + File.separator + "moveTargetRetrieve-pathParams.csv").random

    // Setup all scenarios

    
    val scnmoveAilmentList = scenario("moveAilmentListSimulation")
        .feed(move_ailment_listQUERYFeeder)
        .exec(http("moveAilmentList")
        .httpRequest("GET","/api/v2/move-ailment/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnmoveAilmentList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveAilmentList.inject(
        rampUsersPerSec(1) to(moveAilmentListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveAilmentListPerSecond) during(durationSeconds),
        rampUsersPerSec(moveAilmentListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveAilmentRetrieve = scenario("moveAilmentRetrieveSimulation")
        .feed(move_ailment_retrievePATHFeeder)
        .exec(http("moveAilmentRetrieve")
        .httpRequest("GET","/api/v2/move-ailment/${id}/")
)

    // Run scnmoveAilmentRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveAilmentRetrieve.inject(
        rampUsersPerSec(1) to(moveAilmentRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveAilmentRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(moveAilmentRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveBattleStyleList = scenario("moveBattleStyleListSimulation")
        .feed(move_battle_style_listQUERYFeeder)
        .exec(http("moveBattleStyleList")
        .httpRequest("GET","/api/v2/move-battle-style/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnmoveBattleStyleList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveBattleStyleList.inject(
        rampUsersPerSec(1) to(moveBattleStyleListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveBattleStyleListPerSecond) during(durationSeconds),
        rampUsersPerSec(moveBattleStyleListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveBattleStyleRetrieve = scenario("moveBattleStyleRetrieveSimulation")
        .feed(move_battle_style_retrievePATHFeeder)
        .exec(http("moveBattleStyleRetrieve")
        .httpRequest("GET","/api/v2/move-battle-style/${id}/")
)

    // Run scnmoveBattleStyleRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveBattleStyleRetrieve.inject(
        rampUsersPerSec(1) to(moveBattleStyleRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveBattleStyleRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(moveBattleStyleRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveCategoryList = scenario("moveCategoryListSimulation")
        .feed(move_category_listQUERYFeeder)
        .exec(http("moveCategoryList")
        .httpRequest("GET","/api/v2/move-category/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnmoveCategoryList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveCategoryList.inject(
        rampUsersPerSec(1) to(moveCategoryListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveCategoryListPerSecond) during(durationSeconds),
        rampUsersPerSec(moveCategoryListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveCategoryRetrieve = scenario("moveCategoryRetrieveSimulation")
        .feed(move_category_retrievePATHFeeder)
        .exec(http("moveCategoryRetrieve")
        .httpRequest("GET","/api/v2/move-category/${id}/")
)

    // Run scnmoveCategoryRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveCategoryRetrieve.inject(
        rampUsersPerSec(1) to(moveCategoryRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveCategoryRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(moveCategoryRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveLearnMethodList = scenario("moveLearnMethodListSimulation")
        .feed(move_learn_method_listQUERYFeeder)
        .exec(http("moveLearnMethodList")
        .httpRequest("GET","/api/v2/move-learn-method/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnmoveLearnMethodList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveLearnMethodList.inject(
        rampUsersPerSec(1) to(moveLearnMethodListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveLearnMethodListPerSecond) during(durationSeconds),
        rampUsersPerSec(moveLearnMethodListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveLearnMethodRetrieve = scenario("moveLearnMethodRetrieveSimulation")
        .feed(move_learn_method_retrievePATHFeeder)
        .exec(http("moveLearnMethodRetrieve")
        .httpRequest("GET","/api/v2/move-learn-method/${id}/")
)

    // Run scnmoveLearnMethodRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveLearnMethodRetrieve.inject(
        rampUsersPerSec(1) to(moveLearnMethodRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveLearnMethodRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(moveLearnMethodRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveList = scenario("moveListSimulation")
        .feed(move_listQUERYFeeder)
        .exec(http("moveList")
        .httpRequest("GET","/api/v2/move/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnmoveList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveList.inject(
        rampUsersPerSec(1) to(moveListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveListPerSecond) during(durationSeconds),
        rampUsersPerSec(moveListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveRetrieve = scenario("moveRetrieveSimulation")
        .feed(move_retrievePATHFeeder)
        .exec(http("moveRetrieve")
        .httpRequest("GET","/api/v2/move/${id}/")
)

    // Run scnmoveRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveRetrieve.inject(
        rampUsersPerSec(1) to(moveRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(moveRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveTargetList = scenario("moveTargetListSimulation")
        .feed(move_target_listQUERYFeeder)
        .exec(http("moveTargetList")
        .httpRequest("GET","/api/v2/move-target/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnmoveTargetList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveTargetList.inject(
        rampUsersPerSec(1) to(moveTargetListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveTargetListPerSecond) during(durationSeconds),
        rampUsersPerSec(moveTargetListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveTargetRetrieve = scenario("moveTargetRetrieveSimulation")
        .feed(move_target_retrievePATHFeeder)
        .exec(http("moveTargetRetrieve")
        .httpRequest("GET","/api/v2/move-target/${id}/")
)

    // Run scnmoveTargetRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveTargetRetrieve.inject(
        rampUsersPerSec(1) to(moveTargetRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveTargetRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(moveTargetRetrievePerSecond) to(1) during(rampDownSeconds)
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
