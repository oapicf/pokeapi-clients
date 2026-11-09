# PokeApiClient::BerryFlavorMap

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **potency** | **Integer** | How powerful the referenced flavor is for this berry. |  |
| **flavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The referenced berry flavor. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::BerryFlavorMap.new(
  potency: null,
  flavor: null
)
```

