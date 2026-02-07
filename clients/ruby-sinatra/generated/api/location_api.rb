require 'json'


MyApp.add_route('GET', '/api/v2/location-area/', {
  "resourcePath" => "/Location",
  "summary" => "List location areas",
  "nickname" => "location_area_list",
  "responseClass" => "PaginatedLocationAreaSummaryList",
  "endpoint" => "/api/v2/location-area/",
  "notes" => "Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "Number of results to return per page.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offset",
      "description" => "The initial index from which to return the results.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v2/location-area/{id}/', {
  "resourcePath" => "/Location",
  "summary" => "Get location area",
  "nickname" => "location_area_retrieve",
  "responseClass" => "LocationAreaDetail",
  "endpoint" => "/api/v2/location-area/{id}/",
  "notes" => "Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.",
  "parameters" => [
    {
      "name" => "id",
      "description" => "A unique integer value identifying this location area.",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v2/location/', {
  "resourcePath" => "/Location",
  "summary" => "List locations",
  "nickname" => "location_list",
  "responseClass" => "PaginatedLocationSummaryList",
  "endpoint" => "/api/v2/location/",
  "notes" => "Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "Number of results to return per page.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offset",
      "description" => "The initial index from which to return the results.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "q",
      "description" => "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v2/location/{id}/', {
  "resourcePath" => "/Location",
  "summary" => "Get location",
  "nickname" => "location_retrieve",
  "responseClass" => "LocationDetail",
  "endpoint" => "/api/v2/location/{id}/",
  "notes" => "Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.",
  "parameters" => [
    {
      "name" => "id",
      "description" => "This parameter can be a string or an integer.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v2/pal-park-area/', {
  "resourcePath" => "/Location",
  "summary" => "List pal park areas",
  "nickname" => "pal_park_area_list",
  "responseClass" => "PaginatedPalParkAreaSummaryList",
  "endpoint" => "/api/v2/pal-park-area/",
  "notes" => "Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "Number of results to return per page.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offset",
      "description" => "The initial index from which to return the results.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "q",
      "description" => "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v2/pal-park-area/{id}/', {
  "resourcePath" => "/Location",
  "summary" => "Get pal park area",
  "nickname" => "pal_park_area_retrieve",
  "responseClass" => "PalParkAreaDetail",
  "endpoint" => "/api/v2/pal-park-area/{id}/",
  "notes" => "Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.",
  "parameters" => [
    {
      "name" => "id",
      "description" => "This parameter can be a string or an integer.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v2/region/', {
  "resourcePath" => "/Location",
  "summary" => "List regions",
  "nickname" => "region_list",
  "responseClass" => "PaginatedRegionSummaryList",
  "endpoint" => "/api/v2/region/",
  "notes" => "A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "Number of results to return per page.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offset",
      "description" => "The initial index from which to return the results.",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "q",
      "description" => "&gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v2/region/{id}/', {
  "resourcePath" => "/Location",
  "summary" => "Get region",
  "nickname" => "region_retrieve",
  "responseClass" => "RegionDetail",
  "endpoint" => "/api/v2/region/{id}/",
  "notes" => "A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.",
  "parameters" => [
    {
      "name" => "id",
      "description" => "This parameter can be a string or an integer.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

