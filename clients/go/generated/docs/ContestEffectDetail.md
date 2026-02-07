# ContestEffectDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Appeal** | **int32** |  | 
**Jam** | **int32** |  | 
**EffectEntries** | [**[]ContestEffectEffectText**](ContestEffectEffectText.md) |  | 
**FlavorTextEntries** | [**[]ContestEffectFlavorText**](ContestEffectFlavorText.md) |  | 

## Methods

### NewContestEffectDetail

`func NewContestEffectDetail(id int32, appeal int32, jam int32, effectEntries []ContestEffectEffectText, flavorTextEntries []ContestEffectFlavorText, ) *ContestEffectDetail`

NewContestEffectDetail instantiates a new ContestEffectDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewContestEffectDetailWithDefaults

`func NewContestEffectDetailWithDefaults() *ContestEffectDetail`

NewContestEffectDetailWithDefaults instantiates a new ContestEffectDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ContestEffectDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ContestEffectDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ContestEffectDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetAppeal

`func (o *ContestEffectDetail) GetAppeal() int32`

GetAppeal returns the Appeal field if non-nil, zero value otherwise.

### GetAppealOk

`func (o *ContestEffectDetail) GetAppealOk() (*int32, bool)`

GetAppealOk returns a tuple with the Appeal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppeal

`func (o *ContestEffectDetail) SetAppeal(v int32)`

SetAppeal sets Appeal field to given value.


### GetJam

`func (o *ContestEffectDetail) GetJam() int32`

GetJam returns the Jam field if non-nil, zero value otherwise.

### GetJamOk

`func (o *ContestEffectDetail) GetJamOk() (*int32, bool)`

GetJamOk returns a tuple with the Jam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJam

`func (o *ContestEffectDetail) SetJam(v int32)`

SetJam sets Jam field to given value.


### GetEffectEntries

`func (o *ContestEffectDetail) GetEffectEntries() []ContestEffectEffectText`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *ContestEffectDetail) GetEffectEntriesOk() (*[]ContestEffectEffectText, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *ContestEffectDetail) SetEffectEntries(v []ContestEffectEffectText)`

SetEffectEntries sets EffectEntries field to given value.


### GetFlavorTextEntries

`func (o *ContestEffectDetail) GetFlavorTextEntries() []ContestEffectFlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *ContestEffectDetail) GetFlavorTextEntriesOk() (*[]ContestEffectFlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *ContestEffectDetail) SetFlavorTextEntries(v []ContestEffectFlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


