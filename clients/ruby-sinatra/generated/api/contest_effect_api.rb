require 'json'


MyApp.add_route('GET', '/api/v2/api/v2/contest-effect/', {
  "resourcePath" => "/ContestEffect",
  "summary" => "",
  "nickname" => "contest_effect_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/contest-effect/",
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


MyApp.add_route('GET', '/api/v2/api/v2/contest-effect/{id}/', {
  "resourcePath" => "/ContestEffect",
  "summary" => "",
  "nickname" => "contest_effect_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/contest-effect/{id}/",
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

