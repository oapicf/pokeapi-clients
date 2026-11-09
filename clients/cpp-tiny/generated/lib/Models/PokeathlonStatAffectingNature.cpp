

#include "PokeathlonStatAffectingNature.h"

using namespace Tiny;

PokeathlonStatAffectingNature::PokeathlonStatAffectingNature()
{
	max_change = int(0);
	nature = null;
}

PokeathlonStatAffectingNature::PokeathlonStatAffectingNature(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokeathlonStatAffectingNature::~PokeathlonStatAffectingNature()
{

}

void
PokeathlonStatAffectingNature::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *max_changeKey = "max_change";

    if(object.has_key(max_changeKey))
    {
        bourne::json value = object[max_changeKey];



        jsonToValue(&max_change, value, "int");


    }

    const char *natureKey = "nature";

    if(object.has_key(natureKey))
    {
        bourne::json value = object[natureKey];




        NatureSummary* obj = &nature;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokeathlonStatAffectingNature::toJson()
{
    bourne::json object = bourne::json::object();





    object["max_change"] = getMaxChange();







	object["nature"] = getNature().toJson();


    return object;

}

int
PokeathlonStatAffectingNature::getMaxChange()
{
	return max_change;
}

void
PokeathlonStatAffectingNature::setMaxChange(int max_change)
{
	this->max_change = max_change;
}

NatureSummary
PokeathlonStatAffectingNature::getNature()
{
	return nature;
}

void
PokeathlonStatAffectingNature::setNature(NatureSummary nature)
{
	this->nature = nature;
}



