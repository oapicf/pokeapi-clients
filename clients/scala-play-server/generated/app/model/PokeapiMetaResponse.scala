package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PokeapiMetaResponse.
  * @param deployDate The deployment time as a Unix timestamp string.
  * @param hash The source commit hash used for this deployment.
  * @param tag The deployment tag, or null if the deployment has no tag.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PokeapiMetaResponse(
  deployDate: String,
  hash: String,
  tag: String
)

object PokeapiMetaResponse {
  implicit lazy val pokeapiMetaResponseJsonFormat: Format[PokeapiMetaResponse] = Json.format[PokeapiMetaResponse]
}

