require 'json'


MyApp.add_route('GET', '/api/v2/ability/', {
  "resourcePath" => "/Pokemon",
  "summary" => "",
  "nickname" => "ability_list",
  "responseClass" => "PaginatedAbilitySummaryList",
  "endpoint" => "/api/v2/ability/",
  "notes" => "Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/ability/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "",
  "nickname" => "ability_retrieve",
  "responseClass" => "AbilityDetail",
  "endpoint" => "/api/v2/ability/{id}/",
  "notes" => "Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/characteristic/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List charecterictics",
  "nickname" => "characteristic_list",
  "responseClass" => "PaginatedCharacteristicSummaryList",
  "endpoint" => "/api/v2/characteristic/",
  "notes" => "Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/characteristic/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get characteristic",
  "nickname" => "characteristic_retrieve",
  "responseClass" => "CharacteristicDetail",
  "endpoint" => "/api/v2/characteristic/{id}/",
  "notes" => "Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/egg-group/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List egg groups",
  "nickname" => "egg_group_list",
  "responseClass" => "PaginatedEggGroupSummaryList",
  "endpoint" => "/api/v2/egg-group/",
  "notes" => "Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/egg-group/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get egg group",
  "nickname" => "egg_group_retrieve",
  "responseClass" => "EggGroupDetail",
  "endpoint" => "/api/v2/egg-group/{id}/",
  "notes" => "Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/gender/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List genders",
  "nickname" => "gender_list",
  "responseClass" => "PaginatedGenderSummaryList",
  "endpoint" => "/api/v2/gender/",
  "notes" => "Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/gender/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get gender",
  "nickname" => "gender_retrieve",
  "responseClass" => "GenderDetail",
  "endpoint" => "/api/v2/gender/{id}/",
  "notes" => "Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/growth-rate/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List growth rates",
  "nickname" => "growth_rate_list",
  "responseClass" => "PaginatedGrowthRateSummaryList",
  "endpoint" => "/api/v2/growth-rate/",
  "notes" => "Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/growth-rate/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get growth rate",
  "nickname" => "growth_rate_retrieve",
  "responseClass" => "GrowthRateDetail",
  "endpoint" => "/api/v2/growth-rate/{id}/",
  "notes" => "Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/move-damage-class/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List move damage classes",
  "nickname" => "move_damage_class_list",
  "responseClass" => "PaginatedMoveDamageClassSummaryList",
  "endpoint" => "/api/v2/move-damage-class/",
  "notes" => "Damage classes moves can have, e.g. physical, special, or non-damaging.",
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


MyApp.add_route('GET', '/api/v2/move-damage-class/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get move damage class",
  "nickname" => "move_damage_class_retrieve",
  "responseClass" => "MoveDamageClassDetail",
  "endpoint" => "/api/v2/move-damage-class/{id}/",
  "notes" => "Damage classes moves can have, e.g. physical, special, or non-damaging.",
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


MyApp.add_route('GET', '/api/v2/nature/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List natures",
  "nickname" => "nature_list",
  "responseClass" => "PaginatedNatureSummaryList",
  "endpoint" => "/api/v2/nature/",
  "notes" => "Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/nature/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get nature",
  "nickname" => "nature_retrieve",
  "responseClass" => "NatureDetail",
  "endpoint" => "/api/v2/nature/{id}/",
  "notes" => "Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/pokeathlon-stat/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List pokeathlon stats",
  "nickname" => "pokeathlon_stat_list",
  "responseClass" => "PaginatedPokeathlonStatSummaryList",
  "endpoint" => "/api/v2/pokeathlon-stat/",
  "notes" => "Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/pokeathlon-stat/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get pokeathlon stat",
  "nickname" => "pokeathlon_stat_retrieve",
  "responseClass" => "PokeathlonStatDetail",
  "endpoint" => "/api/v2/pokeathlon-stat/{id}/",
  "notes" => "Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/pokemon-color/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List pokemon colors",
  "nickname" => "pokemon_color_list",
  "responseClass" => "PaginatedPokemonColorSummaryList",
  "endpoint" => "/api/v2/pokemon-color/",
  "notes" => "Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.",
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


MyApp.add_route('GET', '/api/v2/pokemon-color/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get pokemon color",
  "nickname" => "pokemon_color_retrieve",
  "responseClass" => "PokemonColorDetail",
  "endpoint" => "/api/v2/pokemon-color/{id}/",
  "notes" => "Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.",
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


MyApp.add_route('GET', '/api/v2/pokemon-form/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List pokemon forms",
  "nickname" => "pokemon_form_list",
  "responseClass" => "PaginatedPokemonFormSummaryList",
  "endpoint" => "/api/v2/pokemon-form/",
  "notes" => "Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.",
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


MyApp.add_route('GET', '/api/v2/pokemon-form/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get pokemon form",
  "nickname" => "pokemon_form_retrieve",
  "responseClass" => "PokemonFormDetail",
  "endpoint" => "/api/v2/pokemon-form/{id}/",
  "notes" => "Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.",
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


MyApp.add_route('GET', '/api/v2/pokemon-habitat/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List pokemom habitas",
  "nickname" => "pokemon_habitat_list",
  "responseClass" => "PaginatedPokemonHabitatSummaryList",
  "endpoint" => "/api/v2/pokemon-habitat/",
  "notes" => "Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.",
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


MyApp.add_route('GET', '/api/v2/pokemon-habitat/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get pokemom habita",
  "nickname" => "pokemon_habitat_retrieve",
  "responseClass" => "PokemonHabitatDetail",
  "endpoint" => "/api/v2/pokemon-habitat/{id}/",
  "notes" => "Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.",
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


MyApp.add_route('GET', '/api/v2/pokemon/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List pokemon",
  "nickname" => "pokemon_list",
  "responseClass" => "PaginatedPokemonSummaryList",
  "endpoint" => "/api/v2/pokemon/",
  "notes" => "Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/pokemon/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get pokemon",
  "nickname" => "pokemon_retrieve",
  "responseClass" => "PokemonDetail",
  "endpoint" => "/api/v2/pokemon/{id}/",
  "notes" => "Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/pokemon-shape/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List pokemon shapes",
  "nickname" => "pokemon_shape_list",
  "responseClass" => "PaginatedPokemonShapeSummaryList",
  "endpoint" => "/api/v2/pokemon-shape/",
  "notes" => "Shapes used for sorting Pokémon in a Pokédex.",
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


MyApp.add_route('GET', '/api/v2/pokemon-shape/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get pokemon shape",
  "nickname" => "pokemon_shape_retrieve",
  "responseClass" => "PokemonShapeDetail",
  "endpoint" => "/api/v2/pokemon-shape/{id}/",
  "notes" => "Shapes used for sorting Pokémon in a Pokédex.",
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


MyApp.add_route('GET', '/api/v2/pokemon-species/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List pokemon species",
  "nickname" => "pokemon_species_list",
  "responseClass" => "PaginatedPokemonSpeciesSummaryList",
  "endpoint" => "/api/v2/pokemon-species/",
  "notes" => "A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.",
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


MyApp.add_route('GET', '/api/v2/pokemon-species/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get pokemon species",
  "nickname" => "pokemon_species_retrieve",
  "responseClass" => "PokemonSpeciesDetail",
  "endpoint" => "/api/v2/pokemon-species/{id}/",
  "notes" => "A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.",
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


MyApp.add_route('GET', '/api/v2/stat/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List stats",
  "nickname" => "stat_list",
  "responseClass" => "PaginatedStatSummaryList",
  "endpoint" => "/api/v2/stat/",
  "notes" => "Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.",
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


MyApp.add_route('GET', '/api/v2/stat/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get stat",
  "nickname" => "stat_retrieve",
  "responseClass" => "StatDetail",
  "endpoint" => "/api/v2/stat/{id}/",
  "notes" => "Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.",
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


MyApp.add_route('GET', '/api/v2/type/', {
  "resourcePath" => "/Pokemon",
  "summary" => "List types",
  "nickname" => "type_list",
  "responseClass" => "PaginatedTypeSummaryList",
  "endpoint" => "/api/v2/type/",
  "notes" => "Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.",
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


MyApp.add_route('GET', '/api/v2/type/{id}/', {
  "resourcePath" => "/Pokemon",
  "summary" => "Get types",
  "nickname" => "type_retrieve",
  "responseClass" => "TypeDetail",
  "endpoint" => "/api/v2/type/{id}/",
  "notes" => "Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.",
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

