# CharacteristicSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.characteristic_summary import CharacteristicSummary

# TODO update the JSON string below
json = "{}"
# create an instance of CharacteristicSummary from a JSON string
characteristic_summary_instance = CharacteristicSummary.from_json(json)
# print the JSON string representation of the object
print(CharacteristicSummary.to_json())

# convert the object into a dict
characteristic_summary_dict = characteristic_summary_instance.to_dict()
# create an instance of CharacteristicSummary from a dict
characteristic_summary_from_dict = CharacteristicSummary.from_dict(characteristic_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


