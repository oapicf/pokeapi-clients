
package org.openapitools.client.model


case class BerryFlavorBerryMap (
    /* How powerful the referenced flavor is for this berry. */
    _potency: Integer,
    /* The berry with the referenced flavor. */
    _berry: BerrySummary
)
object BerryFlavorBerryMap {
    def toStringBody(var_potency: Object, var_berry: Object) =
        s"""
        | {
        | "potency":$var_potency,"berry":$var_berry
        | }
        """.stripMargin
}
