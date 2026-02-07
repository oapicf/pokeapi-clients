# TypeDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**DamageRelations** | [**TypeDetailDamageRelations**](TypeDetailDamageRelations.md) |  | 
**PastDamageRelations** | [**[]TypeDetailPastDamageRelationsInner**](TypeDetailPastDamageRelationsInner.md) |  | 
**GameIndices** | [**[]TypeGameIndex**](TypeGameIndex.md) |  | 
**Generation** | [**GenerationSummary**](GenerationSummary.md) |  | 
**MoveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**Names** | [**[]AbilityName**](AbilityName.md) |  | 
**Pokemon** | [**[]TypeDetailPokemonInner**](TypeDetailPokemonInner.md) |  | 
**Moves** | [**[]MoveSummary**](MoveSummary.md) |  | 
**Sprites** | [**map[string]map[string]TypeDetailSpritesValueValue**](map.md) |  | [readonly] 

## Methods

### NewTypeDetail

`func NewTypeDetail(id int32, name string, damageRelations TypeDetailDamageRelations, pastDamageRelations []TypeDetailPastDamageRelationsInner, gameIndices []TypeGameIndex, generation GenerationSummary, moveDamageClass MoveDamageClassSummary, names []AbilityName, pokemon []TypeDetailPokemonInner, moves []MoveSummary, sprites map[string]map[string]TypeDetailSpritesValueValue, ) *TypeDetail`

NewTypeDetail instantiates a new TypeDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTypeDetailWithDefaults

`func NewTypeDetailWithDefaults() *TypeDetail`

NewTypeDetailWithDefaults instantiates a new TypeDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *TypeDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TypeDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TypeDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *TypeDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *TypeDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *TypeDetail) SetName(v string)`

SetName sets Name field to given value.


### GetDamageRelations

`func (o *TypeDetail) GetDamageRelations() TypeDetailDamageRelations`

GetDamageRelations returns the DamageRelations field if non-nil, zero value otherwise.

### GetDamageRelationsOk

`func (o *TypeDetail) GetDamageRelationsOk() (*TypeDetailDamageRelations, bool)`

GetDamageRelationsOk returns a tuple with the DamageRelations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDamageRelations

`func (o *TypeDetail) SetDamageRelations(v TypeDetailDamageRelations)`

SetDamageRelations sets DamageRelations field to given value.


### GetPastDamageRelations

`func (o *TypeDetail) GetPastDamageRelations() []TypeDetailPastDamageRelationsInner`

GetPastDamageRelations returns the PastDamageRelations field if non-nil, zero value otherwise.

### GetPastDamageRelationsOk

`func (o *TypeDetail) GetPastDamageRelationsOk() (*[]TypeDetailPastDamageRelationsInner, bool)`

GetPastDamageRelationsOk returns a tuple with the PastDamageRelations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastDamageRelations

`func (o *TypeDetail) SetPastDamageRelations(v []TypeDetailPastDamageRelationsInner)`

SetPastDamageRelations sets PastDamageRelations field to given value.


### GetGameIndices

`func (o *TypeDetail) GetGameIndices() []TypeGameIndex`

GetGameIndices returns the GameIndices field if non-nil, zero value otherwise.

### GetGameIndicesOk

`func (o *TypeDetail) GetGameIndicesOk() (*[]TypeGameIndex, bool)`

GetGameIndicesOk returns a tuple with the GameIndices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndices

`func (o *TypeDetail) SetGameIndices(v []TypeGameIndex)`

SetGameIndices sets GameIndices field to given value.


### GetGeneration

`func (o *TypeDetail) GetGeneration() GenerationSummary`

GetGeneration returns the Generation field if non-nil, zero value otherwise.

### GetGenerationOk

`func (o *TypeDetail) GetGenerationOk() (*GenerationSummary, bool)`

GetGenerationOk returns a tuple with the Generation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeneration

`func (o *TypeDetail) SetGeneration(v GenerationSummary)`

SetGeneration sets Generation field to given value.


### GetMoveDamageClass

`func (o *TypeDetail) GetMoveDamageClass() MoveDamageClassSummary`

GetMoveDamageClass returns the MoveDamageClass field if non-nil, zero value otherwise.

### GetMoveDamageClassOk

`func (o *TypeDetail) GetMoveDamageClassOk() (*MoveDamageClassSummary, bool)`

GetMoveDamageClassOk returns a tuple with the MoveDamageClass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoveDamageClass

`func (o *TypeDetail) SetMoveDamageClass(v MoveDamageClassSummary)`

SetMoveDamageClass sets MoveDamageClass field to given value.


### GetNames

`func (o *TypeDetail) GetNames() []AbilityName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *TypeDetail) GetNamesOk() (*[]AbilityName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *TypeDetail) SetNames(v []AbilityName)`

SetNames sets Names field to given value.


### GetPokemon

`func (o *TypeDetail) GetPokemon() []TypeDetailPokemonInner`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *TypeDetail) GetPokemonOk() (*[]TypeDetailPokemonInner, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *TypeDetail) SetPokemon(v []TypeDetailPokemonInner)`

SetPokemon sets Pokemon field to given value.


### GetMoves

`func (o *TypeDetail) GetMoves() []MoveSummary`

GetMoves returns the Moves field if non-nil, zero value otherwise.

### GetMovesOk

`func (o *TypeDetail) GetMovesOk() (*[]MoveSummary, bool)`

GetMovesOk returns a tuple with the Moves field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMoves

`func (o *TypeDetail) SetMoves(v []MoveSummary)`

SetMoves sets Moves field to given value.


### GetSprites

`func (o *TypeDetail) GetSprites() map[string]map[string]TypeDetailSpritesValueValue`

GetSprites returns the Sprites field if non-nil, zero value otherwise.

### GetSpritesOk

`func (o *TypeDetail) GetSpritesOk() (*map[string]map[string]TypeDetailSpritesValueValue, bool)`

GetSpritesOk returns a tuple with the Sprites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSprites

`func (o *TypeDetail) SetSprites(v map[string]map[string]TypeDetailSpritesValueValue)`

SetSprites sets Sprites field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


