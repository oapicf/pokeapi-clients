# PokemonMoveVersionGroupDetailsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LevelLearnedAt** | **int32** | The minimum level to learn the move | 
**MoveLearnMethod** | [**NamedAPIResource**](NamedAPIResource.md) |  | 
**VersionGroup** | [**NamedAPIResource**](NamedAPIResource.md) |  | 

## Methods

### NewPokemonMoveVersionGroupDetailsInner

`func NewPokemonMoveVersionGroupDetailsInner(levelLearnedAt int32, moveLearnMethod NamedAPIResource, versionGroup NamedAPIResource, ) *PokemonMoveVersionGroupDetailsInner`

NewPokemonMoveVersionGroupDetailsInner instantiates a new PokemonMoveVersionGroupDetailsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonMoveVersionGroupDetailsInnerWithDefaults

`func NewPokemonMoveVersionGroupDetailsInnerWithDefaults() *PokemonMoveVersionGroupDetailsInner`

NewPokemonMoveVersionGroupDetailsInnerWithDefaults instantiates a new PokemonMoveVersionGroupDetailsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLevelLearnedAt

`func (o *PokemonMoveVersionGroupDetailsInner) GetLevelLearnedAt() int32`

GetLevelLearnedAt returns the LevelLearnedAt field if non-nil, zero value otherwise.

### GetLevelLearnedAtOk

`func (o *PokemonMoveVersionGroupDetailsInner) GetLevelLearnedAtOk() (*int32, bool)`

GetLevelLearnedAtOk returns a tuple with the LevelLearnedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLevelLearnedAt

`func (o *PokemonMoveVersionGroupDetailsInner) SetLevelLearnedAt(v int32)`

SetLevelLearnedAt sets LevelLearnedAt field to given value.


### GetMoveLearnMethod

`func (o *PokemonMoveVersionGroupDetailsInner) GetMoveLearnMethod() NamedAPIResource`

GetMoveLearnMethod returns the MoveLearnMethod field if non-nil, zero value otherwise.

### GetMoveLearnMethodOk

`func (o *PokemonMoveVersionGroupDetailsInner) GetMoveLearnMethodOk() (*NamedAPIResource, bool)`

GetMoveLearnMethodOk returns a tuple with the MoveLearnMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveLearnMethod

`func (o *PokemonMoveVersionGroupDetailsInner) SetMoveLearnMethod(v NamedAPIResource)`

SetMoveLearnMethod sets MoveLearnMethod field to given value.


### GetVersionGroup

`func (o *PokemonMoveVersionGroupDetailsInner) GetVersionGroup() NamedAPIResource`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *PokemonMoveVersionGroupDetailsInner) GetVersionGroupOk() (*NamedAPIResource, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *PokemonMoveVersionGroupDetailsInner) SetVersionGroup(v NamedAPIResource)`

SetVersionGroup sets VersionGroup field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


