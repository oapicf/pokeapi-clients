=begin
No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 1.0.0
Generated by: https://github.com/openapitools/openapi-generator.git

=end
class PokedexController < ApplicationController

  def pokedex_list
    # Your code here

    render json: {"message" => "yes, it worked"}
  end

  def pokedex_read
    # Your code here

    render json: {"message" => "yes, it worked"}
  end
end
