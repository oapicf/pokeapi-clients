# openapi::VersionDetail

Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**names** | [**array[VersionName]**](VersionName.md) | The name of this resource listed in different languages. | [readonly] 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this version belongs to. | 


