

#include "MoveMetaAilmentName.h"

using namespace Tiny;

MoveMetaAilmentName::MoveMetaAilmentName()
{
	name = std::string();
	language = LanguageSummary();
}

MoveMetaAilmentName::MoveMetaAilmentName(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveMetaAilmentName::~MoveMetaAilmentName()
{

}

void
MoveMetaAilmentName::fromJson(std::string jsonObj)
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
MoveMetaAilmentName::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();







	object["language"] = getLanguage().toJson();


    return object;

}

std::string
MoveMetaAilmentName::getName()
{
	return name;
}

void
MoveMetaAilmentName::setName(std::string name)
{
	this->name = name;
}

LanguageSummary
MoveMetaAilmentName::getLanguage()
{
	return language;
}

void
MoveMetaAilmentName::setLanguage(LanguageSummary language)
{
	this->language = language;
}



