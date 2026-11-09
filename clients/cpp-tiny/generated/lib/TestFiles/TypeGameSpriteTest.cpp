
#include "TypeGameSprite.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TypeGameSprite_name_icon_is_assigned_from_json()
{


    bourne::json input =
    {
        "name_icon", "hello"
    };

    TypeGameSprite obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNameIcon().c_str());






}


void test_TypeGameSprite_symbol_icon_is_assigned_from_json()
{


    bourne::json input =
    {
        "symbol_icon", "hello"
    };

    TypeGameSprite obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSymbolIcon().c_str());






}



void test_TypeGameSprite_name_icon_is_converted_to_json()
{

    bourne::json input =
    {
        "name_icon", "hello"
    };

    TypeGameSprite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name_icon"] == output["name_icon"]);



}


void test_TypeGameSprite_symbol_icon_is_converted_to_json()
{

    bourne::json input =
    {
        "symbol_icon", "hello"
    };

    TypeGameSprite obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["symbol_icon"] == output["symbol_icon"]);



}


