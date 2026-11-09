# Org.OpenAPITools.Model.VersionDetail
Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Names** | [**List&lt;VersionName&gt;**](VersionName.md) | The name of this resource listed in different languages. | [readonly] 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this version belongs to. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

