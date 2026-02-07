# MoveTargetDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Descriptions** | [**[]MoveTargetDescription**](MoveTargetDescription.md) |  | 
**Moves** | [**[]MoveSummary**](MoveSummary.md) |  | 
**Names** | [**[]MoveTargetName**](MoveTargetName.md) |  | 

## Methods

### NewMoveTargetDetail

`func NewMoveTargetDetail(id int32, name string, descriptions []MoveTargetDescription, moves []MoveSummary, names []MoveTargetName, ) *MoveTargetDetail`

NewMoveTargetDetail instantiates a new MoveTargetDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveTargetDetailWithDefaults

`func NewMoveTargetDetailWithDefaults() *MoveTargetDetail`

NewMoveTargetDetailWithDefaults instantiates a new MoveTargetDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveTargetDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveTargetDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveTargetDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveTargetDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveTargetDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveTargetDetail) SetName(v string)`

SetName sets Name field to given value.


### GetDescriptions

`func (o *MoveTargetDetail) GetDescriptions() []MoveTargetDescription`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *MoveTargetDetail) GetDescriptionsOk() (*[]MoveTargetDescription, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *MoveTargetDetail) SetDescriptions(v []MoveTargetDescription)`

SetDescriptions sets Descriptions field to given value.


### GetMoves

`func (o *MoveTargetDetail) GetMoves() []MoveSummary`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *MoveTargetDetail) GetMovesOk() (*[]MoveSummary, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *MoveTargetDetail) SetMoves(v []MoveSummary)`

SetMoves sets Moves field to given value.


### GetNames

`func (o *MoveTargetDetail) GetNames() []MoveTargetName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *MoveTargetDetail) GetNamesOk() (*[]MoveTargetName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *MoveTargetDetail) SetNames(v []MoveTargetName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


