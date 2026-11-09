

#include "PokeathlonStatAffectingNatures.h"

using namespace Tiny;

PokeathlonStatAffectingNatures::PokeathlonStatAffectingNatures()
{
	increase = std::list<PokeathlonStatAffectingNature>();
	decrease = std::list<PokeathlonStatAffectingNature>();
}

PokeathlonStatAffectingNatures::PokeathlonStatAffectingNatures(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokeathlonStatAffectingNatures::~PokeathlonStatAffectingNatures()
{

}

void
PokeathlonStatAffectingNatures::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *increaseKey = "increase";

    if(object.has_key(increaseKey))
    {
        bourne::json value = object[increaseKey];


        std::list<PokeathlonStatAffectingNature> increase_list;
        PokeathlonStatAffectingNature element;
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


        std::list<PokeathlonStatAffectingNature> decrease_list;
        PokeathlonStatAffectingNature element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            decrease_list.push_back(element);
        }
        decrease = decrease_list;


    }


}

bourne::json
PokeathlonStatAffectingNatures::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<PokeathlonStatAffectingNature> increase_list = getIncrease();
    bourne::json increase_arr = bourne::json::array();

    for(auto& var : increase_list)
    {
        PokeathlonStatAffectingNature obj = var;
        increase_arr.append(obj.toJson());
    }
    object["increase"] = increase_arr;






    std::list<PokeathlonStatAffectingNature> decrease_list = getDecrease();
    bourne::json decrease_arr = bourne::json::array();

    for(auto& var : decrease_list)
    {
        PokeathlonStatAffectingNature obj = var;
        decrease_arr.append(obj.toJson());
    }
    object["decrease"] = decrease_arr;




    return object;

}

std::list<PokeathlonStatAffectingNature>
PokeathlonStatAffectingNatures::getIncrease()
{
	return increase;
}

void
PokeathlonStatAffectingNatures::setIncrease(std::list<PokeathlonStatAffectingNature> increase)
{
	this->increase = increase;
}

std::list<PokeathlonStatAffectingNature>
PokeathlonStatAffectingNatures::getDecrease()
{
	return decrease;
}

void
PokeathlonStatAffectingNatures::setDecrease(std::list<PokeathlonStatAffectingNature> decrease)
{
	this->decrease = decrease;
}



