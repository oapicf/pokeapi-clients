/*
 * BerryFlavorDetail.h
 *
 * 
 */

#ifndef _BerryFlavorDetail_H_
#define _BerryFlavorDetail_H_


#include <string>
#include "BerryFlavorBerryMap.h"
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

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get A list of the berries with this flavor.
	 */
	std::list<BerryFlavorBerryMap> getBerries();

	/*! \brief Set A list of the berries with this flavor.
	 */
	void setBerries(std::list <BerryFlavorBerryMap> berries);
	/*! \brief Get The contest type that correlates with this berry flavor.
	 */
	ContestTypeSummary getContestType();

	/*! \brief Set The contest type that correlates with this berry flavor.
	 */
	void setContestType(ContestTypeSummary  contest_type);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<BerryFlavorName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <BerryFlavorName> names);

private:
	int id;
	std::string name;
	std::list <BerryFlavorBerryMap>berries;
	ContestTypeSummary contest_type;
	std::list <BerryFlavorName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BerryFlavorDetail_H_ */
