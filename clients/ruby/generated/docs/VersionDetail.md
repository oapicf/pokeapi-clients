# PokeApiClient::VersionDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **names** | [**Array&lt;VersionName&gt;**](VersionName.md) | The name of this resource listed in different languages. | [readonly] |
| **version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this version belongs to. |  |

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

