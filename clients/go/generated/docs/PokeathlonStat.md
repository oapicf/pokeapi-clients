# PokeathlonStat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this Pokéathlon stat resource | 
**Name** | **string** | The name for this Pokéathlon stat resource | 
**Names** | [**[]Name**](Name.md) | The name of this Pokéathlon stat listed in different languages | 
**AffectingNatures** | [**PokeathlonStatAffectingNatures**](PokeathlonStatAffectingNatures.md) |  | 

## Methods

### NewPokeathlonStat

`func NewPokeathlonStat(id int32, name string, names []Name, affectingNatures PokeathlonStatAffectingNatures, ) *PokeathlonStat`

NewPokeathlonStat instantiates a new PokeathlonStat object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokeathlonStatWithDefaults

`func NewPokeathlonStatWithDefaults() *PokeathlonStat`

NewPokeathlonStatWithDefaults instantiates a new PokeathlonStat object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokeathlonStat) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokeathlonStat) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokeathlonStat) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PokeathlonStat) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokeathlonStat) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokeathlonStat) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *PokeathlonStat) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokeathlonStat) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokeathlonStat) SetNames(v []Name)`

SetNames sets Names field to given value.


### GetAffectingNatures

`func (o *PokeathlonStat) GetAffectingNatures() PokeathlonStatAffectingNatures`

GetAffectingNatures returns the AffectingNatures field if non-nil, zero value otherwise.

### GetAffectingNaturesOk

`func (o *PokeathlonStat) GetAffectingNaturesOk() (*PokeathlonStatAffectingNatures, bool)`

GetAffectingNaturesOk returns a tuple with the AffectingNatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAffectingNatures

`func (o *PokeathlonStat) SetAffectingNatures(v PokeathlonStatAffectingNatures)`

SetAffectingNatures sets AffectingNatures field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


