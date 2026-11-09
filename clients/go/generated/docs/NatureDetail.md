# NatureDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**DecreasedStat** | [**NullableStatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | 
**IncreasedStat** | [**NullableStatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | 
**LikesFlavor** | [**NullableBerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | 
**HatesFlavor** | [**NullableBerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | 
**PokeathlonStatChanges** | [**[]NaturePokeathlonStat**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] 
**MoveBattleStylePreferences** | [**[]NatureBattleStylePreference**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] 
**Names** | [**[]NatureName**](NatureName.md) | The name of this resource listed in different languages. | [readonly] 

## Methods

### NewNatureDetail

`func NewNatureDetail(id int32, name string, decreasedStat NullableStatSummary, increasedStat NullableStatSummary, likesFlavor NullableBerryFlavorSummary, hatesFlavor NullableBerryFlavorSummary, pokeathlonStatChanges []NaturePokeathlonStat, moveBattleStylePreferences []NatureBattleStylePreference, names []NatureName, ) *NatureDetail`

NewNatureDetail instantiates a new NatureDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNatureDetailWithDefaults

`func NewNatureDetailWithDefaults() *NatureDetail`

NewNatureDetailWithDefaults instantiates a new NatureDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *NatureDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *NatureDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *NatureDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *NatureDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *NatureDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *NatureDetail) SetName(v string)`

SetName sets Name field to given value.


### GetDecreasedStat

`func (o *NatureDetail) GetDecreasedStat() StatSummary`

GetDecreasedStat returns the DecreasedStat field if non-nil, zero value otherwise.

### GetDecreasedStatOk

`func (o *NatureDetail) GetDecreasedStatOk() (*StatSummary, bool)`

GetDecreasedStatOk returns a tuple with the DecreasedStat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDecreasedStat

`func (o *NatureDetail) SetDecreasedStat(v StatSummary)`

SetDecreasedStat sets DecreasedStat field to given value.


### SetDecreasedStatNil

`func (o *NatureDetail) SetDecreasedStatNil(b bool)`

 SetDecreasedStatNil sets the value for DecreasedStat to be an explicit nil

### UnsetDecreasedStat
`func (o *NatureDetail) UnsetDecreasedStat()`

UnsetDecreasedStat ensures that no value is present for DecreasedStat, not even an explicit nil
### GetIncreasedStat

`func (o *NatureDetail) GetIncreasedStat() StatSummary`

GetIncreasedStat returns the IncreasedStat field if non-nil, zero value otherwise.

### GetIncreasedStatOk

`func (o *NatureDetail) GetIncreasedStatOk() (*StatSummary, bool)`

GetIncreasedStatOk returns a tuple with the IncreasedStat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncreasedStat

`func (o *NatureDetail) SetIncreasedStat(v StatSummary)`

SetIncreasedStat sets IncreasedStat field to given value.


### SetIncreasedStatNil

`func (o *NatureDetail) SetIncreasedStatNil(b bool)`

 SetIncreasedStatNil sets the value for IncreasedStat to be an explicit nil

### UnsetIncreasedStat
`func (o *NatureDetail) UnsetIncreasedStat()`

UnsetIncreasedStat ensures that no value is present for IncreasedStat, not even an explicit nil
### GetLikesFlavor

`func (o *NatureDetail) GetLikesFlavor() BerryFlavorSummary`

GetLikesFlavor returns the LikesFlavor field if non-nil, zero value otherwise.

### GetLikesFlavorOk

`func (o *NatureDetail) GetLikesFlavorOk() (*BerryFlavorSummary, bool)`

GetLikesFlavorOk returns a tuple with the LikesFlavor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLikesFlavor

`func (o *NatureDetail) SetLikesFlavor(v BerryFlavorSummary)`

SetLikesFlavor sets LikesFlavor field to given value.


### SetLikesFlavorNil

`func (o *NatureDetail) SetLikesFlavorNil(b bool)`

 SetLikesFlavorNil sets the value for LikesFlavor to be an explicit nil

### UnsetLikesFlavor
`func (o *NatureDetail) UnsetLikesFlavor()`

UnsetLikesFlavor ensures that no value is present for LikesFlavor, not even an explicit nil
### GetHatesFlavor

`func (o *NatureDetail) GetHatesFlavor() BerryFlavorSummary`

GetHatesFlavor returns the HatesFlavor field if non-nil, zero value otherwise.

### GetHatesFlavorOk

`func (o *NatureDetail) GetHatesFlavorOk() (*BerryFlavorSummary, bool)`

GetHatesFlavorOk returns a tuple with the HatesFlavor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHatesFlavor

`func (o *NatureDetail) SetHatesFlavor(v BerryFlavorSummary)`

SetHatesFlavor sets HatesFlavor field to given value.


### SetHatesFlavorNil

`func (o *NatureDetail) SetHatesFlavorNil(b bool)`

 SetHatesFlavorNil sets the value for HatesFlavor to be an explicit nil

### UnsetHatesFlavor
`func (o *NatureDetail) UnsetHatesFlavor()`

UnsetHatesFlavor ensures that no value is present for HatesFlavor, not even an explicit nil
### GetPokeathlonStatChanges

`func (o *NatureDetail) GetPokeathlonStatChanges() []NaturePokeathlonStat`

GetPokeathlonStatChanges returns the PokeathlonStatChanges field if non-nil, zero value otherwise.

### GetPokeathlonStatChangesOk

`func (o *NatureDetail) GetPokeathlonStatChangesOk() (*[]NaturePokeathlonStat, bool)`

GetPokeathlonStatChangesOk returns a tuple with the PokeathlonStatChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokeathlonStatChanges

`func (o *NatureDetail) SetPokeathlonStatChanges(v []NaturePokeathlonStat)`

SetPokeathlonStatChanges sets PokeathlonStatChanges field to given value.


### GetMoveBattleStylePreferences

`func (o *NatureDetail) GetMoveBattleStylePreferences() []NatureBattleStylePreference`

GetMoveBattleStylePreferences returns the MoveBattleStylePreferences field if non-nil, zero value otherwise.

### GetMoveBattleStylePreferencesOk

`func (o *NatureDetail) GetMoveBattleStylePreferencesOk() (*[]NatureBattleStylePreference, bool)`

GetMoveBattleStylePreferencesOk returns a tuple with the MoveBattleStylePreferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveBattleStylePreferences

`func (o *NatureDetail) SetMoveBattleStylePreferences(v []NatureBattleStylePreference)`

SetMoveBattleStylePreferences sets MoveBattleStylePreferences field to given value.


### GetNames

`func (o *NatureDetail) GetNames() []NatureName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *NatureDetail) GetNamesOk() (*[]NatureName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *NatureDetail) SetNames(v []NatureName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


