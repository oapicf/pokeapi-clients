
#include "PokemonEncounterVersionDetailResponse.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_PokemonEncounterVersionDetailResponse_max_chance_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_chance", 1
    };

    PokemonEncounterVersionDetailResponse obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxChance());








}





void test_PokemonEncounterVersionDetailResponse_max_chance_is_converted_to_json()
{
    bourne::json input =
    {
        "max_chance", 1
    };

    PokemonEncounterVersionDetailResponse obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_chance"] == output["max_chance"]);




}



