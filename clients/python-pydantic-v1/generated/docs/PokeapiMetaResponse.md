# PokeapiMetaResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deploy_date** | **str** | The deployment time as a Unix timestamp string. | 
**hash** | **str** | The source commit hash used for this deployment. | 
**tag** | **str** | The deployment tag, or null if the deployment has no tag. | 

## Example

```python
from openapi_client.models.pokeapi_meta_response import PokeapiMetaResponse

# TODO update the JSON string below
json = "{}"
# create an instance of PokeapiMetaResponse from a JSON string
pokeapi_meta_response_instance = PokeapiMetaResponse.from_json(json)
# print the JSON string representation of the object
print PokeapiMetaResponse.to_json()

# convert the object into a dict
pokeapi_meta_response_dict = pokeapi_meta_response_instance.to_dict()
# create an instance of PokeapiMetaResponse from a dict
pokeapi_meta_response_from_dict = PokeapiMetaResponse.from_dict(pokeapi_meta_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


