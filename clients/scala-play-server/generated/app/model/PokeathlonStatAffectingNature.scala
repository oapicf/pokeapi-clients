package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokeathlonStatAffectingNature.
  * @param maxChange The maximum amount of change to the referenced Pokéathlon stat.
  * @param nature The nature causing the change.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokeathlonStatAffectingNature(
  maxChange: Int,
  nature: NatureSummary
)

object PokeathlonStatAffectingNature {
  implicit lazy val pokeathlonStatAffectingNatureJsonFormat: Format[PokeathlonStatAffectingNature] = Json.format[PokeathlonStatAffectingNature]
}

