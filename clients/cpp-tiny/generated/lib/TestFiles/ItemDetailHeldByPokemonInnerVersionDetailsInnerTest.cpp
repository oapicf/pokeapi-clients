
#include "ItemDetail_held_by_pokemon_inner_version_details_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ItemDetail_held_by_pokemon_inner_version_details_inner_rarity_is_assigned_from_json()
{
    bourne::json input =
    {
        "rarity", 1
    };

    ItemDetail_held_by_pokemon_inner_version_details_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRarity());








}




void test_ItemDetail_held_by_pokemon_inner_version_details_inner_rarity_is_converted_to_json()
{
    bourne::json input =
    {
        "rarity", 1
    };

    ItemDetail_held_by_pokemon_inner_version_details_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rarity"] == output["rarity"]);




}



