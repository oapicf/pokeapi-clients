

#include "PaginatedMoveMetaCategorySummaryList.h"

using namespace Tiny;

PaginatedMoveMetaCategorySummaryList::PaginatedMoveMetaCategorySummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<MoveMetaCategorySummary>();
}

PaginatedMoveMetaCategorySummaryList::PaginatedMoveMetaCategorySummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedMoveMetaCategorySummaryList::~PaginatedMoveMetaCategorySummaryList()
{

}

void
PaginatedMoveMetaCategorySummaryList::fromJson(std::string jsonObj)
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


        std::list<MoveMetaCategorySummary> results_list;
        MoveMetaCategorySummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedMoveMetaCategorySummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<MoveMetaCategorySummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        MoveMetaCategorySummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedMoveMetaCategorySummaryList::getCount()
{
	return count;
}

void
PaginatedMoveMetaCategorySummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedMoveMetaCategorySummaryList::getNext()
{
	return next;
}

void
PaginatedMoveMetaCategorySummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedMoveMetaCategorySummaryList::getPrevious()
{
	return previous;
}

void
PaginatedMoveMetaCategorySummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<MoveMetaCategorySummary>
PaginatedMoveMetaCategorySummaryList::getResults()
{
	return results;
}

void
PaginatedMoveMetaCategorySummaryList::setResults(std::list <MoveMetaCategorySummary> results)
{
	this->results = results;
}



