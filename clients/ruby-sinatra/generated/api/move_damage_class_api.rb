require 'json'


MyApp.add_route('GET', '/api/v2/move-damage-class/', {
  "resourcePath" => "/MoveDamageClass",
  "summary" => "",
  "nickname" => "move_damage_class_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/move-damage-class/",
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


MyApp.add_route('GET', '/api/v2/move-damage-class/{id}/', {
  "resourcePath" => "/MoveDamageClass",
  "summary" => "",
  "nickname" => "move_damage_class_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/move-damage-class/{id}/",
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

