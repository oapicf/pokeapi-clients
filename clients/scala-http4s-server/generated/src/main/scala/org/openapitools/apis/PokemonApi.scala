package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.AbilityDetail
import org.openapitools.models.CharacteristicDetail
import org.openapitools.models.EggGroupDetail
import org.openapitools.models.GenderDetail
import org.openapitools.models.GrowthRateDetail
import org.openapitools.models.MoveDamageClassDetail
import org.openapitools.models.NatureDetail
import org.openapitools.models.PaginatedAbilitySummaryList
import org.openapitools.models.PaginatedCharacteristicSummaryList
import org.openapitools.models.PaginatedEggGroupSummaryList
import org.openapitools.models.PaginatedGenderSummaryList
import org.openapitools.models.PaginatedGrowthRateSummaryList
import org.openapitools.models.PaginatedMoveDamageClassSummaryList
import org.openapitools.models.PaginatedNatureSummaryList
import org.openapitools.models.PaginatedPokeathlonStatSummaryList
import org.openapitools.models.PaginatedPokemonColorSummaryList
import org.openapitools.models.PaginatedPokemonFormSummaryList
import org.openapitools.models.PaginatedPokemonHabitatSummaryList
import org.openapitools.models.PaginatedPokemonShapeSummaryList
import org.openapitools.models.PaginatedPokemonSpeciesSummaryList
import org.openapitools.models.PaginatedPokemonSummaryList
import org.openapitools.models.PaginatedStatSummaryList
import org.openapitools.models.PaginatedTypeSummaryList
import org.openapitools.models.PokeathlonStatDetail
import org.openapitools.models.PokemonColorDetail
import org.openapitools.models.PokemonDetail
import org.openapitools.models.PokemonFormDetail
import org.openapitools.models.PokemonHabitatDetail
import org.openapitools.models.PokemonShapeDetail
import org.openapitools.models.PokemonSpeciesDetail
import org.openapitools.models.StatDetail
import org.openapitools.models.TypeDetail


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class PokemonApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: PokemonApiDelegate[F]) extends Http4sDsl[F] {
  object abilityList {
    import PokemonApiDelegate.abilityListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "ability" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.abilityList.handle(req, limit, offset, q, responses)

    }


    val responses: abilityListResponses[F] = new abilityListResponses[F] {
      def resp200(value: PaginatedAbilitySummaryList): F[Response[F]] = Ok(value)
    }
  }
  object abilityRetrieve {
    import PokemonApiDelegate.abilityRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "ability" / id =>
        delegate.abilityRetrieve.handle(req, id, responses)

    }


    val responses: abilityRetrieveResponses[F] = new abilityRetrieveResponses[F] {
      def resp200(value: AbilityDetail): F[Response[F]] = Ok(value)
    }
  }
  object characteristicList {
    import PokemonApiDelegate.characteristicListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "characteristic" :? limitQueryParam(limit) +& offsetQueryParam(offset) =>
        delegate.characteristicList.handle(req, limit, offset, responses)

    }


    val responses: characteristicListResponses[F] = new characteristicListResponses[F] {
      def resp200(value: PaginatedCharacteristicSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object characteristicRetrieve {
    import PokemonApiDelegate.characteristicRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "characteristic" / id =>
        delegate.characteristicRetrieve.handle(req, id, responses)

    }


    val responses: characteristicRetrieveResponses[F] = new characteristicRetrieveResponses[F] {
      def resp200(value: CharacteristicDetail): F[Response[F]] = Ok(value)
    }
  }
  object eggGroupList {
    import PokemonApiDelegate.eggGroupListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "egg-group" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.eggGroupList.handle(req, limit, offset, q, responses)

    }


    val responses: eggGroupListResponses[F] = new eggGroupListResponses[F] {
      def resp200(value: PaginatedEggGroupSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object eggGroupRetrieve {
    import PokemonApiDelegate.eggGroupRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "egg-group" / id =>
        delegate.eggGroupRetrieve.handle(req, id, responses)

    }


    val responses: eggGroupRetrieveResponses[F] = new eggGroupRetrieveResponses[F] {
      def resp200(value: EggGroupDetail): F[Response[F]] = Ok(value)
    }
  }
  object genderList {
    import PokemonApiDelegate.genderListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "gender" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.genderList.handle(req, limit, offset, q, responses)

    }


    val responses: genderListResponses[F] = new genderListResponses[F] {
      def resp200(value: PaginatedGenderSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object genderRetrieve {
    import PokemonApiDelegate.genderRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "gender" / id =>
        delegate.genderRetrieve.handle(req, id, responses)

    }


    val responses: genderRetrieveResponses[F] = new genderRetrieveResponses[F] {
      def resp200(value: GenderDetail): F[Response[F]] = Ok(value)
    }
  }
  object growthRateList {
    import PokemonApiDelegate.growthRateListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "growth-rate" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.growthRateList.handle(req, limit, offset, q, responses)

    }


    val responses: growthRateListResponses[F] = new growthRateListResponses[F] {
      def resp200(value: PaginatedGrowthRateSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object growthRateRetrieve {
    import PokemonApiDelegate.growthRateRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "growth-rate" / id =>
        delegate.growthRateRetrieve.handle(req, id, responses)

    }


    val responses: growthRateRetrieveResponses[F] = new growthRateRetrieveResponses[F] {
      def resp200(value: GrowthRateDetail): F[Response[F]] = Ok(value)
    }
  }
  object moveDamageClassList {
    import PokemonApiDelegate.moveDamageClassListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-damage-class" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.moveDamageClassList.handle(req, limit, offset, q, responses)

    }


    val responses: moveDamageClassListResponses[F] = new moveDamageClassListResponses[F] {
      def resp200(value: PaginatedMoveDamageClassSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object moveDamageClassRetrieve {
    import PokemonApiDelegate.moveDamageClassRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "move-damage-class" / id =>
        delegate.moveDamageClassRetrieve.handle(req, id, responses)

    }


    val responses: moveDamageClassRetrieveResponses[F] = new moveDamageClassRetrieveResponses[F] {
      def resp200(value: MoveDamageClassDetail): F[Response[F]] = Ok(value)
    }
  }
  object natureList {
    import PokemonApiDelegate.natureListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "nature" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.natureList.handle(req, limit, offset, q, responses)

    }


    val responses: natureListResponses[F] = new natureListResponses[F] {
      def resp200(value: PaginatedNatureSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object natureRetrieve {
    import PokemonApiDelegate.natureRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "nature" / id =>
        delegate.natureRetrieve.handle(req, id, responses)

    }


    val responses: natureRetrieveResponses[F] = new natureRetrieveResponses[F] {
      def resp200(value: NatureDetail): F[Response[F]] = Ok(value)
    }
  }
  object pokeathlonStatList {
    import PokemonApiDelegate.pokeathlonStatListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokeathlon-stat" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.pokeathlonStatList.handle(req, limit, offset, q, responses)

    }


    val responses: pokeathlonStatListResponses[F] = new pokeathlonStatListResponses[F] {
      def resp200(value: PaginatedPokeathlonStatSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object pokeathlonStatRetrieve {
    import PokemonApiDelegate.pokeathlonStatRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokeathlon-stat" / id =>
        delegate.pokeathlonStatRetrieve.handle(req, id, responses)

    }


    val responses: pokeathlonStatRetrieveResponses[F] = new pokeathlonStatRetrieveResponses[F] {
      def resp200(value: PokeathlonStatDetail): F[Response[F]] = Ok(value)
    }
  }
  object pokemonColorList {
    import PokemonApiDelegate.pokemonColorListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-color" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.pokemonColorList.handle(req, limit, offset, q, responses)

    }


    val responses: pokemonColorListResponses[F] = new pokemonColorListResponses[F] {
      def resp200(value: PaginatedPokemonColorSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object pokemonColorRetrieve {
    import PokemonApiDelegate.pokemonColorRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-color" / id =>
        delegate.pokemonColorRetrieve.handle(req, id, responses)

    }


    val responses: pokemonColorRetrieveResponses[F] = new pokemonColorRetrieveResponses[F] {
      def resp200(value: PokemonColorDetail): F[Response[F]] = Ok(value)
    }
  }
  object pokemonFormList {
    import PokemonApiDelegate.pokemonFormListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-form" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.pokemonFormList.handle(req, limit, offset, q, responses)

    }


    val responses: pokemonFormListResponses[F] = new pokemonFormListResponses[F] {
      def resp200(value: PaginatedPokemonFormSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object pokemonFormRetrieve {
    import PokemonApiDelegate.pokemonFormRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-form" / id =>
        delegate.pokemonFormRetrieve.handle(req, id, responses)

    }


    val responses: pokemonFormRetrieveResponses[F] = new pokemonFormRetrieveResponses[F] {
      def resp200(value: PokemonFormDetail): F[Response[F]] = Ok(value)
    }
  }
  object pokemonHabitatList {
    import PokemonApiDelegate.pokemonHabitatListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-habitat" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.pokemonHabitatList.handle(req, limit, offset, q, responses)

    }


    val responses: pokemonHabitatListResponses[F] = new pokemonHabitatListResponses[F] {
      def resp200(value: PaginatedPokemonHabitatSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object pokemonHabitatRetrieve {
    import PokemonApiDelegate.pokemonHabitatRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-habitat" / id =>
        delegate.pokemonHabitatRetrieve.handle(req, id, responses)

    }


    val responses: pokemonHabitatRetrieveResponses[F] = new pokemonHabitatRetrieveResponses[F] {
      def resp200(value: PokemonHabitatDetail): F[Response[F]] = Ok(value)
    }
  }
  object pokemonList {
    import PokemonApiDelegate.pokemonListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.pokemonList.handle(req, limit, offset, q, responses)

    }


    val responses: pokemonListResponses[F] = new pokemonListResponses[F] {
      def resp200(value: PaginatedPokemonSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object pokemonRetrieve {
    import PokemonApiDelegate.pokemonRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon" / id =>
        delegate.pokemonRetrieve.handle(req, id, responses)

    }


    val responses: pokemonRetrieveResponses[F] = new pokemonRetrieveResponses[F] {
      def resp200(value: PokemonDetail): F[Response[F]] = Ok(value)
    }
  }
  object pokemonShapeList {
    import PokemonApiDelegate.pokemonShapeListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-shape" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.pokemonShapeList.handle(req, limit, offset, q, responses)

    }


    val responses: pokemonShapeListResponses[F] = new pokemonShapeListResponses[F] {
      def resp200(value: PaginatedPokemonShapeSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object pokemonShapeRetrieve {
    import PokemonApiDelegate.pokemonShapeRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-shape" / id =>
        delegate.pokemonShapeRetrieve.handle(req, id, responses)

    }


    val responses: pokemonShapeRetrieveResponses[F] = new pokemonShapeRetrieveResponses[F] {
      def resp200(value: PokemonShapeDetail): F[Response[F]] = Ok(value)
    }
  }
  object pokemonSpeciesList {
    import PokemonApiDelegate.pokemonSpeciesListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-species" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.pokemonSpeciesList.handle(req, limit, offset, q, responses)

    }


    val responses: pokemonSpeciesListResponses[F] = new pokemonSpeciesListResponses[F] {
      def resp200(value: PaginatedPokemonSpeciesSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object pokemonSpeciesRetrieve {
    import PokemonApiDelegate.pokemonSpeciesRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "pokemon-species" / id =>
        delegate.pokemonSpeciesRetrieve.handle(req, id, responses)

    }


    val responses: pokemonSpeciesRetrieveResponses[F] = new pokemonSpeciesRetrieveResponses[F] {
      def resp200(value: PokemonSpeciesDetail): F[Response[F]] = Ok(value)
    }
  }
  object statList {
    import PokemonApiDelegate.statListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "stat" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.statList.handle(req, limit, offset, q, responses)

    }


    val responses: statListResponses[F] = new statListResponses[F] {
      def resp200(value: PaginatedStatSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object statRetrieve {
    import PokemonApiDelegate.statRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "stat" / id =>
        delegate.statRetrieve.handle(req, id, responses)

    }


    val responses: statRetrieveResponses[F] = new statRetrieveResponses[F] {
      def resp200(value: StatDetail): F[Response[F]] = Ok(value)
    }
  }
  object typeList {
    import PokemonApiDelegate.typeListResponses

    object limitQueryParam extends OptionalQueryParamDecoderMatcher[Int]("limit")
    object offsetQueryParam extends OptionalQueryParamDecoderMatcher[Int]("offset")
    object qQueryParam extends OptionalQueryParamDecoderMatcher[String]("q")

    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "type" :? limitQueryParam(limit) +& offsetQueryParam(offset) +& qQueryParam(q) =>
        delegate.typeList.handle(req, limit, offset, q, responses)

    }


    val responses: typeListResponses[F] = new typeListResponses[F] {
      def resp200(value: PaginatedTypeSummaryList): F[Response[F]] = Ok(value)
    }
  }
  object typeRetrieve {
    import PokemonApiDelegate.typeRetrieveResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "api" / "v2" / "type" / id =>
        delegate.typeRetrieve.handle(req, id, responses)

    }


    val responses: typeRetrieveResponses[F] = new typeRetrieveResponses[F] {
      def resp200(value: TypeDetail): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    abilityList.route <+>
    abilityRetrieve.route <+>
    characteristicList.route <+>
    characteristicRetrieve.route <+>
    eggGroupList.route <+>
    eggGroupRetrieve.route <+>
    genderList.route <+>
    genderRetrieve.route <+>
    growthRateList.route <+>
    growthRateRetrieve.route <+>
    moveDamageClassList.route <+>
    moveDamageClassRetrieve.route <+>
    natureList.route <+>
    natureRetrieve.route <+>
    pokeathlonStatList.route <+>
    pokeathlonStatRetrieve.route <+>
    pokemonColorList.route <+>
    pokemonColorRetrieve.route <+>
    pokemonFormList.route <+>
    pokemonFormRetrieve.route <+>
    pokemonHabitatList.route <+>
    pokemonHabitatRetrieve.route <+>
    pokemonList.route <+>
    pokemonRetrieve.route <+>
    pokemonShapeList.route <+>
    pokemonShapeRetrieve.route <+>
    pokemonSpeciesList.route <+>
    pokemonSpeciesRetrieve.route <+>
    statList.route <+>
    statRetrieve.route <+>
    typeList.route <+>
    typeRetrieve.route
}

object PokemonApiDelegate {
  trait abilityListResponses[F[_]] {
    def resp200(value: PaginatedAbilitySummaryList): F[Response[F]]
  }

  trait abilityRetrieveResponses[F[_]] {
    def resp200(value: AbilityDetail): F[Response[F]]
  }

  trait characteristicListResponses[F[_]] {
    def resp200(value: PaginatedCharacteristicSummaryList): F[Response[F]]
  }

  trait characteristicRetrieveResponses[F[_]] {
    def resp200(value: CharacteristicDetail): F[Response[F]]
  }

  trait eggGroupListResponses[F[_]] {
    def resp200(value: PaginatedEggGroupSummaryList): F[Response[F]]
  }

  trait eggGroupRetrieveResponses[F[_]] {
    def resp200(value: EggGroupDetail): F[Response[F]]
  }

  trait genderListResponses[F[_]] {
    def resp200(value: PaginatedGenderSummaryList): F[Response[F]]
  }

  trait genderRetrieveResponses[F[_]] {
    def resp200(value: GenderDetail): F[Response[F]]
  }

  trait growthRateListResponses[F[_]] {
    def resp200(value: PaginatedGrowthRateSummaryList): F[Response[F]]
  }

  trait growthRateRetrieveResponses[F[_]] {
    def resp200(value: GrowthRateDetail): F[Response[F]]
  }

  trait moveDamageClassListResponses[F[_]] {
    def resp200(value: PaginatedMoveDamageClassSummaryList): F[Response[F]]
  }

  trait moveDamageClassRetrieveResponses[F[_]] {
    def resp200(value: MoveDamageClassDetail): F[Response[F]]
  }

  trait natureListResponses[F[_]] {
    def resp200(value: PaginatedNatureSummaryList): F[Response[F]]
  }

  trait natureRetrieveResponses[F[_]] {
    def resp200(value: NatureDetail): F[Response[F]]
  }

  trait pokeathlonStatListResponses[F[_]] {
    def resp200(value: PaginatedPokeathlonStatSummaryList): F[Response[F]]
  }

  trait pokeathlonStatRetrieveResponses[F[_]] {
    def resp200(value: PokeathlonStatDetail): F[Response[F]]
  }

  trait pokemonColorListResponses[F[_]] {
    def resp200(value: PaginatedPokemonColorSummaryList): F[Response[F]]
  }

  trait pokemonColorRetrieveResponses[F[_]] {
    def resp200(value: PokemonColorDetail): F[Response[F]]
  }

  trait pokemonFormListResponses[F[_]] {
    def resp200(value: PaginatedPokemonFormSummaryList): F[Response[F]]
  }

  trait pokemonFormRetrieveResponses[F[_]] {
    def resp200(value: PokemonFormDetail): F[Response[F]]
  }

  trait pokemonHabitatListResponses[F[_]] {
    def resp200(value: PaginatedPokemonHabitatSummaryList): F[Response[F]]
  }

  trait pokemonHabitatRetrieveResponses[F[_]] {
    def resp200(value: PokemonHabitatDetail): F[Response[F]]
  }

  trait pokemonListResponses[F[_]] {
    def resp200(value: PaginatedPokemonSummaryList): F[Response[F]]
  }

  trait pokemonRetrieveResponses[F[_]] {
    def resp200(value: PokemonDetail): F[Response[F]]
  }

  trait pokemonShapeListResponses[F[_]] {
    def resp200(value: PaginatedPokemonShapeSummaryList): F[Response[F]]
  }

  trait pokemonShapeRetrieveResponses[F[_]] {
    def resp200(value: PokemonShapeDetail): F[Response[F]]
  }

  trait pokemonSpeciesListResponses[F[_]] {
    def resp200(value: PaginatedPokemonSpeciesSummaryList): F[Response[F]]
  }

  trait pokemonSpeciesRetrieveResponses[F[_]] {
    def resp200(value: PokemonSpeciesDetail): F[Response[F]]
  }

  trait statListResponses[F[_]] {
    def resp200(value: PaginatedStatSummaryList): F[Response[F]]
  }

  trait statRetrieveResponses[F[_]] {
    def resp200(value: StatDetail): F[Response[F]]
  }

  trait typeListResponses[F[_]] {
    def resp200(value: PaginatedTypeSummaryList): F[Response[F]]
  }

  trait typeRetrieveResponses[F[_]] {
    def resp200(value: TypeDetail): F[Response[F]]
  }

}

trait PokemonApiDelegate[F[_]] {

  trait abilityList {
    import PokemonApiDelegate.abilityListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: abilityListResponses[F]
    ): F[Response[F]]

  }
  def abilityList: abilityList


  trait abilityRetrieve {
    import PokemonApiDelegate.abilityRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: abilityRetrieveResponses[F]
    ): F[Response[F]]

  }
  def abilityRetrieve: abilityRetrieve


  trait characteristicList {
    import PokemonApiDelegate.characteristicListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      responses: characteristicListResponses[F]
    ): F[Response[F]]

  }
  def characteristicList: characteristicList


  trait characteristicRetrieve {
    import PokemonApiDelegate.characteristicRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: characteristicRetrieveResponses[F]
    ): F[Response[F]]

  }
  def characteristicRetrieve: characteristicRetrieve


  trait eggGroupList {
    import PokemonApiDelegate.eggGroupListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: eggGroupListResponses[F]
    ): F[Response[F]]

  }
  def eggGroupList: eggGroupList


  trait eggGroupRetrieve {
    import PokemonApiDelegate.eggGroupRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: eggGroupRetrieveResponses[F]
    ): F[Response[F]]

  }
  def eggGroupRetrieve: eggGroupRetrieve


  trait genderList {
    import PokemonApiDelegate.genderListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: genderListResponses[F]
    ): F[Response[F]]

  }
  def genderList: genderList


  trait genderRetrieve {
    import PokemonApiDelegate.genderRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: genderRetrieveResponses[F]
    ): F[Response[F]]

  }
  def genderRetrieve: genderRetrieve


  trait growthRateList {
    import PokemonApiDelegate.growthRateListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: growthRateListResponses[F]
    ): F[Response[F]]

  }
  def growthRateList: growthRateList


  trait growthRateRetrieve {
    import PokemonApiDelegate.growthRateRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: growthRateRetrieveResponses[F]
    ): F[Response[F]]

  }
  def growthRateRetrieve: growthRateRetrieve


  trait moveDamageClassList {
    import PokemonApiDelegate.moveDamageClassListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: moveDamageClassListResponses[F]
    ): F[Response[F]]

  }
  def moveDamageClassList: moveDamageClassList


  trait moveDamageClassRetrieve {
    import PokemonApiDelegate.moveDamageClassRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: moveDamageClassRetrieveResponses[F]
    ): F[Response[F]]

  }
  def moveDamageClassRetrieve: moveDamageClassRetrieve


  trait natureList {
    import PokemonApiDelegate.natureListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: natureListResponses[F]
    ): F[Response[F]]

  }
  def natureList: natureList


  trait natureRetrieve {
    import PokemonApiDelegate.natureRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: natureRetrieveResponses[F]
    ): F[Response[F]]

  }
  def natureRetrieve: natureRetrieve


  trait pokeathlonStatList {
    import PokemonApiDelegate.pokeathlonStatListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: pokeathlonStatListResponses[F]
    ): F[Response[F]]

  }
  def pokeathlonStatList: pokeathlonStatList


  trait pokeathlonStatRetrieve {
    import PokemonApiDelegate.pokeathlonStatRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: pokeathlonStatRetrieveResponses[F]
    ): F[Response[F]]

  }
  def pokeathlonStatRetrieve: pokeathlonStatRetrieve


  trait pokemonColorList {
    import PokemonApiDelegate.pokemonColorListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: pokemonColorListResponses[F]
    ): F[Response[F]]

  }
  def pokemonColorList: pokemonColorList


  trait pokemonColorRetrieve {
    import PokemonApiDelegate.pokemonColorRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: pokemonColorRetrieveResponses[F]
    ): F[Response[F]]

  }
  def pokemonColorRetrieve: pokemonColorRetrieve


  trait pokemonFormList {
    import PokemonApiDelegate.pokemonFormListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: pokemonFormListResponses[F]
    ): F[Response[F]]

  }
  def pokemonFormList: pokemonFormList


  trait pokemonFormRetrieve {
    import PokemonApiDelegate.pokemonFormRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: pokemonFormRetrieveResponses[F]
    ): F[Response[F]]

  }
  def pokemonFormRetrieve: pokemonFormRetrieve


  trait pokemonHabitatList {
    import PokemonApiDelegate.pokemonHabitatListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: pokemonHabitatListResponses[F]
    ): F[Response[F]]

  }
  def pokemonHabitatList: pokemonHabitatList


  trait pokemonHabitatRetrieve {
    import PokemonApiDelegate.pokemonHabitatRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: pokemonHabitatRetrieveResponses[F]
    ): F[Response[F]]

  }
  def pokemonHabitatRetrieve: pokemonHabitatRetrieve


  trait pokemonList {
    import PokemonApiDelegate.pokemonListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: pokemonListResponses[F]
    ): F[Response[F]]

  }
  def pokemonList: pokemonList


  trait pokemonRetrieve {
    import PokemonApiDelegate.pokemonRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: pokemonRetrieveResponses[F]
    ): F[Response[F]]

  }
  def pokemonRetrieve: pokemonRetrieve


  trait pokemonShapeList {
    import PokemonApiDelegate.pokemonShapeListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: pokemonShapeListResponses[F]
    ): F[Response[F]]

  }
  def pokemonShapeList: pokemonShapeList


  trait pokemonShapeRetrieve {
    import PokemonApiDelegate.pokemonShapeRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: pokemonShapeRetrieveResponses[F]
    ): F[Response[F]]

  }
  def pokemonShapeRetrieve: pokemonShapeRetrieve


  trait pokemonSpeciesList {
    import PokemonApiDelegate.pokemonSpeciesListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: pokemonSpeciesListResponses[F]
    ): F[Response[F]]

  }
  def pokemonSpeciesList: pokemonSpeciesList


  trait pokemonSpeciesRetrieve {
    import PokemonApiDelegate.pokemonSpeciesRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: pokemonSpeciesRetrieveResponses[F]
    ): F[Response[F]]

  }
  def pokemonSpeciesRetrieve: pokemonSpeciesRetrieve


  trait statList {
    import PokemonApiDelegate.statListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: statListResponses[F]
    ): F[Response[F]]

  }
  def statList: statList


  trait statRetrieve {
    import PokemonApiDelegate.statRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: statRetrieveResponses[F]
    ): F[Response[F]]

  }
  def statRetrieve: statRetrieve


  trait typeList {
    import PokemonApiDelegate.typeListResponses

    def handle(
      req: Request[F],
      limit: Option[Int],
      offset: Option[Int],
      q: Option[String],
      responses: typeListResponses[F]
    ): F[Response[F]]

  }
  def typeList: typeList


  trait typeRetrieve {
    import PokemonApiDelegate.typeRetrieveResponses

    def handle(
      req: Request[F],
      id: String,
      responses: typeRetrieveResponses[F]
    ): F[Response[F]]

  }
  def typeRetrieve: typeRetrieve

}