/*
 * PaginatedItemFlingEffectSummaryList.h
 *
 * 
 */

#ifndef _PaginatedItemFlingEffectSummaryList_H_
#define _PaginatedItemFlingEffectSummaryList_H_


#include <string>
#include "ItemFlingEffectSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PaginatedItemFlingEffectSummaryList : public Object {
public:
	/*! \brief Constructor.
	 */
	PaginatedItemFlingEffectSummaryList();
	PaginatedItemFlingEffectSummaryList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PaginatedItemFlingEffectSummaryList();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getCount();

	/*! \brief Set 
	 */
	void setCount(int  count);
	/*! \brief Get 
	 */
	std::string getNext();

	/*! \brief Set 
	 */
	void setNext(std::string  next);
	/*! \brief Get 
	 */
	std::string getPrevious();

	/*! \brief Set 
	 */
	void setPrevious(std::string  previous);
	/*! \brief Get 
	 */
	std::list<ItemFlingEffectSummary> getResults();

	/*! \brief Set 
	 */
	void setResults(std::list <ItemFlingEffectSummary> results);

private:
	int count;
	std::string next;
	std::string previous;
	std::list <ItemFlingEffectSummary>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PaginatedItemFlingEffectSummaryList_H_ */
