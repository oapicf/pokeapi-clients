

#include "SuperContestEffectDetail.h"

using namespace Tiny;

SuperContestEffectDetail::SuperContestEffectDetail()
{
	id = int(0);
	appeal = int(0);
	flavor_text_entries = std::list<SuperContestEffectFlavorText>();
	moves = std::list<MoveSummary>();
}

SuperContestEffectDetail::SuperContestEffectDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

SuperContestEffectDetail::~SuperContestEffectDetail()
{

}

void
SuperContestEffectDetail::fromJson(std::string jsonObj)
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

    const char *flavor_text_entriesKey = "flavor_text_entries";

    if(object.has_key(flavor_text_entriesKey))
    {
        bourne::json value = object[flavor_text_entriesKey];


        std::list<SuperContestEffectFlavorText> flavor_text_entries_list;
        SuperContestEffectFlavorText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            flavor_text_entries_list.push_back(element);
        }
        flavor_text_entries = flavor_text_entries_list;


    }

    const char *movesKey = "moves";

    if(object.has_key(movesKey))
    {
        bourne::json value = object[movesKey];


        std::list<MoveSummary> moves_list;
        MoveSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            moves_list.push_back(element);
        }
        moves = moves_list;


    }


}

bourne::json
SuperContestEffectDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["appeal"] = getAppeal();





    std::list<SuperContestEffectFlavorText> flavor_text_entries_list = getFlavorTextEntries();
    bourne::json flavor_text_entries_arr = bourne::json::array();

    for(auto& var : flavor_text_entries_list)
    {
        SuperContestEffectFlavorText obj = var;
        flavor_text_entries_arr.append(obj.toJson());
    }
    object["flavor_text_entries"] = flavor_text_entries_arr;






    std::list<MoveSummary> moves_list = getMoves();
    bourne::json moves_arr = bourne::json::array();

    for(auto& var : moves_list)
    {
        MoveSummary obj = var;
        moves_arr.append(obj.toJson());
    }
    object["moves"] = moves_arr;




    return object;

}

int
SuperContestEffectDetail::getId()
{
	return id;
}

void
SuperContestEffectDetail::setId(int  id)
{
	this->id = id;
}

int
SuperContestEffectDetail::getAppeal()
{
	return appeal;
}

void
SuperContestEffectDetail::setAppeal(int  appeal)
{
	this->appeal = appeal;
}

std::list<SuperContestEffectFlavorText>
SuperContestEffectDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
SuperContestEffectDetail::setFlavorTextEntries(std::list <SuperContestEffectFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<MoveSummary>
SuperContestEffectDetail::getMoves()
{
	return moves;
}

void
SuperContestEffectDetail::setMoves(std::list <MoveSummary> moves)
{
	this->moves = moves;
}



