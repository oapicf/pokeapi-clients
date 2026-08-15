

#include "ItemFlingEffectDetail.h"

using namespace Tiny;

ItemFlingEffectDetail::ItemFlingEffectDetail()
{
	id = int(0);
	name = std::string();
	effect_entries = std::list<ItemFlingEffectEffectText>();
	items = std::list<ItemSummary>();
}

ItemFlingEffectDetail::ItemFlingEffectDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemFlingEffectDetail::~ItemFlingEffectDetail()
{

}

void
ItemFlingEffectDetail::fromJson(std::string jsonObj)
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

    const char *effect_entriesKey = "effect_entries";

    if(object.has_key(effect_entriesKey))
    {
        bourne::json value = object[effect_entriesKey];


        std::list<ItemFlingEffectEffectText> effect_entries_list;
        ItemFlingEffectEffectText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<ItemSummary> items_list;
        ItemSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
ItemFlingEffectDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<ItemFlingEffectEffectText> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        ItemFlingEffectEffectText obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;






    std::list<ItemSummary> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ItemSummary obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

int
ItemFlingEffectDetail::getId()
{
	return id;
}

void
ItemFlingEffectDetail::setId(int  id)
{
	this->id = id;
}

std::string
ItemFlingEffectDetail::getName()
{
	return name;
}

void
ItemFlingEffectDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<ItemFlingEffectEffectText>
ItemFlingEffectDetail::getEffectEntries()
{
	return effect_entries;
}

void
ItemFlingEffectDetail::setEffectEntries(std::list <ItemFlingEffectEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<ItemSummary>
ItemFlingEffectDetail::getItems()
{
	return items;
}

void
ItemFlingEffectDetail::setItems(std::list <ItemSummary> items)
{
	this->items = items;
}



