package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StatDetail_affecting_natures.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class StatDetailAffectingNatures(
  increase: List[AbilityDetailPokemonInnerPokemon],
  decrease: List[AbilityDetailPokemonInnerPokemon]
)

object StatDetailAffectingNatures {
  implicit lazy val statDetailAffectingNaturesJsonFormat: Format[StatDetailAffectingNatures] = Json.format[StatDetailAffectingNatures]
}

