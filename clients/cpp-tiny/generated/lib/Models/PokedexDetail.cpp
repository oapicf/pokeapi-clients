

#include "PokedexDetail.h"

using namespace Tiny;

PokedexDetail::PokedexDetail()
{
	id = int(0);
	name = std::string();
	is_main_series = bool(false);
	descriptions = std::list<PokedexDescription>();
	names = std::list<PokedexName>();
	pokemon_entries = std::list<PokedexDetail_pokemon_entries_inner>();
	region = RegionSummary();
	version_groups = std::list<AbilityDetail_pokemon_inner_pokemon>();
}

PokedexDetail::PokedexDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokedexDetail::~PokedexDetail()
{

}

void
PokedexDetail::fromJson(std::string jsonObj)
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

    const char *is_main_seriesKey = "is_main_series";

    if(object.has_key(is_main_seriesKey))
    {
        bourne::json value = object[is_main_seriesKey];



        jsonToValue(&is_main_series, value, "bool");


    }

    const char *descriptionsKey = "descriptions";

    if(object.has_key(descriptionsKey))
    {
        bourne::json value = object[descriptionsKey];


        std::list<PokedexDescription> descriptions_list;
        PokedexDescription element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            descriptions_list.push_back(element);
        }
        descriptions = descriptions_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<PokedexName> names_list;
        PokedexName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *pokemon_entriesKey = "pokemon_entries";

    if(object.has_key(pokemon_entriesKey))
    {
        bourne::json value = object[pokemon_entriesKey];


        std::list<PokedexDetail_pokemon_entries_inner> pokemon_entries_list;
        PokedexDetail_pokemon_entries_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_entries_list.push_back(element);
        }
        pokemon_entries = pokemon_entries_list;


    }

    const char *regionKey = "region";

    if(object.has_key(regionKey))
    {
        bourne::json value = object[regionKey];




        RegionSummary* obj = &region;
		obj->fromJson(value.dump());

    }

    const char *version_groupsKey = "version_groups";

    if(object.has_key(version_groupsKey))
    {
        bourne::json value = object[version_groupsKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> version_groups_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_groups_list.push_back(element);
        }
        version_groups = version_groups_list;


    }


}

bourne::json
PokedexDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["is_main_series"] = isIsMainSeries();





    std::list<PokedexDescription> descriptions_list = getDescriptions();
    bourne::json descriptions_arr = bourne::json::array();

    for(auto& var : descriptions_list)
    {
        PokedexDescription obj = var;
        descriptions_arr.append(obj.toJson());
    }
    object["descriptions"] = descriptions_arr;






    std::list<PokedexName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        PokedexName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<PokedexDetail_pokemon_entries_inner> pokemon_entries_list = getPokemonEntries();
    bourne::json pokemon_entries_arr = bourne::json::array();

    for(auto& var : pokemon_entries_list)
    {
        PokedexDetail_pokemon_entries_inner obj = var;
        pokemon_entries_arr.append(obj.toJson());
    }
    object["pokemon_entries"] = pokemon_entries_arr;








	object["region"] = getRegion().toJson();




    std::list<AbilityDetail_pokemon_inner_pokemon> version_groups_list = getVersionGroups();
    bourne::json version_groups_arr = bourne::json::array();

    for(auto& var : version_groups_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        version_groups_arr.append(obj.toJson());
    }
    object["version_groups"] = version_groups_arr;




    return object;

}

int
PokedexDetail::getId()
{
	return id;
}

void
PokedexDetail::setId(int id)
{
	this->id = id;
}

std::string
PokedexDetail::getName()
{
	return name;
}

void
PokedexDetail::setName(std::string name)
{
	this->name = name;
}

bool
PokedexDetail::isIsMainSeries()
{
	return is_main_series;
}

void
PokedexDetail::setIsMainSeries(bool is_main_series)
{
	this->is_main_series = is_main_series;
}

std::list<PokedexDescription>
PokedexDetail::getDescriptions()
{
	return descriptions;
}

void
PokedexDetail::setDescriptions(std::list<PokedexDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<PokedexName>
PokedexDetail::getNames()
{
	return names;
}

void
PokedexDetail::setNames(std::list<PokedexName> names)
{
	this->names = names;
}

std::list<PokedexDetail_pokemon_entries_inner>
PokedexDetail::getPokemonEntries()
{
	return pokemon_entries;
}

void
PokedexDetail::setPokemonEntries(std::list<PokedexDetail_pokemon_entries_inner> pokemon_entries)
{
	this->pokemon_entries = pokemon_entries;
}

RegionSummary
PokedexDetail::getRegion()
{
	return region;
}

void
PokedexDetail::setRegion(RegionSummary region)
{
	this->region = region;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
PokedexDetail::getVersionGroups()
{
	return version_groups;
}

void
PokedexDetail::setVersionGroups(std::list<AbilityDetail_pokemon_inner_pokemon> version_groups)
{
	this->version_groups = version_groups;
}



