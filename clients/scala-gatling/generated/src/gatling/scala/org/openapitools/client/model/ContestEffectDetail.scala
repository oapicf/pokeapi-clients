
package org.openapitools.client.model


case class ContestEffectDetail (
    _id: Integer,
    _appeal: Integer,
    _jam: Integer,
    _effectEntries: List[ContestEffectEffectText],
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
