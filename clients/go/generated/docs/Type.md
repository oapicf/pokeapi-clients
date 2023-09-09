# Type

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** | The identifier for this type resource. | [optional] 
**Name** | Pointer to **string** | The name for this type resource. | [optional] 
**DamageRelations** | Pointer to [**TypeDamageRelations**](TypeDamageRelations.md) |  | [optional] 
**GameIndices** | Pointer to [**[]TypeGameIndicesInner**](TypeGameIndicesInner.md) |  | [optional] 
**Generation** | Pointer to [**TypeGeneration**](TypeGeneration.md) |  | [optional] 
**MoveDamageClass** | Pointer to [**TypeMoveDamageClass**](TypeMoveDamageClass.md) |  | [optional] 
**Names** | Pointer to [**[]AbilityNamesInner**](AbilityNamesInner.md) |  | [optional] 
**Pokemon** | Pointer to [**[]TypePokemonInner**](TypePokemonInner.md) |  | [optional] 

## Methods

### NewType

`func NewType() *Type`

NewType instantiates a new Type object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTypeWithDefaults

`func NewTypeWithDefaults() *Type`

NewTypeWithDefaults instantiates a new Type object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Type) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Type) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Type) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Type) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Type) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Type) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Type) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Type) HasName() bool`

HasName returns a boolean if a field has been set.

### GetDamageRelations

`func (o *Type) GetDamageRelations() TypeDamageRelations`

GetDamageRelations returns the DamageRelations field if non-nil, zero value otherwise.

### GetDamageRelationsOk

`func (o *Type) GetDamageRelationsOk() (*TypeDamageRelations, bool)`

GetDamageRelationsOk returns a tuple with the DamageRelations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDamageRelations

`func (o *Type) SetDamageRelations(v TypeDamageRelations)`

SetDamageRelations sets DamageRelations field to given value.

### HasDamageRelations

`func (o *Type) HasDamageRelations() bool`

HasDamageRelations returns a boolean if a field has been set.

### GetGameIndices

`func (o *Type) GetGameIndices() []TypeGameIndicesInner`

GetGameIndices returns the GameIndices field if non-nil, zero value otherwise.

### GetGameIndicesOk

`func (o *Type) GetGameIndicesOk() (*[]TypeGameIndicesInner, bool)`

GetGameIndicesOk returns a tuple with the GameIndices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndices

`func (o *Type) SetGameIndices(v []TypeGameIndicesInner)`

SetGameIndices sets GameIndices field to given value.

### HasGameIndices

`func (o *Type) HasGameIndices() bool`

HasGameIndices returns a boolean if a field has been set.

### GetGeneration

`func (o *Type) GetGeneration() TypeGeneration`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *Type) GetGenerationOk() (*TypeGeneration, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *Type) SetGeneration(v TypeGeneration)`

SetGeneration sets Generation field to given value.

### HasGeneration

`func (o *Type) HasGeneration() bool`

HasGeneration returns a boolean if a field has been set.

### GetMoveDamageClass

`func (o *Type) GetMoveDamageClass() TypeMoveDamageClass`

GetMoveDamageClass returns the MoveDamageClass field if non-nil, zero value otherwise.

### GetMoveDamageClassOk

`func (o *Type) GetMoveDamageClassOk() (*TypeMoveDamageClass, bool)`

GetMoveDamageClassOk returns a tuple with the MoveDamageClass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveDamageClass

`func (o *Type) SetMoveDamageClass(v TypeMoveDamageClass)`

SetMoveDamageClass sets MoveDamageClass field to given value.

### HasMoveDamageClass

`func (o *Type) HasMoveDamageClass() bool`

HasMoveDamageClass returns a boolean if a field has been set.

### GetNames

`func (o *Type) GetNames() []AbilityNamesInner`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *Type) GetNamesOk() (*[]AbilityNamesInner, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *Type) SetNames(v []AbilityNamesInner)`

SetNames sets Names field to given value.

### HasNames

`func (o *Type) HasNames() bool`

HasNames returns a boolean if a field has been set.

### GetPokemon

`func (o *Type) GetPokemon() []TypePokemonInner`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *Type) GetPokemonOk() (*[]TypePokemonInner, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *Type) SetPokemon(v []TypePokemonInner)`

SetPokemon sets Pokemon field to given value.

### HasPokemon

`func (o *Type) HasPokemon() bool`

HasPokemon returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


