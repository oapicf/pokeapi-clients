require 'json'


MyApp.add_route('GET', '/api/v2/evolution-chain/', {
  "resourcePath" => "/Evolution",
  "summary" => "List evolution chains",
  "nickname" => "evolution_chain_list",
  "responseClass" => "PaginatedEvolutionChainSummaryList",
  "endpoint" => "/api/v2/evolution-chain/",
  "notes" => "Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.",
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


MyApp.add_route('GET', '/api/v2/evolution-chain/{id}/', {
  "resourcePath" => "/Evolution",
  "summary" => "Get evolution chain",
  "nickname" => "evolution_chain_retrieve",
  "responseClass" => "EvolutionChainDetail",
  "endpoint" => "/api/v2/evolution-chain/{id}/",
  "notes" => "Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.",
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


MyApp.add_route('GET', '/api/v2/evolution-trigger/', {
  "resourcePath" => "/Evolution",
  "summary" => "List evolution triggers",
  "nickname" => "evolution_trigger_list",
  "responseClass" => "PaginatedEvolutionTriggerSummaryList",
  "endpoint" => "/api/v2/evolution-trigger/",
  "notes" => "Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/evolution-trigger/{id}/', {
  "resourcePath" => "/Evolution",
  "summary" => "Get evolution trigger",
  "nickname" => "evolution_trigger_retrieve",
  "responseClass" => "EvolutionTriggerDetail",
  "endpoint" => "/api/v2/evolution-trigger/{id}/",
  "notes" => "Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.",
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

