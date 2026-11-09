# ItemMachine


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**machine** | [**MachineSummary**](MachineSummary.md) | The machine that teaches a move from an item. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group of this specific machine. | 

## Example

```python
from pokeapiclient.models.item_machine import ItemMachine

# TODO update the JSON string below
json = "{}"
# create an instance of ItemMachine from a JSON string
item_machine_instance = ItemMachine.from_json(json)
# print the JSON string representation of the object
print(ItemMachine.to_json())

# convert the object into a dict
item_machine_dict = item_machine_instance.to_dict()
# create an instance of ItemMachine from a dict
item_machine_from_dict = ItemMachine.from_dict(item_machine_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


