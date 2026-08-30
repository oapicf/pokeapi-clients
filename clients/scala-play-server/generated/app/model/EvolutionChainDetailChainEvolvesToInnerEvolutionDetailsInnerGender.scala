package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender(
  name: String,
  url: URI
)

object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender {
  implicit lazy val evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderJsonFormat: Format[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender] = Json.format[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender]
}

