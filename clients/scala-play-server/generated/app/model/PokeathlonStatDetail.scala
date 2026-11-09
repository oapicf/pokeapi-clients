package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokeathlonStatDetail.
  * @param id The identifier for this resource.
  * @param name The name for this resource.
  * @param affectingNatures A detail of natures which affect this Pokéathlon stat positively or negatively.
  * @param names The name of this resource listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokeathlonStatDetail(
  id: Int,
  name: String,
  affectingNatures: PokeathlonStatAffectingNatures,
  names: List[PokeathlonStatName]
)

object PokeathlonStatDetail {
  implicit lazy val pokeathlonStatDetailJsonFormat: Format[PokeathlonStatDetail] = Json.format[PokeathlonStatDetail]
}

