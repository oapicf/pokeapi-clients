
# Table `ItemPrice`
(mapped from: ItemPrice)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**currency** | currency | long NOT NULL |  | [**CurrencySummary**](CurrencySummary.md) | The currency used for this price. |  [foreignkey]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group to which this price applies. |  [foreignkey]
**purchasePrice** | purchase_price | int |  | **kotlin.Int** | The purchase price in this currency and version group, or null if unavailable. |  [optional]
**sellPrice** | sell_price | int |  | **kotlin.Int** | The sell price in this currency and version group, or null if unavailable. |  [optional]






