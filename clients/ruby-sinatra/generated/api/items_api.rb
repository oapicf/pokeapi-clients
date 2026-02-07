require 'json'


MyApp.add_route('GET', '/api/v2/item-attribute/', {
  "resourcePath" => "/Items",
  "summary" => "List item attributes",
  "nickname" => "item_attribute_list",
  "responseClass" => "PaginatedItemAttributeSummaryList",
  "endpoint" => "/api/v2/item-attribute/",
  "notes" => "Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".",
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


MyApp.add_route('GET', '/api/v2/item-attribute/{id}/', {
  "resourcePath" => "/Items",
  "summary" => "Get item attribute",
  "nickname" => "item_attribute_retrieve",
  "responseClass" => "ItemAttributeDetail",
  "endpoint" => "/api/v2/item-attribute/{id}/",
  "notes" => "Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".",
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


MyApp.add_route('GET', '/api/v2/item-category/', {
  "resourcePath" => "/Items",
  "summary" => "List item categories",
  "nickname" => "item_category_list",
  "responseClass" => "PaginatedItemCategorySummaryList",
  "endpoint" => "/api/v2/item-category/",
  "notes" => "Item categories determine where items will be placed in the players bag.",
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


MyApp.add_route('GET', '/api/v2/item-category/{id}/', {
  "resourcePath" => "/Items",
  "summary" => "Get item category",
  "nickname" => "item_category_retrieve",
  "responseClass" => "ItemCategoryDetail",
  "endpoint" => "/api/v2/item-category/{id}/",
  "notes" => "Item categories determine where items will be placed in the players bag.",
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


MyApp.add_route('GET', '/api/v2/item-fling-effect/', {
  "resourcePath" => "/Items",
  "summary" => "List item fling effects",
  "nickname" => "item_fling_effect_list",
  "responseClass" => "PaginatedItemFlingEffectSummaryList",
  "endpoint" => "/api/v2/item-fling-effect/",
  "notes" => "The various effects of the move\"Fling\" when used with different items.",
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


MyApp.add_route('GET', '/api/v2/item-fling-effect/{id}/', {
  "resourcePath" => "/Items",
  "summary" => "Get item fling effect",
  "nickname" => "item_fling_effect_retrieve",
  "responseClass" => "ItemFlingEffectDetail",
  "endpoint" => "/api/v2/item-fling-effect/{id}/",
  "notes" => "The various effects of the move\"Fling\" when used with different items.",
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


MyApp.add_route('GET', '/api/v2/item/', {
  "resourcePath" => "/Items",
  "summary" => "List items",
  "nickname" => "item_list",
  "responseClass" => "PaginatedItemSummaryList",
  "endpoint" => "/api/v2/item/",
  "notes" => "An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.",
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


MyApp.add_route('GET', '/api/v2/item-pocket/', {
  "resourcePath" => "/Items",
  "summary" => "List item pockets",
  "nickname" => "item_pocket_list",
  "responseClass" => "PaginatedItemPocketSummaryList",
  "endpoint" => "/api/v2/item-pocket/",
  "notes" => "Pockets within the players bag used for storing items by category.",
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


MyApp.add_route('GET', '/api/v2/item-pocket/{id}/', {
  "resourcePath" => "/Items",
  "summary" => "Get item pocket",
  "nickname" => "item_pocket_retrieve",
  "responseClass" => "ItemPocketDetail",
  "endpoint" => "/api/v2/item-pocket/{id}/",
  "notes" => "Pockets within the players bag used for storing items by category.",
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


MyApp.add_route('GET', '/api/v2/item/{id}/', {
  "resourcePath" => "/Items",
  "summary" => "Get item",
  "nickname" => "item_retrieve",
  "responseClass" => "ItemDetail",
  "endpoint" => "/api/v2/item/{id}/",
  "notes" => "An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.",
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

