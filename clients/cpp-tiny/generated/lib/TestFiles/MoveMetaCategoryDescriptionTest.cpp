
#include "MoveMetaCategoryDescription.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MoveMetaCategoryDescription_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    MoveMetaCategoryDescription obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}




void test_MoveMetaCategoryDescription_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    MoveMetaCategoryDescription obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}



