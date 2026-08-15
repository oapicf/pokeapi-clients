
#include "AbilityEffectText.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_AbilityEffectText_effect_is_assigned_from_json()
{


    bourne::json input =
    {
        "effect", "hello"
    };

    AbilityEffectText obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getEffect().c_str());






}


void test_AbilityEffectText_short_effect_is_assigned_from_json()
{


    bourne::json input =
    {
        "short_effect", "hello"
    };

    AbilityEffectText obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getShortEffect().c_str());






}




void test_AbilityEffectText_effect_is_converted_to_json()
{

    bourne::json input =
    {
        "effect", "hello"
    };

    AbilityEffectText obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["effect"] == output["effect"]);



}


void test_AbilityEffectText_short_effect_is_converted_to_json()
{

    bourne::json input =
    {
        "short_effect", "hello"
    };

    AbilityEffectText obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["short_effect"] == output["short_effect"]);



}



