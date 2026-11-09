# PokemonFormTriggerCondition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Trigger** | **string** | The trigger for this form change. | 
**Name** | Pointer to **string** | The name of the required item, ability, or move. Only present for a resource-based trigger. | [optional] 
**Url** | Pointer to **string** | The URL of the required item, ability, or move. Only present for a resource-based trigger. | [optional] 
**BaseForm** | Pointer to [**PokemonFormSummary**](PokemonFormSummary.md) | The required base form. Only present when the trigger specifies one. | [optional] 

## Methods

### NewPokemonFormTriggerCondition

`func NewPokemonFormTriggerCondition(trigger string, ) *PokemonFormTriggerCondition`

NewPokemonFormTriggerCondition instantiates a new PokemonFormTriggerCondition object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonFormTriggerConditionWithDefaults

`func NewPokemonFormTriggerConditionWithDefaults() *PokemonFormTriggerCondition`

NewPokemonFormTriggerConditionWithDefaults instantiates a new PokemonFormTriggerCondition object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTrigger

`func (o *PokemonFormTriggerCondition) GetTrigger() string`

GetTrigger returns the Trigger field if non-nil, zero value otherwise.

### GetTriggerOk

`func (o *PokemonFormTriggerCondition) GetTriggerOk() (*string, bool)`

GetTriggerOk returns a tuple with the Trigger field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTrigger

`func (o *PokemonFormTriggerCondition) SetTrigger(v string)`

SetTrigger sets Trigger field to given value.


### GetName

`func (o *PokemonFormTriggerCondition) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokemonFormTriggerCondition) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokemonFormTriggerCondition) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *PokemonFormTriggerCondition) HasName() bool`

HasName returns a boolean if a field has been set.

### GetUrl

`func (o *PokemonFormTriggerCondition) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *PokemonFormTriggerCondition) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *PokemonFormTriggerCondition) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *PokemonFormTriggerCondition) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetBaseForm

`func (o *PokemonFormTriggerCondition) GetBaseForm() PokemonFormSummary`

GetBaseForm returns the BaseForm field if non-nil, zero value otherwise.

### GetBaseFormOk

`func (o *PokemonFormTriggerCondition) GetBaseFormOk() (*PokemonFormSummary, bool)`

GetBaseFormOk returns a tuple with the BaseForm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBaseForm

`func (o *PokemonFormTriggerCondition) SetBaseForm(v PokemonFormSummary)`

SetBaseForm sets BaseForm field to given value.

### HasBaseForm

`func (o *PokemonFormTriggerCondition) HasBaseForm() bool`

HasBaseForm returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


