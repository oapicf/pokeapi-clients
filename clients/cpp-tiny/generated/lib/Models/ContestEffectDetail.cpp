

#include "ContestEffectDetail.h"

using namespace Tiny;

ContestEffectDetail::ContestEffectDetail()
{
	id = int(0);
	appeal = int(0);
	jam = int(0);
	effect_entries = std::list<ContestEffectEffectText>();
	flavor_text_entries = std::list<ContestEffectFlavorText>();
}

ContestEffectDetail::ContestEffectDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

ContestEffectDetail::~ContestEffectDetail()
{

}

void
ContestEffectDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *appealKey = "appeal";

    if(object.has_key(appealKey))
    {
        bourne::json value = object[appealKey];



        jsonToValue(&appeal, value, "int");


    }

    const char *jamKey = "jam";

    if(object.has_key(jamKey))
    {
        bourne::json value = object[jamKey];



        jsonToValue(&jam, value, "int");


    }

    const char *effect_entriesKey = "effect_entries";

    if(object.has_key(effect_entriesKey))
    {
        bourne::json value = object[effect_entriesKey];


        std::list<ContestEffectEffectText> effect_entries_list;
        ContestEffectEffectText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }

    const char *flavor_text_entriesKey = "flavor_text_entries";

    if(object.has_key(flavor_text_entriesKey))
    {
        bourne::json value = object[flavor_text_entriesKey];


        std::list<ContestEffectFlavorText> flavor_text_entries_list;
        ContestEffectFlavorText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            flavor_text_entries_list.push_back(element);
        }
        flavor_text_entries = flavor_text_entries_list;


    }


}

bourne::json
ContestEffectDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["appeal"] = getAppeal();






    object["jam"] = getJam();





    std::list<ContestEffectEffectText> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        ContestEffectEffectText obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;






    std::list<ContestEffectFlavorText> flavor_text_entries_list = getFlavorTextEntries();
    bourne::json flavor_text_entries_arr = bourne::json::array();

    for(auto& var : flavor_text_entries_list)
    {
        ContestEffectFlavorText obj = var;
        flavor_text_entries_arr.append(obj.toJson());
    }
    object["flavor_text_entries"] = flavor_text_entries_arr;




    return object;

}

int
ContestEffectDetail::getId()
{
	return id;
}

void
ContestEffectDetail::setId(int  id)
{
	this->id = id;
}

int
ContestEffectDetail::getAppeal()
{
	return appeal;
}

void
ContestEffectDetail::setAppeal(int  appeal)
{
	this->appeal = appeal;
}

int
ContestEffectDetail::getJam()
{
	return jam;
}

void
ContestEffectDetail::setJam(int  jam)
{
	this->jam = jam;
}

std::list<ContestEffectEffectText>
ContestEffectDetail::getEffectEntries()
{
	return effect_entries;
}

void
ContestEffectDetail::setEffectEntries(std::list <ContestEffectEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<ContestEffectFlavorText>
ContestEffectDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
ContestEffectDetail::setFlavorTextEntries(std::list <ContestEffectFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}



