

#include "PaginatedMoveMetaAilmentSummaryList.h"

using namespace Tiny;

PaginatedMoveMetaAilmentSummaryList::PaginatedMoveMetaAilmentSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<MoveMetaAilmentSummary>();
}

PaginatedMoveMetaAilmentSummaryList::PaginatedMoveMetaAilmentSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedMoveMetaAilmentSummaryList::~PaginatedMoveMetaAilmentSummaryList()
{

}

void
PaginatedMoveMetaAilmentSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<MoveMetaAilmentSummary> results_list;
        MoveMetaAilmentSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedMoveMetaAilmentSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<MoveMetaAilmentSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        MoveMetaAilmentSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedMoveMetaAilmentSummaryList::getCount()
{
	return count;
}

void
PaginatedMoveMetaAilmentSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedMoveMetaAilmentSummaryList::getNext()
{
	return next;
}

void
PaginatedMoveMetaAilmentSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedMoveMetaAilmentSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedMoveMetaAilmentSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<MoveMetaAilmentSummary>
PaginatedMoveMetaAilmentSummaryList::getResults()
{
	return results;
}

void
PaginatedMoveMetaAilmentSummaryList::setResults(std::list<MoveMetaAilmentSummary> results)
{
	this->results = results;
}



