# contests_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ContestEffectList**](contests_api.md#ContestEffectList) | **GET** /api/v2/contest-effect/ | List contest effects
[**ContestEffectRetrieve**](contests_api.md#ContestEffectRetrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
[**ContestTypeList**](contests_api.md#ContestTypeList) | **GET** /api/v2/contest-type/ | List contest types
[**ContestTypeRetrieve**](contests_api.md#ContestTypeRetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
[**SuperContestEffectList**](contests_api.md#SuperContestEffectList) | **GET** /api/v2/super-contest-effect/ | List super contest effects
[**SuperContestEffectRetrieve**](contests_api.md#SuperContestEffectRetrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect


<a name="ContestEffectList"></a>
# **ContestEffectList**
> PaginatedContestEffectSummaryList ContestEffectList(limit, offset, q)

List contest effects

Contest effects refer to the effects of moves when used in contests.
<a name="ContestEffectRetrieve"></a>
# **ContestEffectRetrieve**
> ContestEffectDetail ContestEffectRetrieve(Id_)

Get contest effect

Contest effects refer to the effects of moves when used in contests.
<a name="ContestTypeList"></a>
# **ContestTypeList**
> PaginatedContestTypeSummaryList ContestTypeList(limit, offset, q)

List contest types

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
<a name="ContestTypeRetrieve"></a>
# **ContestTypeRetrieve**
> ContestTypeDetail ContestTypeRetrieve(Id_)

Get contest type

Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
<a name="SuperContestEffectList"></a>
# **SuperContestEffectList**
> PaginatedSuperContestEffectSummaryList SuperContestEffectList(limit, offset, q)

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.
<a name="SuperContestEffectRetrieve"></a>
# **SuperContestEffectRetrieve**
> SuperContestEffectDetail SuperContestEffectRetrieve(Id_)

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.
