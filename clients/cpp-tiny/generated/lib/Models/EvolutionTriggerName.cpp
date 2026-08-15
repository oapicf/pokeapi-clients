

#include "EvolutionTriggerName.h"

using namespace Tiny;

EvolutionTriggerName::EvolutionTriggerName()
{
	name = std::string();
	language = LanguageSummary();
}

EvolutionTriggerName::EvolutionTriggerName(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionTriggerName::~EvolutionTriggerName()
{

}

void
EvolutionTriggerName::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];




        LanguageSummary* obj = &language;
		obj->fromJson(value.dump());

    }


}

bourne::json
EvolutionTriggerName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
EvolutionTriggerName::getName()
{
	return name;
}

void
EvolutionTriggerName::setName(std::string  name)
{
	this->name = name;
}

LanguageSummary
EvolutionTriggerName::getLanguage()
{
	return language;
}

void
EvolutionTriggerName::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



