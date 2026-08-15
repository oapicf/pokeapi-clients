
#include "MoveDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MoveDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    MoveDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_MoveDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    MoveDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_MoveDetail_accuracy_is_assigned_from_json()
{
    bourne::json input =
    {
        "accuracy", 1
    };

    MoveDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAccuracy());








}


void test_MoveDetail_effect_chance_is_assigned_from_json()
{
    bourne::json input =
    {
        "effect_chance", 1
    };

    MoveDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEffectChance());








}


void test_MoveDetail_pp_is_assigned_from_json()
{
    bourne::json input =
    {
        "pp", 1
    };

    MoveDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPp());








}


void test_MoveDetail_priority_is_assigned_from_json()
{
    bourne::json input =
    {
        "priority", 1
    };

    MoveDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPriority());








}


void test_MoveDetail_power_is_assigned_from_json()
{
    bourne::json input =
    {
        "power", 1
    };

    MoveDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPower());








}




















void test_MoveDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    MoveDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_MoveDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    MoveDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_MoveDetail_accuracy_is_converted_to_json()
{
    bourne::json input =
    {
        "accuracy", 1
    };

    MoveDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accuracy"] == output["accuracy"]);




}


void test_MoveDetail_effect_chance_is_converted_to_json()
{
    bourne::json input =
    {
        "effect_chance", 1
    };

    MoveDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["effect_chance"] == output["effect_chance"]);




}


void test_MoveDetail_pp_is_converted_to_json()
{
    bourne::json input =
    {
        "pp", 1
    };

    MoveDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pp"] == output["pp"]);




}


void test_MoveDetail_priority_is_converted_to_json()
{
    bourne::json input =
    {
        "priority", 1
    };

    MoveDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["priority"] == output["priority"]);




}


void test_MoveDetail_power_is_converted_to_json()
{
    bourne::json input =
    {
        "power", 1
    };

    MoveDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["power"] == output["power"]);




}



















