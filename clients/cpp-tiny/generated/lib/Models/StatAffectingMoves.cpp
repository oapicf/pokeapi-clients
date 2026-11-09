

#include "StatAffectingMoves.h"

using namespace Tiny;

StatAffectingMoves::StatAffectingMoves()
{
	increase = std::list<MoveStatChange>();
	decrease = std::list<MoveStatChange>();
}

StatAffectingMoves::StatAffectingMoves(std::string jsonString)
{
	this->fromJson(jsonString);
}

StatAffectingMoves::~StatAffectingMoves()
{

}

void
StatAffectingMoves::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *increaseKey = "increase";

    if(object.has_key(increaseKey))
    {
        bourne::json value = object[increaseKey];


        std::list<MoveStatChange> increase_list;
        MoveStatChange element;
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


        std::list<MoveStatChange> decrease_list;
        MoveStatChange element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            decrease_list.push_back(element);
        }
        decrease = decrease_list;


    }


}

bourne::json
StatAffectingMoves::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<MoveStatChange> increase_list = getIncrease();
    bourne::json increase_arr = bourne::json::array();

    for(auto& var : increase_list)
    {
        MoveStatChange obj = var;
        increase_arr.append(obj.toJson());
    }
    object["increase"] = increase_arr;






    std::list<MoveStatChange> decrease_list = getDecrease();
    bourne::json decrease_arr = bourne::json::array();

    for(auto& var : decrease_list)
    {
        MoveStatChange obj = var;
        decrease_arr.append(obj.toJson());
    }
    object["decrease"] = decrease_arr;




    return object;

}

std::list<MoveStatChange>
StatAffectingMoves::getIncrease()
{
	return increase;
}

void
StatAffectingMoves::setIncrease(std::list<MoveStatChange> increase)
{
	this->increase = increase;
}

std::list<MoveStatChange>
StatAffectingMoves::getDecrease()
{
	return decrease;
}

void
StatAffectingMoves::setDecrease(std::list<MoveStatChange> decrease)
{
	this->decrease = decrease;
}



