
#include "TypeDetail_pokemon_inner_pokemon.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TypeDetail_pokemon_inner_pokemon_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    TypeDetail_pokemon_inner_pokemon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_TypeDetail_pokemon_inner_pokemon_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    TypeDetail_pokemon_inner_pokemon obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_TypeDetail_pokemon_inner_pokemon_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    TypeDetail_pokemon_inner_pokemon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_TypeDetail_pokemon_inner_pokemon_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    TypeDetail_pokemon_inner_pokemon obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


