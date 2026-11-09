
/*
 * ItemMachine.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemMachine_H_
#define TINY_CPP_CLIENT_ItemMachine_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MachineSummary.h"
#include "VersionGroupSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemMachine{
public:

    /*! \brief Constructor.
	 */
    ItemMachine();
    ItemMachine(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemMachine();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The machine that teaches a move from an item.
	 */
	MachineSummary getMachine();

	/*! \brief Set The machine that teaches a move from an item.
	 */
	void setMachine(MachineSummary machine);
	/*! \brief Get The version group of this specific machine.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group of this specific machine.
	 */
	void setVersionGroup(VersionGroupSummary version_group);


    private:
    MachineSummary machine;
    VersionGroupSummary version_group;
};
}

#endif /* TINY_CPP_CLIENT_ItemMachine_H_ */
