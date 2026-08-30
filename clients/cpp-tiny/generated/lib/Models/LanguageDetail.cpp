

#include "LanguageDetail.h"

using namespace Tiny;

LanguageDetail::LanguageDetail()
{
	id = int(0);
	name = std::string();
	official = bool(false);
	iso639 = std::string();
	iso3166 = std::string();
	names = std::list<LanguageName>();
}

LanguageDetail::LanguageDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

LanguageDetail::~LanguageDetail()
{

}

void
LanguageDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *officialKey = "official";

    if(object.has_key(officialKey))
    {
        bourne::json value = object[officialKey];



        jsonToValue(&official, value, "bool");


    }

    const char *iso639Key = "iso639";

    if(object.has_key(iso639Key))
    {
        bourne::json value = object[iso639Key];



        jsonToValue(&iso639, value, "std::string");


    }

    const char *iso3166Key = "iso3166";

    if(object.has_key(iso3166Key))
    {
        bourne::json value = object[iso3166Key];



        jsonToValue(&iso3166, value, "std::string");


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<LanguageName> names_list;
        LanguageName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
LanguageDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["official"] = isOfficial();






    object["iso639"] = getIso639();






    object["iso3166"] = getIso3166();





    std::list<LanguageName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        LanguageName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
LanguageDetail::getId()
{
	return id;
}

void
LanguageDetail::setId(int id)
{
	this->id = id;
}

std::string
LanguageDetail::getName()
{
	return name;
}

void
LanguageDetail::setName(std::string name)
{
	this->name = name;
}

bool
LanguageDetail::isOfficial()
{
	return official;
}

void
LanguageDetail::setOfficial(bool official)
{
	this->official = official;
}

std::string
LanguageDetail::getIso639()
{
	return iso639;
}

void
LanguageDetail::setIso639(std::string iso639)
{
	this->iso639 = iso639;
}

std::string
LanguageDetail::getIso3166()
{
	return iso3166;
}

void
LanguageDetail::setIso3166(std::string iso3166)
{
	this->iso3166 = iso3166;
}

std::list<LanguageName>
LanguageDetail::getNames()
{
	return names;
}

void
LanguageDetail::setNames(std::list<LanguageName> names)
{
	this->names = names;
}



