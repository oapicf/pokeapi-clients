require 'json'


MyApp.add_route('GET', '/api/v2/stat/', {
  "resourcePath" => "/Stat",
  "summary" => "",
  "nickname" => "stat_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/stat/",
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


MyApp.add_route('GET', '/api/v2/stat/{id}/', {
  "resourcePath" => "/Stat",
  "summary" => "",
  "nickname" => "stat_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/stat/{id}/",
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

