# PokeApiClient::MachineDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **item** | [**ItemSummary**](ItemSummary.md) | The TM or HM item that corresponds to this machine. |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that this machine applies to. |  |
| **move** | [**MoveSummary**](MoveSummary.md) | The move that is taught by this machine. |  |

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

