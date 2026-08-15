
#include "StatDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_StatDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    StatDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_StatDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    StatDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_StatDetail_game_index_is_assigned_from_json()
{
    bourne::json input =
    {
        "game_index", 1
    };

    StatDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGameIndex());








}


void test_StatDetail_is_battle_only_is_assigned_from_json()
{




    bourne::json input =
    {
        "is_battle_only", true
    };

    StatDetail obj(input.dump());

    TEST_ASSERT(true == obj.isIsBattleOnly());




}








void test_StatDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    StatDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_StatDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    StatDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_StatDetail_game_index_is_converted_to_json()
{
    bourne::json input =
    {
        "game_index", 1
    };

    StatDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["game_index"] == output["game_index"]);




}


void test_StatDetail_is_battle_only_is_converted_to_json()
{


    bourne::json input =
    {
        "is_battle_only", true
    };

    StatDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["is_battle_only"] == output["is_battle_only"]);


}







