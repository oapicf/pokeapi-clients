
#include "PokemonCries.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonCries_latest_is_assigned_from_json()
{


    bourne::json input =
    {
        "latest", "hello"
    };

    PokemonCries obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLatest().c_str());






}


void test_PokemonCries_legacy_is_assigned_from_json()
{


    bourne::json input =
    {
        "legacy", "hello"
    };

    PokemonCries obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLegacy().c_str());






}



void test_PokemonCries_latest_is_converted_to_json()
{

    bourne::json input =
    {
        "latest", "hello"
    };

    PokemonCries obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["latest"] == output["latest"]);



}


void test_PokemonCries_legacy_is_converted_to_json()
{

    bourne::json input =
    {
        "legacy", "hello"
    };

    PokemonCries obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["legacy"] == output["legacy"]);



}


