# WWW::OpenAPIClient::Object::ItemCategoryDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ItemCategoryDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**items** | [**ARRAY[ItemSummary]**](ItemSummary.md) | A list of items that are a part of this category. | [readonly] 
**names** | [**ARRAY[ItemCategoryName]**](ItemCategoryName.md) | The name of this item category listed in different languages. | [readonly] 
**pocket** | [**ItemPocketSummary**](ItemPocketSummary.md) | The pocket items in this category would be put in. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


