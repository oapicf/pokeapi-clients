

#include "EvolutionVariableDescription.h"

using namespace Tiny;

EvolutionVariableDescription::EvolutionVariableDescription()
{
	description = std::string();
	language = null;
}

EvolutionVariableDescription::EvolutionVariableDescription(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionVariableDescription::~EvolutionVariableDescription()
{

}

void
EvolutionVariableDescription::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


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
EvolutionVariableDescription::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
EvolutionVariableDescription::getDescription()
{
	return description;
}

void
EvolutionVariableDescription::setDescription(std::string description)
{
	this->description = description;
}

LanguageSummary
EvolutionVariableDescription::getLanguage()
{
	return language;
}

void
EvolutionVariableDescription::setLanguage(LanguageSummary language)
{
	this->language = language;
}



