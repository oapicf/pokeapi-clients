require 'json'


MyApp.add_route('GET', '/api/v2/item/', {
  "resourcePath" => "/Item",
  "summary" => "",
  "nickname" => "item_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/item/",
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


MyApp.add_route('GET', '/api/v2/item/{id}/', {
  "resourcePath" => "/Item",
  "summary" => "",
  "nickname" => "item_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/item/{id}/",
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

