# EvolutionVariableDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Symbol** | **string** | The symbol used for this variable in evolution condition expressions. | 
**DataType** | Pointer to **string** | The data type of this variable. | [optional] 
**Source** | Pointer to **string** | The source of the variable value. | [optional] 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which this variable was introduced. | 
**Names** | [**[]EvolutionVariableName**](EvolutionVariableName.md) | The name of this resource listed in different languages. | [readonly] 
**Descriptions** | [**[]EvolutionVariableDescription**](EvolutionVariableDescription.md) | The description of this resource listed in different languages. | [readonly] 

## Methods

### NewEvolutionVariableDetail

`func NewEvolutionVariableDetail(id int32, name string, symbol string, versionGroup VersionGroupSummary, names []EvolutionVariableName, descriptions []EvolutionVariableDescription, ) *EvolutionVariableDetail`

NewEvolutionVariableDetail instantiates a new EvolutionVariableDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvolutionVariableDetailWithDefaults

`func NewEvolutionVariableDetailWithDefaults() *EvolutionVariableDetail`

NewEvolutionVariableDetailWithDefaults instantiates a new EvolutionVariableDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EvolutionVariableDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EvolutionVariableDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EvolutionVariableDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EvolutionVariableDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EvolutionVariableDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EvolutionVariableDetail) SetName(v string)`

SetName sets Name field to given value.


### GetSymbol

`func (o *EvolutionVariableDetail) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *EvolutionVariableDetail) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *EvolutionVariableDetail) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.


### GetDataType

`func (o *EvolutionVariableDetail) GetDataType() string`

GetDataType returns the DataType field if non-nil, zero value otherwise.

### GetDataTypeOk

`func (o *EvolutionVariableDetail) GetDataTypeOk() (*string, bool)`

GetDataTypeOk returns a tuple with the DataType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataType

`func (o *EvolutionVariableDetail) SetDataType(v string)`

SetDataType sets DataType field to given value.

### HasDataType

`func (o *EvolutionVariableDetail) HasDataType() bool`

HasDataType returns a boolean if a field has been set.

### GetSource

`func (o *EvolutionVariableDetail) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *EvolutionVariableDetail) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *EvolutionVariableDetail) SetSource(v string)`

SetSource sets Source field to given value.

### HasSource

`func (o *EvolutionVariableDetail) HasSource() bool`

HasSource returns a boolean if a field has been set.

### GetVersionGroup

`func (o *EvolutionVariableDetail) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *EvolutionVariableDetail) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *EvolutionVariableDetail) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.


### GetNames

`func (o *EvolutionVariableDetail) GetNames() []EvolutionVariableName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EvolutionVariableDetail) GetNamesOk() (*[]EvolutionVariableName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EvolutionVariableDetail) SetNames(v []EvolutionVariableName)`

SetNames sets Names field to given value.


### GetDescriptions

`func (o *EvolutionVariableDetail) GetDescriptions() []EvolutionVariableDescription`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *EvolutionVariableDetail) GetDescriptionsOk() (*[]EvolutionVariableDescription, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *EvolutionVariableDetail) SetDescriptions(v []EvolutionVariableDescription)`

SetDescriptions sets Descriptions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


