

#include "ItemAttributeDetail.h"

using namespace Tiny;

ItemAttributeDetail::ItemAttributeDetail()
{
	id = int(0);
	name = std::string();
	descriptions = std::list<ItemAttributeDescription>();
	items = std::list<AbilityDetail_pokemon_inner_pokemon>();
	names = std::list<ItemAttributeName>();
}

ItemAttributeDetail::ItemAttributeDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemAttributeDetail::~ItemAttributeDetail()
{

}

void
ItemAttributeDetail::fromJson(std::string jsonObj)
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

    const char *descriptionsKey = "descriptions";

    if(object.has_key(descriptionsKey))
    {
        bourne::json value = object[descriptionsKey];


        std::list<ItemAttributeDescription> descriptions_list;
        ItemAttributeDescription element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            descriptions_list.push_back(element);
        }
        descriptions = descriptions_list;


    }

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> items_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<ItemAttributeName> names_list;
        ItemAttributeName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
ItemAttributeDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<ItemAttributeDescription> descriptions_list = getDescriptions();
    bourne::json descriptions_arr = bourne::json::array();

    for(auto& var : descriptions_list)
    {
        ItemAttributeDescription obj = var;
        descriptions_arr.append(obj.toJson());
    }
    object["descriptions"] = descriptions_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;






    std::list<ItemAttributeName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        ItemAttributeName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
ItemAttributeDetail::getId()
{
	return id;
}

void
ItemAttributeDetail::setId(int  id)
{
	this->id = id;
}

std::string
ItemAttributeDetail::getName()
{
	return name;
}

void
ItemAttributeDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<ItemAttributeDescription>
ItemAttributeDetail::getDescriptions()
{
	return descriptions;
}

void
ItemAttributeDetail::setDescriptions(std::list <ItemAttributeDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
ItemAttributeDetail::getItems()
{
	return items;
}

void
ItemAttributeDetail::setItems(std::list <AbilityDetail_pokemon_inner_pokemon> items)
{
	this->items = items;
}

std::list<ItemAttributeName>
ItemAttributeDetail::getNames()
{
	return names;
}

void
ItemAttributeDetail::setNames(std::list <ItemAttributeName> names)
{
	this->names = names;
}



