# EncounterCondition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this encounter condition resource | 
**Name** | **string** | The name for this encounter condition resource | 
**Values** | [**[]NamedAPIResource**](NamedAPIResource.md) | A list of values that are used with this encounter condition | 
**Names** | [**[]Name**](Name.md) | The name of this encounter condition listed in different languages | 

## Methods

### NewEncounterCondition

`func NewEncounterCondition(id int32, name string, values []NamedAPIResource, names []Name, ) *EncounterCondition`

NewEncounterCondition instantiates a new EncounterCondition object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterConditionWithDefaults

`func NewEncounterConditionWithDefaults() *EncounterCondition`

NewEncounterConditionWithDefaults instantiates a new EncounterCondition object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EncounterCondition) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EncounterCondition) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EncounterCondition) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EncounterCondition) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EncounterCondition) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EncounterCondition) SetName(v string)`

SetName sets Name field to given value.


### GetValues

`func (o *EncounterCondition) GetValues() []NamedAPIResource`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *EncounterCondition) GetValuesOk() (*[]NamedAPIResource, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *EncounterCondition) SetValues(v []NamedAPIResource)`

SetValues sets Values field to given value.


### GetNames

`func (o *EncounterCondition) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EncounterCondition) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EncounterCondition) SetNames(v []Name)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


