# PokeApiClient::MoveLearnMethodDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **names** | [**Array&lt;MoveLearnMethodName&gt;**](MoveLearnMethodName.md) | The name of this resource listed in different languages. | [readonly] |
| **descriptions** | [**Array&lt;MoveLearnMethodDescription&gt;**](MoveLearnMethodDescription.md) | The description of this resource listed in different languages. | [readonly] |
| **version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups where moves can be learned through this method. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::MoveLearnMethodDetail.new(
  id: null,
  name: null,
  names: null,
  descriptions: null,
  version_groups: null
)
```

