
#include "PokemonDetail_abilities_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"




void test_PokemonDetail_abilities_inner_is_hidden_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_hidden", true
    };

    PokemonDetail_abilities_inner obj(input.dump());

    TEST_ASSERT(true == obj.isIsHidden());




}


void test_PokemonDetail_abilities_inner_slot_is_assigned_from_json()
{
    bourne::json input =
    {
        "slot", 1
    };

    PokemonDetail_abilities_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSlot());








}




void test_PokemonDetail_abilities_inner_is_hidden_is_converted_to_json()
{


    bourne::json input =
    {
        "is_hidden", true
    };

    PokemonDetail_abilities_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_hidden"] == output["is_hidden"]);


}


void test_PokemonDetail_abilities_inner_slot_is_converted_to_json()
{
    bourne::json input =
    {
        "slot", 1
    };

    PokemonDetail_abilities_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["slot"] == output["slot"]);




}


