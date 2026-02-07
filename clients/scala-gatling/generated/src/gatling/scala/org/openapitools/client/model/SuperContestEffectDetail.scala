
package org.openapitools.client.model


case class SuperContestEffectDetail (
    _id: Integer,
    _appeal: Integer,
    _flavorTextEntries: List[SuperContestEffectFlavorText],
    _moves: List[MoveSummary]
)
object SuperContestEffectDetail {
    def toStringBody(var_id: Object, var_appeal: Object, var_flavorTextEntries: Object, var_moves: Object) =
        s"""
        | {
        | "id":$var_id,"appeal":$var_appeal,"flavorTextEntries":$var_flavorTextEntries,"moves":$var_moves
        | }
        """.stripMargin
}
