require 'json'


MyApp.add_route('GET', '/api/v2/contest-effect/', {
  "resourcePath" => "/Contests",
  "summary" => "List contest effects",
  "nickname" => "contest_effect_list",
  "responseClass" => "PaginatedContestEffectSummaryList",
  "endpoint" => "/api/v2/contest-effect/",
  "notes" => "Contest effects refer to the effects of moves when used in contests.",
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


MyApp.add_route('GET', '/api/v2/contest-effect/{id}/', {
  "resourcePath" => "/Contests",
  "summary" => "Get contest effect",
  "nickname" => "contest_effect_retrieve",
  "responseClass" => "ContestEffectDetail",
  "endpoint" => "/api/v2/contest-effect/{id}/",
  "notes" => "Contest effects refer to the effects of moves when used in contests.",
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


MyApp.add_route('GET', '/api/v2/contest-type/', {
  "resourcePath" => "/Contests",
  "summary" => "List contest types",
  "nickname" => "contest_type_list",
  "responseClass" => "PaginatedContestTypeSummaryList",
  "endpoint" => "/api/v2/contest-type/",
  "notes" => "Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/contest-type/{id}/', {
  "resourcePath" => "/Contests",
  "summary" => "Get contest type",
  "nickname" => "contest_type_retrieve",
  "responseClass" => "ContestTypeDetail",
  "endpoint" => "/api/v2/contest-type/{id}/",
  "notes" => "Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/super-contest-effect/', {
  "resourcePath" => "/Contests",
  "summary" => "List super contest effects",
  "nickname" => "super_contest_effect_list",
  "responseClass" => "PaginatedSuperContestEffectSummaryList",
  "endpoint" => "/api/v2/super-contest-effect/",
  "notes" => "Super contest effects refer to the effects of moves when used in super contests.",
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


MyApp.add_route('GET', '/api/v2/super-contest-effect/{id}/', {
  "resourcePath" => "/Contests",
  "summary" => "Get super contest effect",
  "nickname" => "super_contest_effect_retrieve",
  "responseClass" => "SuperContestEffectDetail",
  "endpoint" => "/api/v2/super-contest-effect/{id}/",
  "notes" => "Super contest effects refer to the effects of moves when used in super contests.",
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

