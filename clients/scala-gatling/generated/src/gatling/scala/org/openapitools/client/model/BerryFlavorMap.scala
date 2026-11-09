
package org.openapitools.client.model


case class BerryFlavorMap (
    /* How powerful the referenced flavor is for this berry. */
    _potency: Integer,
    /* The referenced berry flavor. */
    _flavor: BerryFlavorSummary
)
object BerryFlavorMap {
    def toStringBody(var_potency: Object, var_flavor: Object) =
        s"""
        | {
        | "potency":$var_potency,"flavor":$var_flavor
        | }
        """.stripMargin
}
