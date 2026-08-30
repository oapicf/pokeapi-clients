

#include "PokeathlonStatDetail_affecting_natures.h"

using namespace Tiny;

PokeathlonStatDetail_affecting_natures::PokeathlonStatDetail_affecting_natures()
{
	decrease = std::list<PokeathlonStatDetail_affecting_natures_decrease_inner>();
	increase = std::list<PokeathlonStatDetail_affecting_natures_increase_inner>();
}

PokeathlonStatDetail_affecting_natures::PokeathlonStatDetail_affecting_natures(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokeathlonStatDetail_affecting_natures::~PokeathlonStatDetail_affecting_natures()
{

}

void
PokeathlonStatDetail_affecting_natures::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *decreaseKey = "decrease";

    if(object.has_key(decreaseKey))
    {
        bourne::json value = object[decreaseKey];


        std::list<PokeathlonStatDetail_affecting_natures_decrease_inner> decrease_list;
        PokeathlonStatDetail_affecting_natures_decrease_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            decrease_list.push_back(element);
        }
        decrease = decrease_list;


    }

    const char *increaseKey = "increase";

    if(object.has_key(increaseKey))
    {
        bourne::json value = object[increaseKey];


        std::list<PokeathlonStatDetail_affecting_natures_increase_inner> increase_list;
        PokeathlonStatDetail_affecting_natures_increase_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            increase_list.push_back(element);
        }
        increase = increase_list;


    }


}

bourne::json
PokeathlonStatDetail_affecting_natures::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<PokeathlonStatDetail_affecting_natures_decrease_inner> decrease_list = getDecrease();
    bourne::json decrease_arr = bourne::json::array();

    for(auto& var : decrease_list)
    {
        PokeathlonStatDetail_affecting_natures_decrease_inner obj = var;
        decrease_arr.append(obj.toJson());
    }
    object["decrease"] = decrease_arr;






    std::list<PokeathlonStatDetail_affecting_natures_increase_inner> increase_list = getIncrease();
    bourne::json increase_arr = bourne::json::array();

    for(auto& var : increase_list)
    {
        PokeathlonStatDetail_affecting_natures_increase_inner obj = var;
        increase_arr.append(obj.toJson());
    }
    object["increase"] = increase_arr;




    return object;

}

std::list<PokeathlonStatDetail_affecting_natures_decrease_inner>
PokeathlonStatDetail_affecting_natures::getDecrease()
{
	return decrease;
}

void
PokeathlonStatDetail_affecting_natures::setDecrease(std::list<PokeathlonStatDetail_affecting_natures_decrease_inner> decrease)
{
	this->decrease = decrease;
}

std::list<PokeathlonStatDetail_affecting_natures_increase_inner>
PokeathlonStatDetail_affecting_natures::getIncrease()
{
	return increase;
}

void
PokeathlonStatDetail_affecting_natures::setIncrease(std::list<PokeathlonStatDetail_affecting_natures_increase_inner> increase)
{
	this->increase = increase;
}



