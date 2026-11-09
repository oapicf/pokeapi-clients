# StatAffectingNatures


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**increase** | [**List[NatureSummary]**](NatureSummary.md) | A list of natures and how they change the referenced stat. | 
**decrease** | [**List[NatureSummary]**](NatureSummary.md) | A list of nature sand how they change the referenced stat. | 

## Example

```python
from pokeapiclient.models.stat_affecting_natures import StatAffectingNatures

# TODO update the JSON string below
json = "{}"
# create an instance of StatAffectingNatures from a JSON string
stat_affecting_natures_instance = StatAffectingNatures.from_json(json)
# print the JSON string representation of the object
print(StatAffectingNatures.to_json())

# convert the object into a dict
stat_affecting_natures_dict = stat_affecting_natures_instance.to_dict()
# create an instance of StatAffectingNatures from a dict
stat_affecting_natures_from_dict = StatAffectingNatures.from_dict(stat_affecting_natures_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


