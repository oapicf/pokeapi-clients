require 'json'


MyApp.add_route('GET', '/api/v2/api/v2/move-battle-style/', {
  "resourcePath" => "/MoveBattleStyle",
  "summary" => "",
  "nickname" => "move_battle_style_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/move-battle-style/",
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


MyApp.add_route('GET', '/api/v2/api/v2/move-battle-style/{id}/', {
  "resourcePath" => "/MoveBattleStyle",
  "summary" => "",
  "nickname" => "move_battle_style_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/move-battle-style/{id}/",
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

