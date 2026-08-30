

#include "AbilityFlavorText.h"

using namespace Tiny;

AbilityFlavorText::AbilityFlavorText()
{
	flavor_text = std::string();
	language = LanguageSummary();
	version_group = VersionGroupSummary();
}

AbilityFlavorText::AbilityFlavorText(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilityFlavorText::~AbilityFlavorText()
{

}

void
AbilityFlavorText::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *flavor_textKey = "flavor_text";

    if(object.has_key(flavor_textKey))
    {
        bourne::json value = object[flavor_textKey];



        jsonToValue(&flavor_text, value, "std::string");


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];




        LanguageSummary* obj = &language;
		obj->fromJson(value.dump());

    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

    }


}

bourne::json
AbilityFlavorText::toJson()
{
    bourne::json object = bourne::json::object();





    object["flavor_text"] = getFlavorText();







	object["language"] = getLanguage().toJson();






	object["version_group"] = getVersionGroup().toJson();


    return object;

}

std::string
AbilityFlavorText::getFlavorText()
{
	return flavor_text;
}

void
AbilityFlavorText::setFlavorText(std::string flavor_text)
{
	this->flavor_text = flavor_text;
}

LanguageSummary
AbilityFlavorText::getLanguage()
{
	return language;
}

void
AbilityFlavorText::setLanguage(LanguageSummary language)
{
	this->language = language;
}

VersionGroupSummary
AbilityFlavorText::getVersionGroup()
{
	return version_group;
}

void
AbilityFlavorText::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}



