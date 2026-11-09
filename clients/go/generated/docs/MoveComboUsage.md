# MoveComboUsage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UseBefore** | [**[]MoveSummary**](MoveSummary.md) | A list of moves to use before this move. | 
**UseAfter** | [**[]MoveSummary**](MoveSummary.md) | A list of moves to use after this move. | 

## Methods

### NewMoveComboUsage

`func NewMoveComboUsage(useBefore []MoveSummary, useAfter []MoveSummary, ) *MoveComboUsage`

NewMoveComboUsage instantiates a new MoveComboUsage object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveComboUsageWithDefaults

`func NewMoveComboUsageWithDefaults() *MoveComboUsage`

NewMoveComboUsageWithDefaults instantiates a new MoveComboUsage object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUseBefore

`func (o *MoveComboUsage) GetUseBefore() []MoveSummary`

GetUseBefore returns the UseBefore field if non-nil, zero value otherwise.

### GetUseBeforeOk

`func (o *MoveComboUsage) GetUseBeforeOk() (*[]MoveSummary, bool)`

GetUseBeforeOk returns a tuple with the UseBefore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseBefore

`func (o *MoveComboUsage) SetUseBefore(v []MoveSummary)`

SetUseBefore sets UseBefore field to given value.


### SetUseBeforeNil

`func (o *MoveComboUsage) SetUseBeforeNil(b bool)`

 SetUseBeforeNil sets the value for UseBefore to be an explicit nil

### UnsetUseBefore
`func (o *MoveComboUsage) UnsetUseBefore()`

UnsetUseBefore ensures that no value is present for UseBefore, not even an explicit nil
### GetUseAfter

`func (o *MoveComboUsage) GetUseAfter() []MoveSummary`

GetUseAfter returns the UseAfter field if non-nil, zero value otherwise.

### GetUseAfterOk

`func (o *MoveComboUsage) GetUseAfterOk() (*[]MoveSummary, bool)`

GetUseAfterOk returns a tuple with the UseAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseAfter

`func (o *MoveComboUsage) SetUseAfter(v []MoveSummary)`

SetUseAfter sets UseAfter field to given value.


### SetUseAfterNil

`func (o *MoveComboUsage) SetUseAfterNil(b bool)`

 SetUseAfterNil sets the value for UseAfter to be an explicit nil

### UnsetUseAfter
`func (o *MoveComboUsage) UnsetUseAfter()`

UnsetUseAfter ensures that no value is present for UseAfter, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


