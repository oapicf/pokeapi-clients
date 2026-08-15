
#include "ContestEffectFlavorText.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ContestEffectFlavorText_flavor_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "flavor_text", "hello"
    };

    ContestEffectFlavorText obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFlavorText().c_str());






}




void test_ContestEffectFlavorText_flavor_text_is_converted_to_json()
{

    bourne::json input =
    {
        "flavor_text", "hello"
    };

    ContestEffectFlavorText obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["flavor_text"] == output["flavor_text"]);



}



