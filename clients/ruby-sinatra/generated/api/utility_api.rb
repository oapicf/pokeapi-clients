require 'json'


MyApp.add_route('GET', '/api/v2/language/', {
  "resourcePath" => "/Utility",
  "summary" => "List languages",
  "nickname" => "language_list",
  "responseClass" => "PaginatedLanguageSummaryList",
  "endpoint" => "/api/v2/language/",
  "notes" => "Languages for translations of API resource information.",
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


MyApp.add_route('GET', '/api/v2/language/{id}/', {
  "resourcePath" => "/Utility",
  "summary" => "Get language",
  "nickname" => "language_retrieve",
  "responseClass" => "LanguageDetail",
  "endpoint" => "/api/v2/language/{id}/",
  "notes" => "Languages for translations of API resource information.",
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


MyApp.add_route('GET', '/api/v2/meta/', {
  "resourcePath" => "/Utility",
  "summary" => "Get API metadata",
  "nickname" => "meta_retrieve",
  "responseClass" => "PokeapiMetaResponse",
  "endpoint" => "/api/v2/meta/",
  "notes" => "Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

