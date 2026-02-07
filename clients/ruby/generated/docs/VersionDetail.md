# PokeApiClient::VersionDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  | [readonly] |
| **name** | **String** |  |  |
| **names** | [**Array&lt;VersionName&gt;**](VersionName.md) |  |  |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::VersionDetail.new(
  id: null,
  name: null,
  names: null,
  version_group: null
)
```

