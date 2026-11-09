# AbilityFlavorText


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flavor_text** | **str** | The localized name for an API resource in a specific language. | 
**language** | [**LanguageSummary**](LanguageSummary.md) | The language this text resource is in. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group that uses this flavor text. | 

## Example

```python
from openapi_client.models.ability_flavor_text import AbilityFlavorText

# TODO update the JSON string below
json = "{}"
# create an instance of AbilityFlavorText from a JSON string
ability_flavor_text_instance = AbilityFlavorText.from_json(json)
# print the JSON string representation of the object
print AbilityFlavorText.to_json()

# convert the object into a dict
ability_flavor_text_dict = ability_flavor_text_instance.to_dict()
# create an instance of AbilityFlavorText from a dict
ability_flavor_text_from_dict = AbilityFlavorText.from_dict(ability_flavor_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


