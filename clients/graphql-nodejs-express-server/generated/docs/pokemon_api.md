# pokemon_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AbilityList**](pokemon_api.md#AbilityList) | **GET** /api/v2/ability/ | 
[**AbilityRetrieve**](pokemon_api.md#AbilityRetrieve) | **GET** /api/v2/ability/{id}/ | 
[**CharacteristicList**](pokemon_api.md#CharacteristicList) | **GET** /api/v2/characteristic/ | List charecterictics
[**CharacteristicRetrieve**](pokemon_api.md#CharacteristicRetrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
[**EggGroupList**](pokemon_api.md#EggGroupList) | **GET** /api/v2/egg-group/ | List egg groups
[**EggGroupRetrieve**](pokemon_api.md#EggGroupRetrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
[**GenderList**](pokemon_api.md#GenderList) | **GET** /api/v2/gender/ | List genders
[**GenderRetrieve**](pokemon_api.md#GenderRetrieve) | **GET** /api/v2/gender/{id}/ | Get gender
[**GrowthRateList**](pokemon_api.md#GrowthRateList) | **GET** /api/v2/growth-rate/ | List growth rates
[**GrowthRateRetrieve**](pokemon_api.md#GrowthRateRetrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
[**MoveDamageClassList**](pokemon_api.md#MoveDamageClassList) | **GET** /api/v2/move-damage-class/ | List move damage classes
[**MoveDamageClassRetrieve**](pokemon_api.md#MoveDamageClassRetrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
[**NatureList**](pokemon_api.md#NatureList) | **GET** /api/v2/nature/ | List natures
[**NatureRetrieve**](pokemon_api.md#NatureRetrieve) | **GET** /api/v2/nature/{id}/ | Get nature
[**PokeathlonStatList**](pokemon_api.md#PokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
[**PokeathlonStatRetrieve**](pokemon_api.md#PokeathlonStatRetrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
[**PokemonColorList**](pokemon_api.md#PokemonColorList) | **GET** /api/v2/pokemon-color/ | List pokemon colors
[**PokemonColorRetrieve**](pokemon_api.md#PokemonColorRetrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
[**PokemonFormList**](pokemon_api.md#PokemonFormList) | **GET** /api/v2/pokemon-form/ | List pokemon forms
[**PokemonFormRetrieve**](pokemon_api.md#PokemonFormRetrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
[**PokemonHabitatList**](pokemon_api.md#PokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
[**PokemonHabitatRetrieve**](pokemon_api.md#PokemonHabitatRetrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
[**PokemonList**](pokemon_api.md#PokemonList) | **GET** /api/v2/pokemon/ | List pokemon
[**PokemonRetrieve**](pokemon_api.md#PokemonRetrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
[**PokemonShapeList**](pokemon_api.md#PokemonShapeList) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
[**PokemonShapeRetrieve**](pokemon_api.md#PokemonShapeRetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
[**PokemonSpeciesList**](pokemon_api.md#PokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | List pokemon species
[**PokemonSpeciesRetrieve**](pokemon_api.md#PokemonSpeciesRetrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
[**StatList**](pokemon_api.md#StatList) | **GET** /api/v2/stat/ | List stats
[**StatRetrieve**](pokemon_api.md#StatRetrieve) | **GET** /api/v2/stat/{id}/ | Get stat
[**TypeList**](pokemon_api.md#TypeList) | **GET** /api/v2/type/ | List types
[**TypeRetrieve**](pokemon_api.md#TypeRetrieve) | **GET** /api/v2/type/{id}/ | Get types


<a name="AbilityList"></a>
# **AbilityList**
> PaginatedAbilitySummaryList AbilityList(limit, offset, q)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
<a name="AbilityRetrieve"></a>
# **AbilityRetrieve**
> AbilityDetail AbilityRetrieve(Id_)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
<a name="CharacteristicList"></a>
# **CharacteristicList**
> PaginatedCharacteristicSummaryList CharacteristicList(limit, offset, q)

List charecterictics

Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
<a name="CharacteristicRetrieve"></a>
# **CharacteristicRetrieve**
> CharacteristicDetail CharacteristicRetrieve(Id_)

Get characteristic

Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
<a name="EggGroupList"></a>
# **EggGroupList**
> PaginatedEggGroupSummaryList EggGroupList(limit, offset, q)

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
<a name="EggGroupRetrieve"></a>
# **EggGroupRetrieve**
> EggGroupDetail EggGroupRetrieve(Id_)

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
<a name="GenderList"></a>
# **GenderList**
> PaginatedGenderSummaryList GenderList(limit, offset, q)

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
<a name="GenderRetrieve"></a>
# **GenderRetrieve**
> GenderDetail GenderRetrieve(Id_)

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
<a name="GrowthRateList"></a>
# **GrowthRateList**
> PaginatedGrowthRateSummaryList GrowthRateList(limit, offset, q)

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
<a name="GrowthRateRetrieve"></a>
# **GrowthRateRetrieve**
> GrowthRateDetail GrowthRateRetrieve(Id_)

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
<a name="MoveDamageClassList"></a>
# **MoveDamageClassList**
> PaginatedMoveDamageClassSummaryList MoveDamageClassList(limit, offset, q)

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.
<a name="MoveDamageClassRetrieve"></a>
# **MoveDamageClassRetrieve**
> MoveDamageClassDetail MoveDamageClassRetrieve(Id_)

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.
<a name="NatureList"></a>
# **NatureList**
> PaginatedNatureSummaryList NatureList(limit, offset, q)

List natures

Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
<a name="NatureRetrieve"></a>
# **NatureRetrieve**
> NatureDetail NatureRetrieve(Id_)

Get nature

Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
<a name="PokeathlonStatList"></a>
# **PokeathlonStatList**
> PaginatedPokeathlonStatSummaryList PokeathlonStatList(limit, offset, q)

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
<a name="PokeathlonStatRetrieve"></a>
# **PokeathlonStatRetrieve**
> PokeathlonStatDetail PokeathlonStatRetrieve(Id_)

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
<a name="PokemonColorList"></a>
# **PokemonColorList**
> PaginatedPokemonColorSummaryList PokemonColorList(limit, offset, q)

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
<a name="PokemonColorRetrieve"></a>
# **PokemonColorRetrieve**
> PokemonColorDetail PokemonColorRetrieve(Id_)

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
<a name="PokemonFormList"></a>
# **PokemonFormList**
> PaginatedPokemonFormSummaryList PokemonFormList(limit, offset, q)

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
<a name="PokemonFormRetrieve"></a>
# **PokemonFormRetrieve**
> PokemonFormDetail PokemonFormRetrieve(Id_)

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.
<a name="PokemonHabitatList"></a>
# **PokemonHabitatList**
> PaginatedPokemonHabitatSummaryList PokemonHabitatList(limit, offset, q)

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
<a name="PokemonHabitatRetrieve"></a>
# **PokemonHabitatRetrieve**
> PokemonHabitatDetail PokemonHabitatRetrieve(Id_)

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
<a name="PokemonList"></a>
# **PokemonList**
> PaginatedPokemonSummaryList PokemonList(limit, offset, q)

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
<a name="PokemonRetrieve"></a>
# **PokemonRetrieve**
> PokemonDetail PokemonRetrieve(Id_)

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
<a name="PokemonShapeList"></a>
# **PokemonShapeList**
> PaginatedPokemonShapeSummaryList PokemonShapeList(limit, offset, q)

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.
<a name="PokemonShapeRetrieve"></a>
# **PokemonShapeRetrieve**
> PokemonShapeDetail PokemonShapeRetrieve(Id_)

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.
<a name="PokemonSpeciesList"></a>
# **PokemonSpeciesList**
> PaginatedPokemonSpeciesSummaryList PokemonSpeciesList(limit, offset, q)

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
<a name="PokemonSpeciesRetrieve"></a>
# **PokemonSpeciesRetrieve**
> PokemonSpeciesDetail PokemonSpeciesRetrieve(Id_)

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
<a name="StatList"></a>
# **StatList**
> PaginatedStatSummaryList StatList(limit, offset, q)

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
<a name="StatRetrieve"></a>
# **StatRetrieve**
> StatDetail StatRetrieve(Id_)

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
<a name="TypeList"></a>
# **TypeList**
> PaginatedTypeSummaryList TypeList(limit, offset, q)

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
<a name="TypeRetrieve"></a>
# **TypeRetrieve**
> TypeDetail TypeRetrieve(Id_)

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
