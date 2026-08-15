
#include "TypeDetail_pokemon_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TypeDetail_pokemon_inner_slot_is_assigned_from_json()
{
    bourne::json input =
    {
        "slot", 1
    };

    TypeDetail_pokemon_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSlot());








}




void test_TypeDetail_pokemon_inner_slot_is_converted_to_json()
{
    bourne::json input =
    {
        "slot", 1
    };

    TypeDetail_pokemon_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["slot"] == output["slot"]);




}



