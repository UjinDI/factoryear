@AnyMetaDef( name= "CarPartsPropertyMetaDef", metaType = "string", idType = "long",
        metaValues = {
                @MetaValue(value = "S", targetEntity = StrPropParts.class),
                @MetaValue(value = "I", targetEntity = IntPropParts.class),
                @MetaValue(value = "SS", targetEntity = SerialPropParts.class)
        }
)
package org.factoryear.model.carparts;

import org.factoryear.model.typeprops.IntPropParts;
import org.factoryear.model.typeprops.SerialPropParts;
import org.factoryear.model.typeprops.StrPropParts;
import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.MetaValue;