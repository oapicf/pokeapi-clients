
#include "PokemonHeldItemVersion.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonHeldItemVersion_rarity_is_assigned_from_json()
{
    bourne::json input =
    {
        "rarity", 1
    };

    PokemonHeldItemVersion obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRarity());








}




void test_PokemonHeldItemVersion_rarity_is_converted_to_json()
{
    bourne::json input =
    {
        "rarity", 1
    };

    PokemonHeldItemVersion obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rarity"] == output["rarity"]);




}



