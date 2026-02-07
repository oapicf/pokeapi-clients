# berries_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BerryFirmnessList**](berries_api.md#BerryFirmnessList) | **GET** /api/v2/berry-firmness/ | List berry firmness
[**BerryFirmnessRetrieve**](berries_api.md#BerryFirmnessRetrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**BerryFlavorList**](berries_api.md#BerryFlavorList) | **GET** /api/v2/berry-flavor/ | List berry flavors
[**BerryFlavorRetrieve**](berries_api.md#BerryFlavorRetrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**BerryList**](berries_api.md#BerryList) | **GET** /api/v2/berry/ | List berries
[**BerryRetrieve**](berries_api.md#BerryRetrieve) | **GET** /api/v2/berry/{id}/ | Get a berry


<a name="BerryFirmnessList"></a>
# **BerryFirmnessList**
> PaginatedBerryFirmnessSummaryList BerryFirmnessList(limit, offset, q)

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
<a name="BerryFirmnessRetrieve"></a>
# **BerryFirmnessRetrieve**
> BerryFirmnessDetail BerryFirmnessRetrieve(Id_)

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
<a name="BerryFlavorList"></a>
# **BerryFlavorList**
> PaginatedBerryFlavorSummaryList BerryFlavorList(limit, offset, q)

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
<a name="BerryFlavorRetrieve"></a>
# **BerryFlavorRetrieve**
> BerryFlavorDetail BerryFlavorRetrieve(Id_)

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
<a name="BerryList"></a>
# **BerryList**
> PaginatedBerrySummaryList BerryList(limit, offset, q)

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
<a name="BerryRetrieve"></a>
# **BerryRetrieve**
> BerryDetail BerryRetrieve(Id_)

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
