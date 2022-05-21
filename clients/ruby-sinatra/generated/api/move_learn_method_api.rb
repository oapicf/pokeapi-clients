require 'json'


MyApp.add_route('GET', '/api/v2/move-learn-method/', {
  "resourcePath" => "/MoveLearnMethod",
  "summary" => "",
  "nickname" => "move_learn_method_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/move-learn-method/",
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


MyApp.add_route('GET', '/api/v2/move-learn-method/{id}/', {
  "resourcePath" => "/MoveLearnMethod",
  "summary" => "",
  "nickname" => "move_learn_method_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/move-learn-method/{id}/",
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

