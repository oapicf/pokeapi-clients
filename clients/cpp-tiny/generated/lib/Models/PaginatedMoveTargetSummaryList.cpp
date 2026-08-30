

#include "PaginatedMoveTargetSummaryList.h"

using namespace Tiny;

PaginatedMoveTargetSummaryList::PaginatedMoveTargetSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<MoveTargetSummary>();
}

PaginatedMoveTargetSummaryList::PaginatedMoveTargetSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedMoveTargetSummaryList::~PaginatedMoveTargetSummaryList()
{

}

void
PaginatedMoveTargetSummaryList::fromJson(std::string jsonObj)
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


        std::list<MoveTargetSummary> results_list;
        MoveTargetSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedMoveTargetSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<MoveTargetSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        MoveTargetSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedMoveTargetSummaryList::getCount()
{
	return count;
}

void
PaginatedMoveTargetSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedMoveTargetSummaryList::getNext()
{
	return next;
}

void
PaginatedMoveTargetSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedMoveTargetSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedMoveTargetSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<MoveTargetSummary>
PaginatedMoveTargetSummaryList::getResults()
{
	return results;
}

void
PaginatedMoveTargetSummaryList::setResults(std::list<MoveTargetSummary> results)
{
	this->results = results;
}



