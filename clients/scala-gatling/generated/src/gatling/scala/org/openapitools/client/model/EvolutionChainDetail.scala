
package org.openapitools.client.model


case class EvolutionChainDetail (
    _id: Integer,
    _babyTriggerItem: ItemSummary,
    _chain: EvolutionChainDetailChain
)
object EvolutionChainDetail {
    def toStringBody(var_id: Object, var_babyTriggerItem: Object, var_chain: Object) =
        s"""
        | {
        | "id":$var_id,"babyTriggerItem":$var_babyTriggerItem,"chain":$var_chain
        | }
        """.stripMargin
}
