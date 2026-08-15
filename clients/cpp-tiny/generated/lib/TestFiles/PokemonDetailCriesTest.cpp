
#include "PokemonDetail_cries.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonDetail_cries_latest_is_assigned_from_json()
{


    bourne::json input =
    {
        "latest", "hello"
    };

    PokemonDetail_cries obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLatest().c_str());






}


void test_PokemonDetail_cries_legacy_is_assigned_from_json()
{


    bourne::json input =
    {
        "legacy", "hello"
    };

    PokemonDetail_cries obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getLegacy().c_str());






}



void test_PokemonDetail_cries_latest_is_converted_to_json()
{

    bourne::json input =
    {
        "latest", "hello"
    };

    PokemonDetail_cries obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["latest"] == output["latest"]);



}


void test_PokemonDetail_cries_legacy_is_converted_to_json()
{

    bourne::json input =
    {
        "legacy", "hello"
    };

    PokemonDetail_cries obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["legacy"] == output["legacy"]);



}


