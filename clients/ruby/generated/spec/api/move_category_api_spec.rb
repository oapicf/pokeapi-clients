=begin
#No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 20220523

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.4.0

=end

require 'spec_helper'
require 'json'

# Unit tests for PokeApiClient::MoveCategoryApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'MoveCategoryApi' do
  before do
    # run before each test
    @api_instance = PokeApiClient::MoveCategoryApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MoveCategoryApi' do
    it 'should create an instance of MoveCategoryApi' do
      expect(@api_instance).to be_instance_of(PokeApiClient::MoveCategoryApi)
    end
  end

  # unit tests for move_category_list
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :limit 
  # @option opts [Integer] :offset 
  # @return [String]
  describe 'move_category_list test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for move_category_read
  # @param id 
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'move_category_read test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end