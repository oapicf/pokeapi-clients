# Ability

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The identifier for this ability resource. | [optional] 
**Name** | Pointer to **string** | The name for this ability resource. | [optional] 
**IsMainSeries** | Pointer to **bool** | Whether or not this ability originated in the main series of the video games. | [optional] 
**Generation** | Pointer to [**AbilityGeneration**](AbilityGeneration.md) |  | [optional] 
**Names** | Pointer to [**[]AbilityNamesInner**](AbilityNamesInner.md) |  | [optional] 

## Methods

### NewAbility

`func NewAbility() *Ability`

NewAbility instantiates a new Ability object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAbilityWithDefaults

`func NewAbilityWithDefaults() *Ability`

NewAbilityWithDefaults instantiates a new Ability object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Ability) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Ability) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Ability) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Ability) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Ability) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Ability) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Ability) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Ability) HasName() bool`

HasName returns a boolean if a field has been set.

### GetIsMainSeries

`func (o *Ability) GetIsMainSeries() bool`

GetIsMainSeries returns the IsMainSeries field if non-nil, zero value otherwise.

### GetIsMainSeriesOk

`func (o *Ability) GetIsMainSeriesOk() (*bool, bool)`

GetIsMainSeriesOk returns a tuple with the IsMainSeries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMainSeries

`func (o *Ability) SetIsMainSeries(v bool)`

SetIsMainSeries sets IsMainSeries field to given value.

### HasIsMainSeries

`func (o *Ability) HasIsMainSeries() bool`

HasIsMainSeries returns a boolean if a field has been set.

### GetGeneration

`func (o *Ability) GetGeneration() AbilityGeneration`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *Ability) GetGenerationOk() (*AbilityGeneration, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *Ability) SetGeneration(v AbilityGeneration)`

SetGeneration sets Generation field to given value.

### HasGeneration

`func (o *Ability) HasGeneration() bool`

HasGeneration returns a boolean if a field has been set.

### GetNames

`func (o *Ability) GetNames() []AbilityNamesInner`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *Ability) GetNamesOk() (*[]AbilityNamesInner, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *Ability) SetNames(v []AbilityNamesInner)`

SetNames sets Names field to given value.

### HasNames

`func (o *Ability) HasNames() bool`

HasNames returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


