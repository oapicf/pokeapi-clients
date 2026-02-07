package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AbilityDetail
import org.openapitools.server.model.CharacteristicDetail
import org.openapitools.server.model.EggGroupDetail
import org.openapitools.server.model.GenderDetail
import org.openapitools.server.model.GrowthRateDetail
import org.openapitools.server.model.MoveDamageClassDetail
import org.openapitools.server.model.NatureDetail
import org.openapitools.server.model.PaginatedAbilitySummaryList
import org.openapitools.server.model.PaginatedCharacteristicSummaryList
import org.openapitools.server.model.PaginatedEggGroupSummaryList
import org.openapitools.server.model.PaginatedGenderSummaryList
import org.openapitools.server.model.PaginatedGrowthRateSummaryList
import org.openapitools.server.model.PaginatedMoveDamageClassSummaryList
import org.openapitools.server.model.PaginatedNatureSummaryList
import org.openapitools.server.model.PaginatedPokeathlonStatSummaryList
import org.openapitools.server.model.PaginatedPokemonColorSummaryList
import org.openapitools.server.model.PaginatedPokemonFormSummaryList
import org.openapitools.server.model.PaginatedPokemonHabitatSummaryList
import org.openapitools.server.model.PaginatedPokemonShapeSummaryList
import org.openapitools.server.model.PaginatedPokemonSpeciesSummaryList
import org.openapitools.server.model.PaginatedPokemonSummaryList
import org.openapitools.server.model.PaginatedStatSummaryList
import org.openapitools.server.model.PaginatedTypeSummaryList
import org.openapitools.server.model.PokeathlonStatDetail
import org.openapitools.server.model.PokemonColorDetail
import org.openapitools.server.model.PokemonDetail
import org.openapitools.server.model.PokemonFormDetail
import org.openapitools.server.model.PokemonHabitatDetail
import org.openapitools.server.model.PokemonShapeDetail
import org.openapitools.server.model.PokemonSpeciesDetail
import org.openapitools.server.model.StatDetail
import org.openapitools.server.model.TypeDetail


