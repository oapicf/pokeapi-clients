
package org.openapitools.client.model


case class ItemPrice (
    /* The purchase price in this currency and version group, or null if unavailable. */
    _purchasePrice: Option[Integer],
    /* The sell price in this currency and version group, or null if unavailable. */
    _sellPrice: Option[Integer],
    /* The currency used for this price. */
    _currency: CurrencySummary,
    /* The version group to which this price applies. */
    _versionGroup: VersionGroupSummary
)
object ItemPrice {
    def toStringBody(var_purchasePrice: Object, var_sellPrice: Object, var_currency: Object, var_versionGroup: Object) =
        s"""
        | {
        | "purchasePrice":$var_purchasePrice,"sellPrice":$var_sellPrice,"currency":$var_currency,"versionGroup":$var_versionGroup
        | }
        """.stripMargin
}
