# PokeApiClient::BerryFirmnessDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **berries** | [**Array&lt;BerrySummary&gt;**](BerrySummary.md) | A list of the berries with this firmness. | [readonly] |
| **names** | [**Array&lt;BerryFirmnessName&gt;**](BerryFirmnessName.md) | The name of this resource listed in different languages. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::BerryFirmnessDetail.new(
  id: null,
  name: null,
  berries: null,
  names: null
)
```

