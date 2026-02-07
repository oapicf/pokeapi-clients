# GenerationName


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**language** | [**LanguageSummary**](LanguageSummary.md) |  | 

## Example

```python
from pokeapiclient.models.generation_name import GenerationName

# TODO update the JSON string below
json = "{}"
# create an instance of GenerationName from a JSON string
generation_name_instance = GenerationName.from_json(json)
# print the JSON string representation of the object
print(GenerationName.to_json())

# convert the object into a dict
generation_name_dict = generation_name_instance.to_dict()
# create an instance of GenerationName from a dict
generation_name_from_dict = GenerationName.from_dict(generation_name_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


