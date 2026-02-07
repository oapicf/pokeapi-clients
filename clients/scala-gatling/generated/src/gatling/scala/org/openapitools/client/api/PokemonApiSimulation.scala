package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class PokemonApiSimulation extends Simulation {

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
    val abilityListPerSecond = config.getDouble("performance.operationsPerSecond.abilityList") * rateMultiplier * instanceMultiplier
    val abilityRetrievePerSecond = config.getDouble("performance.operationsPerSecond.abilityRetrieve") * rateMultiplier * instanceMultiplier
    val characteristicListPerSecond = config.getDouble("performance.operationsPerSecond.characteristicList") * rateMultiplier * instanceMultiplier
    val characteristicRetrievePerSecond = config.getDouble("performance.operationsPerSecond.characteristicRetrieve") * rateMultiplier * instanceMultiplier
    val eggGroupListPerSecond = config.getDouble("performance.operationsPerSecond.eggGroupList") * rateMultiplier * instanceMultiplier
    val eggGroupRetrievePerSecond = config.getDouble("performance.operationsPerSecond.eggGroupRetrieve") * rateMultiplier * instanceMultiplier
    val genderListPerSecond = config.getDouble("performance.operationsPerSecond.genderList") * rateMultiplier * instanceMultiplier
    val genderRetrievePerSecond = config.getDouble("performance.operationsPerSecond.genderRetrieve") * rateMultiplier * instanceMultiplier
    val growthRateListPerSecond = config.getDouble("performance.operationsPerSecond.growthRateList") * rateMultiplier * instanceMultiplier
    val growthRateRetrievePerSecond = config.getDouble("performance.operationsPerSecond.growthRateRetrieve") * rateMultiplier * instanceMultiplier
    val moveDamageClassListPerSecond = config.getDouble("performance.operationsPerSecond.moveDamageClassList") * rateMultiplier * instanceMultiplier
    val moveDamageClassRetrievePerSecond = config.getDouble("performance.operationsPerSecond.moveDamageClassRetrieve") * rateMultiplier * instanceMultiplier
    val natureListPerSecond = config.getDouble("performance.operationsPerSecond.natureList") * rateMultiplier * instanceMultiplier
    val natureRetrievePerSecond = config.getDouble("performance.operationsPerSecond.natureRetrieve") * rateMultiplier * instanceMultiplier
    val pokeathlonStatListPerSecond = config.getDouble("performance.operationsPerSecond.pokeathlonStatList") * rateMultiplier * instanceMultiplier
    val pokeathlonStatRetrievePerSecond = config.getDouble("performance.operationsPerSecond.pokeathlonStatRetrieve") * rateMultiplier * instanceMultiplier
    val pokemonColorListPerSecond = config.getDouble("performance.operationsPerSecond.pokemonColorList") * rateMultiplier * instanceMultiplier
    val pokemonColorRetrievePerSecond = config.getDouble("performance.operationsPerSecond.pokemonColorRetrieve") * rateMultiplier * instanceMultiplier
    val pokemonFormListPerSecond = config.getDouble("performance.operationsPerSecond.pokemonFormList") * rateMultiplier * instanceMultiplier
    val pokemonFormRetrievePerSecond = config.getDouble("performance.operationsPerSecond.pokemonFormRetrieve") * rateMultiplier * instanceMultiplier
    val pokemonHabitatListPerSecond = config.getDouble("performance.operationsPerSecond.pokemonHabitatList") * rateMultiplier * instanceMultiplier
    val pokemonHabitatRetrievePerSecond = config.getDouble("performance.operationsPerSecond.pokemonHabitatRetrieve") * rateMultiplier * instanceMultiplier
    val pokemonListPerSecond = config.getDouble("performance.operationsPerSecond.pokemonList") * rateMultiplier * instanceMultiplier
    val pokemonRetrievePerSecond = config.getDouble("performance.operationsPerSecond.pokemonRetrieve") * rateMultiplier * instanceMultiplier
    val pokemonShapeListPerSecond = config.getDouble("performance.operationsPerSecond.pokemonShapeList") * rateMultiplier * instanceMultiplier
    val pokemonShapeRetrievePerSecond = config.getDouble("performance.operationsPerSecond.pokemonShapeRetrieve") * rateMultiplier * instanceMultiplier
    val pokemonSpeciesListPerSecond = config.getDouble("performance.operationsPerSecond.pokemonSpeciesList") * rateMultiplier * instanceMultiplier
    val pokemonSpeciesRetrievePerSecond = config.getDouble("performance.operationsPerSecond.pokemonSpeciesRetrieve") * rateMultiplier * instanceMultiplier
    val statListPerSecond = config.getDouble("performance.operationsPerSecond.statList") * rateMultiplier * instanceMultiplier
    val statRetrievePerSecond = config.getDouble("performance.operationsPerSecond.statRetrieve") * rateMultiplier * instanceMultiplier
    val typeListPerSecond = config.getDouble("performance.operationsPerSecond.typeList") * rateMultiplier * instanceMultiplier
    val typeRetrievePerSecond = config.getDouble("performance.operationsPerSecond.typeRetrieve") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val ability_listQUERYFeeder = csv(userDataDirectory + File.separator + "abilityList-queryParams.csv").random
    val ability_retrievePATHFeeder = csv(userDataDirectory + File.separator + "abilityRetrieve-pathParams.csv").random
    val characteristic_listQUERYFeeder = csv(userDataDirectory + File.separator + "characteristicList-queryParams.csv").random
    val characteristic_retrievePATHFeeder = csv(userDataDirectory + File.separator + "characteristicRetrieve-pathParams.csv").random
    val egg_group_listQUERYFeeder = csv(userDataDirectory + File.separator + "eggGroupList-queryParams.csv").random
    val egg_group_retrievePATHFeeder = csv(userDataDirectory + File.separator + "eggGroupRetrieve-pathParams.csv").random
    val gender_listQUERYFeeder = csv(userDataDirectory + File.separator + "genderList-queryParams.csv").random
    val gender_retrievePATHFeeder = csv(userDataDirectory + File.separator + "genderRetrieve-pathParams.csv").random
    val growth_rate_listQUERYFeeder = csv(userDataDirectory + File.separator + "growthRateList-queryParams.csv").random
    val growth_rate_retrievePATHFeeder = csv(userDataDirectory + File.separator + "growthRateRetrieve-pathParams.csv").random
    val move_damage_class_listQUERYFeeder = csv(userDataDirectory + File.separator + "moveDamageClassList-queryParams.csv").random
    val move_damage_class_retrievePATHFeeder = csv(userDataDirectory + File.separator + "moveDamageClassRetrieve-pathParams.csv").random
    val nature_listQUERYFeeder = csv(userDataDirectory + File.separator + "natureList-queryParams.csv").random
    val nature_retrievePATHFeeder = csv(userDataDirectory + File.separator + "natureRetrieve-pathParams.csv").random
    val pokeathlon_stat_listQUERYFeeder = csv(userDataDirectory + File.separator + "pokeathlonStatList-queryParams.csv").random
    val pokeathlon_stat_retrievePATHFeeder = csv(userDataDirectory + File.separator + "pokeathlonStatRetrieve-pathParams.csv").random
    val pokemon_color_listQUERYFeeder = csv(userDataDirectory + File.separator + "pokemonColorList-queryParams.csv").random
    val pokemon_color_retrievePATHFeeder = csv(userDataDirectory + File.separator + "pokemonColorRetrieve-pathParams.csv").random
    val pokemon_form_listQUERYFeeder = csv(userDataDirectory + File.separator + "pokemonFormList-queryParams.csv").random
    val pokemon_form_retrievePATHFeeder = csv(userDataDirectory + File.separator + "pokemonFormRetrieve-pathParams.csv").random
    val pokemon_habitat_listQUERYFeeder = csv(userDataDirectory + File.separator + "pokemonHabitatList-queryParams.csv").random
    val pokemon_habitat_retrievePATHFeeder = csv(userDataDirectory + File.separator + "pokemonHabitatRetrieve-pathParams.csv").random
    val pokemon_listQUERYFeeder = csv(userDataDirectory + File.separator + "pokemonList-queryParams.csv").random
    val pokemon_retrievePATHFeeder = csv(userDataDirectory + File.separator + "pokemonRetrieve-pathParams.csv").random
    val pokemon_shape_listQUERYFeeder = csv(userDataDirectory + File.separator + "pokemonShapeList-queryParams.csv").random
    val pokemon_shape_retrievePATHFeeder = csv(userDataDirectory + File.separator + "pokemonShapeRetrieve-pathParams.csv").random
    val pokemon_species_listQUERYFeeder = csv(userDataDirectory + File.separator + "pokemonSpeciesList-queryParams.csv").random
    val pokemon_species_retrievePATHFeeder = csv(userDataDirectory + File.separator + "pokemonSpeciesRetrieve-pathParams.csv").random
    val stat_listQUERYFeeder = csv(userDataDirectory + File.separator + "statList-queryParams.csv").random
    val stat_retrievePATHFeeder = csv(userDataDirectory + File.separator + "statRetrieve-pathParams.csv").random
    val type_listQUERYFeeder = csv(userDataDirectory + File.separator + "typeList-queryParams.csv").random
    val type_retrievePATHFeeder = csv(userDataDirectory + File.separator + "typeRetrieve-pathParams.csv").random

    // Setup all scenarios

    
    val scnabilityList = scenario("abilityListSimulation")
        .feed(ability_listQUERYFeeder)
        .exec(http("abilityList")
        .httpRequest("GET","/api/v2/ability/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnabilityList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnabilityList.inject(
        rampUsersPerSec(1) to(abilityListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(abilityListPerSecond) during(durationSeconds),
        rampUsersPerSec(abilityListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnabilityRetrieve = scenario("abilityRetrieveSimulation")
        .feed(ability_retrievePATHFeeder)
        .exec(http("abilityRetrieve")
        .httpRequest("GET","/api/v2/ability/${id}/")
)

    // Run scnabilityRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnabilityRetrieve.inject(
        rampUsersPerSec(1) to(abilityRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(abilityRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(abilityRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncharacteristicList = scenario("characteristicListSimulation")
        .feed(characteristic_listQUERYFeeder)
        .exec(http("characteristicList")
        .httpRequest("GET","/api/v2/characteristic/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scncharacteristicList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncharacteristicList.inject(
        rampUsersPerSec(1) to(characteristicListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(characteristicListPerSecond) during(durationSeconds),
        rampUsersPerSec(characteristicListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scncharacteristicRetrieve = scenario("characteristicRetrieveSimulation")
        .feed(characteristic_retrievePATHFeeder)
        .exec(http("characteristicRetrieve")
        .httpRequest("GET","/api/v2/characteristic/${id}/")
)

    // Run scncharacteristicRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncharacteristicRetrieve.inject(
        rampUsersPerSec(1) to(characteristicRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(characteristicRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(characteristicRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scneggGroupList = scenario("eggGroupListSimulation")
        .feed(egg_group_listQUERYFeeder)
        .exec(http("eggGroupList")
        .httpRequest("GET","/api/v2/egg-group/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scneggGroupList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scneggGroupList.inject(
        rampUsersPerSec(1) to(eggGroupListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(eggGroupListPerSecond) during(durationSeconds),
        rampUsersPerSec(eggGroupListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scneggGroupRetrieve = scenario("eggGroupRetrieveSimulation")
        .feed(egg_group_retrievePATHFeeder)
        .exec(http("eggGroupRetrieve")
        .httpRequest("GET","/api/v2/egg-group/${id}/")
)

    // Run scneggGroupRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scneggGroupRetrieve.inject(
        rampUsersPerSec(1) to(eggGroupRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(eggGroupRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(eggGroupRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenderList = scenario("genderListSimulation")
        .feed(gender_listQUERYFeeder)
        .exec(http("genderList")
        .httpRequest("GET","/api/v2/gender/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scngenderList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenderList.inject(
        rampUsersPerSec(1) to(genderListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(genderListPerSecond) during(durationSeconds),
        rampUsersPerSec(genderListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngenderRetrieve = scenario("genderRetrieveSimulation")
        .feed(gender_retrievePATHFeeder)
        .exec(http("genderRetrieve")
        .httpRequest("GET","/api/v2/gender/${id}/")
)

    // Run scngenderRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngenderRetrieve.inject(
        rampUsersPerSec(1) to(genderRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(genderRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(genderRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngrowthRateList = scenario("growthRateListSimulation")
        .feed(growth_rate_listQUERYFeeder)
        .exec(http("growthRateList")
        .httpRequest("GET","/api/v2/growth-rate/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scngrowthRateList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngrowthRateList.inject(
        rampUsersPerSec(1) to(growthRateListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(growthRateListPerSecond) during(durationSeconds),
        rampUsersPerSec(growthRateListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scngrowthRateRetrieve = scenario("growthRateRetrieveSimulation")
        .feed(growth_rate_retrievePATHFeeder)
        .exec(http("growthRateRetrieve")
        .httpRequest("GET","/api/v2/growth-rate/${id}/")
)

    // Run scngrowthRateRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scngrowthRateRetrieve.inject(
        rampUsersPerSec(1) to(growthRateRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(growthRateRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(growthRateRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveDamageClassList = scenario("moveDamageClassListSimulation")
        .feed(move_damage_class_listQUERYFeeder)
        .exec(http("moveDamageClassList")
        .httpRequest("GET","/api/v2/move-damage-class/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnmoveDamageClassList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveDamageClassList.inject(
        rampUsersPerSec(1) to(moveDamageClassListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveDamageClassListPerSecond) during(durationSeconds),
        rampUsersPerSec(moveDamageClassListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnmoveDamageClassRetrieve = scenario("moveDamageClassRetrieveSimulation")
        .feed(move_damage_class_retrievePATHFeeder)
        .exec(http("moveDamageClassRetrieve")
        .httpRequest("GET","/api/v2/move-damage-class/${id}/")
)

    // Run scnmoveDamageClassRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnmoveDamageClassRetrieve.inject(
        rampUsersPerSec(1) to(moveDamageClassRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(moveDamageClassRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(moveDamageClassRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnnatureList = scenario("natureListSimulation")
        .feed(nature_listQUERYFeeder)
        .exec(http("natureList")
        .httpRequest("GET","/api/v2/nature/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnnatureList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnnatureList.inject(
        rampUsersPerSec(1) to(natureListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(natureListPerSecond) during(durationSeconds),
        rampUsersPerSec(natureListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnnatureRetrieve = scenario("natureRetrieveSimulation")
        .feed(nature_retrievePATHFeeder)
        .exec(http("natureRetrieve")
        .httpRequest("GET","/api/v2/nature/${id}/")
)

    // Run scnnatureRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnnatureRetrieve.inject(
        rampUsersPerSec(1) to(natureRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(natureRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(natureRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokeathlonStatList = scenario("pokeathlonStatListSimulation")
        .feed(pokeathlon_stat_listQUERYFeeder)
        .exec(http("pokeathlonStatList")
        .httpRequest("GET","/api/v2/pokeathlon-stat/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnpokeathlonStatList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokeathlonStatList.inject(
        rampUsersPerSec(1) to(pokeathlonStatListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokeathlonStatListPerSecond) during(durationSeconds),
        rampUsersPerSec(pokeathlonStatListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokeathlonStatRetrieve = scenario("pokeathlonStatRetrieveSimulation")
        .feed(pokeathlon_stat_retrievePATHFeeder)
        .exec(http("pokeathlonStatRetrieve")
        .httpRequest("GET","/api/v2/pokeathlon-stat/${id}/")
)

    // Run scnpokeathlonStatRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokeathlonStatRetrieve.inject(
        rampUsersPerSec(1) to(pokeathlonStatRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokeathlonStatRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(pokeathlonStatRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonColorList = scenario("pokemonColorListSimulation")
        .feed(pokemon_color_listQUERYFeeder)
        .exec(http("pokemonColorList")
        .httpRequest("GET","/api/v2/pokemon-color/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnpokemonColorList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonColorList.inject(
        rampUsersPerSec(1) to(pokemonColorListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonColorListPerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonColorListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonColorRetrieve = scenario("pokemonColorRetrieveSimulation")
        .feed(pokemon_color_retrievePATHFeeder)
        .exec(http("pokemonColorRetrieve")
        .httpRequest("GET","/api/v2/pokemon-color/${id}/")
)

    // Run scnpokemonColorRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonColorRetrieve.inject(
        rampUsersPerSec(1) to(pokemonColorRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonColorRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonColorRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonFormList = scenario("pokemonFormListSimulation")
        .feed(pokemon_form_listQUERYFeeder)
        .exec(http("pokemonFormList")
        .httpRequest("GET","/api/v2/pokemon-form/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnpokemonFormList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonFormList.inject(
        rampUsersPerSec(1) to(pokemonFormListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonFormListPerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonFormListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonFormRetrieve = scenario("pokemonFormRetrieveSimulation")
        .feed(pokemon_form_retrievePATHFeeder)
        .exec(http("pokemonFormRetrieve")
        .httpRequest("GET","/api/v2/pokemon-form/${id}/")
)

    // Run scnpokemonFormRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonFormRetrieve.inject(
        rampUsersPerSec(1) to(pokemonFormRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonFormRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonFormRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonHabitatList = scenario("pokemonHabitatListSimulation")
        .feed(pokemon_habitat_listQUERYFeeder)
        .exec(http("pokemonHabitatList")
        .httpRequest("GET","/api/v2/pokemon-habitat/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnpokemonHabitatList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonHabitatList.inject(
        rampUsersPerSec(1) to(pokemonHabitatListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonHabitatListPerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonHabitatListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonHabitatRetrieve = scenario("pokemonHabitatRetrieveSimulation")
        .feed(pokemon_habitat_retrievePATHFeeder)
        .exec(http("pokemonHabitatRetrieve")
        .httpRequest("GET","/api/v2/pokemon-habitat/${id}/")
)

    // Run scnpokemonHabitatRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonHabitatRetrieve.inject(
        rampUsersPerSec(1) to(pokemonHabitatRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonHabitatRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonHabitatRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonList = scenario("pokemonListSimulation")
        .feed(pokemon_listQUERYFeeder)
        .exec(http("pokemonList")
        .httpRequest("GET","/api/v2/pokemon/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnpokemonList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonList.inject(
        rampUsersPerSec(1) to(pokemonListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonListPerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonRetrieve = scenario("pokemonRetrieveSimulation")
        .feed(pokemon_retrievePATHFeeder)
        .exec(http("pokemonRetrieve")
        .httpRequest("GET","/api/v2/pokemon/${id}/")
)

    // Run scnpokemonRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonRetrieve.inject(
        rampUsersPerSec(1) to(pokemonRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonShapeList = scenario("pokemonShapeListSimulation")
        .feed(pokemon_shape_listQUERYFeeder)
        .exec(http("pokemonShapeList")
        .httpRequest("GET","/api/v2/pokemon-shape/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnpokemonShapeList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonShapeList.inject(
        rampUsersPerSec(1) to(pokemonShapeListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonShapeListPerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonShapeListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonShapeRetrieve = scenario("pokemonShapeRetrieveSimulation")
        .feed(pokemon_shape_retrievePATHFeeder)
        .exec(http("pokemonShapeRetrieve")
        .httpRequest("GET","/api/v2/pokemon-shape/${id}/")
)

    // Run scnpokemonShapeRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonShapeRetrieve.inject(
        rampUsersPerSec(1) to(pokemonShapeRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonShapeRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonShapeRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonSpeciesList = scenario("pokemonSpeciesListSimulation")
        .feed(pokemon_species_listQUERYFeeder)
        .exec(http("pokemonSpeciesList")
        .httpRequest("GET","/api/v2/pokemon-species/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnpokemonSpeciesList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonSpeciesList.inject(
        rampUsersPerSec(1) to(pokemonSpeciesListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonSpeciesListPerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonSpeciesListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnpokemonSpeciesRetrieve = scenario("pokemonSpeciesRetrieveSimulation")
        .feed(pokemon_species_retrievePATHFeeder)
        .exec(http("pokemonSpeciesRetrieve")
        .httpRequest("GET","/api/v2/pokemon-species/${id}/")
)

    // Run scnpokemonSpeciesRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnpokemonSpeciesRetrieve.inject(
        rampUsersPerSec(1) to(pokemonSpeciesRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(pokemonSpeciesRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(pokemonSpeciesRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnstatList = scenario("statListSimulation")
        .feed(stat_listQUERYFeeder)
        .exec(http("statList")
        .httpRequest("GET","/api/v2/stat/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scnstatList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnstatList.inject(
        rampUsersPerSec(1) to(statListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(statListPerSecond) during(durationSeconds),
        rampUsersPerSec(statListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnstatRetrieve = scenario("statRetrieveSimulation")
        .feed(stat_retrievePATHFeeder)
        .exec(http("statRetrieve")
        .httpRequest("GET","/api/v2/stat/${id}/")
)

    // Run scnstatRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnstatRetrieve.inject(
        rampUsersPerSec(1) to(statRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(statRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(statRetrievePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntypeList = scenario("typeListSimulation")
        .feed(type_listQUERYFeeder)
        .exec(http("typeList")
        .httpRequest("GET","/api/v2/type/")
        .queryParam("limit","${limit}")
        .queryParam("offset","${offset}")
        .queryParam("q","${q}")
)

    // Run scntypeList with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntypeList.inject(
        rampUsersPerSec(1) to(typeListPerSecond) during(rampUpSeconds),
        constantUsersPerSec(typeListPerSecond) during(durationSeconds),
        rampUsersPerSec(typeListPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scntypeRetrieve = scenario("typeRetrieveSimulation")
        .feed(type_retrievePATHFeeder)
        .exec(http("typeRetrieve")
        .httpRequest("GET","/api/v2/type/${id}/")
)

    // Run scntypeRetrieve with warm up and reach a constant rate for entire duration
    scenarioBuilders += scntypeRetrieve.inject(
        rampUsersPerSec(1) to(typeRetrievePerSecond) during(rampUpSeconds),
        constantUsersPerSec(typeRetrievePerSecond) during(durationSeconds),
        rampUsersPerSec(typeRetrievePerSecond) to(1) during(rampDownSeconds)
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
