
package org.openapitools.client.model


case class SuperContestEffectDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The level of appeal this super contest effect has. */
    _appeal: Integer,
    /* The flavor text of this super contest effect listed in different languages. */
    _flavorTextEntries: List[SuperContestEffectFlavorText],
    /* A list of moves that have the effect when used in super contests. */
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
