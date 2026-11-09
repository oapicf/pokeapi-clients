# CharacteristicDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**gene_modulo** | **int** | The remainder of the highest stat/IV divided by 5. | 
**possible_values** | **List[int]** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] 
**highest_stat** | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. | 
**descriptions** | [**List[CharacteristicDescription]**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] 

## Example

```python
from openapi_client.models.characteristic_detail import CharacteristicDetail

# TODO update the JSON string below
json = "{}"
# create an instance of CharacteristicDetail from a JSON string
characteristic_detail_instance = CharacteristicDetail.from_json(json)
# print the JSON string representation of the object
print CharacteristicDetail.to_json()

# convert the object into a dict
characteristic_detail_dict = characteristic_detail_instance.to_dict()
# create an instance of CharacteristicDetail from a dict
characteristic_detail_from_dict = CharacteristicDetail.from_dict(characteristic_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


