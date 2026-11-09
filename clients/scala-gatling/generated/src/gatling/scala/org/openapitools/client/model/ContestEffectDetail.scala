
package org.openapitools.client.model


case class ContestEffectDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The base number of hearts the user of this move gets. */
    _appeal: Integer,
    /* The base number of hearts the user's opponent loses. */
    _jam: Integer,
    /* The result of this contest effect listed in different languages. */
    _effectEntries: List[ContestEffectEffectText],
    /* The flavor text of this contest effect listed in different languages. */
    _flavorTextEntries: List[ContestEffectFlavorText]
)
object ContestEffectDetail {
    def toStringBody(var_id: Object, var_appeal: Object, var_jam: Object, var_effectEntries: Object, var_flavorTextEntries: Object) =
        s"""
        | {
        | "id":$var_id,"appeal":$var_appeal,"jam":$var_jam,"effectEntries":$var_effectEntries,"flavorTextEntries":$var_flavorTextEntries
        | }
        """.stripMargin
}
