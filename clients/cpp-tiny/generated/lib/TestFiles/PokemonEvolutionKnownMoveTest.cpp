
#include "PokemonEvolution_known_move.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonEvolution_known_move_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    PokemonEvolution_known_move obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_PokemonEvolution_known_move_url_is_assigned_from_json()
{


    bourne::json input =
    {
        "url", "hello"
    };

    PokemonEvolution_known_move obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getUrl().c_str());






}



void test_PokemonEvolution_known_move_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    PokemonEvolution_known_move obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_PokemonEvolution_known_move_url_is_converted_to_json()
{

    bourne::json input =
    {
        "url", "hello"
    };

    PokemonEvolution_known_move obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["url"] == output["url"]);



}


