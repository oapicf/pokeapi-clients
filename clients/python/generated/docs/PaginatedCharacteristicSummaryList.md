# PaginatedCharacteristicSummaryList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** |  | [optional] 
**next** | **str** |  | [optional] 
**previous** | **str** |  | [optional] 
**results** | [**List[CharacteristicSummary]**](CharacteristicSummary.md) |  | [optional] 

## Example

```python
from pokeapiclient.models.paginated_characteristic_summary_list import PaginatedCharacteristicSummaryList

# TODO update the JSON string below
json = "{}"
# create an instance of PaginatedCharacteristicSummaryList from a JSON string
paginated_characteristic_summary_list_instance = PaginatedCharacteristicSummaryList.from_json(json)
# print the JSON string representation of the object
print(PaginatedCharacteristicSummaryList.to_json())

# convert the object into a dict
paginated_characteristic_summary_list_dict = paginated_characteristic_summary_list_instance.to_dict()
# create an instance of PaginatedCharacteristicSummaryList from a dict
paginated_characteristic_summary_list_from_dict = PaginatedCharacteristicSummaryList.from_dict(paginated_characteristic_summary_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


