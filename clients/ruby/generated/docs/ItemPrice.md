# PokeApiClient::ItemPrice

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **purchase_price** | **Integer** | The purchase price in this currency and version group, or null if unavailable. | [optional] |
| **sell_price** | **Integer** | The sell price in this currency and version group, or null if unavailable. | [optional] |
| **currency** | [**CurrencySummary**](CurrencySummary.md) | The currency used for this price. |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group to which this price applies. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemPrice.new(
  purchase_price: null,
  sell_price: null,
  currency: null,
  version_group: null
)
```

