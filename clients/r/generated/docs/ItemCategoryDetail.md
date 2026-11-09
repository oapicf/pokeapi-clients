# openapi::ItemCategoryDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**items** | [**array[ItemSummary]**](ItemSummary.md) | A list of items that are a part of this category. | [readonly] 
**names** | [**array[ItemCategoryName]**](ItemCategoryName.md) | The name of this item category listed in different languages. | [readonly] 
**pocket** | [**ItemPocketSummary**](ItemPocketSummary.md) | The pocket items in this category would be put in. | 


