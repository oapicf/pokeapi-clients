
#include "PokemonDetail_moves_inner_version_group_details_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonDetail_moves_inner_version_group_details_inner_level_learned_at_is_assigned_from_json()
{
    bourne::json input =
    {
        "level_learned_at", 1
    };

    PokemonDetail_moves_inner_version_group_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLevelLearnedAt());








}





void test_PokemonDetail_moves_inner_version_group_details_inner_level_learned_at_is_converted_to_json()
{
    bourne::json input =
    {
        "level_learned_at", 1
    };

    PokemonDetail_moves_inner_version_group_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["level_learned_at"] == output["level_learned_at"]);




}




