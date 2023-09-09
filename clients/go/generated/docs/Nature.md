# Nature

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Name** | **string** |  | 
**DecreasedStat** | **string** |  | 
**IncreasedStat** | **string** |  | 
**HatesFlavor** | **string** |  | 
**LikesFlavor** | **string** |  | 
**PokeathlonStatChanges** | Pointer to [**[]NatureStatChange**](NatureStatChange.md) |  | [optional] 
**MoveBattleStylePreferences** | Pointer to [**[]MoveBattleStylePreference**](MoveBattleStylePreference.md) |  | [optional] 

## Methods

### NewNature

`func NewNature(id int32, name string, decreasedStat string, increasedStat string, hatesFlavor string, likesFlavor string, ) *Nature`

NewNature instantiates a new Nature object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNatureWithDefaults

`func NewNatureWithDefaults() *Nature`

NewNatureWithDefaults instantiates a new Nature object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Nature) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Nature) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Nature) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *Nature) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Nature) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Nature) SetName(v string)`

SetName sets Name field to given value.


### GetDecreasedStat

`func (o *Nature) GetDecreasedStat() string`

GetDecreasedStat returns the DecreasedStat field if non-nil, zero value otherwise.

### GetDecreasedStatOk

`func (o *Nature) GetDecreasedStatOk() (*string, bool)`

GetDecreasedStatOk returns a tuple with the DecreasedStat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecreasedStat

`func (o *Nature) SetDecreasedStat(v string)`

SetDecreasedStat sets DecreasedStat field to given value.


### GetIncreasedStat

`func (o *Nature) GetIncreasedStat() string`

GetIncreasedStat returns the IncreasedStat field if non-nil, zero value otherwise.

### GetIncreasedStatOk

`func (o *Nature) GetIncreasedStatOk() (*string, bool)`

GetIncreasedStatOk returns a tuple with the IncreasedStat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncreasedStat

`func (o *Nature) SetIncreasedStat(v string)`

SetIncreasedStat sets IncreasedStat field to given value.


### GetHatesFlavor

`func (o *Nature) GetHatesFlavor() string`

GetHatesFlavor returns the HatesFlavor field if non-nil, zero value otherwise.

### GetHatesFlavorOk

`func (o *Nature) GetHatesFlavorOk() (*string, bool)`

GetHatesFlavorOk returns a tuple with the HatesFlavor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHatesFlavor

`func (o *Nature) SetHatesFlavor(v string)`

SetHatesFlavor sets HatesFlavor field to given value.


### GetLikesFlavor

`func (o *Nature) GetLikesFlavor() string`

GetLikesFlavor returns the LikesFlavor field if non-nil, zero value otherwise.

### GetLikesFlavorOk

`func (o *Nature) GetLikesFlavorOk() (*string, bool)`

GetLikesFlavorOk returns a tuple with the LikesFlavor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLikesFlavor

`func (o *Nature) SetLikesFlavor(v string)`

SetLikesFlavor sets LikesFlavor field to given value.


### GetPokeathlonStatChanges

`func (o *Nature) GetPokeathlonStatChanges() []NatureStatChange`

GetPokeathlonStatChanges returns the PokeathlonStatChanges field if non-nil, zero value otherwise.

### GetPokeathlonStatChangesOk

`func (o *Nature) GetPokeathlonStatChangesOk() (*[]NatureStatChange, bool)`

GetPokeathlonStatChangesOk returns a tuple with the PokeathlonStatChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokeathlonStatChanges

`func (o *Nature) SetPokeathlonStatChanges(v []NatureStatChange)`

SetPokeathlonStatChanges sets PokeathlonStatChanges field to given value.

### HasPokeathlonStatChanges

`func (o *Nature) HasPokeathlonStatChanges() bool`

HasPokeathlonStatChanges returns a boolean if a field has been set.

### GetMoveBattleStylePreferences

`func (o *Nature) GetMoveBattleStylePreferences() []MoveBattleStylePreference`

GetMoveBattleStylePreferences returns the MoveBattleStylePreferences field if non-nil, zero value otherwise.

### GetMoveBattleStylePreferencesOk

`func (o *Nature) GetMoveBattleStylePreferencesOk() (*[]MoveBattleStylePreference, bool)`

GetMoveBattleStylePreferencesOk returns a tuple with the MoveBattleStylePreferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveBattleStylePreferences

`func (o *Nature) SetMoveBattleStylePreferences(v []MoveBattleStylePreference)`

SetMoveBattleStylePreferences sets MoveBattleStylePreferences field to given value.

### HasMoveBattleStylePreferences

`func (o *Nature) HasMoveBattleStylePreferences() bool`

HasMoveBattleStylePreferences returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


