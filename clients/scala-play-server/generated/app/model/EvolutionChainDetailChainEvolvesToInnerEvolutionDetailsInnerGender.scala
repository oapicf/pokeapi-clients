package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender(
  name: String,
  url: URI
)

object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender {
  implicit lazy val evolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGenderJsonFormat: Format[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender] = Json.format[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender]
}

