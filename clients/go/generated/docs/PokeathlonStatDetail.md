# PokeathlonStatDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**AffectingNatures** | [**PokeathlonStatDetailAffectingNatures**](PokeathlonStatDetailAffectingNatures.md) |  | 
**Names** | [**[]PokeathlonStatName**](PokeathlonStatName.md) |  | 

## Methods

### NewPokeathlonStatDetail

`func NewPokeathlonStatDetail(id int32, name string, affectingNatures PokeathlonStatDetailAffectingNatures, names []PokeathlonStatName, ) *PokeathlonStatDetail`

NewPokeathlonStatDetail instantiates a new PokeathlonStatDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokeathlonStatDetailWithDefaults

`func NewPokeathlonStatDetailWithDefaults() *PokeathlonStatDetail`

NewPokeathlonStatDetailWithDefaults instantiates a new PokeathlonStatDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokeathlonStatDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokeathlonStatDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokeathlonStatDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PokeathlonStatDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokeathlonStatDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokeathlonStatDetail) SetName(v string)`

SetName sets Name field to given value.


### GetAffectingNatures

`func (o *PokeathlonStatDetail) GetAffectingNatures() PokeathlonStatDetailAffectingNatures`

GetAffectingNatures returns the AffectingNatures field if non-nil, zero value otherwise.

### GetAffectingNaturesOk

`func (o *PokeathlonStatDetail) GetAffectingNaturesOk() (*PokeathlonStatDetailAffectingNatures, bool)`

GetAffectingNaturesOk returns a tuple with the AffectingNatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAffectingNatures

`func (o *PokeathlonStatDetail) SetAffectingNatures(v PokeathlonStatDetailAffectingNatures)`

SetAffectingNatures sets AffectingNatures field to given value.


### GetNames

`func (o *PokeathlonStatDetail) GetNames() []PokeathlonStatName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokeathlonStatDetail) GetNamesOk() (*[]PokeathlonStatName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokeathlonStatDetail) SetNames(v []PokeathlonStatName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


