# CharacteristicDescription


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.characteristic_description import CharacteristicDescription

# TODO update the JSON string below
json = "{}"
# create an instance of CharacteristicDescription from a JSON string
characteristic_description_instance = CharacteristicDescription.from_json(json)
# print the JSON string representation of the object
print(CharacteristicDescription.to_json())

# convert the object into a dict
characteristic_description_dict = characteristic_description_instance.to_dict()
# create an instance of CharacteristicDescription from a dict
characteristic_description_from_dict = CharacteristicDescription.from_dict(characteristic_description_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


