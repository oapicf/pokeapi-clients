# PokeApiClient::ContestTypeDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **berry_flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The berry flavor that correlates with this contest type. | [readonly] |
| **names** | [**Array&lt;ContestTypeName&gt;**](ContestTypeName.md) | The name of this contest type listed in different languages. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ContestTypeDetail.new(
  id: null,
  name: null,
  berry_flavor: null,
  names: null
)
```

