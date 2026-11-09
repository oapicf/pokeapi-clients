package org.openapitools.server.model;

import org.openapitools.server.model.MachineSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ItemMachine   {

    private MachineSummary machine;
    private VersionGroupSummary versionGroup;

    /**
     * Default constructor.
     */
    public ItemMachine() {
    // JSON-B / Jackson
    }

    /**
     * Create ItemMachine.
     *
     * @param machine The machine that teaches a move from an item.
     * @param versionGroup The version group of this specific machine.
     */
    public ItemMachine(
        MachineSummary machine, 
        VersionGroupSummary versionGroup
    ) {
        this.machine = machine;
        this.versionGroup = versionGroup;
    }



    /**
     * The machine that teaches a move from an item.
     * @return machine
     */
    public MachineSummary getMachine() {
        return machine;
    }

    public void setMachine(MachineSummary machine) {
        this.machine = machine;
    }

    /**
     * The version group of this specific machine.
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ItemMachine {\n");
        
        sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
        sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

