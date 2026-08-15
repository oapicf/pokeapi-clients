
#include "PokemonFormDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PokemonFormDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    PokemonFormDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_PokemonFormDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    PokemonFormDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_PokemonFormDetail_order_is_assigned_from_json()
{
    bourne::json input =
    {
        "order", 1
    };

    PokemonFormDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrder());








}


void test_PokemonFormDetail_form_order_is_assigned_from_json()
{
    bourne::json input =
    {
        "form_order", 1
    };

    PokemonFormDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFormOrder());








}


void test_PokemonFormDetail_is_default_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_default", true
    };

    PokemonFormDetail obj(input.dump());

    TEST_ASSERT(true == obj.isIsDefault());




}


void test_PokemonFormDetail_is_battle_only_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_battle_only", true
    };

    PokemonFormDetail obj(input.dump());

    TEST_ASSERT(true == obj.isIsBattleOnly());




}


void test_PokemonFormDetail_is_mega_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_mega", true
    };

    PokemonFormDetail obj(input.dump());

    TEST_ASSERT(true == obj.isIsMega());




}


void test_PokemonFormDetail_form_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "form_name", "hello"
    };

    PokemonFormDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFormName().c_str());






}









void test_PokemonFormDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    PokemonFormDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_PokemonFormDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    PokemonFormDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_PokemonFormDetail_order_is_converted_to_json()
{
    bourne::json input =
    {
        "order", 1
    };

    PokemonFormDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order"] == output["order"]);




}


void test_PokemonFormDetail_form_order_is_converted_to_json()
{
    bourne::json input =
    {
        "form_order", 1
    };

    PokemonFormDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["form_order"] == output["form_order"]);




}


void test_PokemonFormDetail_is_default_is_converted_to_json()
{


    bourne::json input =
    {
        "is_default", true
    };

    PokemonFormDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_default"] == output["is_default"]);


}


void test_PokemonFormDetail_is_battle_only_is_converted_to_json()
{


    bourne::json input =
    {
        "is_battle_only", true
    };

    PokemonFormDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_battle_only"] == output["is_battle_only"]);


}


void test_PokemonFormDetail_is_mega_is_converted_to_json()
{


    bourne::json input =
    {
        "is_mega", true
    };

    PokemonFormDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_mega"] == output["is_mega"]);


}


void test_PokemonFormDetail_form_name_is_converted_to_json()
{

    bourne::json input =
    {
        "form_name", "hello"
    };

    PokemonFormDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["form_name"] == output["form_name"]);



}








