# ItemSprites


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**default** | **str** | The default depiction of this item. | 

## Example

```python
from pokeapiclient.models.item_sprites import ItemSprites

# TODO update the JSON string below
json = "{}"
# create an instance of ItemSprites from a JSON string
item_sprites_instance = ItemSprites.from_json(json)
# print the JSON string representation of the object
print(ItemSprites.to_json())

# convert the object into a dict
item_sprites_dict = item_sprites_instance.to_dict()
# create an instance of ItemSprites from a dict
item_sprites_from_dict = ItemSprites.from_dict(item_sprites_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


