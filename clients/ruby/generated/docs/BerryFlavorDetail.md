# PokeApiClient::BerryFlavorDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **berries** | [**Array&lt;BerryFlavorBerryMap&gt;**](BerryFlavorBerryMap.md) | A list of the berries with this flavor. | [readonly] |
| **contest_type** | [**ContestTypeSummary**](ContestTypeSummary.md) | The contest type that correlates with this berry flavor. |  |
| **names** | [**Array&lt;BerryFlavorName&gt;**](BerryFlavorName.md) | The name of this resource listed in different languages. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::BerryFlavorDetail.new(
  id: null,
  name: null,
  berries: null,
  contest_type: null,
  names: null
)
```

