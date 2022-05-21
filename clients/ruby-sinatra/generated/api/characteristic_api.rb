require 'json'


MyApp.add_route('GET', '/api/v2/characteristic/', {
  "resourcePath" => "/Characteristic",
  "summary" => "",
  "nickname" => "characteristic_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/characteristic/",
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


MyApp.add_route('GET', '/api/v2/characteristic/{id}/', {
  "resourcePath" => "/Characteristic",
  "summary" => "",
  "nickname" => "characteristic_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/characteristic/{id}/",
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

