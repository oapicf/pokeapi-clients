# MoveMetaCategoryDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Descriptions** | [**[]MoveMetaCategoryDescription**](MoveMetaCategoryDescription.md) |  | 
**Moves** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Methods

### NewMoveMetaCategoryDetail

`func NewMoveMetaCategoryDetail(id int32, name string, descriptions []MoveMetaCategoryDescription, moves []AbilityDetailPokemonInnerPokemon, ) *MoveMetaCategoryDetail`

NewMoveMetaCategoryDetail instantiates a new MoveMetaCategoryDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveMetaCategoryDetailWithDefaults

`func NewMoveMetaCategoryDetailWithDefaults() *MoveMetaCategoryDetail`

NewMoveMetaCategoryDetailWithDefaults instantiates a new MoveMetaCategoryDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveMetaCategoryDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveMetaCategoryDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveMetaCategoryDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveMetaCategoryDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveMetaCategoryDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveMetaCategoryDetail) SetName(v string)`

SetName sets Name field to given value.


### GetDescriptions

`func (o *MoveMetaCategoryDetail) GetDescriptions() []MoveMetaCategoryDescription`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *MoveMetaCategoryDetail) GetDescriptionsOk() (*[]MoveMetaCategoryDescription, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *MoveMetaCategoryDetail) SetDescriptions(v []MoveMetaCategoryDescription)`

SetDescriptions sets Descriptions field to given value.


### GetMoves

`func (o *MoveMetaCategoryDetail) GetMoves() []AbilityDetailPokemonInnerPokemon`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *MoveMetaCategoryDetail) GetMovesOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *MoveMetaCategoryDetail) SetMoves(v []AbilityDetailPokemonInnerPokemon)`

SetMoves sets Moves field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


