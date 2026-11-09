package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EvolutionChainDetail.
  * @param id The identifier for this resource.
  * @param babyTriggerItem The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
  * @param chain The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EvolutionChainDetail(
  id: Int,
  babyTriggerItem: ItemSummary,
  chain: EvolutionChainLink
)

object EvolutionChainDetail {
  implicit lazy val evolutionChainDetailJsonFormat: Format[EvolutionChainDetail] = Json.format[EvolutionChainDetail]
}

