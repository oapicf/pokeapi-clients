=begin
#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 20220523

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

require 'spec_helper'
require 'json'

# Unit tests for PokeApiClient::PokedexApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'PokedexApi' do
  before do
    # run before each test
    @api_instance = PokeApiClient::PokedexApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PokedexApi' do
    it 'should create an instance of PokedexApi' do
      expect(@api_instance).to be_instance_of(PokeApiClient::PokedexApi)
    end
  end

  # unit tests for pokedex_list
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit 
  # @option opts [Integer] :offset 
  # @return [String]
  describe 'pokedex_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for pokedex_read
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'pokedex_read test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end