# PokeApiClient::MachineDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **item** | [**ItemSummary**](ItemSummary.md) |  |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  |
| **move** | [**MoveSummary**](MoveSummary.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MachineDetail.new(
  id: null,
  item: null,
  version_group: null,
  move: null
)
```

