package org.openapitools.server.model


/**
 * @param purchasePrice The purchase price in this currency and version group, or null if unavailable. for example: ''null''
 * @param sellPrice The sell price in this currency and version group, or null if unavailable. for example: ''null''
 * @param currency The currency used for this price. for example: ''null''
 * @param versionGroup The version group to which this price applies. for example: ''null''
*/
final case class ItemPrice (
  purchasePrice: Option[Int] = None,
  sellPrice: Option[Int] = None,
  currency: CurrencySummary,
  versionGroup: VersionGroupSummary
)

