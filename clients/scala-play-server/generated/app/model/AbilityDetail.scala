package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AbilityDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AbilityDetail(
  id: Int,
  name: String,
  isMainSeries: Option[Boolean],
  generation: GenerationSummary,
  names: List[AbilityName],
  effectEntries: List[AbilityEffectText],
  effectChanges: List[AbilityChange],
  flavorTextEntries: List[AbilityFlavorText],
  pokemon: List[AbilityDetailPokemonInner]
)

object AbilityDetail {
  implicit lazy val abilityDetailJsonFormat: Format[AbilityDetail] = Json.format[AbilityDetail]
}

