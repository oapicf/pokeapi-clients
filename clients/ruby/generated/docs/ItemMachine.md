# PokeApiClient::ItemMachine

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **machine** | [**MachineSummary**](MachineSummary.md) | The machine that teaches a move from an item. |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group of this specific machine. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::ItemMachine.new(
  machine: null,
  version_group: null
)
```

