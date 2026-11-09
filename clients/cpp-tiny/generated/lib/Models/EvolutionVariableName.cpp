

#include "EvolutionVariableName.h"

using namespace Tiny;

EvolutionVariableName::EvolutionVariableName()
{
	name = std::string();
	language = null;
}

EvolutionVariableName::EvolutionVariableName(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionVariableName::~EvolutionVariableName()
{

}

void
EvolutionVariableName::fromJson(std::string jsonObj)
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
EvolutionVariableName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
EvolutionVariableName::getName()
{
	return name;
}

void
EvolutionVariableName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
EvolutionVariableName::getLanguage()
{
	return language;
}

void
EvolutionVariableName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



