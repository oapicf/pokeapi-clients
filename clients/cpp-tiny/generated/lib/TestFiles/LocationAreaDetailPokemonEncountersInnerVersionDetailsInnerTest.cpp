
#include "LocationAreaDetail_pokemon_encounters_inner_version_details_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_LocationAreaDetail_pokemon_encounters_inner_version_details_inner_max_chance_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_chance", 1
    };

    LocationAreaDetail_pokemon_encounters_inner_version_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxChance());








}





void test_LocationAreaDetail_pokemon_encounters_inner_version_details_inner_max_chance_is_converted_to_json()
{
    bourne::json input =
    {
        "max_chance", 1
    };

    LocationAreaDetail_pokemon_encounters_inner_version_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_chance"] == output["max_chance"]);




}



