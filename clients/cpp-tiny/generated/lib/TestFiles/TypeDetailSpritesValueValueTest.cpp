
#include "TypeDetail_sprites_value_value.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TypeDetail_sprites_value_value_nameicon_is_assigned_from_json()
{


    bourne::json input =
    {
        "nameicon", "hello"
    };

    TypeDetail_sprites_value_value obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNameicon().c_str());






}



void test_TypeDetail_sprites_value_value_nameicon_is_converted_to_json()
{

    bourne::json input =
    {
        "nameicon", "hello"
    };

    TypeDetail_sprites_value_value obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["nameicon"] == output["nameicon"]);



}


