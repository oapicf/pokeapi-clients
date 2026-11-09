# TypeDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**DamageRelations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**PastDamageRelations** | [**[]TypePastRelationships**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**GameIndices** | [**[]TypeGameIndex**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | 
**MoveDamageClass** | [**NullableMoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | 
**Names** | [**[]TypeName**](TypeName.md) | The name of this resource listed in different languages. | [readonly] 
**Pokemon** | [**[]TypePokemon**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] 
**Moves** | [**[]MoveSummary**](MoveSummary.md) | A list of moves that have this type. | [readonly] 
**Sprites** | [**map[string]map[string]TypeGameSprite**](map.md) | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 

## Methods

### NewTypeDetail

`func NewTypeDetail(id int32, name string, damageRelations TypeRelationships, pastDamageRelations []TypePastRelationships, gameIndices []TypeGameIndex, generation GenerationSummary, moveDamageClass NullableMoveDamageClassSummary, names []TypeName, pokemon []TypePokemon, moves []MoveSummary, sprites map[string]map[string]TypeGameSprite, ) *TypeDetail`

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

`func (o *TypeDetail) GetDamageRelations() TypeRelationships`

GetDamageRelations returns the DamageRelations field if non-nil, zero value otherwise.

### GetDamageRelationsOk

`func (o *TypeDetail) GetDamageRelationsOk() (*TypeRelationships, bool)`

GetDamageRelationsOk returns a tuple with the DamageRelations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDamageRelations

`func (o *TypeDetail) SetDamageRelations(v TypeRelationships)`

SetDamageRelations sets DamageRelations field to given value.


### GetPastDamageRelations

`func (o *TypeDetail) GetPastDamageRelations() []TypePastRelationships`

GetPastDamageRelations returns the PastDamageRelations field if non-nil, zero value otherwise.

### GetPastDamageRelationsOk

`func (o *TypeDetail) GetPastDamageRelationsOk() (*[]TypePastRelationships, bool)`

GetPastDamageRelationsOk returns a tuple with the PastDamageRelations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPastDamageRelations

`func (o *TypeDetail) SetPastDamageRelations(v []TypePastRelationships)`

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


### SetMoveDamageClassNil

`func (o *TypeDetail) SetMoveDamageClassNil(b bool)`

 SetMoveDamageClassNil sets the value for MoveDamageClass to be an explicit nil

### UnsetMoveDamageClass
`func (o *TypeDetail) UnsetMoveDamageClass()`

UnsetMoveDamageClass ensures that no value is present for MoveDamageClass, not even an explicit nil
### GetNames

`func (o *TypeDetail) GetNames() []TypeName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *TypeDetail) GetNamesOk() (*[]TypeName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *TypeDetail) SetNames(v []TypeName)`

SetNames sets Names field to given value.


### GetPokemon

`func (o *TypeDetail) GetPokemon() []TypePokemon`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *TypeDetail) GetPokemonOk() (*[]TypePokemon, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *TypeDetail) SetPokemon(v []TypePokemon)`

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

`func (o *TypeDetail) GetSprites() map[string]map[string]TypeGameSprite`

GetSprites returns the Sprites field if non-nil, zero value otherwise.

### GetSpritesOk

`func (o *TypeDetail) GetSpritesOk() (*map[string]map[string]TypeGameSprite, bool)`

GetSpritesOk returns a tuple with the Sprites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSprites

`func (o *TypeDetail) SetSprites(v map[string]map[string]TypeGameSprite)`

SetSprites sets Sprites field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


