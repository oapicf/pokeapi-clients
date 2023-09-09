# ContestEffect

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this contest effect resource | 
**Appeal** | **int32** | The base number of hearts the user of this move gets | 
**Jam** | **int32** | The base number of hearts the user&#39;s opponent loses | 
**EffectEntries** | [**[]VerboseEffect**](VerboseEffect.md) | The flavor text of this contest effect listed in different languages | 
**FlavorTextEntries** | [**[]FlavorText**](FlavorText.md) | The flavor text of this contest effect listed in different languages | 

## Methods

### NewContestEffect

`func NewContestEffect(id int32, appeal int32, jam int32, effectEntries []VerboseEffect, flavorTextEntries []FlavorText, ) *ContestEffect`

NewContestEffect instantiates a new ContestEffect object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewContestEffectWithDefaults

`func NewContestEffectWithDefaults() *ContestEffect`

NewContestEffectWithDefaults instantiates a new ContestEffect object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ContestEffect) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ContestEffect) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ContestEffect) SetId(v int32)`

SetId sets Id field to given value.


### GetAppeal

`func (o *ContestEffect) GetAppeal() int32`

GetAppeal returns the Appeal field if non-nil, zero value otherwise.

### GetAppealOk

`func (o *ContestEffect) GetAppealOk() (*int32, bool)`

GetAppealOk returns a tuple with the Appeal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppeal

`func (o *ContestEffect) SetAppeal(v int32)`

SetAppeal sets Appeal field to given value.


### GetJam

`func (o *ContestEffect) GetJam() int32`

GetJam returns the Jam field if non-nil, zero value otherwise.

### GetJamOk

`func (o *ContestEffect) GetJamOk() (*int32, bool)`

GetJamOk returns a tuple with the Jam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJam

`func (o *ContestEffect) SetJam(v int32)`

SetJam sets Jam field to given value.


### GetEffectEntries

`func (o *ContestEffect) GetEffectEntries() []VerboseEffect`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *ContestEffect) GetEffectEntriesOk() (*[]VerboseEffect, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *ContestEffect) SetEffectEntries(v []VerboseEffect)`

SetEffectEntries sets EffectEntries field to given value.


### GetFlavorTextEntries

`func (o *ContestEffect) GetFlavorTextEntries() []FlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *ContestEffect) GetFlavorTextEntriesOk() (*[]FlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *ContestEffect) SetFlavorTextEntries(v []FlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


