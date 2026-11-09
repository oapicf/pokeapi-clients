# PokeApiClient::LocationAreaEncounterVersionDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **rate** | **Integer** | The chance of an encounter to occur. |  |
| **version** | [**VersionSummary**](VersionSummary.md) | The version of the game in which the encounter can occur with the given chance. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::LocationAreaEncounterVersionDetail.new(
  rate: null,
  version: null
)
```

