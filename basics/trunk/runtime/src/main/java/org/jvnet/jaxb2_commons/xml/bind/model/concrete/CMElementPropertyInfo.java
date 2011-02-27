package org.jvnet.jaxb2_commons.xml.bind.model.concrete;

import javax.xml.namespace.QName;

import org.jvnet.jaxb2_commons.xml.bind.model.MClassInfo;
import org.jvnet.jaxb2_commons.xml.bind.model.MElementPropertyInfo;
import org.jvnet.jaxb2_commons.xml.bind.model.MPropertyInfoVisitor;
import org.jvnet.jaxb2_commons.xml.bind.model.MTypeInfo;
import org.jvnet.jaxb2_commons.xml.bind.model.origin.MPropertyInfoOrigin;

public class CMElementPropertyInfo extends CMPropertyInfo implements
		MElementPropertyInfo {

	private final MTypeInfo typeInfo;
	private final QName elementName;
	private final QName wrapperElementName;

	public CMElementPropertyInfo(MPropertyInfoOrigin origin,
			MClassInfo classInfo, String privateName, boolean collection,
			MTypeInfo typeInfo, QName elementName, QName wrapperElementName) {
		super(origin, classInfo, privateName, collection);
		this.typeInfo = typeInfo;
		this.elementName = elementName;
		this.wrapperElementName = wrapperElementName;
	}

	@Override
	public MTypeInfo getTypeInfo() {
		return typeInfo;
	}

	@Override
	public QName getElementName() {
		return elementName;
	}

	@Override
	public QName getWrapperElementName() {
		return wrapperElementName;
	}

	@Override
	public <V> V acceptPropertyInfoVisitor(MPropertyInfoVisitor<V> visitor) {
		return visitor.visitElementPropertyInfo(this);
	}

}
