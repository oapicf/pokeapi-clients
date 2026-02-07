# PokeApiClient::EncounterMethodDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **order** | **Integer** |  | [optional] |
| **names** | [**Array&lt;EncounterMethodName&gt;**](EncounterMethodName.md) |  |  |

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

