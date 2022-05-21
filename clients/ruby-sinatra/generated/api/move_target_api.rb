require 'json'


MyApp.add_route('GET', '/api/v2/move-target/', {
  "resourcePath" => "/MoveTarget",
  "summary" => "",
  "nickname" => "move_target_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/move-target/",
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


MyApp.add_route('GET', '/api/v2/move-target/{id}/', {
  "resourcePath" => "/MoveTarget",
  "summary" => "",
  "nickname" => "move_target_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/move-target/{id}/",
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

