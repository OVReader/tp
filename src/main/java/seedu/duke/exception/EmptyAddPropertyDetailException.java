//@@author OVReader

package seedu.duke.exception;

import static seedu.duke.Messages.MESSAGE_ADD_PROPERTY_WRONG_FORMAT;

/**
 * Represents exception when no property description is provided when adding property.
 */
public class EmptyAddPropertyDetailException extends ParseAddPropertyException {
    @Override
    public String toString() {
        return MESSAGE_ADD_PROPERTY_WRONG_FORMAT;
    }
}
