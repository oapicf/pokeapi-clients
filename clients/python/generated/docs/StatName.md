# StatName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.stat_name import StatName

# TODO update the JSON string below
json = "{}"
# create an instance of StatName from a JSON string
stat_name_instance = StatName.from_json(json)
# print the JSON string representation of the object
print(StatName.to_json())

# convert the object into a dict
stat_name_dict = stat_name_instance.to_dict()
# create an instance of StatName from a dict
stat_name_from_dict = StatName.from_dict(stat_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


