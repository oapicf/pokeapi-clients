
#include "PokemonShapeDetail_names_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonShapeDetail_names_inner_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    PokemonShapeDetail_names_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}


void test_PokemonShapeDetail_names_inner_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    PokemonShapeDetail_names_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}



void test_PokemonShapeDetail_names_inner_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    PokemonShapeDetail_names_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


void test_PokemonShapeDetail_names_inner_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    PokemonShapeDetail_names_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


