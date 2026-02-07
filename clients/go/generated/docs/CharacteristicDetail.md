# CharacteristicDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**GeneModulo** | **int32** |  | 
**PossibleValues** | **[]int32** |  | 
**HighestStat** | [**StatSummary**](StatSummary.md) |  | 
**Descriptions** | [**[]CharacteristicDescription**](CharacteristicDescription.md) |  | 

## Methods

### NewCharacteristicDetail

`func NewCharacteristicDetail(id int32, geneModulo int32, possibleValues []int32, highestStat StatSummary, descriptions []CharacteristicDescription, ) *CharacteristicDetail`

NewCharacteristicDetail instantiates a new CharacteristicDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCharacteristicDetailWithDefaults

`func NewCharacteristicDetailWithDefaults() *CharacteristicDetail`

NewCharacteristicDetailWithDefaults instantiates a new CharacteristicDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CharacteristicDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CharacteristicDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CharacteristicDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetGeneModulo

`func (o *CharacteristicDetail) GetGeneModulo() int32`

GetGeneModulo returns the GeneModulo field if non-nil, zero value otherwise.

### GetGeneModuloOk

`func (o *CharacteristicDetail) GetGeneModuloOk() (*int32, bool)`

GetGeneModuloOk returns a tuple with the GeneModulo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneModulo

`func (o *CharacteristicDetail) SetGeneModulo(v int32)`

SetGeneModulo sets GeneModulo field to given value.


### GetPossibleValues

`func (o *CharacteristicDetail) GetPossibleValues() []int32`

GetPossibleValues returns the PossibleValues field if non-nil, zero value otherwise.

### GetPossibleValuesOk

`func (o *CharacteristicDetail) GetPossibleValuesOk() (*[]int32, bool)`

GetPossibleValuesOk returns a tuple with the PossibleValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPossibleValues

`func (o *CharacteristicDetail) SetPossibleValues(v []int32)`

SetPossibleValues sets PossibleValues field to given value.


### GetHighestStat

`func (o *CharacteristicDetail) GetHighestStat() StatSummary`

GetHighestStat returns the HighestStat field if non-nil, zero value otherwise.

### GetHighestStatOk

`func (o *CharacteristicDetail) GetHighestStatOk() (*StatSummary, bool)`

GetHighestStatOk returns a tuple with the HighestStat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHighestStat

`func (o *CharacteristicDetail) SetHighestStat(v StatSummary)`

SetHighestStat sets HighestStat field to given value.


### GetDescriptions

`func (o *CharacteristicDetail) GetDescriptions() []CharacteristicDescription`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *CharacteristicDetail) GetDescriptionsOk() (*[]CharacteristicDescription, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *CharacteristicDetail) SetDescriptions(v []CharacteristicDescription)`

SetDescriptions sets Descriptions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


