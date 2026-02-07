package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokeathlonStatDetail_affecting_natures_decrease_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokeathlonStatDetailAffectingNaturesDecreaseInner(
  maxChange: Int,
  nature: AbilityDetailPokemonInnerPokemon
)

object PokeathlonStatDetailAffectingNaturesDecreaseInner {
  implicit lazy val pokeathlonStatDetailAffectingNaturesDecreaseInnerJsonFormat: Format[PokeathlonStatDetailAffectingNaturesDecreaseInner] = Json.format[PokeathlonStatDetailAffectingNaturesDecreaseInner]
}

