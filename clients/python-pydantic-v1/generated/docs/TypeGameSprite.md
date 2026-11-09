# TypeGameSprite


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name_icon** | **str** | The URL of the icon displaying the type name in this game, or null if unavailable. | [optional] 
**symbol_icon** | **str** | The URL of the type symbol icon in this game, or null if unavailable. | [optional] 

## Example

```python
from openapi_client.models.type_game_sprite import TypeGameSprite

# TODO update the JSON string below
json = "{}"
# create an instance of TypeGameSprite from a JSON string
type_game_sprite_instance = TypeGameSprite.from_json(json)
# print the JSON string representation of the object
print TypeGameSprite.to_json()

# convert the object into a dict
type_game_sprite_dict = type_game_sprite_instance.to_dict()
# create an instance of TypeGameSprite from a dict
type_game_sprite_from_dict = TypeGameSprite.from_dict(type_game_sprite_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


