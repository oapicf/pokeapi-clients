
#include "EvolutionVariableDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_EvolutionVariableDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    EvolutionVariableDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_EvolutionVariableDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    EvolutionVariableDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_EvolutionVariableDetail_symbol_is_assigned_from_json()
{


    bourne::json input =
    {
        "symbol", "hello"
    };

    EvolutionVariableDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSymbol().c_str());






}


void test_EvolutionVariableDetail_data_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "data_type", "hello"
    };

    EvolutionVariableDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDataType().c_str());






}


void test_EvolutionVariableDetail_source_is_assigned_from_json()
{


    bourne::json input =
    {
        "source", "hello"
    };

    EvolutionVariableDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSource().c_str());






}






void test_EvolutionVariableDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    EvolutionVariableDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_EvolutionVariableDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    EvolutionVariableDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_EvolutionVariableDetail_symbol_is_converted_to_json()
{

    bourne::json input =
    {
        "symbol", "hello"
    };

    EvolutionVariableDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["symbol"] == output["symbol"]);



}


void test_EvolutionVariableDetail_data_type_is_converted_to_json()
{

    bourne::json input =
    {
        "data_type", "hello"
    };

    EvolutionVariableDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["data_type"] == output["data_type"]);



}


void test_EvolutionVariableDetail_source_is_converted_to_json()
{

    bourne::json input =
    {
        "source", "hello"
    };

    EvolutionVariableDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["source"] == output["source"]);



}