class PokemonApi(
    pokemonService: PokemonApiService,
    pokemonMarshaller: PokemonApiMarshaller
) {

  
  import pokemonMarshaller._

  lazy val route: Route =
    path("api" / "v2" / "ability") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.abilityList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "ability" / Segment) { (id) => 
      get {  
            pokemonService.abilityRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "characteristic") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.characteristicList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "characteristic" / Segment) { (id) => 
      get {  
            pokemonService.characteristicRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "egg-group") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.eggGroupList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "egg-group" / Segment) { (id) => 
      get {  
            pokemonService.eggGroupRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "gender") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.genderList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "gender" / Segment) { (id) => 
      get {  
            pokemonService.genderRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "growth-rate") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.growthRateList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "growth-rate" / Segment) { (id) => 
      get {  
            pokemonService.growthRateRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "move-damage-class") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.moveDamageClassList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "move-damage-class" / Segment) { (id) => 
      get {  
            pokemonService.moveDamageClassRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "nature") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.natureList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "nature" / Segment) { (id) => 
      get {  
            pokemonService.natureRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pokeathlon-stat") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.pokeathlonStatList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "pokeathlon-stat" / Segment) { (id) => 
      get {  
            pokemonService.pokeathlonStatRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pokemon-color") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.pokemonColorList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-color" / Segment) { (id) => 
      get {  
            pokemonService.pokemonColorRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pokemon-form") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.pokemonFormList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-form" / Segment) { (id) => 
      get {  
            pokemonService.pokemonFormRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pokemon-habitat") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.pokemonHabitatList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-habitat" / Segment) { (id) => 
      get {  
            pokemonService.pokemonHabitatRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pokemon") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.pokemonList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "pokemon" / Segment) { (id) => 
      get {  
            pokemonService.pokemonRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pokemon-shape") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.pokemonShapeList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-shape" / Segment) { (id) => 
      get {  
            pokemonService.pokemonShapeRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "pokemon-species") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.pokemonSpeciesList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "pokemon-species" / Segment) { (id) => 
      get {  
            pokemonService.pokemonSpeciesRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "stat") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.statList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "stat" / Segment) { (id) => 
      get {  
            pokemonService.statRetrieve(id = id)
      }
    } ~
    path("api" / "v2" / "type") { 
      get { 
        parameters("limit".as[Int].?, "offset".as[Int].?, "q".as[String].?) { (limit, offset, q) => 
            pokemonService.typeList(limit = limit, offset = offset, q = q)
        }
      }
    } ~
    path("api" / "v2" / "type" / Segment) { (id) => 
      get {  
            pokemonService.typeRetrieve(id = id)
      }
    }
}


trait PokemonApiService {

  def abilityList200(responsePaginatedAbilitySummaryList: PaginatedAbilitySummaryList)(implicit toEntityMarshallerPaginatedAbilitySummaryList: ToEntityMarshaller[PaginatedAbilitySummaryList]): Route =
    complete((200, responsePaginatedAbilitySummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedAbilitySummaryList
   */
  def abilityList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedAbilitySummaryList: ToEntityMarshaller[PaginatedAbilitySummaryList]): Route

  def abilityRetrieve200(responseAbilityDetail: AbilityDetail)(implicit toEntityMarshallerAbilityDetail: ToEntityMarshaller[AbilityDetail]): Route =
    complete((200, responseAbilityDetail))
  /**
   * Code: 200, Message: , DataType: AbilityDetail
   */
  def abilityRetrieve(id: String)
      (implicit toEntityMarshallerAbilityDetail: ToEntityMarshaller[AbilityDetail]): Route

  def characteristicList200(responsePaginatedCharacteristicSummaryList: PaginatedCharacteristicSummaryList)(implicit toEntityMarshallerPaginatedCharacteristicSummaryList: ToEntityMarshaller[PaginatedCharacteristicSummaryList]): Route =
    complete((200, responsePaginatedCharacteristicSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedCharacteristicSummaryList
   */
  def characteristicList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedCharacteristicSummaryList: ToEntityMarshaller[PaginatedCharacteristicSummaryList]): Route

  def characteristicRetrieve200(responseCharacteristicDetail: CharacteristicDetail)(implicit toEntityMarshallerCharacteristicDetail: ToEntityMarshaller[CharacteristicDetail]): Route =
    complete((200, responseCharacteristicDetail))
  /**
   * Code: 200, Message: , DataType: CharacteristicDetail
   */
  def characteristicRetrieve(id: String)
      (implicit toEntityMarshallerCharacteristicDetail: ToEntityMarshaller[CharacteristicDetail]): Route

  def eggGroupList200(responsePaginatedEggGroupSummaryList: PaginatedEggGroupSummaryList)(implicit toEntityMarshallerPaginatedEggGroupSummaryList: ToEntityMarshaller[PaginatedEggGroupSummaryList]): Route =
    complete((200, responsePaginatedEggGroupSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedEggGroupSummaryList
   */
  def eggGroupList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedEggGroupSummaryList: ToEntityMarshaller[PaginatedEggGroupSummaryList]): Route

  def eggGroupRetrieve200(responseEggGroupDetail: EggGroupDetail)(implicit toEntityMarshallerEggGroupDetail: ToEntityMarshaller[EggGroupDetail]): Route =
    complete((200, responseEggGroupDetail))
  /**
   * Code: 200, Message: , DataType: EggGroupDetail
   */
  def eggGroupRetrieve(id: String)
      (implicit toEntityMarshallerEggGroupDetail: ToEntityMarshaller[EggGroupDetail]): Route

  def genderList200(responsePaginatedGenderSummaryList: PaginatedGenderSummaryList)(implicit toEntityMarshallerPaginatedGenderSummaryList: ToEntityMarshaller[PaginatedGenderSummaryList]): Route =
    complete((200, responsePaginatedGenderSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedGenderSummaryList
   */
  def genderList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedGenderSummaryList: ToEntityMarshaller[PaginatedGenderSummaryList]): Route

  def genderRetrieve200(responseGenderDetail: GenderDetail)(implicit toEntityMarshallerGenderDetail: ToEntityMarshaller[GenderDetail]): Route =
    complete((200, responseGenderDetail))
  /**
   * Code: 200, Message: , DataType: GenderDetail
   */
  def genderRetrieve(id: String)
      (implicit toEntityMarshallerGenderDetail: ToEntityMarshaller[GenderDetail]): Route

  def growthRateList200(responsePaginatedGrowthRateSummaryList: PaginatedGrowthRateSummaryList)(implicit toEntityMarshallerPaginatedGrowthRateSummaryList: ToEntityMarshaller[PaginatedGrowthRateSummaryList]): Route =
    complete((200, responsePaginatedGrowthRateSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedGrowthRateSummaryList
   */
  def growthRateList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedGrowthRateSummaryList: ToEntityMarshaller[PaginatedGrowthRateSummaryList]): Route

  def growthRateRetrieve200(responseGrowthRateDetail: GrowthRateDetail)(implicit toEntityMarshallerGrowthRateDetail: ToEntityMarshaller[GrowthRateDetail]): Route =
    complete((200, responseGrowthRateDetail))
  /**
   * Code: 200, Message: , DataType: GrowthRateDetail
   */
  def growthRateRetrieve(id: String)
      (implicit toEntityMarshallerGrowthRateDetail: ToEntityMarshaller[GrowthRateDetail]): Route

  def moveDamageClassList200(responsePaginatedMoveDamageClassSummaryList: PaginatedMoveDamageClassSummaryList)(implicit toEntityMarshallerPaginatedMoveDamageClassSummaryList: ToEntityMarshaller[PaginatedMoveDamageClassSummaryList]): Route =
    complete((200, responsePaginatedMoveDamageClassSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedMoveDamageClassSummaryList
   */
  def moveDamageClassList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedMoveDamageClassSummaryList: ToEntityMarshaller[PaginatedMoveDamageClassSummaryList]): Route

  def moveDamageClassRetrieve200(responseMoveDamageClassDetail: MoveDamageClassDetail)(implicit toEntityMarshallerMoveDamageClassDetail: ToEntityMarshaller[MoveDamageClassDetail]): Route =
    complete((200, responseMoveDamageClassDetail))
  /**
   * Code: 200, Message: , DataType: MoveDamageClassDetail
   */
  def moveDamageClassRetrieve(id: String)
      (implicit toEntityMarshallerMoveDamageClassDetail: ToEntityMarshaller[MoveDamageClassDetail]): Route

  def natureList200(responsePaginatedNatureSummaryList: PaginatedNatureSummaryList)(implicit toEntityMarshallerPaginatedNatureSummaryList: ToEntityMarshaller[PaginatedNatureSummaryList]): Route =
    complete((200, responsePaginatedNatureSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedNatureSummaryList
   */
  def natureList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedNatureSummaryList: ToEntityMarshaller[PaginatedNatureSummaryList]): Route

  def natureRetrieve200(responseNatureDetail: NatureDetail)(implicit toEntityMarshallerNatureDetail: ToEntityMarshaller[NatureDetail]): Route =
    complete((200, responseNatureDetail))
  /**
   * Code: 200, Message: , DataType: NatureDetail
   */
  def natureRetrieve(id: String)
      (implicit toEntityMarshallerNatureDetail: ToEntityMarshaller[NatureDetail]): Route

  def pokeathlonStatList200(responsePaginatedPokeathlonStatSummaryList: PaginatedPokeathlonStatSummaryList)(implicit toEntityMarshallerPaginatedPokeathlonStatSummaryList: ToEntityMarshaller[PaginatedPokeathlonStatSummaryList]): Route =
    complete((200, responsePaginatedPokeathlonStatSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedPokeathlonStatSummaryList
   */
  def pokeathlonStatList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedPokeathlonStatSummaryList: ToEntityMarshaller[PaginatedPokeathlonStatSummaryList]): Route

  def pokeathlonStatRetrieve200(responsePokeathlonStatDetail: PokeathlonStatDetail)(implicit toEntityMarshallerPokeathlonStatDetail: ToEntityMarshaller[PokeathlonStatDetail]): Route =
    complete((200, responsePokeathlonStatDetail))
  /**
   * Code: 200, Message: , DataType: PokeathlonStatDetail
   */
  def pokeathlonStatRetrieve(id: String)
      (implicit toEntityMarshallerPokeathlonStatDetail: ToEntityMarshaller[PokeathlonStatDetail]): Route

  def pokemonColorList200(responsePaginatedPokemonColorSummaryList: PaginatedPokemonColorSummaryList)(implicit toEntityMarshallerPaginatedPokemonColorSummaryList: ToEntityMarshaller[PaginatedPokemonColorSummaryList]): Route =
    complete((200, responsePaginatedPokemonColorSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedPokemonColorSummaryList
   */
  def pokemonColorList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedPokemonColorSummaryList: ToEntityMarshaller[PaginatedPokemonColorSummaryList]): Route

  def pokemonColorRetrieve200(responsePokemonColorDetail: PokemonColorDetail)(implicit toEntityMarshallerPokemonColorDetail: ToEntityMarshaller[PokemonColorDetail]): Route =
    complete((200, responsePokemonColorDetail))
  /**
   * Code: 200, Message: , DataType: PokemonColorDetail
   */
  def pokemonColorRetrieve(id: String)
      (implicit toEntityMarshallerPokemonColorDetail: ToEntityMarshaller[PokemonColorDetail]): Route

  def pokemonFormList200(responsePaginatedPokemonFormSummaryList: PaginatedPokemonFormSummaryList)(implicit toEntityMarshallerPaginatedPokemonFormSummaryList: ToEntityMarshaller[PaginatedPokemonFormSummaryList]): Route =
    complete((200, responsePaginatedPokemonFormSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedPokemonFormSummaryList
   */
  def pokemonFormList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedPokemonFormSummaryList: ToEntityMarshaller[PaginatedPokemonFormSummaryList]): Route

  def pokemonFormRetrieve200(responsePokemonFormDetail: PokemonFormDetail)(implicit toEntityMarshallerPokemonFormDetail: ToEntityMarshaller[PokemonFormDetail]): Route =
    complete((200, responsePokemonFormDetail))
  /**
   * Code: 200, Message: , DataType: PokemonFormDetail
   */
  def pokemonFormRetrieve(id: String)
      (implicit toEntityMarshallerPokemonFormDetail: ToEntityMarshaller[PokemonFormDetail]): Route

  def pokemonHabitatList200(responsePaginatedPokemonHabitatSummaryList: PaginatedPokemonHabitatSummaryList)(implicit toEntityMarshallerPaginatedPokemonHabitatSummaryList: ToEntityMarshaller[PaginatedPokemonHabitatSummaryList]): Route =
    complete((200, responsePaginatedPokemonHabitatSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedPokemonHabitatSummaryList
   */
  def pokemonHabitatList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedPokemonHabitatSummaryList: ToEntityMarshaller[PaginatedPokemonHabitatSummaryList]): Route

  def pokemonHabitatRetrieve200(responsePokemonHabitatDetail: PokemonHabitatDetail)(implicit toEntityMarshallerPokemonHabitatDetail: ToEntityMarshaller[PokemonHabitatDetail]): Route =
    complete((200, responsePokemonHabitatDetail))
  /**
   * Code: 200, Message: , DataType: PokemonHabitatDetail
   */
  def pokemonHabitatRetrieve(id: String)
      (implicit toEntityMarshallerPokemonHabitatDetail: ToEntityMarshaller[PokemonHabitatDetail]): Route

  def pokemonList200(responsePaginatedPokemonSummaryList: PaginatedPokemonSummaryList)(implicit toEntityMarshallerPaginatedPokemonSummaryList: ToEntityMarshaller[PaginatedPokemonSummaryList]): Route =
    complete((200, responsePaginatedPokemonSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedPokemonSummaryList
   */
  def pokemonList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedPokemonSummaryList: ToEntityMarshaller[PaginatedPokemonSummaryList]): Route

  def pokemonRetrieve200(responsePokemonDetail: PokemonDetail)(implicit toEntityMarshallerPokemonDetail: ToEntityMarshaller[PokemonDetail]): Route =
    complete((200, responsePokemonDetail))
  /**
   * Code: 200, Message: , DataType: PokemonDetail
   */
  def pokemonRetrieve(id: String)
      (implicit toEntityMarshallerPokemonDetail: ToEntityMarshaller[PokemonDetail]): Route

  def pokemonShapeList200(responsePaginatedPokemonShapeSummaryList: PaginatedPokemonShapeSummaryList)(implicit toEntityMarshallerPaginatedPokemonShapeSummaryList: ToEntityMarshaller[PaginatedPokemonShapeSummaryList]): Route =
    complete((200, responsePaginatedPokemonShapeSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedPokemonShapeSummaryList
   */
  def pokemonShapeList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedPokemonShapeSummaryList: ToEntityMarshaller[PaginatedPokemonShapeSummaryList]): Route

  def pokemonShapeRetrieve200(responsePokemonShapeDetail: PokemonShapeDetail)(implicit toEntityMarshallerPokemonShapeDetail: ToEntityMarshaller[PokemonShapeDetail]): Route =
    complete((200, responsePokemonShapeDetail))
  /**
   * Code: 200, Message: , DataType: PokemonShapeDetail
   */
  def pokemonShapeRetrieve(id: String)
      (implicit toEntityMarshallerPokemonShapeDetail: ToEntityMarshaller[PokemonShapeDetail]): Route

  def pokemonSpeciesList200(responsePaginatedPokemonSpeciesSummaryList: PaginatedPokemonSpeciesSummaryList)(implicit toEntityMarshallerPaginatedPokemonSpeciesSummaryList: ToEntityMarshaller[PaginatedPokemonSpeciesSummaryList]): Route =
    complete((200, responsePaginatedPokemonSpeciesSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedPokemonSpeciesSummaryList
   */
  def pokemonSpeciesList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedPokemonSpeciesSummaryList: ToEntityMarshaller[PaginatedPokemonSpeciesSummaryList]): Route

  def pokemonSpeciesRetrieve200(responsePokemonSpeciesDetail: PokemonSpeciesDetail)(implicit toEntityMarshallerPokemonSpeciesDetail: ToEntityMarshaller[PokemonSpeciesDetail]): Route =
    complete((200, responsePokemonSpeciesDetail))
  /**
   * Code: 200, Message: , DataType: PokemonSpeciesDetail
   */
  def pokemonSpeciesRetrieve(id: String)
      (implicit toEntityMarshallerPokemonSpeciesDetail: ToEntityMarshaller[PokemonSpeciesDetail]): Route

  def statList200(responsePaginatedStatSummaryList: PaginatedStatSummaryList)(implicit toEntityMarshallerPaginatedStatSummaryList: ToEntityMarshaller[PaginatedStatSummaryList]): Route =
    complete((200, responsePaginatedStatSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedStatSummaryList
   */
  def statList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedStatSummaryList: ToEntityMarshaller[PaginatedStatSummaryList]): Route

  def statRetrieve200(responseStatDetail: StatDetail)(implicit toEntityMarshallerStatDetail: ToEntityMarshaller[StatDetail]): Route =
    complete((200, responseStatDetail))
  /**
   * Code: 200, Message: , DataType: StatDetail
   */
  def statRetrieve(id: String)
      (implicit toEntityMarshallerStatDetail: ToEntityMarshaller[StatDetail]): Route

  def typeList200(responsePaginatedTypeSummaryList: PaginatedTypeSummaryList)(implicit toEntityMarshallerPaginatedTypeSummaryList: ToEntityMarshaller[PaginatedTypeSummaryList]): Route =
    complete((200, responsePaginatedTypeSummaryList))
  /**
   * Code: 200, Message: , DataType: PaginatedTypeSummaryList
   */
  def typeList(limit: Option[Int], offset: Option[Int], q: Option[String])
      (implicit toEntityMarshallerPaginatedTypeSummaryList: ToEntityMarshaller[PaginatedTypeSummaryList]): Route

  def typeRetrieve200(responseTypeDetail: TypeDetail)(implicit toEntityMarshallerTypeDetail: ToEntityMarshaller[TypeDetail]): Route =
    complete((200, responseTypeDetail))
  /**
   * Code: 200, Message: , DataType: TypeDetail
   */
  def typeRetrieve(id: String)
      (implicit toEntityMarshallerTypeDetail: ToEntityMarshaller[TypeDetail]): Route

}

trait PokemonApiMarshaller {


  implicit def toEntityMarshallerPaginatedPokeathlonStatSummaryList: ToEntityMarshaller[PaginatedPokeathlonStatSummaryList]

  implicit def toEntityMarshallerEggGroupDetail: ToEntityMarshaller[EggGroupDetail]

  implicit def toEntityMarshallerPaginatedMoveDamageClassSummaryList: ToEntityMarshaller[PaginatedMoveDamageClassSummaryList]

  implicit def toEntityMarshallerPaginatedAbilitySummaryList: ToEntityMarshaller[PaginatedAbilitySummaryList]

  implicit def toEntityMarshallerPaginatedNatureSummaryList: ToEntityMarshaller[PaginatedNatureSummaryList]

  implicit def toEntityMarshallerPaginatedPokemonSpeciesSummaryList: ToEntityMarshaller[PaginatedPokemonSpeciesSummaryList]

  implicit def toEntityMarshallerPaginatedPokemonFormSummaryList: ToEntityMarshaller[PaginatedPokemonFormSummaryList]

  implicit def toEntityMarshallerNatureDetail: ToEntityMarshaller[NatureDetail]

  implicit def toEntityMarshallerPaginatedPokemonHabitatSummaryList: ToEntityMarshaller[PaginatedPokemonHabitatSummaryList]

  implicit def toEntityMarshallerTypeDetail: ToEntityMarshaller[TypeDetail]

  implicit def toEntityMarshallerPaginatedGrowthRateSummaryList: ToEntityMarshaller[PaginatedGrowthRateSummaryList]

  implicit def toEntityMarshallerPokeathlonStatDetail: ToEntityMarshaller[PokeathlonStatDetail]

  implicit def toEntityMarshallerPaginatedTypeSummaryList: ToEntityMarshaller[PaginatedTypeSummaryList]

  implicit def toEntityMarshallerCharacteristicDetail: ToEntityMarshaller[CharacteristicDetail]

  implicit def toEntityMarshallerGrowthRateDetail: ToEntityMarshaller[GrowthRateDetail]

  implicit def toEntityMarshallerStatDetail: ToEntityMarshaller[StatDetail]

  implicit def toEntityMarshallerPokemonColorDetail: ToEntityMarshaller[PokemonColorDetail]

  implicit def toEntityMarshallerAbilityDetail: ToEntityMarshaller[AbilityDetail]

  implicit def toEntityMarshallerMoveDamageClassDetail: ToEntityMarshaller[MoveDamageClassDetail]

  implicit def toEntityMarshallerPokemonFormDetail: ToEntityMarshaller[PokemonFormDetail]

  implicit def toEntityMarshallerPokemonHabitatDetail: ToEntityMarshaller[PokemonHabitatDetail]

  implicit def toEntityMarshallerPokemonSpeciesDetail: ToEntityMarshaller[PokemonSpeciesDetail]

  implicit def toEntityMarshallerPokemonShapeDetail: ToEntityMarshaller[PokemonShapeDetail]

  implicit def toEntityMarshallerPokemonDetail: ToEntityMarshaller[PokemonDetail]

  implicit def toEntityMarshallerPaginatedPokemonSummaryList: ToEntityMarshaller[PaginatedPokemonSummaryList]

  implicit def toEntityMarshallerGenderDetail: ToEntityMarshaller[GenderDetail]

  implicit def toEntityMarshallerPaginatedCharacteristicSummaryList: ToEntityMarshaller[PaginatedCharacteristicSummaryList]

  implicit def toEntityMarshallerPaginatedGenderSummaryList: ToEntityMarshaller[PaginatedGenderSummaryList]

  implicit def toEntityMarshallerPaginatedEggGroupSummaryList: ToEntityMarshaller[PaginatedEggGroupSummaryList]

  implicit def toEntityMarshallerPaginatedStatSummaryList: ToEntityMarshaller[PaginatedStatSummaryList]

  implicit def toEntityMarshallerPaginatedPokemonShapeSummaryList: ToEntityMarshaller[PaginatedPokemonShapeSummaryList]

  implicit def toEntityMarshallerPaginatedPokemonColorSummaryList: ToEntityMarshaller[PaginatedPokemonColorSummaryList]

}

