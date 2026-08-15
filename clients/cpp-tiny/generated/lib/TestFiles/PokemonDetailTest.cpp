
#include "PokemonDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    PokemonDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_PokemonDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    PokemonDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_PokemonDetail_base_experience_is_assigned_from_json()
{
    bourne::json input =
    {
        "base_experience", 1
    };

    PokemonDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBaseExperience());








}


void test_PokemonDetail_height_is_assigned_from_json()
{
    bourne::json input =
    {
        "height", 1
    };

    PokemonDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHeight());








}


void test_PokemonDetail_is_default_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_default", true
    };

    PokemonDetail obj(input.dump());

    TEST_ASSERT(true == obj.isIsDefault());




}


void test_PokemonDetail_order_is_assigned_from_json()
{
    bourne::json input =
    {
        "order", 1
    };

    PokemonDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrder());








}


void test_PokemonDetail_weight_is_assigned_from_json()
{
    bourne::json input =
    {
        "weight", 1
    };

    PokemonDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWeight());








}







void test_PokemonDetail_location_area_encounters_is_assigned_from_json()
{


    bourne::json input =
    {
        "location_area_encounters", "hello"
    };

    PokemonDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLocationAreaEncounters().c_str());






}










void test_PokemonDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    PokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_PokemonDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    PokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_PokemonDetail_base_experience_is_converted_to_json()
{
    bourne::json input =
    {
        "base_experience", 1
    };

    PokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["base_experience"] == output["base_experience"]);




}


void test_PokemonDetail_height_is_converted_to_json()
{
    bourne::json input =
    {
        "height", 1
    };

    PokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["height"] == output["height"]);




}


void test_PokemonDetail_is_default_is_converted_to_json()
{


    bourne::json input =
    {
        "is_default", true
    };

    PokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_default"] == output["is_default"]);


}


void test_PokemonDetail_order_is_converted_to_json()
{
    bourne::json input =
    {
        "order", 1
    };

    PokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order"] == output["order"]);




}


void test_PokemonDetail_weight_is_converted_to_json()
{
    bourne::json input =
    {
        "weight", 1
    };

    PokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["weight"] == output["weight"]);




}







void test_PokemonDetail_location_area_encounters_is_converted_to_json()
{

    bourne::json input =
    {
        "location_area_encounters", "hello"
    };

    PokemonDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["location_area_encounters"] == output["location_area_encounters"]);



}









