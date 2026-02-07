
package org.openapitools.client.model


case class BerryDetailFlavorsInner (
    _potency: Integer,
    _flavor: BerryDetailFlavorsInnerFlavor
)
object BerryDetailFlavorsInner {
    def toStringBody(var_potency: Object, var_flavor: Object) =
        s"""
        | {
        | "potency":$var_potency,"flavor":$var_flavor
        | }
        """.stripMargin
}
