
#include "MoveDetail_effect_changes_inner_effect_entries_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MoveDetail_effect_changes_inner_effect_entries_inner_effect_is_assigned_from_json()
{


    bourne::json input =
    {
        "effect", "hello"
    };

    MoveDetail_effect_changes_inner_effect_entries_inner obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEffect().c_str());






}




void test_MoveDetail_effect_changes_inner_effect_entries_inner_effect_is_converted_to_json()
{

    bourne::json input =
    {
        "effect", "hello"
    };

    MoveDetail_effect_changes_inner_effect_entries_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["effect"] == output["effect"]);



}



