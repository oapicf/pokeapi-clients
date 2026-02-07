# MoveMetaAilmentDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Moves** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Names** | [**[]MoveMetaAilmentName**](MoveMetaAilmentName.md) |  | 

## Methods

### NewMoveMetaAilmentDetail

`func NewMoveMetaAilmentDetail(id int32, name string, moves []AbilityDetailPokemonInnerPokemon, names []MoveMetaAilmentName, ) *MoveMetaAilmentDetail`

NewMoveMetaAilmentDetail instantiates a new MoveMetaAilmentDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveMetaAilmentDetailWithDefaults

`func NewMoveMetaAilmentDetailWithDefaults() *MoveMetaAilmentDetail`

NewMoveMetaAilmentDetailWithDefaults instantiates a new MoveMetaAilmentDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveMetaAilmentDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveMetaAilmentDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveMetaAilmentDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveMetaAilmentDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveMetaAilmentDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveMetaAilmentDetail) SetName(v string)`

SetName sets Name field to given value.


### GetMoves

`func (o *MoveMetaAilmentDetail) GetMoves() []AbilityDetailPokemonInnerPokemon`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *MoveMetaAilmentDetail) GetMovesOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *MoveMetaAilmentDetail) SetMoves(v []AbilityDetailPokemonInnerPokemon)`

SetMoves sets Moves field to given value.


### GetNames

`func (o *MoveMetaAilmentDetail) GetNames() []MoveMetaAilmentName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *MoveMetaAilmentDetail) GetNamesOk() (*[]MoveMetaAilmentName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *MoveMetaAilmentDetail) SetNames(v []MoveMetaAilmentName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


