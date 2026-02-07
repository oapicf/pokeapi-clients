
package org.openapitools.client.model


case class BerryFlavorDetailBerriesInner (
    _potency: Integer,
    _berry: BerryFlavorDetailBerriesInnerBerry
)
object BerryFlavorDetailBerriesInner {
    def toStringBody(var_potency: Object, var_berry: Object) =
        s"""
        | {
        | "potency":$var_potency,"berry":$var_berry
        | }
        """.stripMargin
}
