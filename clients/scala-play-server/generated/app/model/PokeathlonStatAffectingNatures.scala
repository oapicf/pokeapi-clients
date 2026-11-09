package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokeathlonStatAffectingNatures.
  * @param increase A list of natures and how they change the referenced Pokéathlon stat.
  * @param decrease A list of natures and how they change the referenced Pokéathlon stat.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokeathlonStatAffectingNatures(
  increase: List[PokeathlonStatAffectingNature],
  decrease: List[PokeathlonStatAffectingNature]
)

object PokeathlonStatAffectingNatures {
  implicit lazy val pokeathlonStatAffectingNaturesJsonFormat: Format[PokeathlonStatAffectingNatures] = Json.format[PokeathlonStatAffectingNatures]
}

