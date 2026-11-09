# PokeApiClient::StatAffectingMoves

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **increase** | [**Array&lt;MoveStatChange&gt;**](MoveStatChange.md) | A list of moves and how they change the referenced stat. |  |
| **decrease** | [**Array&lt;MoveStatChange&gt;**](MoveStatChange.md) | A list of moves and how they change the referenced stat. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::StatAffectingMoves.new(
  increase: null,
  decrease: null
)
```

