# NatureDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**DecreasedStat** | [**StatSummary**](StatSummary.md) |  | 
**IncreasedStat** | [**StatSummary**](StatSummary.md) |  | 
**LikesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | 
**HatesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | 
**Berries** | [**[]BerrySummary**](BerrySummary.md) |  | 
**PokeathlonStatChanges** | [**[]NatureDetailPokeathlonStatChangesInner**](NatureDetailPokeathlonStatChangesInner.md) |  | 
**MoveBattleStylePreferences** | [**[]NatureBattleStylePreference**](NatureBattleStylePreference.md) |  | 
**Names** | [**[]NatureName**](NatureName.md) |  | 

## Methods

### NewNatureDetail

`func NewNatureDetail(id int32, name string, decreasedStat StatSummary, increasedStat StatSummary, likesFlavor BerryFlavorSummary, hatesFlavor BerryFlavorSummary, berries []BerrySummary, pokeathlonStatChanges []NatureDetailPokeathlonStatChangesInner, moveBattleStylePreferences []NatureBattleStylePreference, names []NatureName, ) *NatureDetail`

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


### GetBerries

`func (o *NatureDetail) GetBerries() []BerrySummary`

GetBerries returns the Berries field if non-nil, zero value otherwise.

### GetBerriesOk

`func (o *NatureDetail) GetBerriesOk() (*[]BerrySummary, bool)`

GetBerriesOk returns a tuple with the Berries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBerries

`func (o *NatureDetail) SetBerries(v []BerrySummary)`

SetBerries sets Berries field to given value.


### GetPokeathlonStatChanges

`func (o *NatureDetail) GetPokeathlonStatChanges() []NatureDetailPokeathlonStatChangesInner`

GetPokeathlonStatChanges returns the PokeathlonStatChanges field if non-nil, zero value otherwise.

### GetPokeathlonStatChangesOk

`func (o *NatureDetail) GetPokeathlonStatChangesOk() (*[]NatureDetailPokeathlonStatChangesInner, bool)`

GetPokeathlonStatChangesOk returns a tuple with the PokeathlonStatChanges field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokeathlonStatChanges

`func (o *NatureDetail) SetPokeathlonStatChanges(v []NatureDetailPokeathlonStatChangesInner)`

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


