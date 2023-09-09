# Characteristic

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this characteristic resource | 
**GeneModulo** | **int32** | The remainder of the highest stat/IV divided by 5 | 
**PossibleValues** | **[]int32** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5 | 

## Methods

### NewCharacteristic

`func NewCharacteristic(id int32, geneModulo int32, possibleValues []int32, ) *Characteristic`

NewCharacteristic instantiates a new Characteristic object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCharacteristicWithDefaults

`func NewCharacteristicWithDefaults() *Characteristic`

NewCharacteristicWithDefaults instantiates a new Characteristic object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Characteristic) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Characteristic) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Characteristic) SetId(v int32)`

SetId sets Id field to given value.


### GetGeneModulo

`func (o *Characteristic) GetGeneModulo() int32`

GetGeneModulo returns the GeneModulo field if non-nil, zero value otherwise.

### GetGeneModuloOk

`func (o *Characteristic) GetGeneModuloOk() (*int32, bool)`

GetGeneModuloOk returns a tuple with the GeneModulo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneModulo

`func (o *Characteristic) SetGeneModulo(v int32)`

SetGeneModulo sets GeneModulo field to given value.


### GetPossibleValues

`func (o *Characteristic) GetPossibleValues() []int32`

GetPossibleValues returns the PossibleValues field if non-nil, zero value otherwise.

### GetPossibleValuesOk

`func (o *Characteristic) GetPossibleValuesOk() (*[]int32, bool)`

GetPossibleValuesOk returns a tuple with the PossibleValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPossibleValues

`func (o *Characteristic) SetPossibleValues(v []int32)`

SetPossibleValues sets PossibleValues field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


