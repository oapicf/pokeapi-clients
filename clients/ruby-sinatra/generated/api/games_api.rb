require 'json'


MyApp.add_route('GET', '/api/v2/generation/', {
  "resourcePath" => "/Games",
  "summary" => "List genrations",
  "nickname" => "generation_list",
  "responseClass" => "PaginatedGenerationSummaryList",
  "endpoint" => "/api/v2/generation/",
  "notes" => "A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.",
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


MyApp.add_route('GET', '/api/v2/generation/{id}/', {
  "resourcePath" => "/Games",
  "summary" => "Get genration",
  "nickname" => "generation_retrieve",
  "responseClass" => "GenerationDetail",
  "endpoint" => "/api/v2/generation/{id}/",
  "notes" => "A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.",
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


MyApp.add_route('GET', '/api/v2/pokedex/', {
  "resourcePath" => "/Games",
  "summary" => "List pokedex",
  "nickname" => "pokedex_list",
  "responseClass" => "PaginatedPokedexSummaryList",
  "endpoint" => "/api/v2/pokedex/",
  "notes" => "A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/pokedex/{id}/', {
  "resourcePath" => "/Games",
  "summary" => "Get pokedex",
  "nickname" => "pokedex_retrieve",
  "responseClass" => "PokedexDetail",
  "endpoint" => "/api/v2/pokedex/{id}/",
  "notes" => "A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/version-group/', {
  "resourcePath" => "/Games",
  "summary" => "List version groups",
  "nickname" => "version_group_list",
  "responseClass" => "PaginatedVersionGroupSummaryList",
  "endpoint" => "/api/v2/version-group/",
  "notes" => "Version groups categorize highly similar versions of the games.",
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


MyApp.add_route('GET', '/api/v2/version-group/{id}/', {
  "resourcePath" => "/Games",
  "summary" => "Get version group",
  "nickname" => "version_group_retrieve",
  "responseClass" => "VersionGroupDetail",
  "endpoint" => "/api/v2/version-group/{id}/",
  "notes" => "Version groups categorize highly similar versions of the games.",
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


MyApp.add_route('GET', '/api/v2/version/', {
  "resourcePath" => "/Games",
  "summary" => "List versions",
  "nickname" => "version_list",
  "responseClass" => "PaginatedVersionSummaryList",
  "endpoint" => "/api/v2/version/",
  "notes" => "Versions of the games, e.g., Red, Blue or Yellow.",
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


MyApp.add_route('GET', '/api/v2/version/{id}/', {
  "resourcePath" => "/Games",
  "summary" => "Get version",
  "nickname" => "version_retrieve",
  "responseClass" => "VersionDetail",
  "endpoint" => "/api/v2/version/{id}/",
  "notes" => "Versions of the games, e.g., Red, Blue or Yellow.",
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

