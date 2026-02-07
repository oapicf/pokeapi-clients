# GenerationSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**url** | **str** |  | [readonly] 

## Example

```python
from pokeapiclient.models.generation_summary import GenerationSummary

# TODO update the JSON string below
json = "{}"
# create an instance of GenerationSummary from a JSON string
generation_summary_instance = GenerationSummary.from_json(json)
# print the JSON string representation of the object
print(GenerationSummary.to_json())

# convert the object into a dict
generation_summary_dict = generation_summary_instance.to_dict()
# create an instance of GenerationSummary from a dict
generation_summary_from_dict = GenerationSummary.from_dict(generation_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


