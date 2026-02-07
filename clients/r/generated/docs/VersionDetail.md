# openapi::VersionDetail

Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** |  | [readonly] 
**name** | **character** |  | [Max. length: 100] 
**names** | [**array[VersionName]**](VersionName.md) |  | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 


