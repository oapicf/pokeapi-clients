package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokeathlonStatDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PokeathlonStatDetail(
  id: Int,
  name: String,
  affectingNatures: PokeathlonStatDetailAffectingNatures,
  names: List[PokeathlonStatName]
)

object PokeathlonStatDetail {
  implicit lazy val pokeathlonStatDetailJsonFormat: Format[PokeathlonStatDetail] = Json.format[PokeathlonStatDetail]
}

