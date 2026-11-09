

#include "StatAffectingNatures.h"

using namespace Tiny;

StatAffectingNatures::StatAffectingNatures()
{
	increase = std::list<NatureSummary>();
	decrease = std::list<NatureSummary>();
}

StatAffectingNatures::StatAffectingNatures(std::string jsonString)
{
	this->fromJson(jsonString);
}

StatAffectingNatures::~StatAffectingNatures()
{

}

void
StatAffectingNatures::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *increaseKey = "increase";

    if(object.has_key(increaseKey))
    {
        bourne::json value = object[increaseKey];


        std::list<NatureSummary> increase_list;
        NatureSummary element;
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


        std::list<NatureSummary> decrease_list;
        NatureSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            decrease_list.push_back(element);
        }
        decrease = decrease_list;


    }


}

bourne::json
StatAffectingNatures::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<NatureSummary> increase_list = getIncrease();
    bourne::json increase_arr = bourne::json::array();

    for(auto& var : increase_list)
    {
        NatureSummary obj = var;
        increase_arr.append(obj.toJson());
    }
    object["increase"] = increase_arr;






    std::list<NatureSummary> decrease_list = getDecrease();
    bourne::json decrease_arr = bourne::json::array();

    for(auto& var : decrease_list)
    {
        NatureSummary obj = var;
        decrease_arr.append(obj.toJson());
    }
    object["decrease"] = decrease_arr;




    return object;

}

std::list<NatureSummary>
StatAffectingNatures::getIncrease()
{
	return increase;
}

void
StatAffectingNatures::setIncrease(std::list<NatureSummary> increase)
{
	this->increase = increase;
}

std::list<NatureSummary>
StatAffectingNatures::getDecrease()
{
	return decrease;
}

void
StatAffectingNatures::setDecrease(std::list<NatureSummary> decrease)
{
	this->decrease = decrease;
}



