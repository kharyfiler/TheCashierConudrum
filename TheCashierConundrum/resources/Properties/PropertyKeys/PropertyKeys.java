package resources.Properties.PropertyKeys;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * All the keys in the properties found in /environment/env-type subfolders
 */
@AllArgsConstructor
@Getter
public enum PropertyKeys {

    // Enviroment
    PLATFORM("platform");

    String literal;

}
