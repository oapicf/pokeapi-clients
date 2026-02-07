require 'json'


MyApp.add_route('GET', '/api/v2/encounter-condition/', {
  "resourcePath" => "/Encounters",
  "summary" => "List encounter conditions",
  "nickname" => "encounter_condition_list",
  "responseClass" => "PaginatedEncounterConditionSummaryList",
  "endpoint" => "/api/v2/encounter-condition/",
  "notes" => "Conditions which affect what pokemon might appear in the wild, e.g., day or night.",
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


MyApp.add_route('GET', '/api/v2/encounter-condition/{id}/', {
  "resourcePath" => "/Encounters",
  "summary" => "Get encounter condition",
  "nickname" => "encounter_condition_retrieve",
  "responseClass" => "EncounterConditionDetail",
  "endpoint" => "/api/v2/encounter-condition/{id}/",
  "notes" => "Conditions which affect what pokemon might appear in the wild, e.g., day or night.",
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


MyApp.add_route('GET', '/api/v2/encounter-condition-value/', {
  "resourcePath" => "/Encounters",
  "summary" => "List encounter condition values",
  "nickname" => "encounter_condition_value_list",
  "responseClass" => "PaginatedEncounterConditionValueSummaryList",
  "endpoint" => "/api/v2/encounter-condition-value/",
  "notes" => "Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.",
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


MyApp.add_route('GET', '/api/v2/encounter-condition-value/{id}/', {
  "resourcePath" => "/Encounters",
  "summary" => "Get encounter condition value",
  "nickname" => "encounter_condition_value_retrieve",
  "responseClass" => "EncounterConditionValueDetail",
  "endpoint" => "/api/v2/encounter-condition-value/{id}/",
  "notes" => "Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.",
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


MyApp.add_route('GET', '/api/v2/encounter-method/', {
  "resourcePath" => "/Encounters",
  "summary" => "List encounter methods",
  "nickname" => "encounter_method_list",
  "responseClass" => "PaginatedEncounterMethodSummaryList",
  "endpoint" => "/api/v2/encounter-method/",
  "notes" => "Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.",
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


MyApp.add_route('GET', '/api/v2/encounter-method/{id}/', {
  "resourcePath" => "/Encounters",
  "summary" => "Get encounter method",
  "nickname" => "encounter_method_retrieve",
  "responseClass" => "EncounterMethodDetail",
  "endpoint" => "/api/v2/encounter-method/{id}/",
  "notes" => "Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.",
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

