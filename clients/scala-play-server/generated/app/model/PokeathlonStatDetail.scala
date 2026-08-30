package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokeathlonStatDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PokeathlonStatDetail(
  id: Int,
  name: String,
  affectingNatures: PokeathlonStatDetailAffectingNatures,
  names: List[PokeathlonStatName]
)

object PokeathlonStatDetail {
  implicit lazy val pokeathlonStatDetailJsonFormat: Format[PokeathlonStatDetail] = Json.format[PokeathlonStatDetail]
}

