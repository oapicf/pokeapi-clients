
#include "PokemonMoveVersionGroup.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonMoveVersionGroup_level_learned_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "level_learned_at", 1
    };

    PokemonMoveVersionGroup obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLevelLearnedAt());








}




void test_PokemonMoveVersionGroup_order_is_assigned_from_json()
{
    bourne::json input =
    {
        "order", 1
    };

    PokemonMoveVersionGroup obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrder());








}



void test_PokemonMoveVersionGroup_level_learned_at_is_converted_to_json()
{
    bourne::json input =
    {
        "level_learned_at", 1
    };

    PokemonMoveVersionGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["level_learned_at"] == output["level_learned_at"]);




}




void test_PokemonMoveVersionGroup_order_is_converted_to_json()
{
    bourne::json input =
    {
        "order", 1
    };

    PokemonMoveVersionGroup obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order"] == output["order"]);




}


