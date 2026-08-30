package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NatureDetail_pokeathlon_stat_changes_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class NatureDetailPokeathlonStatChangesInner(
  maxChange: Int,
  pokeathlonStat: AbilityDetailPokemonInnerPokemon
)

object NatureDetailPokeathlonStatChangesInner {
  implicit lazy val natureDetailPokeathlonStatChangesInnerJsonFormat: Format[NatureDetailPokeathlonStatChangesInner] = Json.format[NatureDetailPokeathlonStatChangesInner]
}

