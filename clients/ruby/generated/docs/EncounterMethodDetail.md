# PokeApiClient::EncounterMethodDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **order** | **Integer** | A good value for sorting. | [optional] |
| **names** | [**Array&lt;EncounterMethodName&gt;**](EncounterMethodName.md) | The name of this resource listed in different languages. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::EncounterMethodDetail.new(
  id: null,
  name: null,
  order: null,
  names: null
)
```

