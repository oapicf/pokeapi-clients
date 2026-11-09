# WWW::OpenAPIClient::Object::EvolutionConditionExpression

## Load the model package
```perl
use WWW::OpenAPIClient::Object::EvolutionConditionExpression;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **string** | Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;) | 
**percentage_chance** | **double** | Percentage chance of evolution under this condition (0-100) | 
**variables** | [**ARRAY[EvolutionVariableSummary]**](EvolutionVariableSummary.md) | Evolution variables referenced in the expression | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


