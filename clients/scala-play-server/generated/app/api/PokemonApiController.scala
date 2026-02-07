package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AbilityDetail
import model.CharacteristicDetail
import model.EggGroupDetail
import model.GenderDetail
import model.GrowthRateDetail
import model.MoveDamageClassDetail
import model.NatureDetail
import model.PaginatedAbilitySummaryList
import model.PaginatedCharacteristicSummaryList
import model.PaginatedEggGroupSummaryList
import model.PaginatedGenderSummaryList
import model.PaginatedGrowthRateSummaryList
import model.PaginatedMoveDamageClassSummaryList
import model.PaginatedNatureSummaryList
import model.PaginatedPokeathlonStatSummaryList
import model.PaginatedPokemonColorSummaryList
import model.PaginatedPokemonFormSummaryList
import model.PaginatedPokemonHabitatSummaryList
import model.PaginatedPokemonShapeSummaryList
import model.PaginatedPokemonSpeciesSummaryList
import model.PaginatedPokemonSummaryList
import model.PaginatedStatSummaryList
import model.PaginatedTypeSummaryList
import model.PokeathlonStatDetail
import model.PokemonColorDetail
import model.PokemonDetail
import model.PokemonFormDetail
import model.PokemonHabitatDetail
import model.PokemonShapeDetail
import model.PokemonSpeciesDetail
import model.StatDetail
import model.TypeDetail

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class PokemonApiController @Inject()(cc: ControllerComponents, api: PokemonApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/ability/?limit=[value]&offset=[value]&q=[value]
    */
  def abilityList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedAbilitySummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.abilityList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/ability/:id/
    * @param id This parameter can be a string or an integer.
    */
  def abilityRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): AbilityDetail = {
      api.abilityRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/characteristic/?limit=[value]&offset=[value]&q=[value]
    */
  def characteristicList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedCharacteristicSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.characteristicList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/characteristic/:id/
    * @param id This parameter can be a string or an integer.
    */
  def characteristicRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): CharacteristicDetail = {
      api.characteristicRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/egg-group/?limit=[value]&offset=[value]&q=[value]
    */
  def eggGroupList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedEggGroupSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.eggGroupList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/egg-group/:id/
    * @param id This parameter can be a string or an integer.
    */
  def eggGroupRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): EggGroupDetail = {
      api.eggGroupRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/gender/?limit=[value]&offset=[value]&q=[value]
    */
  def genderList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedGenderSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.genderList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/gender/:id/
    * @param id This parameter can be a string or an integer.
    */
  def genderRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): GenderDetail = {
      api.genderRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/growth-rate/?limit=[value]&offset=[value]&q=[value]
    */
  def growthRateList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedGrowthRateSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.growthRateList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/growth-rate/:id/
    * @param id This parameter can be a string or an integer.
    */
  def growthRateRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): GrowthRateDetail = {
      api.growthRateRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-damage-class/?limit=[value]&offset=[value]&q=[value]
    */
  def moveDamageClassList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedMoveDamageClassSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.moveDamageClassList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-damage-class/:id/
    * @param id This parameter can be a string or an integer.
    */
  def moveDamageClassRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): MoveDamageClassDetail = {
      api.moveDamageClassRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/nature/?limit=[value]&offset=[value]&q=[value]
    */
  def natureList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedNatureSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.natureList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/nature/:id/
    * @param id This parameter can be a string or an integer.
    */
  def natureRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): NatureDetail = {
      api.natureRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokeathlon-stat/?limit=[value]&offset=[value]&q=[value]
    */
  def pokeathlonStatList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedPokeathlonStatSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.pokeathlonStatList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokeathlon-stat/:id/
    * @param id This parameter can be a string or an integer.
    */
  def pokeathlonStatRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): PokeathlonStatDetail = {
      api.pokeathlonStatRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-color/?limit=[value]&offset=[value]&q=[value]
    */
  def pokemonColorList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedPokemonColorSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.pokemonColorList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-color/:id/
    * @param id This parameter can be a string or an integer.
    */
  def pokemonColorRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): PokemonColorDetail = {
      api.pokemonColorRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-form/?limit=[value]&offset=[value]&q=[value]
    */
  def pokemonFormList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedPokemonFormSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.pokemonFormList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-form/:id/
    * @param id This parameter can be a string or an integer.
    */
  def pokemonFormRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): PokemonFormDetail = {
      api.pokemonFormRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-habitat/?limit=[value]&offset=[value]&q=[value]
    */
  def pokemonHabitatList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedPokemonHabitatSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.pokemonHabitatList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-habitat/:id/
    * @param id This parameter can be a string or an integer.
    */
  def pokemonHabitatRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): PokemonHabitatDetail = {
      api.pokemonHabitatRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon/?limit=[value]&offset=[value]&q=[value]
    */
  def pokemonList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedPokemonSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.pokemonList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon/:id/
    * @param id This parameter can be a string or an integer.
    */
  def pokemonRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): PokemonDetail = {
      api.pokemonRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-shape/?limit=[value]&offset=[value]&q=[value]
    */
  def pokemonShapeList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedPokemonShapeSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.pokemonShapeList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-shape/:id/
    * @param id This parameter can be a string or an integer.
    */
  def pokemonShapeRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): PokemonShapeDetail = {
      api.pokemonShapeRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-species/?limit=[value]&offset=[value]&q=[value]
    */
  def pokemonSpeciesList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedPokemonSpeciesSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.pokemonSpeciesList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-species/:id/
    * @param id This parameter can be a string or an integer.
    */
  def pokemonSpeciesRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): PokemonSpeciesDetail = {
      api.pokemonSpeciesRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/stat/?limit=[value]&offset=[value]&q=[value]
    */
  def statList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedStatSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.statList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/stat/:id/
    * @param id This parameter can be a string or an integer.
    */
  def statRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): StatDetail = {
      api.statRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/type/?limit=[value]&offset=[value]&q=[value]
    */
  def typeList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedTypeSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.typeList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/type/:id/
    * @param id This parameter can be a string or an integer.
    */
  def typeRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): TypeDetail = {
      api.typeRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
