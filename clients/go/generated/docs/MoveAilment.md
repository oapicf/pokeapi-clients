# MoveAilment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Name** | **string** |  | 
**Moves** | [**[]Move**](Move.md) |  | 

## Methods

### NewMoveAilment

`func NewMoveAilment(id int32, name string, moves []Move, ) *MoveAilment`

NewMoveAilment instantiates a new MoveAilment object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveAilmentWithDefaults

`func NewMoveAilmentWithDefaults() *MoveAilment`

NewMoveAilmentWithDefaults instantiates a new MoveAilment object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveAilment) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveAilment) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveAilment) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveAilment) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveAilment) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveAilment) SetName(v string)`

SetName sets Name field to given value.


### GetMoves

`func (o *MoveAilment) GetMoves() []Move`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *MoveAilment) GetMovesOk() (*[]Move, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *MoveAilment) SetMoves(v []Move)`

SetMoves sets Moves field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


