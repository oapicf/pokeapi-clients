

#include "StatDetail_affecting_moves.h"

using namespace Tiny;

StatDetail_affecting_moves::StatDetail_affecting_moves()
{
	increase = std::list<StatDetail_affecting_moves_increase_inner>();
	decrease = std::list<StatDetail_affecting_moves_increase_inner>();
}

StatDetail_affecting_moves::StatDetail_affecting_moves(std::string jsonString)
{
	this->fromJson(jsonString);
}

StatDetail_affecting_moves::~StatDetail_affecting_moves()
{

}

void
StatDetail_affecting_moves::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *increaseKey = "increase";

    if(object.has_key(increaseKey))
    {
        bourne::json value = object[increaseKey];


        std::list<StatDetail_affecting_moves_increase_inner> increase_list;
        StatDetail_affecting_moves_increase_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            increase_list.push_back(element);
        }
        increase = increase_list;


    }

    const char *decreaseKey = "decrease";

    if(object.has_key(decreaseKey))
    {
        bourne::json value = object[decreaseKey];


        std::list<StatDetail_affecting_moves_increase_inner> decrease_list;
        StatDetail_affecting_moves_increase_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            decrease_list.push_back(element);
        }
        decrease = decrease_list;


    }


}

bourne::json
StatDetail_affecting_moves::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<StatDetail_affecting_moves_increase_inner> increase_list = getIncrease();
    bourne::json increase_arr = bourne::json::array();

    for(auto& var : increase_list)
    {
        StatDetail_affecting_moves_increase_inner obj = var;
        increase_arr.append(obj.toJson());
    }
    object["increase"] = increase_arr;






    std::list<StatDetail_affecting_moves_increase_inner> decrease_list = getDecrease();
    bourne::json decrease_arr = bourne::json::array();

    for(auto& var : decrease_list)
    {
        StatDetail_affecting_moves_increase_inner obj = var;
        decrease_arr.append(obj.toJson());
    }
    object["decrease"] = decrease_arr;




    return object;

}

std::list<StatDetail_affecting_moves_increase_inner>
StatDetail_affecting_moves::getIncrease()
{
	return increase;
}

void
StatDetail_affecting_moves::setIncrease(std::list<StatDetail_affecting_moves_increase_inner> increase)
{
	this->increase = increase;
}

std::list<StatDetail_affecting_moves_increase_inner>
StatDetail_affecting_moves::getDecrease()
{
	return decrease;
}

void
StatDetail_affecting_moves::setDecrease(std::list<StatDetail_affecting_moves_increase_inner> decrease)
{
	this->decrease = decrease;
}



