/*
 * ItemMachine.h
 *
 * 
 */

#ifndef _ItemMachine_H_
#define _ItemMachine_H_


#include <string>
#include "MachineSummary.h"
#include "VersionGroupSummary.h"
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

class ItemMachine : public Object {
public:
	/*! \brief Constructor.
	 */
	ItemMachine();
	ItemMachine(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ItemMachine();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The machine that teaches a move from an item.
	 */
	MachineSummary getMachine();

	/*! \brief Set The machine that teaches a move from an item.
	 */
	void setMachine(MachineSummary  machine);
	/*! \brief Get The version group of this specific machine.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group of this specific machine.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);

private:
	MachineSummary machine;
	VersionGroupSummary version_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ItemMachine_H_ */
