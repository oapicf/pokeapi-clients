
#include "LanguageDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LanguageDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    LanguageDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_LanguageDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    LanguageDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_LanguageDetail_official_is_assigned_from_json()
{




    bourne::json input =
    {
        "official", true
    };

    LanguageDetail obj(input.dump());

    TEST_ASSERT(true == obj.isOfficial());




}


void test_LanguageDetail_iso639_is_assigned_from_json()
{


    bourne::json input =
    {
        "iso639", "hello"
    };

    LanguageDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIso639().c_str());






}


void test_LanguageDetail_iso3166_is_assigned_from_json()
{


    bourne::json input =
    {
        "iso3166", "hello"
    };

    LanguageDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIso3166().c_str());






}




void test_LanguageDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    LanguageDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_LanguageDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    LanguageDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_LanguageDetail_official_is_converted_to_json()
{


    bourne::json input =
    {
        "official", true
    };

    LanguageDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["official"] == output["official"]);


}


void test_LanguageDetail_iso639_is_converted_to_json()
{

    bourne::json input =
    {
        "iso639", "hello"
    };

    LanguageDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iso639"] == output["iso639"]);



}


void test_LanguageDetail_iso3166_is_converted_to_json()
{

    bourne::json input =
    {
        "iso3166", "hello"
    };

    LanguageDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["iso3166"] == output["iso3166"]);



}



