# MoveBattleStylePreference

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LowHpPreference** | **int32** | Chance of using the move, in percent, if HP is under one half of maximum HP. | 
**HighHpPreference** | **int32** | Chance of using the move, in percent, if HP is over one half of maximum HP. | 
**MoveBattleStyle** | [**NamedAPIResource**](NamedAPIResource.md) |  | 

## Methods

### NewMoveBattleStylePreference

`func NewMoveBattleStylePreference(lowHpPreference int32, highHpPreference int32, moveBattleStyle NamedAPIResource, ) *MoveBattleStylePreference`

NewMoveBattleStylePreference instantiates a new MoveBattleStylePreference object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveBattleStylePreferenceWithDefaults

`func NewMoveBattleStylePreferenceWithDefaults() *MoveBattleStylePreference`

NewMoveBattleStylePreferenceWithDefaults instantiates a new MoveBattleStylePreference object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLowHpPreference

`func (o *MoveBattleStylePreference) GetLowHpPreference() int32`

GetLowHpPreference returns the LowHpPreference field if non-nil, zero value otherwise.

### GetLowHpPreferenceOk

`func (o *MoveBattleStylePreference) GetLowHpPreferenceOk() (*int32, bool)`

GetLowHpPreferenceOk returns a tuple with the LowHpPreference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLowHpPreference

`func (o *MoveBattleStylePreference) SetLowHpPreference(v int32)`

SetLowHpPreference sets LowHpPreference field to given value.


### GetHighHpPreference

`func (o *MoveBattleStylePreference) GetHighHpPreference() int32`

GetHighHpPreference returns the HighHpPreference field if non-nil, zero value otherwise.

### GetHighHpPreferenceOk

`func (o *MoveBattleStylePreference) GetHighHpPreferenceOk() (*int32, bool)`

GetHighHpPreferenceOk returns a tuple with the HighHpPreference field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHighHpPreference

`func (o *MoveBattleStylePreference) SetHighHpPreference(v int32)`

SetHighHpPreference sets HighHpPreference field to given value.


### GetMoveBattleStyle

`func (o *MoveBattleStylePreference) GetMoveBattleStyle() NamedAPIResource`

GetMoveBattleStyle returns the MoveBattleStyle field if non-nil, zero value otherwise.

### GetMoveBattleStyleOk

`func (o *MoveBattleStylePreference) GetMoveBattleStyleOk() (*NamedAPIResource, bool)`

GetMoveBattleStyleOk returns a tuple with the MoveBattleStyle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveBattleStyle

`func (o *MoveBattleStylePreference) SetMoveBattleStyle(v NamedAPIResource)`

SetMoveBattleStyle sets MoveBattleStyle field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


