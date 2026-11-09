
package org.openapitools.client.model


case class EvolutionChainDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon. */
    _babyTriggerItem: ItemSummary,
    /* The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order. */
    _chain: EvolutionChainLink
)
object EvolutionChainDetail {
    def toStringBody(var_id: Object, var_babyTriggerItem: Object, var_chain: Object) =
        s"""
        | {
        | "id":$var_id,"babyTriggerItem":$var_babyTriggerItem,"chain":$var_chain
        | }
        """.stripMargin
}
