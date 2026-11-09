# openapi::MoveTargetDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**descriptions** | [**array[MoveTargetDescription]**](MoveTargetDescription.md) | The description of this resource listed in different languages. | [readonly] 
**moves** | [**array[MoveSummary]**](MoveSummary.md) | A list of moves that that are directed at this target. | [readonly] 
**names** | [**array[MoveTargetName]**](MoveTargetName.md) | The name of this resource listed in different languages. | [readonly] 


