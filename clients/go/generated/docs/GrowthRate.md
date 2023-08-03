# GrowthRate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The identifier for this growth rate resource | [optional] 
**Name** | Pointer to **string** | The name for this growth rate resource | [optional] 
**Formula** | Pointer to **string** | The formula used to calculate the rate at which the Pokémon species gains level | [optional] 
**Descriptions** | Pointer to [**[]Description**](Description.md) | The description of this growth rate listed in different languages | [optional] 

## Methods

### NewGrowthRate

`func NewGrowthRate() *GrowthRate`

NewGrowthRate instantiates a new GrowthRate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGrowthRateWithDefaults

`func NewGrowthRateWithDefaults() *GrowthRate`

NewGrowthRateWithDefaults instantiates a new GrowthRate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *GrowthRate) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *GrowthRate) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *GrowthRate) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *GrowthRate) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *GrowthRate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GrowthRate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GrowthRate) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *GrowthRate) HasName() bool`

HasName returns a boolean if a field has been set.

### GetFormula

`func (o *GrowthRate) GetFormula() string`

GetFormula returns the Formula field if non-nil, zero value otherwise.

### GetFormulaOk

`func (o *GrowthRate) GetFormulaOk() (*string, bool)`

GetFormulaOk returns a tuple with the Formula field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormula

`func (o *GrowthRate) SetFormula(v string)`

SetFormula sets Formula field to given value.

### HasFormula

`func (o *GrowthRate) HasFormula() bool`

HasFormula returns a boolean if a field has been set.

### GetDescriptions

`func (o *GrowthRate) GetDescriptions() []Description`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *GrowthRate) GetDescriptionsOk() (*[]Description, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *GrowthRate) SetDescriptions(v []Description)`

SetDescriptions sets Descriptions field to given value.

### HasDescriptions

`func (o *GrowthRate) HasDescriptions() bool`

HasDescriptions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


