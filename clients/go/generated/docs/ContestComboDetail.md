# ContestComboDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UseBefore** | Pointer to [**[]Move**](Move.md) | A list of moves to use before this move. | [optional] 
**UseAfter** | Pointer to [**[]Move**](Move.md) | A list of moves to use after this move. | [optional] 

## Methods

### NewContestComboDetail

`func NewContestComboDetail() *ContestComboDetail`

NewContestComboDetail instantiates a new ContestComboDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewContestComboDetailWithDefaults

`func NewContestComboDetailWithDefaults() *ContestComboDetail`

NewContestComboDetailWithDefaults instantiates a new ContestComboDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUseBefore

`func (o *ContestComboDetail) GetUseBefore() []Move`

GetUseBefore returns the UseBefore field if non-nil, zero value otherwise.

### GetUseBeforeOk

`func (o *ContestComboDetail) GetUseBeforeOk() (*[]Move, bool)`

GetUseBeforeOk returns a tuple with the UseBefore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseBefore

`func (o *ContestComboDetail) SetUseBefore(v []Move)`

SetUseBefore sets UseBefore field to given value.

### HasUseBefore

`func (o *ContestComboDetail) HasUseBefore() bool`

HasUseBefore returns a boolean if a field has been set.

### GetUseAfter

`func (o *ContestComboDetail) GetUseAfter() []Move`

GetUseAfter returns the UseAfter field if non-nil, zero value otherwise.

### GetUseAfterOk

`func (o *ContestComboDetail) GetUseAfterOk() (*[]Move, bool)`

GetUseAfterOk returns a tuple with the UseAfter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseAfter

`func (o *ContestComboDetail) SetUseAfter(v []Move)`

SetUseAfter sets UseAfter field to given value.

### HasUseAfter

`func (o *ContestComboDetail) HasUseAfter() bool`

HasUseAfter returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


