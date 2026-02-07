# MoveDamageClassDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Descriptions** | [**[]MoveDamageClassDescription**](MoveDamageClassDescription.md) |  | 
**Moves** | [**[]MoveSummary**](MoveSummary.md) |  | 
**Names** | [**[]MoveDamageClassName**](MoveDamageClassName.md) |  | 

## Methods

### NewMoveDamageClassDetail

`func NewMoveDamageClassDetail(id int32, name string, descriptions []MoveDamageClassDescription, moves []MoveSummary, names []MoveDamageClassName, ) *MoveDamageClassDetail`

NewMoveDamageClassDetail instantiates a new MoveDamageClassDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveDamageClassDetailWithDefaults

`func NewMoveDamageClassDetailWithDefaults() *MoveDamageClassDetail`

NewMoveDamageClassDetailWithDefaults instantiates a new MoveDamageClassDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveDamageClassDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveDamageClassDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveDamageClassDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveDamageClassDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveDamageClassDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveDamageClassDetail) SetName(v string)`

SetName sets Name field to given value.


### GetDescriptions

`func (o *MoveDamageClassDetail) GetDescriptions() []MoveDamageClassDescription`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *MoveDamageClassDetail) GetDescriptionsOk() (*[]MoveDamageClassDescription, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *MoveDamageClassDetail) SetDescriptions(v []MoveDamageClassDescription)`

SetDescriptions sets Descriptions field to given value.


### GetMoves

`func (o *MoveDamageClassDetail) GetMoves() []MoveSummary`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *MoveDamageClassDetail) GetMovesOk() (*[]MoveSummary, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *MoveDamageClassDetail) SetMoves(v []MoveSummary)`

SetMoves sets Moves field to given value.


### GetNames

`func (o *MoveDamageClassDetail) GetNames() []MoveDamageClassName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *MoveDamageClassDetail) GetNamesOk() (*[]MoveDamageClassName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *MoveDamageClassDetail) SetNames(v []MoveDamageClassName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


