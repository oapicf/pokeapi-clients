# EvolutionConditionExpression


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **str** | Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;) | 
**percentage_chance** | **float** | Percentage chance of evolution under this condition (0-100) | 
**variables** | [**List[EvolutionVariableSummary]**](EvolutionVariableSummary.md) | Evolution variables referenced in the expression | 

## Example

```python
from pokeapiclient.models.evolution_condition_expression import EvolutionConditionExpression

# TODO update the JSON string below
json = "{}"
# create an instance of EvolutionConditionExpression from a JSON string
evolution_condition_expression_instance = EvolutionConditionExpression.from_json(json)
# print the JSON string representation of the object
print(EvolutionConditionExpression.to_json())

# convert the object into a dict
evolution_condition_expression_dict = evolution_condition_expression_instance.to_dict()
# create an instance of EvolutionConditionExpression from a dict
evolution_condition_expression_from_dict = EvolutionConditionExpression.from_dict(evolution_condition_expression_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


