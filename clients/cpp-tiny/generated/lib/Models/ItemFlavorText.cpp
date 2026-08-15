

#include "ItemFlavorText.h"

using namespace Tiny;

ItemFlavorText::ItemFlavorText()
{
	text = std::string();
	version_group = VersionGroupSummary();
	language = LanguageSummary();
}

ItemFlavorText::ItemFlavorText(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemFlavorText::~ItemFlavorText()
{

}

void
ItemFlavorText::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *textKey = "text";

    if(object.has_key(textKey))
    {
        bourne::json value = object[textKey];



        jsonToValue(&text, value, "std::string");


    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

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
ItemFlavorText::toJson()
{
    bourne::json object = bourne::json::object();





    object["text"] = getText();







	object["version_group"] = getVersionGroup().toJson();






	object["language"] = getLanguage().toJson();


    return object;

}

std::string
ItemFlavorText::getText()
{
	return text;
}

void
ItemFlavorText::setText(std::string  text)
{
	this->text = text;
}

VersionGroupSummary
ItemFlavorText::getVersionGroup()
{
	return version_group;
}

void
ItemFlavorText::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}

LanguageSummary
ItemFlavorText::getLanguage()
{
	return language;
}

void
ItemFlavorText::setLanguage(LanguageSummary  language)
{
	this->language = language;
}



