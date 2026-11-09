# openapi::MoveLearnMethodDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**names** | [**array[MoveLearnMethodName]**](MoveLearnMethodName.md) | The name of this resource listed in different languages. | [readonly] 
**descriptions** | [**array[MoveLearnMethodDescription]**](MoveLearnMethodDescription.md) | The description of this resource listed in different languages. | [readonly] 
**version_groups** | [**array[VersionGroupSummary]**](VersionGroupSummary.md) | A list of version groups where moves can be learned through this method. | [readonly] 


