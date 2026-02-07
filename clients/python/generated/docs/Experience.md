# Experience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level** | **int** |  | 
**experience** | **int** |  | 

## Example

```python
from pokeapiclient.models.experience import Experience

# TODO update the JSON string below
json = "{}"
# create an instance of Experience from a JSON string
experience_instance = Experience.from_json(json)
# print the JSON string representation of the object
print(Experience.to_json())

# convert the object into a dict
experience_dict = experience_instance.to_dict()
# create an instance of Experience from a dict
experience_from_dict = Experience.from_dict(experience_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


