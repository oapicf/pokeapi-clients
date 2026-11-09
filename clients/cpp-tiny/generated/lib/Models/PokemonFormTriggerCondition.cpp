

#include "PokemonFormTriggerCondition.h"

using namespace Tiny;

PokemonFormTriggerCondition::PokemonFormTriggerCondition()
{
	trigger = std::string();
	name = std::string();
	url = std::string();
	base_form = null;
}

PokemonFormTriggerCondition::PokemonFormTriggerCondition(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonFormTriggerCondition::~PokemonFormTriggerCondition()
{

}

void
PokemonFormTriggerCondition::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *triggerKey = "trigger";

    if(object.has_key(triggerKey))
    {
        bourne::json value = object[triggerKey];



        jsonToValue(&trigger, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }

    const char *base_formKey = "base_form";

    if(object.has_key(base_formKey))
    {
        bourne::json value = object[base_formKey];




        PokemonFormSummary* obj = &base_form;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonFormTriggerCondition::toJson()
{
    bourne::json object = bourne::json::object();





    object["trigger"] = getTrigger();






    object["name"] = getName();






    object["url"] = getUrl();







	object["base_form"] = getBaseForm().toJson();


    return object;

}

std::string
PokemonFormTriggerCondition::getTrigger()
{
	return trigger;
}

void
PokemonFormTriggerCondition::setTrigger(std::string trigger)
{
	this->trigger = trigger;
}

std::string
PokemonFormTriggerCondition::getName()
{
	return name;
}

void
PokemonFormTriggerCondition::setName(std::string name)
{
	this->name = name;
}

std::string
PokemonFormTriggerCondition::getUrl()
{
	return url;
}

void
PokemonFormTriggerCondition::setUrl(std::string url)
{
	this->url = url;
}

PokemonFormSummary
PokemonFormTriggerCondition::getBaseForm()
{
	return base_form;
}

void
PokemonFormTriggerCondition::setBaseForm(PokemonFormSummary base_form)
{
	this->base_form = base_form;
}



