require 'json'


MyApp.add_route('GET', '/api/v2/move-ailment/', {
  "resourcePath" => "/Moves",
  "summary" => "List move meta ailments",
  "nickname" => "move_ailment_list",
  "responseClass" => "PaginatedMoveMetaAilmentSummaryList",
  "endpoint" => "/api/v2/move-ailment/",
  "notes" => "Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/move-ailment/{id}/', {
  "resourcePath" => "/Moves",
  "summary" => "Get move meta ailment",
  "nickname" => "move_ailment_retrieve",
  "responseClass" => "MoveMetaAilmentDetail",
  "endpoint" => "/api/v2/move-ailment/{id}/",
  "notes" => "Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/move-battle-style/', {
  "resourcePath" => "/Moves",
  "summary" => "List move battle styles",
  "nickname" => "move_battle_style_list",
  "responseClass" => "PaginatedMoveBattleStyleSummaryList",
  "endpoint" => "/api/v2/move-battle-style/",
  "notes" => "Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/move-battle-style/{id}/', {
  "resourcePath" => "/Moves",
  "summary" => "Get move battle style",
  "nickname" => "move_battle_style_retrieve",
  "responseClass" => "MoveBattleStyleDetail",
  "endpoint" => "/api/v2/move-battle-style/{id}/",
  "notes" => "Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.",
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


MyApp.add_route('GET', '/api/v2/move-category/', {
  "resourcePath" => "/Moves",
  "summary" => "List move meta categories",
  "nickname" => "move_category_list",
  "responseClass" => "PaginatedMoveMetaCategorySummaryList",
  "endpoint" => "/api/v2/move-category/",
  "notes" => "Very general categories that loosely group move effects.",
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


MyApp.add_route('GET', '/api/v2/move-category/{id}/', {
  "resourcePath" => "/Moves",
  "summary" => "Get move meta category",
  "nickname" => "move_category_retrieve",
  "responseClass" => "MoveMetaCategoryDetail",
  "endpoint" => "/api/v2/move-category/{id}/",
  "notes" => "Very general categories that loosely group move effects.",
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


MyApp.add_route('GET', '/api/v2/move-learn-method/', {
  "resourcePath" => "/Moves",
  "summary" => "List move learn methods",
  "nickname" => "move_learn_method_list",
  "responseClass" => "PaginatedMoveLearnMethodSummaryList",
  "endpoint" => "/api/v2/move-learn-method/",
  "notes" => "Methods by which Pokémon can learn moves.",
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


MyApp.add_route('GET', '/api/v2/move-learn-method/{id}/', {
  "resourcePath" => "/Moves",
  "summary" => "Get move learn method",
  "nickname" => "move_learn_method_retrieve",
  "responseClass" => "MoveLearnMethodDetail",
  "endpoint" => "/api/v2/move-learn-method/{id}/",
  "notes" => "Methods by which Pokémon can learn moves.",
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


MyApp.add_route('GET', '/api/v2/move/', {
  "resourcePath" => "/Moves",
  "summary" => "List moves",
  "nickname" => "move_list",
  "responseClass" => "PaginatedMoveSummaryList",
  "endpoint" => "/api/v2/move/",
  "notes" => "Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.",
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


MyApp.add_route('GET', '/api/v2/move/{id}/', {
  "resourcePath" => "/Moves",
  "summary" => "Get move",
  "nickname" => "move_retrieve",
  "responseClass" => "MoveDetail",
  "endpoint" => "/api/v2/move/{id}/",
  "notes" => "Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.",
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


MyApp.add_route('GET', '/api/v2/move-target/', {
  "resourcePath" => "/Moves",
  "summary" => "List move targets",
  "nickname" => "move_target_list",
  "responseClass" => "PaginatedMoveTargetSummaryList",
  "endpoint" => "/api/v2/move-target/",
  "notes" => "Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.",
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


MyApp.add_route('GET', '/api/v2/move-target/{id}/', {
  "resourcePath" => "/Moves",
  "summary" => "Get move target",
  "nickname" => "move_target_retrieve",
  "responseClass" => "MoveTargetDetail",
  "endpoint" => "/api/v2/move-target/{id}/",
  "notes" => "Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.",
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

