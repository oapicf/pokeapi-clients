# location_api

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LocationAreaList**](location_api.md#LocationAreaList) | **GET** /api/v2/location-area/ | List location areas
[**LocationAreaRetrieve**](location_api.md#LocationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**LocationList**](location_api.md#LocationList) | **GET** /api/v2/location/ | List locations
[**LocationRetrieve**](location_api.md#LocationRetrieve) | **GET** /api/v2/location/{id}/ | Get location
[**PalParkAreaList**](location_api.md#PalParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**PalParkAreaRetrieve**](location_api.md#PalParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**RegionList**](location_api.md#RegionList) | **GET** /api/v2/region/ | List regions
[**RegionRetrieve**](location_api.md#RegionRetrieve) | **GET** /api/v2/region/{id}/ | Get region


<a name="LocationAreaList"></a>
# **LocationAreaList**
> PaginatedLocationAreaSummaryList LocationAreaList(limit, offset)

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
<a name="LocationAreaRetrieve"></a>
# **LocationAreaRetrieve**
> LocationAreaDetail LocationAreaRetrieve(Id_)

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
<a name="LocationList"></a>
# **LocationList**
> PaginatedLocationSummaryList LocationList(limit, offset, q)

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
<a name="LocationRetrieve"></a>
# **LocationRetrieve**
> LocationDetail LocationRetrieve(Id_)

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
<a name="PalParkAreaList"></a>
# **PalParkAreaList**
> PaginatedPalParkAreaSummaryList PalParkAreaList(limit, offset, q)

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
<a name="PalParkAreaRetrieve"></a>
# **PalParkAreaRetrieve**
> PalParkAreaDetail PalParkAreaRetrieve(Id_)

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
<a name="RegionList"></a>
# **RegionList**
> PaginatedRegionSummaryList RegionList(limit, offset, q)

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
<a name="RegionRetrieve"></a>
# **RegionRetrieve**
> RegionDetail RegionRetrieve(Id_)

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
