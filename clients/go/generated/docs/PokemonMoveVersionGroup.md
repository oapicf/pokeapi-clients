# PokemonMoveVersionGroup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LevelLearnedAt** | **int32** | The minimum level to learn the move. | 
**MoveLearnMethod** | [**MoveLearnMethodSummary**](MoveLearnMethodSummary.md) | The method by which the move is learned. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the move is learned. | 
**Order** | Pointer to **NullableInt32** | Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. | [optional] 

## Methods

### NewPokemonMoveVersionGroup

`func NewPokemonMoveVersionGroup(levelLearnedAt int32, moveLearnMethod MoveLearnMethodSummary, versionGroup VersionGroupSummary, ) *PokemonMoveVersionGroup`

NewPokemonMoveVersionGroup instantiates a new PokemonMoveVersionGroup object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonMoveVersionGroupWithDefaults

`func NewPokemonMoveVersionGroupWithDefaults() *PokemonMoveVersionGroup`

NewPokemonMoveVersionGroupWithDefaults instantiates a new PokemonMoveVersionGroup object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLevelLearnedAt

`func (o *PokemonMoveVersionGroup) GetLevelLearnedAt() int32`

GetLevelLearnedAt returns the LevelLearnedAt field if non-nil, zero value otherwise.

### GetLevelLearnedAtOk

`func (o *PokemonMoveVersionGroup) GetLevelLearnedAtOk() (*int32, bool)`

GetLevelLearnedAtOk returns a tuple with the LevelLearnedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevelLearnedAt

`func (o *PokemonMoveVersionGroup) SetLevelLearnedAt(v int32)`

SetLevelLearnedAt sets LevelLearnedAt field to given value.


### GetMoveLearnMethod

`func (o *PokemonMoveVersionGroup) GetMoveLearnMethod() MoveLearnMethodSummary`

GetMoveLearnMethod returns the MoveLearnMethod field if non-nil, zero value otherwise.

### GetMoveLearnMethodOk

`func (o *PokemonMoveVersionGroup) GetMoveLearnMethodOk() (*MoveLearnMethodSummary, bool)`

GetMoveLearnMethodOk returns a tuple with the MoveLearnMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveLearnMethod

`func (o *PokemonMoveVersionGroup) SetMoveLearnMethod(v MoveLearnMethodSummary)`

SetMoveLearnMethod sets MoveLearnMethod field to given value.


### GetVersionGroup

`func (o *PokemonMoveVersionGroup) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *PokemonMoveVersionGroup) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *PokemonMoveVersionGroup) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.


### GetOrder

`func (o *PokemonMoveVersionGroup) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *PokemonMoveVersionGroup) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *PokemonMoveVersionGroup) SetOrder(v int32)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *PokemonMoveVersionGroup) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### SetOrderNil

`func (o *PokemonMoveVersionGroup) SetOrderNil(b bool)`

 SetOrderNil sets the value for Order to be an explicit nil

### UnsetOrder
`func (o *PokemonMoveVersionGroup) UnsetOrder()`

UnsetOrder ensures that no value is present for Order, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


