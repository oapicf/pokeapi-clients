require 'json'


MyApp.add_route('GET', '/api/v2/item-fling-effect/', {
  "resourcePath" => "/ItemFlingEffect",
  "summary" => "",
  "nickname" => "item_fling_effect_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/item-fling-effect/",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "offset",
      "description" => "",
      "dataType" => "Integer",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/api/v2/item-fling-effect/{id}/', {
  "resourcePath" => "/ItemFlingEffect",
  "summary" => "",
  "nickname" => "item_fling_effect_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/item-fling-effect/{id}/",
  "notes" => "",
  "parameters" => [
    {
      "name" => "id",
      "description" => "",
      "dataType" => "Integer",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

