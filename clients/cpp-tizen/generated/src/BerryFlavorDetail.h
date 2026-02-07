/*
 * BerryFlavorDetail.h
 *
 * 
 */

#ifndef _BerryFlavorDetail_H_
#define _BerryFlavorDetail_H_


#include <string>
#include "BerryFlavorDetail_berries_inner.h"
#include "BerryFlavorName.h"
#include "ContestTypeSummary.h"
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

class BerryFlavorDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	BerryFlavorDetail();
	BerryFlavorDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BerryFlavorDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<BerryFlavorDetail_berries_inner> getBerries();

	/*! \brief Set 
	 */
	void setBerries(std::list <BerryFlavorDetail_berries_inner> berries);
	/*! \brief Get 
	 */
	ContestTypeSummary getContestType();

	/*! \brief Set 
	 */
	void setContestType(ContestTypeSummary  contest_type);
	/*! \brief Get 
	 */
	std::list<BerryFlavorName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <BerryFlavorName> names);

private:
	int id;
	std::string name;
	std::list <BerryFlavorDetail_berries_inner>berries;
	ContestTypeSummary contest_type;
	std::list <BerryFlavorName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BerryFlavorDetail_H_ */
