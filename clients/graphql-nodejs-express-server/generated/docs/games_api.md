# games_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GenerationList**](games_api.md#GenerationList) | **GET** /api/v2/generation/ | List genrations
[**GenerationRetrieve**](games_api.md#GenerationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration
[**PokedexList**](games_api.md#PokedexList) | **GET** /api/v2/pokedex/ | List pokedex
[**PokedexRetrieve**](games_api.md#PokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
[**VersionGroupList**](games_api.md#VersionGroupList) | **GET** /api/v2/version-group/ | List version groups
[**VersionGroupRetrieve**](games_api.md#VersionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
[**VersionList**](games_api.md#VersionList) | **GET** /api/v2/version/ | List versions
[**VersionRetrieve**](games_api.md#VersionRetrieve) | **GET** /api/v2/version/{id}/ | Get version


<a name="GenerationList"></a>
# **GenerationList**
> PaginatedGenerationSummaryList GenerationList(limit, offset, q)

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
<a name="GenerationRetrieve"></a>
# **GenerationRetrieve**
> GenerationDetail GenerationRetrieve(Id_)

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
<a name="PokedexList"></a>
# **PokedexList**
> PaginatedPokedexSummaryList PokedexList(limit, offset, q)

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
<a name="PokedexRetrieve"></a>
# **PokedexRetrieve**
> PokedexDetail PokedexRetrieve(Id_)

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
<a name="VersionGroupList"></a>
# **VersionGroupList**
> PaginatedVersionGroupSummaryList VersionGroupList(limit, offset, q)

List version groups

Version groups categorize highly similar versions of the games.
<a name="VersionGroupRetrieve"></a>
# **VersionGroupRetrieve**
> VersionGroupDetail VersionGroupRetrieve(Id_)

Get version group

Version groups categorize highly similar versions of the games.
<a name="VersionList"></a>
# **VersionList**
> PaginatedVersionSummaryList VersionList(limit, offset, q)

List versions

Versions of the games, e.g., Red, Blue or Yellow.
<a name="VersionRetrieve"></a>
# **VersionRetrieve**
> VersionDetail VersionRetrieve(Id_)

Get version

Versions of the games, e.g., Red, Blue or Yellow.
