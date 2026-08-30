package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokeathlonStatDetail_affecting_natures_increase_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokeathlonStatDetailAffectingNaturesIncreaseInner(
  maxChange: Int,
  nature: AbilityDetailPokemonInnerPokemon
)

object PokeathlonStatDetailAffectingNaturesIncreaseInner {
  implicit lazy val pokeathlonStatDetailAffectingNaturesIncreaseInnerJsonFormat: Format[PokeathlonStatDetailAffectingNaturesIncreaseInner] = Json.format[PokeathlonStatDetailAffectingNaturesIncreaseInner]
}

