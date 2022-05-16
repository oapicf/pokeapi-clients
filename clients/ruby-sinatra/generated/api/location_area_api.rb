require 'json'


MyApp.add_route('GET', '/api/v2/api/v2/location-area/', {
  "resourcePath" => "/LocationArea",
  "summary" => "",
  "nickname" => "location_area_list",
  "responseClass" => "String",
  "endpoint" => "/api/v2/location-area/",
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


MyApp.add_route('GET', '/api/v2/api/v2/location-area/{id}/', {
  "resourcePath" => "/LocationArea",
  "summary" => "",
  "nickname" => "location_area_read",
  "responseClass" => "String",
  "endpoint" => "/api/v2/location-area/{id}/",
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

